package coffeepot.br.sped.contribuicoes.bloco1;

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

import coffeepot.br.sped.contribuicoes.tipos.IndicadorOrigemCredito;
import coffeepot.br.sped.fiscal.arquivo.bloco1.Reg1001;
import coffeepot.br.sped.fiscal.config.Config;
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;
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
import java.util.List;
import org.junit.Test;

/**
 * Class: Bloco1Test.
 *
 * <p>
 * History:<br><br>
 *      - Walter Portugal - Sep 17, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author Walter Portugal
 * @since 2.0.0
 *
 */

public class Bloco1Test {
    
    @Test
    public void testBloco1() throws Exception {
        System.out.println("*** Teste de escrita do BLOCO 1 inteiro ***");
        File file = new File(Config.TEST_BLOCO_OUT_DIR + "Bloco1ContribuicoesTest.txt");

        Writer fw = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(file), StandardCharsets.UTF_8));
        SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

        Bloco1 bloco1 = createBloco1(file, spedFiscalWriter);

        spedFiscalWriter.close();

        System.out.println("Arquivo gerado em: " + file.getAbsolutePath());
    }

    private Bloco1 createBloco1(File file, SpedFiscalWriter spedFiscalWriter) throws NoSuchMethodException,
            InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
            IOException {
        Bloco1 bloco1 = createBloco1();

        return (Bloco1) Util.createFileFromBloco(bloco1, file, spedFiscalWriter);
    }

    private Bloco1 createBloco1() {
        Bloco1 bloco1 = new Bloco1();
        
        bloco1.setReg1001(new Reg1001(IndicadorMovimento.COM_DADOS));
        bloco1.setReg1010List(createReg1010List());
        bloco1.setReg1020List(createReg1020List());
        bloco1.setReg1100List(createReg1100List());
        bloco1.setReg1500List(createReg1500List());
        bloco1.setReg1900List(createReg1900List());
        
        return bloco1;
    }

    private List<Reg1010> createReg1010List() {
        Reg1010 reg = new Reg1010();
        
        reg.setDescDecJud("Descrição Dec. Jud.");
        reg.setDtSentJud(LocalDate.now());
        reg.setIdSecJud("1");
        reg.setIdVara("1");
        reg.setIndNatAcao(Reg1010.IndicadorNaturezaAcaoJudicial.OUTROS);
        reg.setNumProc("0123456");
        
        return Collections.singletonList(reg);
    }

    private List<Reg1020> createReg1020List() {
        Reg1020 reg = new Reg1020();
        
        reg.setDtDecAdm(LocalDate.now());
        reg.setIndNatAcao(Reg1020.IndicadorNaturezaAcao.OUTROS);
        reg.setNumProc("0123456");
        
        return Collections.singletonList(reg);
    }

    private List<Reg1100> createReg1100List() {
        Reg1100 reg = new Reg1100();
        
        reg.setCnpjSuc("00.000.123/0003-40");
        reg.setCodCred("001");
        reg.setOrigCred(Reg1100.IndicadorOrigemCredito.CREDITO_OPERACOES_PROPRIAS);
        reg.setPerApuCred("122020");
        reg.setSdCredDispEfd(0.0);
        reg.setSldCredFim(0.0);
        reg.setVlCredApu(0.0);
        reg.setVlCredDcompEfd(0.0);
        reg.setVlCredDcompPaAnt(0.0);
        reg.setVlCredDescEfd(0.0);
        reg.setVlCredDescPaAnt(0.0);
        reg.setVlCredExtApu(0.0);
        reg.setVlCredOut(0.0);
        reg.setVlCredPerEfd(0.0);
        reg.setVlCredPerPaAnt(0.0);
        reg.setVlTotCredApu(0.0);
        
        reg.setReg1101List(createReg1101List());
        
        return Collections.singletonList(reg);
    }

    private List<Reg1500> createReg1500List() {
        Reg1500 reg = new Reg1500();
        
        reg.setCnpjSuc("00.000.123/0003-40");
        reg.setCodCred("001");
        reg.setOrigCred(Reg1100.IndicadorOrigemCredito.CREDITO_OPERACOES_PROPRIAS);
        reg.setPerApuCred("122020");
        reg.setSdCredDispEfd(0.0);
        reg.setSldCredFim(0.0);
        reg.setVlCredApu(0.0);
        reg.setVlCredDcompEfd(0.0);
        reg.setVlCredDcompPaAnt(0.0);
        reg.setVlCredDescEfd(0.0);
        reg.setVlCredDescPaAnt(0.0);
        reg.setVlCredExtApu(0.0);
        reg.setVlCredOut(0.0);
        reg.setVlCredPerEfd(0.0);
        reg.setVlCredPerPaAnt(0.0);
        reg.setVlTotCredApu(0.0);
        
        reg.setReg1501List(createReg1501List());
        
        return Collections.singletonList(reg);
    }

    private List<Reg1900> createReg1900List() {
        Reg1900 reg = new Reg1900();
        
        reg.setCfop(1102);
        reg.setCnpj("00.000.001/0001-16");
        reg.setCodCta("010101");
        reg.setCodMod(DocumentoFiscal.M55);
        reg.setCodSit(SituacaoDocumento.REGULAR);
        reg.setCstCofins("01");
        reg.setCstPis("01");
        reg.setInfCompl("Complementar do Caralho");
        reg.setQuantDoc(0);
        reg.setSer("1");
        reg.setSubSer("");
        reg.setVlTotRec(0.0);
        
        return Collections.singletonList(reg);
    }

    private List<Reg1101> createReg1101List() {
        Reg1101 reg = new Reg1101();
        
        reg.setAliqPis(1.65);
        reg.setCfop(5102);
        reg.setChvNfe("0123456789 0123456789 0123456789 0123456789 0123");
        reg.setCnpj("00.000.121/0001-13");
        reg.setCodCcus("01");
        reg.setCodCta("010101");
        reg.setCodItem("010101");
        reg.setCodMod(DocumentoFiscal.M55);
        reg.setCodPart("C000001");
        reg.setCstPis("01");
        reg.setDescCompl("Desc. Complementar");
        reg.setDtOper(LocalDate.now());
        reg.setIndOrigCred(IndicadorOrigemCredito.MERCADO_INTERNO);
        reg.setNatBcCred("0101");
        reg.setNumDoc("0123456");
        reg.setPerEscrit(0.0);
        reg.setSer("1");
        reg.setSubSer("");
        reg.setVlBcPis(0.0);
        reg.setVlOper(0.0);
        reg.setVlPis(0.0);
        
        return Collections.singletonList(reg);
    }

    private List<Reg1501> createReg1501List() {
        Reg1501 reg = new Reg1501();
        
        reg.setAliqCofins(1.65);
        reg.setCfop(5102);
        reg.setChvNfe("0123456789 0123456789 0123456789 0123456789 0123");
        reg.setCnpj("00.000.121/0001-13");
        reg.setCodCcus("01");
        reg.setCodCta("010101");
        reg.setCodItem("010101");
        reg.setCodMod(DocumentoFiscal.M55);
        reg.setCodPart("C000001");
        reg.setCstCofins("01");
        reg.setDescCompl("Desc. Complementar");
        reg.setDtOper(LocalDate.now());
        reg.setIndOrigCred(IndicadorOrigemCredito.MERCADO_INTERNO);
        reg.setNatBcCred("0101");
        reg.setNumDoc("0123456");
        reg.setPerEscrit(0.0);
        reg.setSer("1");
        reg.setSubSer("");
        reg.setVlBcCofins(0.0);
        reg.setVlOper(0.0);
        reg.setVlCofins(0.0);
        
        return Collections.singletonList(reg);

    }


}
