/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoC;

/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 - 2019 Jeandeson O. Merelis
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

import coffeepot.br.sped.fiscal.config.Config;
import coffeepot.br.sped.fiscal.tipos.ApuracaoIpi;
import coffeepot.br.sped.fiscal.tipos.CondicaoPagamento;
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import coffeepot.br.sped.fiscal.tipos.DocumentoImportacao;
import coffeepot.br.sped.fiscal.tipos.EmissaoDocumento;
import coffeepot.br.sped.fiscal.tipos.Frete;
import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;
import coffeepot.br.sped.fiscal.tipos.ModeloDocumentoArecadacao;
import coffeepot.br.sped.fiscal.tipos.MotivoRessarcimento;
import coffeepot.br.sped.fiscal.tipos.Operacao;
import coffeepot.br.sped.fiscal.tipos.ResponsalvelRetencaoIcmsSt;
import coffeepot.br.sped.fiscal.tipos.SituacaoDocumento;
import coffeepot.br.sped.fiscal.tipos.TipoTituloCredito;
import coffeepot.br.sped.fiscal.tipos.TipoTransporte;
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
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class BlocoCTest {

    @Test
    public void testBloco0() throws Exception {

        System.out.println("**** Teste de escrita do BLOCO C inteiro ***");

        File file = new File(Config.TEST_BLOCO_OUT_DIR + "BlocoCTest.txt");

        Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8));
        SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

        BlocoC bloco = createBlocoC(file, spedFiscalWriter);
        spedFiscalWriter.close();

        /*
        try {
            Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8));
            SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

            spedFiscalWriter.write(bloco);

            spedFiscalWriter.flush();
            spedFiscalWriter.close();

        } catch (IOException ex) {
            Logger.getLogger(BlocoCTest.class.getName()).log(Level.SEVERE, null, ex);
        }
         */
        System.out.println("Arquivo gerado em: " + file.getAbsolutePath());

    }

    public static BlocoC createBlocoC(File file, SpedFiscalWriter spedFiscalWriter) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
        BlocoC bloco = getDataBlocoC();
        return (BlocoC) Util.createFileFromBloco(bloco, file, spedFiscalWriter);
    }

    public static BlocoC getDataBlocoC() {
        BlocoC bloco = new BlocoC();
        bloco.setRegC001(createReg0001());
        bloco.setRegC100List(createRegC100List());
        //TODO: completar testes bloco C
        //bloco.setRegC300List(createRegC300List());

        return bloco;
    }

    public static RegC001 createReg0001() {
        RegC001 reg = new RegC001(IndicadorMovimento.COM_DADOS);
        return reg;
    }

    public static List<RegC100> createRegC100List() {
        List<RegC100> list = new LinkedList<>();
        for (int i = 0; i < 2; i++) {
            list.add(createRegC100());
        }
        return list;
    }

    public static RegC100 createRegC100() {

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
        reg.setVlSeg(50.0);
        reg.setVlPisSt(50.0);
        reg.setVlPis(50.0);
        reg.setVlOutDa(30.0);
        reg.setVlMerc(100.0);
        reg.setVlIpi(20.0);
        reg.setVlSeg(99.0);
        reg.setVlCofinsSt(123.99);

        RegC101 rc101 = new RegC101();
        rc101.setVlFcpUfDest(10.25);
        rc101.setVlIcmsUfDest(15.26);
        rc101.setVlIcmsUfRem(20.27);
        reg.setRegC101(rc101);
        
        RegC105 rc105 = new RegC105();
        rc105.setOper(0);
        rc105.setUf("SP");
        reg.setRegC105(rc105);
        
        reg.setRegC110List(createRegC110List());
        //reg.setRegC120List(createRegC120List());
        //reg.setRegC130(createRegC130());
        //reg.setRegC140(createRegC140());
        //reg.setRegC160(createRegC160());
        //reg.setRegC165List(createRegC165List());
        reg.setRegC170List(createRegC170List());
        reg.setRegC190List(createRegC190List());
        reg.setRegC195List(createRegC195List());

        return reg;
    }

    public static List<RegC110> createRegC110List() {
        List<RegC110> list = new LinkedList<>();
        list.add(createRegC110());
        list.add(createRegC110());
        list.add(createRegC110());
        return list;
    }

    public static RegC110 createRegC110() {
        RegC110 reg = new RegC110();
        reg.setCodInf("123");
        reg.setTxtCompl("Texto complementar");
        //--
        reg.setRegC111List(createRegC111List());
        reg.setRegC112List(createRegC112List());
        reg.setRegC113List(createRegC113List());
        reg.setRegC114List(createRegC114List());
        //reg.setRegC115List(createRegC115List());
        //reg.setRegC116List(createRegC116List());
        //--
        return reg;
    }

    public static List<RegC111> createRegC111List() {
        List<RegC111> list = new LinkedList<>();
        list.add(createRegC111());
        list.add(createRegC111());
        list.add(createRegC111());
        return list;
    }

    public static RegC111 createRegC111() {
        RegC111 reg = new RegC111();
        reg.setIndProc(RegC111.OrigemProcesso.SEFAZ);
        reg.setNumProc("123456789012345");
        return reg;
    }

    public static List<RegC112> createRegC112List() {
        List<RegC112> list = new LinkedList<>();
        list.add(createRegC112());
        list.add(createRegC112());
        list.add(createRegC112());
        return list;
    }

    public static RegC112 createRegC112() {
        RegC112 reg = new RegC112();
        reg.setCodAut("Cod aut");
        reg.setCodDa(RegC112.DocumentoArrecadacao.GNRE);
        reg.setDtPgto(LocalDate.now());
        reg.setDtVcto(LocalDate.now());
        reg.setNumDa("num DA");
        reg.setUf("ES");
        reg.setVlDa(88.0);
        return reg;
    }

    public static List<RegC113> createRegC113List() {
        List<RegC113> list = new LinkedList<>();
        list.add(createRegC113());
        list.add(createRegC113());
        list.add(createRegC113());
        return list;
    }

    public static RegC113 createRegC113() {
        RegC113 reg = new RegC113();
        reg.setCodMod(DocumentoFiscal.M16);
        reg.setCodPart("0001");
        reg.setDtDoc(LocalDate.now());
        reg.setIndEmit(EmissaoDocumento.TERCEIROS);
        reg.setIndOper(Operacao.ENTRADA);
        reg.setNumDoc(123L);
        reg.setSer("1");
        reg.setSub(1);
        reg.setChvDoce("33180336293264000128550010000000171507577876");
        return reg;
    }

    public static List<RegC114> createRegC114List() {
        List<RegC114> list = new LinkedList<>();
        list.add(createRegC114());
        list.add(createRegC114());
        list.add(createRegC114());
        return list;
    }

    public static RegC114 createRegC114() {
        RegC114 reg = new RegC114();
        reg.setCodMod(DocumentoFiscal.M55);
        reg.setDtDoc(LocalDate.now());
        reg.setEcfCx(1);
        reg.setEcfFab("FAB000000000000000001");
        reg.setNumDoc(123L);
        return reg;
    }

    public static List<RegC115> createRegC115List() {
        List<RegC115> list = new LinkedList<>();
        list.add(createRegC115());
        list.add(createRegC115());
        list.add(createRegC115());
        return list;
    }

    public static RegC115 createRegC115() {
        RegC115 reg = new RegC115();
        reg.setCnpjCol("1231.12131-12adf");
        reg.setCnpjEntg("12.123.123/0000-00");
        reg.setCodMunCol(1);
        reg.setCodMunEntg(2);
        reg.setIeCol("IE COLETA");
        reg.setIeEntg("Ie Entrega");
        reg.setIndCarga(TipoTransporte.RODOVIARIO);
        return reg;
    }

    public static List<RegC116> createRegC116List() {
        List<RegC116> list = new LinkedList<>();
        list.add(createRegC116());
        list.add(createRegC116());
        list.add(createRegC116());
        return list;
    }

    public static RegC116 createRegC116() {
        RegC116 reg = new RegC116();
        reg.setChvCfe("1234567890 1234567890 1234564567890 1234567890 1234");
        reg.setCodMod(DocumentoFiscal.M65);
        reg.setDtDoc(LocalDate.now());
        reg.setNrSat("000000001");
        reg.setNumCfe(123);
        return reg;
    }
    //</editor-fold>

    public static List<RegC120> createRegC120List() {
        List<RegC120> list = new LinkedList<>();
        list.add(createRegC120());
        list.add(createRegC120());
        list.add(createRegC120());
        return list;
    }

    public static RegC120 createRegC120() {
        RegC120 reg = new RegC120();
        reg.setCodDocImp(DocumentoImportacao.DECLARACAO_IMPORTACAO);
        reg.setCofinsImp(123.99);
        reg.setNumAcdraw("num acdraw");
        reg.setNumDocImp("123456");
        reg.setPisImp(321.99);
        return reg;
    }

    public static RegC130 createRegC130() {
        RegC130 reg = new RegC130();
        reg.setVlBcIrrf(1.99);
        reg.setVlBcIssqn(1.99);
        reg.setVlBcPrev(1.99);
        reg.setVlIrrf(1.99);
        reg.setVlIssqn(1.99);
        reg.setVlPrev(1.99);
        reg.setVlServNt(1.99);
        return reg;
    }

    public static RegC140 createRegC140() {
        RegC140 reg = new RegC140();
        reg.setDescTit("descr tit");
        reg.setIndEmit(EmissaoDocumento.PROPRIA);
        reg.setIndTit(TipoTituloCredito.DUPLICATA);
        reg.setNumTit("23");
        reg.setQtdParc(3);
        reg.setVlTit(99.99);
        //--
        reg.setRegC141List(createRegC141List());
        return reg;
    }

    public static List<RegC141> createRegC141List() {
        List<RegC141> list = new LinkedList<>();
        list.add(createRegC141());
        list.add(createRegC141());
        list.add(createRegC141());
        return list;
    }

    public static RegC141 createRegC141() {
        RegC141 reg = new RegC141();
        reg.setDtVcto(LocalDate.now());
        reg.setNumParc(1);
        reg.setVlParc(33.33);
        return reg;
    }

    public static RegC160 createRegC160() {
        RegC160 reg = new RegC160();
        reg.setCodPart("0001");
        reg.setPesoBrt(222.22);
        reg.setPesoLiq(200.33);
        reg.setQtdVol(15);
        reg.setUfId("ES");
        reg.setVeicId("MPA-1000");
        return reg;
    }

    public static List<RegC165> createRegC165List() {
        List<RegC165> list = new LinkedList<>();
        list.add(createRegC165());
        list.add(createRegC165());
        list.add(createRegC165());
        return list;
    }

    public static RegC165 createRegC165() {
        RegC165 reg = new RegC165();
        reg.setCodAut("lakdfjalk");
        reg.setCodPart("0001");
        reg.setCpf("123 123 123 11");
        reg.setHora(LocalTime.now());
        reg.setNomMot("Fulano de Tal");
        reg.setNrPasse("213156465");
        reg.setPesoBrt(1500.5);
        reg.setPesoLiq(1400.0);
        reg.setQtdVol(1);
        reg.setTemper(12.0);
        reg.setUfId("RJ");
        reg.setVeicId("AAA-1234");
        return reg;
    }

    public static List<RegC170> createRegC170List() {
        List<RegC170> list = new LinkedList<>();
        list.add(createRegC170());
        list.add(createRegC170());
        list.add(createRegC170());
        return list;
    }

    public static RegC170 createRegC170() {
        RegC170 reg = new RegC170();
        reg.setAliqCofinsPerc(5.5);
        reg.setAliqCofinsReal(10.1);
        reg.setAliqIcms(18.0);
        reg.setAliqIpi(9.9);
        reg.setAliqPisPerc(15.0);
        reg.setAliqPisReal(1.0);
        reg.setAliqSt(1.09);
        reg.setCfop(6101);
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

        //reg.setRegC171List(createRegC171List());
        //reg.setRegC172List(createRegC172List());
        //reg.setRegC173List(createRegC173List());
        //reg.setRegC174List(createRegC174List());
        //reg.setRegC175List(createRegC175List());
        reg.setRegC176List(createRegC176List());
        //reg.setRegC177(createRegC177());
        //reg.setRegC178(createRegC178());
        //reg.setRegC179(createRegC179());

        return reg;
    }

    public static List<RegC171> createRegC171List() {
        List<RegC171> list = new LinkedList<>();
        list.add(createRegC171());
        list.add(createRegC171());
        list.add(createRegC171());
        return list;
    }

    public static RegC171 createRegC171() {
        RegC171 reg = new RegC171();
        reg.setNumTanque("123");
        reg.setQtde(333.33);
        return reg;
    }

    public static List<RegC172> createRegC172List() {
        List<RegC172> list = new LinkedList<>();
        list.add(createRegC172());
        list.add(createRegC172());
        list.add(createRegC172());
        return list;
    }

    public static RegC172 createRegC172() {
        RegC172 reg = new RegC172();
        reg.setAliqIssqn(7.5);
        reg.setVlBcIssqn(123.12);
        reg.setVlIssqn(12.12);
        return reg;
    }

    public static List<RegC173> createRegC173List() {
        List<RegC173> list = new LinkedList<>();
        list.add(createRegC173());
        list.add(createRegC173());
        list.add(createRegC173());
        return list;
    }

    public static RegC173 createRegC173() {
        RegC173 reg = new RegC173();
        reg.setDtFab(LocalDate.now());
        reg.setDtVal(LocalDate.now());
        reg.setIndMed("1");
        reg.setLoteMed("123");
        reg.setQtdItem(12.12);
        reg.setTpProd("0");
        reg.setVlTabMax(12.12);
        return reg;
    }

    public static List<RegC174> createRegC174List() {
        List<RegC174> list = new LinkedList<>();
        list.add(createRegC174());
        list.add(createRegC174());
        list.add(createRegC174());
        return list;
    }

    public static RegC174 createRegC174() {
        RegC174 reg = new RegC174();
        reg.setDescrCompl("descr compl");
        reg.setIndArm("0");
        reg.setNumArm("123");
        return reg;
    }

    public static List<RegC175> createRegC175List() {
        List<RegC175> list = new LinkedList<>();
        list.add(createRegC175());
        list.add(createRegC175());
        list.add(createRegC175());
        return list;
    }

    public static RegC175 createRegC175() {
        RegC175 reg = new RegC175();
        reg.setChassiVeic("123456464984ddf");
        reg.setCnpj("1234567890123");
        reg.setIndVeicOper("0");
        reg.setUf("SP");
        return reg;
    }

    public static List<RegC176> createRegC176List() {
        List<RegC176> list = new LinkedList<>();
        list.add(createRegC176());
        list.add(createRegC176());
        list.add(createRegC176());
        return list;
    }

    public static RegC176 createRegC176() {
        RegC176 reg = new RegC176();
        reg.setCodModUltE("00");
        reg.setCodPartUltE("0001");
        reg.setDtUltE(LocalDate.now());
        reg.setNumDocUltE(123L);
        reg.setQuantUltE(12.12);
        reg.setSerUltE("1");
        reg.setVlUnitBcSt(12.12);
        reg.setVlUnitUltE(12.12);
        reg.setVlUnitBcSt(12.12);
        reg.setChaveNfeUltE("");
        reg.setNumItemUltE(1L);
        reg.setVlUnitBcIcmsUltE(12.12);
        reg.setAliqIcmsUltE(12.12);
        reg.setVlUnitLimiteBcIcmsUltE(12.12);
        reg.setVlUnitIcmsUltE(12.12);
        reg.setAliqStUltE(12.12);
        reg.setVlUnitRes(12.12);
        reg.setCodRespRet(ResponsalvelRetencaoIcmsSt.REMETENTE_DIRETO);
        reg.setCodMotRes(MotivoRessarcimento.OUTROS);
        reg.setChaveNfeRet("");
        reg.setCodPartNfeRet("");
        reg.setSerNfeRet("");
        reg.setNumNfeRet(12L);
        reg.setItemNfeRet(1L);
        reg.setCodDa(ModeloDocumentoArecadacao.GNRE);
        reg.setNumDa("");
        return reg;
    }

    public static RegC177 createRegC177() {
        RegC177 reg = new RegC177();
        reg.setCodSeloIpi("165165ads");
        reg.setQtSeloIpi(123L);
        return reg;
    }

    public static RegC178 createRegC178() {
        RegC178 reg = new RegC178();
        reg.setClEnq("enq");
        reg.setQuantPad(12.12);
        reg.setVlUnid(12.99);
        return reg;
    }

    public static RegC179 createRegC179() {
        RegC179 reg = new RegC179();
        reg.setBcRet(12.12);
        reg.setBcStOrigDest(12.12);
        reg.setIcmsRet(12.12);
        reg.setIcmsStCompl(12.12);
        reg.setIcmsStRep(12.12);
        return reg;
    }

    public static List<RegC190> createRegC190List() {
        List<RegC190> list = new LinkedList<>();
        list.add(createRegC190());
        list.add(createRegC190());
        list.add(createRegC190());
        return list;
    }

    public static RegC190 createRegC190() {
        RegC190 reg = new RegC190();
        reg.setAliqIcms(3.3);
        reg.setCfop(1101);
        reg.setCodObs("123");
        reg.setCstIcms("000");
        reg.setVlBcIcms(123.12);
        reg.setVlBcIcmsSt(123.12);
        reg.setVlIpi(123.12);
        reg.setVlOpr(123.12);
        reg.setVlRedBc(123.12);
        return reg;
    }

    public static List<RegC195> createRegC195List() {
        List<RegC195> list = new LinkedList<>();
        list.add(createRegC195());
        list.add(createRegC195());
        list.add(createRegC195());
        return list;
    }

    public static RegC195 createRegC195() {
        RegC195 reg = new RegC195();
        reg.setCodObs("123");
        reg.setTxtCompl("texto compl");
        reg.setRegC197List(createRegC197List());
        return reg;
    }

    public static List<RegC197> createRegC197List() {
        List<RegC197> list = new LinkedList<>();
        list.add(createRegC197());
        list.add(createRegC197());
        list.add(createRegC197());
        return list;
    }

    public static RegC197 createRegC197() {
        RegC197 reg = new RegC197();
        reg.setAliqIcms(17.0);
        reg.setCodAj("adfad");
        reg.setCodItem("123");
        reg.setDescrComplAj("descre lajl jadl");
        reg.setVlBcIcms(123.12);
        reg.setVlIcms(123.12);
        reg.setVlOutros(12.12);
        return reg;
    }

}
