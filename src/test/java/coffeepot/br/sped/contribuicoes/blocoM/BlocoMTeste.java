package coffeepot.br.sped.contribuicoes.blocoM;

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

import coffeepot.br.sped.contribuicoes.tipos.IndicadorCreditoOriundo;
import coffeepot.br.sped.contribuicoes.tipos.IndicadorTipoAjuste;
import coffeepot.br.sped.contribuicoes.tipos.IndicadorTipoSociedadeCooperativa;
import coffeepot.br.sped.contribuicoes.tipos.IndicadorUtilizacaoCredito;
import coffeepot.br.sped.contribuicoes.tipos.NaturezaCreditoDiferido;
import coffeepot.br.sped.fiscal.config.Config;
import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;
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
import java.util.List;
import org.junit.Test;

/**
 * Class: BlocoMTeste.
 *
 * <p>
 * History:<br><br>
 * - walter - Sep 17, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
public class BlocoMTeste {

    @Test
    public void testBlocoM() throws Exception {
        System.out.println("*** Teste de escrita do BLOCO M inteiro ***");
        File file = new File(Config.TEST_BLOCO_OUT_DIR + "BlocoMContribuicoesTest.txt");

        Writer fw = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(file), StandardCharsets.UTF_8));
        SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

        BlocoM blocoM = createBlocoM(file, spedFiscalWriter);

        spedFiscalWriter.close();

        System.out.println("Arquivo gerado em: " + file.getAbsolutePath());
    }

    private BlocoM createBlocoM(File file, SpedFiscalWriter spedFiscalWriter) throws NoSuchMethodException,
            InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
            IOException {
        BlocoM blocoM = createBlocoM();

        return (BlocoM) Util.createFileFromBloco(blocoM, file, spedFiscalWriter);
    }

    private BlocoM createBlocoM() {
        BlocoM blocoM = new BlocoM();

        blocoM.setRegM001(new RegM001(IndicadorMovimento.COM_DADOS));
        blocoM.setRegM100List(createRegM100List());
        blocoM.setRegM200(createRegM200());
        blocoM.setRegM300List(createRegM300List());
        blocoM.setRegM350(createRegM350());
        blocoM.setRegM400List(createRegM400List());
        blocoM.setRegM500List(createRegM500List());
        blocoM.setRegM600List(createRegM600List());
        blocoM.setRegM700List(createRegM700List());
        blocoM.setRegM800List(createRegM800List());

        return blocoM;
    }

    private List<RegM100> createRegM100List() {
        RegM100 reg = new RegM100();
        
        reg.setAliqPis(1.65);
        reg.setAliqPisQuant(0.0);
        reg.setCodCred("001");
        reg.setIndCredOri(IndicadorCreditoOriundo.OPERACOES_PROPRIAS);
        reg.setIndDescCred(IndicadorUtilizacaoCredito.UTILIZACAO_TOTAL);
        reg.setQuantBcPis(0.0);
        reg.setSldCred(100.0);
        reg.setVlAjusAcres(0.0);
        reg.setVlAjusReduc(0.0);
        reg.setVlBcPis(100.0);
        reg.setVlCred(1.65);
        reg.setVlCredDesc(0.0);
        reg.setVlCredDif(0.0);
        reg.setVlCredDisp(0.0);

        reg.setRegM105List(createRegM105List());
        reg.setRegM110List(createRegM110List());

        return Collections.singletonList(reg);
    }

    private RegM200 createRegM200() {
        RegM200 reg = new RegM200();
        
        reg.setVlContCumRec(0.0);
        reg.setVlContNcRec(0.0);
        reg.setVlOutDedCum(0.0);
        reg.setVlOutDedNc(0.0);
        reg.setVlRetCum(0.0);
        reg.setVlRetNc(0.0);
        reg.setVlTotContCumPer(0.0);
        reg.setVlTotContNcDev(0.0);
        reg.setVlTotContNcPer(0.0);
        reg.setVlTotContRec(0.0);
        reg.setVlTotCredDesc(0.0);
        reg.setVlTotCredDescAnt(0.0);

        reg.setRegM205List(createRegM205List());
        reg.setRegM210List(createRegM210List());

        return reg;
    }

    private List<RegM300> createRegM300List() {
        RegM300 reg = new RegM300();
        
        reg.setCodCont("01010101");
        reg.setDtReceb(LocalDate.now());
        reg.setNatCredDesc(NaturezaCreditoDiferido.CREDITO_ALIQ_BASICA);
        reg.setPerApur("122020");
        reg.setVlContApurDifer(100.0);
        reg.setVlContDiferAnt(0.0);
        reg.setVlCredDescDifer(0.0);
        
        return Collections.singletonList(reg);
    }

    private RegM350 createRegM350() {
        RegM350 reg = new RegM350();
        
        reg.setAliqPisFol(5.0);
        reg.setVlExcBc(50000.0);
        reg.setVlTotBc(5000.0);
        reg.setVlTotContFol(5000.0);
        reg.setVlTotFol(5000.0);

        return reg;
    }

    private List<RegM400> createRegM400List() {
        RegM400 reg = new RegM400();
        
        reg.setCodCta("0101010");
        reg.setCstPis("01");
        reg.setDescCompl("TESTE");
        reg.setVlTotRec(10000.0);

        reg.setRegM410List(createRegM410List());

        return Collections.singletonList(reg);
    }

    private List<RegM500> createRegM500List() {
        RegM500 reg = new RegM500();
        
        reg.setAliqCofins(3.65);
        reg.setAliqCofinsQuant(0.0);
        reg.setCodCred("001");
        reg.setIndCredOri(IndicadorCreditoOriundo.OPERACOES_PROPRIAS);
        reg.setIndDescCred(IndicadorUtilizacaoCredito.UTILIZACAO_TOTAL);
        reg.setQuantBcCofins(0.0);
        reg.setSldCred(100.0);
        reg.setVlAjusAcres(0.0);
        reg.setVlAjusReduc(0.0);
        reg.setVlBcCofins(100.0);
        reg.setVlCred(3.65);
        reg.setVlCredDesc(0.0);
        reg.setVlCredDifer(0.0);
        reg.setVlCredDisp(0.0);

        reg.setRegM505List(createRegM505List());
        reg.setRegM510List(createRegM510List());

        return Collections.singletonList(reg);
    }

    private List<RegM600> createRegM600List() {
        RegM600 reg = new RegM600();
        
        reg.setVlContCumRec(0.0);
        reg.setVlContNcRec(0.0);
        reg.setVlOutDedCum(0.0);
        reg.setVlOutDedNc(0.0);
        reg.setVlRetCum(0.0);
        reg.setVlRetNc(0.0);
        reg.setVlTotContCumPer(0.0);
        reg.setVlTotContNcDev(0.0);
        reg.setVlTotContNcPer(0.0);
        reg.setVlTotContRec(0.0);
        reg.setVlTotCredDesc(0.0);
        reg.setVlTotCredDescAnt(0.0);

        reg.setRegM605List(createRegM605List());
        reg.setRegM610List(createRegM610List());

        return Collections.singletonList(reg);
    }

    private List<RegM700> createRegM700List() {
        RegM700 reg = new RegM700();
        
        reg.setCodCont("010101");
        reg.setDtReceb(LocalDate.now());
        reg.setNatCredDesc(NaturezaCreditoDiferido.CREDITO_ALIQ_BASICA);
        reg.setPerApur("122020");
        reg.setVlContApurDifer(100.0);
        reg.setVlContDiferAnt(0.0);
        reg.setVlCredDescDifer(0.0);

        return Collections.singletonList(reg);
    }

    private List<RegM800> createRegM800List() {
        RegM800 reg = new RegM800();
        
        reg.setCodCta("010101");
        reg.setCstCofins("01");
        reg.setDescCompl("TESTE");
        reg.setVlTotRec(0.0);
        reg.setRegM810List(createRegM810List());

        return Collections.singletonList(reg);
    }

    private List<RegM105> createRegM105List() {
        RegM105 reg = new RegM105();
        
        reg.setCstPis("01");
        reg.setDescCred("TESTE");
        reg.setNatBcCred("001");
        reg.setQuantBcPis(0.0);
        reg.setQuantBcPisTot(0.0);
        reg.setVlBcPis(1.65);
        reg.setVlBcPisNc(0.0);
        reg.setVlBcPisTot(1.65);

        return Collections.singletonList(reg);
    }

    private List<RegM110> createRegM110List() {
        RegM110 reg = new RegM110();
        
        reg.setCodAj("01");
        reg.setDescrAj("TESTE AJUSTES");
        reg.setDtRef(LocalDate.now());
        reg.setIndAj(IndicadorTipoAjuste.AJUSTE_REDUCAO);
        reg.setNumDoc("0123456");
        reg.setVlAj(0.0);

        return Collections.singletonList(reg);

    }

    private List<RegM205> createRegM205List() {
        RegM205 reg = new RegM205();
        
        reg.setCodRec("012345");
        reg.setNumCampo("01");
        reg.setVlDebito(0.0);

        return Collections.singletonList(reg);

    }

    private List<RegM210> createRegM210List() {
        RegM210 reg = new RegM210();
        
        reg.setAliqPis(1.65);
        reg.setAliqPisQuant(0.0);
        reg.setCodCont("010101");
        reg.setQuantBcPis(0.0);
        reg.setVlAjusAcres(0.0);
        reg.setVlAjusReduc(0.0);
        reg.setVlBcCont(1000.0);
        reg.setVlContApur(0.0);
        reg.setVlContDifer(0.0);
        reg.setVlContDiferAnt(0.0);
        reg.setVlContPer(0.0);
        reg.setVlRecBrt(0.0);
        
        reg.setRegM211(createRegM211());
        reg.setRegM220List(createRegM220List());
        reg.setRegM230List(createRegM230List());
        
        return Collections.singletonList(reg);
    }

    private List<RegM410> createRegM410List() {
        RegM410 reg = new RegM410();
    
        reg.setCodCta("0101010");
        reg.setDescCompl("TESTE");
        reg.setNatRec("010");
        reg.setVlRec(10000.0);
       
        return Collections.singletonList(reg);
    }

    private List<RegM505> createRegM505List() {
        RegM505 reg = new RegM505();
        
        reg.setCstCofins("01");
        reg.setDescCred("TESTE");
        reg.setNatBcCred("001");
        reg.setQuantBcCofins(0.0);
        reg.setQuantBcCofinsTot(0.0);
        reg.setVlBcCofins(100.0);
        reg.setVlBcCofinsNc(0.0);
        reg.setVlBcCofinsTot(0.0);
        
        return Collections.singletonList(reg);
    }

    private List<RegM510> createRegM510List() {
        RegM510 reg = new RegM510();
        
        reg.setCodAj("01");
        reg.setDescrAj("TESTE AJUSTES");
        reg.setDtRef(LocalDate.now());
        reg.setIndAj(IndicadorTipoAjuste.AJUSTE_REDUCAO);
        reg.setNumDoc("0123456");
        reg.setVlAj(0.0);
        
        return Collections.singletonList(reg);

    }

    private List<RegM605> createRegM605List() {
        RegM605 reg = new RegM605();
        
        reg.setCodRec("012345");
        reg.setNumCampo("01");
        reg.setVlDebito(100.0);
                
        return Collections.singletonList(reg);
    }

    private List<RegM610> createRegM610List() {
        RegM610 reg = new RegM610();
        
        reg.setAliqCofins(3.65);
        reg.setAliqCofinsQuant(0.0);
        reg.setCodCont("010101");
        reg.setQuantBcCofins(0.0);
        reg.setVlAjusAcres(0.0);
        reg.setVlAjusReduc(0.0);
        reg.setVlBcCont(1000.0);
        reg.setVlContApur(0.0);
        reg.setVlContDifer(0.0);
        reg.setVlContDiferAnt(0.0);
        reg.setVlContPer(0.0);
        reg.setVlRecBrt(0.0);
        
        return Collections.singletonList(reg);
    }

    private List<RegM810> createRegM810List() {
        RegM810 reg = new RegM810();
        
        reg.setCodCta("010101");
        reg.setDescCompl("TESTE");
        reg.setNatRec("010");
        reg.setVlRec(100.0);
        
        return Collections.singletonList(reg);
    }

    private RegM211 createRegM211() {
        RegM211 reg = new RegM211();
        
        reg.setIndTipCoop(IndicadorTipoSociedadeCooperativa.OUTRAS);
        reg.setVlBcCont(100.0);
        reg.setVlBcContAntExcCoop(100.0);
        reg.setVlExcCoopGer(100.0);
        reg.setVlExcEspCoop(100.0);
        
        return reg;
    }

    private List<RegM220> createRegM220List() {
        RegM220 reg = new RegM220();
        
        reg.setCodAj("010");
        reg.setDescrAj("Teste");
        reg.setDtRef(LocalDate.now());
        reg.setIndAj(IndicadorTipoAjuste.AJUSTE_REDUCAO);
        reg.setNumDoc("001012");
        reg.setVlAj(1000.0);
        
        reg.setRegM225List(createRegM225List());
        
        return Collections.singletonList(reg);
    }

    private List<RegM230> createRegM230List() {
        RegM230 reg = new RegM230();
        
        reg.setCnpj("16.200.121/0001-16");
        reg.setCodCred("010");
        reg.setVlContDif(0.0);
        reg.setVlCredDif(0.0);
        reg.setVlNaoReceb(0.0);
        reg.setVlVend(0.0);
        
        return Collections.singletonList(reg);
    }

    private List<RegM225> createRegM225List() {
        RegM225 reg = new RegM225();
        
        reg.setCodCta("010101");
        reg.setCstPis("01");
        reg.setDescAj("Desc Ajustes");
        reg.setDetAliq(1.1);
        reg.setDetBcCred(1000.0);
        reg.setDetValorAj(50.0);
        reg.setDtOperAj(LocalDate.now());
        reg.setInfoCompl("Teste Info Compl.");
        
        return Collections.singletonList(reg);
    }

}
