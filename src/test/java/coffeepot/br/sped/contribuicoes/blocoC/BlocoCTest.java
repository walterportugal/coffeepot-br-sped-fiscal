package coffeepot.br.sped.contribuicoes.blocoC;

/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 - 2020 Jeandeson O. Merelis
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import coffeepot.br.sped.contribuicoes.tipos.OrigemProcesso;
import coffeepot.br.sped.fiscal.arquivo.blocoC.RegC001;
import coffeepot.br.sped.fiscal.config.Config;
import coffeepot.br.sped.fiscal.tipos.ApuracaoIpi;
import coffeepot.br.sped.fiscal.tipos.CondicaoPagamento;
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import coffeepot.br.sped.fiscal.tipos.DocumentoImportacao;
import coffeepot.br.sped.fiscal.tipos.EmissaoDocumento;
import coffeepot.br.sped.fiscal.tipos.Frete;
import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;
import coffeepot.br.sped.fiscal.tipos.Operacao;
import coffeepot.br.sped.fiscal.tipos.SituacaoDocumento;
import coffeepot.br.sped.fiscal.util.Util;
import coffeepot.br.sped.fiscal.writer.SpedFiscalWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;

/**
 * Class: BlocoCTest.
 *
 * <p>
 * History:<br><br>
 * - walter - Sep 16, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
public class BlocoCTest {

    @Test
    public void testBlocoC() throws Exception {
        System.out.println("*** Teste de escrita do BLOCO C inteiro ***");
        File file = new File(Config.TEST_BLOCO_OUT_DIR + "BlocoCContribuicoesTest.txt");

        Writer fw = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(file), StandardCharsets.UTF_8));
        SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

        BlocoC blocoC = createBlocoC(file, spedFiscalWriter);

        spedFiscalWriter.close();

        System.out.println("Arquivo gerado em: " + file.getAbsolutePath());
    }

    public static BlocoC createBlocoC(File file, SpedFiscalWriter spedFiscalWriter) throws NoSuchMethodException,
            InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
            IOException {
        BlocoC blocoC = createBlocoC();

        return (BlocoC) Util.createFileFromBloco(blocoC, file, spedFiscalWriter);

    }

    public static BlocoC createBlocoC() {
        BlocoC blocoC = new BlocoC();
        
        blocoC.setRegC001(new RegC001(IndicadorMovimento.COM_DADOS));
        blocoC.setRegC010List(createRegC010List());
        
        return blocoC;
    }

    private static List<RegC010> createRegC010List() {
        RegC010 regC010 = new RegC010();
        
        regC010.setCnpj("36.293.264/0001-28");
        regC010.setIndEscri(RegC010.IndicadorApuracaoContribuicoesCreditos.REGISTRO_INDIVIDUALIZADO);
        
        regC010.setRegC100List(createRegC100List());
        regC010.setRegC180List(createReg180List());
        regC010.setRegC190List(createRegC190List());
        regC010.setRegC395List(createRegC395List());
        regC010.setRegC500List(createRegC500List());
        
        return Collections.singletonList(regC010);
    }

    private static List<RegC100> createRegC100List() {
        List<RegC100> list = new LinkedList<>();
        for (int i = 0; i < 2; i++) {
            list.add(createRegC100());
        }
        return list;
    }

    private static List<RegC180> createReg180List() {
        RegC180 regC180 = new RegC180();
        
        regC180.setCodItem("000001");
        regC180.setCodMod(DocumentoFiscal.M55);
        regC180.setCodNcm("12345678");
        regC180.setDtDocFin(LocalDate.now());
        regC180.setDtDocIni(LocalDate.now());
        regC180.setExIpi("");
        regC180.setVlTotItem(100.0);
        
        regC180.setRegC181List(createReg181List());
        regC180.setRegC185List(createRegC181List());
        regC180.setRegC188List(createRegC188List());
        
        return Collections.singletonList(regC180);
    }

    private static List<RegC190> createRegC190List() {
        RegC190 regC190 = new RegC190();
        
        regC190.setCodItem("000001");
        regC190.setCodNcm("12345678");
        regC190.setDtRefFin(LocalDate.now());
        regC190.setDtRefIni(LocalDate.now());
        regC190.setExIpi("");
        regC190.setVlTotItem(100.0);
        regC190.setRegC191List(createRegC191List());
        regC190.setRegC195List(createRegC195List());
        regC190.setRegC198List(createRegC198List());
        regC190.setRegC199List(createRegC199List());
        
        return Collections.singletonList(regC190);
    }

    private static List<RegC395> createRegC395List() {
        RegC395 reg = new RegC395();
        
        reg.setCodMod(DocumentoFiscal.M59);
        reg.setCodPart("F000001");
        reg.setDtDoc(LocalDate.now());
        reg.setNumDoc(123);
        reg.setSer("1");
        reg.setSubSer("");
        reg.setVlDoc(100.0);
        
        return Collections.singletonList(reg);
        
    }

    private static List<RegC500> createRegC500List() {
        RegC500 reg = new RegC500();
        
        reg.setCodInf("123");
        reg.setCodMod(DocumentoFiscal.M29);
        reg.setCodPart("F00002");
        reg.setCodSit(SituacaoDocumento.REGULAR);
        reg.setDtDoc(LocalDate.now());
        reg.setDtEnt(LocalDate.now());
        reg.setNumDoc(12345);
        reg.setSer("1");
        reg.setSub("");
        reg.setVlCofins(3.65);
        reg.setVlDoc(100.0);
        reg.setVlIcms(18.0);
        reg.setVlPis(1.65);
        
        reg.setRegC501List(createRegC501List());
        reg.setRegC505List(createRegC505List());
        reg.setRegC509List(createRegC509List());
        
        return Collections.singletonList(reg);
    }

    private static RegC100 createRegC100() {
        RegC100 reg = new RegC100();
        
        reg.setChvNfe("1234567890 1234567890 1234567890 1234567890 1234");
        reg.setCodMod(DocumentoFiscal.M55);
        reg.setCodPart("0001");
        reg.setCodSit(SituacaoDocumento.REGULAR);
        reg.setDtDoc(LocalDate.now());
        reg.setIndEmit(EmissaoDocumento.PROPRIA);
        reg.setIndFrt(Frete.CONTRATACAO_POR_CONTA_DO_REMETENTE);
        reg.setIndOper(Operacao.SAIDA);
        reg.setIndPgto(CondicaoPagamento.A_VISTA);
        reg.setNumDoc(1L);
        reg.setSer("1");
        reg.setVlAbatNt(10d);
        reg.setVlBcIcms(100.0);
        reg.setVlBcIcmsSt(55.0);
        reg.setVlCofins(100.0);
        reg.setVlCofinsSt(0.0);
        reg.setVlDesc(0.0);
        reg.setVlDoc(100.0);
        reg.setVlFrt(0.0);
        reg.setVlIcms(18.0);
        reg.setVlIcmsSt(0.0);
        reg.setVlIpi(0.0);
        reg.setVlMerc(100.0);
        reg.setVlOutDa(0.0);
        reg.setVlPis(50.0);
        reg.setVlPisSt(50.0);
        reg.setVlSeg(50.0);
        reg.setRegC110List(createRegC110List());
        reg.setRegC111List(createRegC111List());
        reg.setRegC120List(createRegC120List());
        reg.setRegC170List(createRegC170List());
        reg.setRegC175List(createRegC175List());
        
        return reg;
    }

    private static List<RegC110> createRegC110List() {
        RegC110 regC110 = new RegC110();
        
        regC110.setCodInf("123");
        regC110.setTxtCompl("Texto complementar");
        
        return Collections.singletonList(regC110);
    }

    private static List<RegC111> createRegC111List() {
        RegC111 regC111 = new RegC111();
        
        regC111.setNumProc("123");
        regC111.setIndProc(OrigemProcesso.JUSTICA_FEDERAL);
        
        return Collections.singletonList(regC111);
    }

    private static List<RegC120> createRegC120List() {
        RegC120 regC120 = new RegC120();
        
        regC120.setCodDocImp(DocumentoImportacao.DECLARACAO_IMPORTACAO);
        regC120.setNumAcdraw("123");
        regC120.setNumDocImp("123");
        regC120.setVlCofinsImp(100.0);
        regC120.setVlPisImp(50.0);
        
        return Collections.singletonList(regC120);
    }

    private static List<RegC170> createRegC170List() {
        RegC170 reg = new RegC170();
        
        reg.setAliqCofinsPerc(5.5);
        reg.setAliqCofinsQuant(10.1);
        reg.setAliqIcms(18.0);
        reg.setAliqIpi(9.9);
        reg.setAliqPisPerc(15.0);
        reg.setAliqPisQuant(1.0);
        reg.setAliqSt(1.09);
        reg.setCfop(5102);
        reg.setCodCta("0001");
        reg.setCodEnq("999");
        reg.setCodItem("123");
        reg.setCodNat("123");
        reg.setCstCofins("01");
        reg.setCstIcms("000");
        reg.setCstIpi("03");
        reg.setCstPis("04");
        reg.setDescrCompl("descr compl");
        reg.setIndApur(ApuracaoIpi.MENSAL);
        reg.setIndMov(Boolean.TRUE);
        reg.setNumItem(123);
        reg.setQtd(123.123);
        reg.setQuantBcCofins(123.1);
        reg.setQuantBcPis(123.1);
        reg.setUnid("un");
        reg.setVlBcCofins(123.12);
        reg.setVlBcIcms(123.12);
        reg.setVlBcIcmsSt(123.12);
        reg.setVlBcIpi(123.12);
        reg.setVlBcPis(123.12);
        reg.setVlCofins(123.12);
        reg.setVlDesc(12.12);
        reg.setVlIcms(12.12);
        reg.setVlIcmsSt(12.12);
        reg.setVlIpi(12.12);
        reg.setVlItem(123.12);
        reg.setVlPis(12.12);
        
        return Collections.singletonList(reg);
    }

    private static List<RegC175> createRegC175List() {
        RegC175 regC175 = new RegC175();
        
        regC175.setAliqCofins(3.65);
        regC175.setAliqCofinsQuant(0.0);
        regC175.setAliqPis(1.65);
        regC175.setAliqPisQuant(0.0);
        regC175.setCfop(5102);
        regC175.setCodCta("0123456");
        regC175.setCstCofins("01");
        regC175.setCstPis("01");
        regC175.setInfoCompl("Info Complementar");
        regC175.setQuantBcCofins(0.0);
        regC175.setQuantBcPis(0.0);
        regC175.setVlBcCofins(100.0);
        regC175.setVlBcPis(100.0);
        regC175.setVlCofins(3.65);
        regC175.setVlDesc(0.0);
        regC175.setVlOpr(100.0);
        regC175.setVlPis(1.65);
        
        return Collections.singletonList(regC175);
    }

    private static List<RegC181> createReg181List() {
        RegC181 reg = new RegC181();
        
        reg.setAliqPis(1.65);
        reg.setAliqPisQuant(0.0);
        reg.setCfop(5102);
        reg.setCodCta("64646464");
        reg.setCstPis("01");
        reg.setQuantBcPis(0.0);
        reg.setVlBcPis(100.0);
        reg.setVlDesc(0.0);
        reg.setVlItem(100.0);
        reg.setVlPis(1.65);
        
        return Collections.singletonList(reg);
    }

    private static List<RegC185> createRegC181List() {
        RegC185 reg = new RegC185();
        
        reg.setAliqCofins(3.65);
        reg.setAliqCofinsQuant(0.0);
        reg.setCfop(5102);
        reg.setCodCta("64646464");
        reg.setCstCofins("01");
        reg.setQuantBcCofins(0.0);
        reg.setVlBcCofins(100.0);
        reg.setVlDesc(0.0);
        reg.setVlItem(100.0);
        reg.setVlCofins(3.65);
        
        return Collections.singletonList(reg);
    }

    private static List<RegC188> createRegC188List() {
        RegC188 reg = new RegC188();
        
        reg.setNumProc("123");
        reg.setIndProc(OrigemProcesso.JUSTICA_FEDERAL);
        
        return Collections.singletonList(reg);
    }

    private static List<RegC191> createRegC191List() {
        RegC191 reg = new RegC191();
        
        reg.setAliqPis(1.65);
        reg.setAliqPisQuant(0.0);
        reg.setCfop(5102);
        reg.setCnpjCpfPart("F000001");
        reg.setCodCta("321654");
        reg.setCstPis("01");
        reg.setQuantBcPis(0.0);
        reg.setVlBcPis(100.0);
        reg.setVlDesc(0.0);
        reg.setVlItem(100.0);
        reg.setVlPis(1.65);
        
        return Collections.singletonList(reg);
    }

    private static List<RegC195> createRegC195List() {
        RegC195 reg = new RegC195();
        
        reg.setAliqCofins(3.65);
        reg.setAliqCofinsQuant(0.0);
        reg.setCfop(5102);
        reg.setCnpjCpfPart("F000001");
        reg.setCodCta("321654");
        reg.setCstCofins("01");
        reg.setQuantBcCofins(0.0);
        reg.setVlBcCofins(100.0);
        reg.setVlDesc(0.0);
        reg.setVlItem(100.0);
        reg.setVlCofins(3.65);
        
        return Collections.singletonList(reg);
    }

    private static List<RegC198> createRegC198List() {
        RegC198 reg = new RegC198();
        
        reg.setNumProc("123");
        reg.setIndProc(OrigemProcesso.JUSTICA_FEDERAL);
        
        return Collections.singletonList(reg);
    }

    private static List<RegC199> createRegC199List() {
        RegC199 reg = new RegC199();
        
        reg.setCodDocImp(DocumentoImportacao.DECLARACAO_IMPORTACAO);
        reg.setNumAcdraw("123");
        reg.setNumDocImp("123");
        reg.setVlCofinsImp(0.0);
        reg.setVlPisImp(0.0);
        
        return Collections.singletonList(reg);
    }

    private static List<RegC501> createRegC501List() {
        RegC501 reg = new RegC501();
        
        reg.setAliqPis(1.65);
        reg.setCodCta("123456");
        reg.setCstPis("01");
        reg.setNatBcCred("012222");
        reg.setVlBcPis(100.0);
        reg.setVlItem(100.0);
        reg.setVlPis(1.65);
        
        return Collections.singletonList(reg);
    }

    private static List<RegC505> createRegC505List() {
        RegC505 reg = new RegC505();
        
        reg.setAliqCofins(3.65);
        reg.setCodCta("123456");
        reg.setCstCofins("01");
        reg.setNatBcCred("012222");
        reg.setVlBcCofins(100.0);
        reg.setVlItem(100.0);
        reg.setVlCofins(3.65);
        
        return Collections.singletonList(reg);
    }

    private static List<RegC509> createRegC509List() {
        RegC509 reg = new RegC509();
        
        reg.setNumProc("123");
        reg.setIndProc(OrigemProcesso.JUSTICA_FEDERAL);
        
        return Collections.singletonList(reg);
    }

    
}

