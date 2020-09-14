package coffeepot.br.sped.fiscal.contribuicoes.bloco0;

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
import coffeepot.br.sped.contribuicoes.bloco0.Bloco0;
import coffeepot.br.sped.contribuicoes.bloco0.Reg0000;
import coffeepot.br.sped.contribuicoes.bloco0.Reg0001;
import coffeepot.br.sped.contribuicoes.bloco0.Reg0100;
import coffeepot.br.sped.contribuicoes.bloco0.Reg0110;
import coffeepot.br.sped.contribuicoes.bloco0.Reg0111;
import coffeepot.br.sped.contribuicoes.bloco0.Reg0120;
import coffeepot.br.sped.contribuicoes.bloco0.Reg0140;
import coffeepot.br.sped.contribuicoes.bloco0.Reg0145;
import coffeepot.br.sped.contribuicoes.bloco0.Reg0150;
import coffeepot.br.sped.contribuicoes.bloco0.Reg0190;
import coffeepot.br.sped.contribuicoes.bloco0.Reg0200;
import coffeepot.br.sped.contribuicoes.bloco0.Reg0208;
import coffeepot.br.sped.contribuicoes.bloco0.Reg0500;
import coffeepot.br.sped.contribuicoes.tipos.IndicadorAtividadePrepoderante;
import coffeepot.br.sped.contribuicoes.tipos.IndicadorNaturezaPj;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0205;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0206;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0400;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0450;
import coffeepot.br.sped.fiscal.config.Config;
import coffeepot.br.sped.fiscal.tipos.FinalidadeArquivo;
import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;
import coffeepot.br.sped.fiscal.tipos.NaturezaContaContabil;
import coffeepot.br.sped.fiscal.tipos.TipoContaContabil;
import coffeepot.br.sped.fiscal.tipos.VersaoLayout;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.junit.Test;

/**
 * Class: Bloco0Test.
 *
 * <p>
 * History:<br><br>
 * - walter - Sep 14, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
public class Bloco0Test {

    public static Bloco0 createBloco0(File file, SpedFiscalWriter spedFiscalWriter) throws NoSuchMethodException,
            InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
            IOException {
        Bloco0 bloco0 = getDataBloco0();

        return (Bloco0) Util.createFileFromBloco(bloco0, file, spedFiscalWriter);
    }

    public static Bloco0 getDataBloco0() {
        Bloco0 bloco0 = new Bloco0();

        bloco0.setReg0000(createReg0000());
        bloco0.setReg0001(createReg0001());
        bloco0.setReg0100List(create0100List());
        bloco0.setReg0110(createReg0110());
        bloco0.setReg0120List(createReg0120List());
        bloco0.setReg0140List(createReg0140List());
        bloco0.setReg0500List(createReg0500List());

        return bloco0;
    }

    public static Reg0000 createReg0000() {
        Reg0000 reg = new Reg0000();

        reg.setCodVer(VersaoLayout.VERSAO_011);
        reg.setTipoEscrit(FinalidadeArquivo.ARQUIVO_ORIGINAL);
        //reg.setIndSitEsp(IndicadorSituacaoEspecial.ABERTURA);
        //reg.setNumRecAnterior(numRecAnterior);        
        reg.setDtFin(LocalDate.now());
        reg.setDtIni(LocalDate.now());

        reg.setNome("EMPRESA FATURA PRA CARAMBA");
        reg.setCnpj("36.293.264/0001-28");
        reg.setUf("RJ");
        reg.setCodMun(3302403);
        //reg.setSuframa(suframa);
        reg.setIndNatPj(IndicadorNaturezaPj.PESSOA_JUR_GERAL);
        reg.setIndAtiv(IndicadorAtividadePrepoderante.ATIVIDADE_DE_COMERCIO);

        //reg.setUf("ES");
        return reg;
    }

    public static Reg0001 createReg0001() {
        return new Reg0001(IndicadorMovimento.COM_DADOS);
    }

    public static List<Reg0100> create0100List() {
        Reg0100 reg = new Reg0100();

        reg.setBairro("Bairro");
        reg.setCep("29.700-000");
        reg.setCompl("Complemento");
        reg.setEmail("email@email.com");
        reg.setEnd("Rua Sem Nome");
        reg.setFax("(27)7777-5555");
        reg.setFone("(27)7777-5555");
        reg.setNum("s/n");
        reg.setCnpj("12.123.123/0123-99");
        reg.setCrc("CRC 1516165161");
        reg.setCpf("123.123.123-99");
        reg.setNome("Contador João");

        return Collections.singletonList(reg);
    }

    public static Reg0110 createReg0110() {
        Reg0110 reg = new Reg0110();

        reg.setCodIncTrib(Reg0110.CodigoIncidenciaTributaria.INCIDENCIA_EXCLUSIVAMENTE_NAO_CUMULATIVO);
        reg.setIndAproCred(Reg0110.IndicadorApropriacaoCredito.APROPRIACAO_DIRETA);
        reg.setCodTipoCont(Reg0110.ContribuicaoApuradaPeriodo.APURACAO_CONTRIB_EXCLUSIVA_ALIQ_BASICA);
        reg.setIndRegCum(Reg0110.IndicadorRegimeCumulativo.REGIME_DE_CAIXA);
        reg.setReg0111(createReg0111());

        return reg;
    }

    public static Reg0111 createReg0111() {
        Reg0111 reg = new Reg0111();

        reg.setRecBruNcumTribMi(10000.0);
        reg.setRecBruNcumNtMi(0.0);
        reg.setRecBruNcumExp(100000.0);
        reg.setRecBruCum(0.0);
        reg.setRecBruTotal(110000.0);

        return reg;
    }

    public static List<Reg0120> createReg0120List() {
        Reg0120 reg = new Reg0120();

        reg.setMesRefer("122020");

        return Collections.singletonList(reg);
    }

    public static List<Reg0140> createReg0140List() {
        Reg0140 reg = new Reg0140();

        reg.setCodEst("000001");
        reg.setNome("TESTE ESTABELECIMENTO");
        reg.setCnpj("00.011.223/0001-11");
        reg.setUf("SP");
        reg.setIe("123456456123");
        reg.setCodMun("3512345");
        //reg.setIm(im);
        //reg.setSuframa(suframa);

        reg.setReg0145(createReg0145());
        reg.setReg0150List(createReg0150List());
        reg.setReg0190List(createReg0190List());
        reg.setReg0200List(createReg0200List());
        reg.setReg0400List(createReg0400List());
        reg.setReg0450List(createReg0450List());

        return Collections.singletonList(reg);
    }

    public static List<Reg0150> createReg0150List() {
        List<Reg0150> list = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            list.add(createReg0150());
        }
        return list;
    }

    public static Reg0150 createReg0150() {
        Reg0150 reg = new Reg0150();

        reg.setCodPart(UUID.randomUUID().toString());
        reg.setNome("João da Silva");
        reg.setBairro("Bairro");
        reg.setCnpj("12.123.123/0001-99");
        reg.setCodMun(3302403);
        reg.setCodPais(1);

        reg.setCompl("Complemento");
        reg.setCpf("123.456.789-01");
        reg.setEnd("Rua Qualquer");
        reg.setIe("0IE 0001234567A");

        reg.setNum("S/N");

        return reg;
    }

    public static Reg0145 createReg0145() {
        Reg0145 reg = new Reg0145();

        reg.setCodIncTrib(Reg0145.IndicadorIncidenciaTributaria.CONTRIBUICAO_PREV_EXCLUSIVA_REC_BRUTA);
        reg.setVlRecTot(10000.0);
        reg.setVlRecAtiv(5000.0);
        reg.setVlRecDemaisAtiv(1.0);
        reg.setInfoCompl("");

        return reg;
    }

    public static List<Reg0190> createReg0190List() {
        List<Reg0190> list = new LinkedList<>();

        Reg0190 reg = new Reg0190();
        reg.setUnid("un");
        reg.setDescr("Unidade");
        list.add(reg);

        reg = new Reg0190();
        reg.setUnid("kg");
        reg.setDescr("Kilograma");
        list.add(reg);

        reg = new Reg0190();
        reg.setUnid("m");
        reg.setDescr("Metro");
        list.add(reg);

        reg = new Reg0190();
        reg.setUnid("cx");
        reg.setDescr("Caixa");
        list.add(reg);

        reg = new Reg0190();
        reg.setUnid("kwh");
        reg.setDescr("Kilowatts/hora");
        list.add(reg);

        return list;
    }

    public static List<Reg0200> createReg0200List() {
        List<Reg0200> list = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            list.add(createReg0200());
        }
        return list;
    }

    public static Reg0200 createReg0200() {

        Reg0200 reg = new Reg0200();

        reg.setAliqIcms(17d);
        reg.setCodAntItem("CODIGO ANTERIOR");
        reg.setCodBarra("CODIGO DE BARRAS");
        reg.setCodGen("80");
        reg.setCodItem("CODIGO ITEM");
        reg.setCodNcm("NCM88888889");
        reg.setDescrItem("Descrição do item");
        reg.setExIpi("001");
        reg.setTipoItem("00");
        reg.setUnidInv("un");

        reg.setReg0205List(createReg0205List());
        
        Reg0206 reg0206 = new Reg0206();
        reg0206.setCodComb("CodigoComb");
        
        reg.setReg0206(reg0206);
        
        Reg0208 reg0208 = new Reg0208();
        
        reg0208.setCodGru("01");
        reg0208.setCodTab(Reg0208.CodigoTabelaAnexoIII.TABELA_I);
        reg0208.setMarcaCom("MARCA");
        
        reg.setReg0208(reg0208);

        return reg;
    }

    public static List<Reg0205> createReg0205List() {
        List<Reg0205> reg0205List = new ArrayList<>();

        Reg0205 reg0205 = new Reg0205();
        reg0205.setCodAntItem("CODIGO ANTERIOR");
        reg0205.setDescrAntItem("Descricao anterior");
        reg0205.setDtIni(LocalDate.now());
        reg0205.setDtFim(reg0205.getDtIni());
        reg0205List.add(reg0205);
        reg0205 = new Reg0205();
        reg0205.setCodAntItem("CODIGO ANTERIOR 2");
        reg0205.setDescrAntItem("Descricao anterior 2");
        reg0205.setDtIni(LocalDate.now());
        reg0205.setDtFim(reg0205.getDtIni());
        reg0205List.add(reg0205);
        reg0205 = new Reg0205();
        reg0205.setCodAntItem("CODIGO ANTERIOR 3");
        reg0205.setDescrAntItem("Descricao anterior 3");
        reg0205.setDtIni(LocalDate.now());
        reg0205.setDtFim(reg0205.getDtIni());
        reg0205List.add(reg0205);

        return reg0205List;
    }
    
    public static List<Reg0400> createReg0400List() {
        List<Reg0400> list = new LinkedList<>();

        Reg0400 reg = new Reg0400();
        reg.setCodNat("1");
        reg.setDescrNat("Vendas");
        list.add(reg);

        reg = new Reg0400();
        reg.setCodNat("2");
        reg.setDescrNat("Industrialização");
        list.add(reg);

        reg = new Reg0400();
        reg.setCodNat("3");
        reg.setDescrNat("Devolução");
        list.add(reg);

        return list;
    }
    
    public static List<Reg0450> createReg0450List() {
        List<Reg0450> list = new LinkedList<>();

        Reg0450 reg = new Reg0450();
        reg.setCodInf("COD1");
        reg.setTxt("Texto da informação complementar  ");
        list.add(reg);

        reg = new Reg0450();
        reg.setCodInf("COD2");
        reg.setTxt("Texto da informação complementar 2");
        list.add(reg);

        return list;
    }

    public static List<Reg0500> createReg0500List() {
        List<Reg0500> reg0500List = new ArrayList<>();
        
        Reg0500 reg;

        reg = new Reg0500();
        reg.setCodCta("cod conta");
        reg.setCodNatCc(NaturezaContaContabil.ATIVO);
        reg.setDtAlt(LocalDate.now());
        reg.setIndCta(TipoContaContabil.SINTETICA);
        reg.setNivel(1);
        reg.setNomeCta("Nome da conta");
        reg0500List.add(reg);

        reg = new Reg0500();
        reg.setCodCta("cod conta 2");
        reg.setCodNatCc(NaturezaContaContabil.PASSIVO);
        reg.setDtAlt(LocalDate.now());
        reg.setIndCta(TipoContaContabil.ANALITICA);
        reg.setNivel(1);
        reg.setNomeCta("Nome da conta 2");
        reg0500List.add(reg);
        
        return reg0500List;
    }

    @Test
    public void testBloco0() throws Exception {
        System.out.println("*** Teste de escrita do BLOCO 0 inteiro ***");
        File file = new File(Config.TEST_BLOCO_OUT_DIR + "Bloco0ContribuicoesTest.txt");

        Writer fw = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(file), StandardCharsets.UTF_8));
        SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

        Bloco0 bloco0 = createBloco0(file, spedFiscalWriter);

        spedFiscalWriter.close();

        System.out.println("Arquivo gerado em: " + file.getAbsolutePath());
    }

}
