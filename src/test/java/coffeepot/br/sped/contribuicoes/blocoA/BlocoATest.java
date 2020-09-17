package coffeepot.br.sped.contribuicoes.blocoA;

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

import coffeepot.br.sped.contribuicoes.blocoA.BlocoA;
import coffeepot.br.sped.contribuicoes.blocoA.RegA001;
import coffeepot.br.sped.contribuicoes.blocoA.RegA010;
import coffeepot.br.sped.contribuicoes.blocoA.RegA100;
import coffeepot.br.sped.contribuicoes.blocoA.RegA120;
import coffeepot.br.sped.contribuicoes.blocoA.RegA170;
import coffeepot.br.sped.contribuicoes.tipos.IndicadorOrigemCredito;
import coffeepot.br.sped.fiscal.config.Config;
import coffeepot.br.sped.fiscal.tipos.CondicaoPagamento;
import coffeepot.br.sped.fiscal.tipos.EmissaoDocumento;
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
 * Class: BlocoATest.
 *
 * <p>
 * History:<br><br>
 *      - walter - Sep 14, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */

public class BlocoATest {
    
    @Test
    public void testBlocoA() throws Exception {
        System.out.println("*** Teste de escrita do BLOCO A inteiro ***");
        File file = new File(Config.TEST_BLOCO_OUT_DIR + "BlocoAContribuicoesTest.txt");

        Writer fw = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(file), StandardCharsets.UTF_8));
        SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

        BlocoA blocoA = createBlocoA(file, spedFiscalWriter);

        spedFiscalWriter.close();

        System.out.println("Arquivo gerado em: " + file.getAbsolutePath());
    }

    private BlocoA createBlocoA(File file, SpedFiscalWriter spedFiscalWriter) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
        BlocoA blocoA = createBlocoA();
        
        return (BlocoA) Util.createFileFromBloco(blocoA, file, spedFiscalWriter);
    }

    private BlocoA createBlocoA() {
        BlocoA blocoA = new BlocoA();
        
        blocoA.setRegA001(new RegA001(IndicadorMovimento.COM_DADOS));
        blocoA.setRegA010List(createRegA010List());
        
        return blocoA;
    }

    private List<RegA010> createRegA010List() {
        RegA010 regA010 = new RegA010();
        
        regA010.setCnpj("36.293.264/0001-28");
        regA010.setRegA100List(createRegA100List());
        
        return Collections.singletonList(regA010);
    }

    private List<RegA100> createRegA100List() {
        RegA100 regA100 = new RegA100();
        
        regA100.setChvNfse("012345678901234567890123456789012345678901234567890123456789");
        regA100.setCodPart("F00001");
        regA100.setCodSit(SituacaoDocumento.REGULAR);
        regA100.setDtDoc(LocalDate.now());
        regA100.setDtExeServ(LocalDate.now());
        regA100.setIndEmit(EmissaoDocumento.TERCEIROS);
        regA100.setIndPgto(CondicaoPagamento.A_VISTA);
        regA100.setNumDoc(new Long(12345678));
        regA100.setSer("1");
        regA100.setSub("");
        regA100.setVlBcCofins(1000.0);
        regA100.setVlBcPis(1000.0);
        regA100.setVlCofins(36.5);
        regA100.setVlCofinsRet(0.0);
        regA100.setVlDesc(0.0);
        regA100.setVlDoc(1000.0);
        regA100.setVlIss(50.0);
        regA100.setVlPis(16.5);
        regA100.setVlPisRet(0.0);
        
        regA100.setRegA120List(createRegA120List());
        regA100.setRegA170List(createRegA170List());
        
        return Collections.singletonList(regA100);
        
    }

    private List<RegA120> createRegA120List() {
        RegA120 regA120 = new RegA120();
        
        regA120.setDtPagCofins(LocalDate.now());
        regA120.setDtPagPis(LocalDate.now());
        regA120.setLocExeServ(RegA120.LocalExecServico.EXECUTADO_PAIS);
        regA120.setVlBcCofins(1000.0);
        regA120.setVlBcPis(1000.0);
        regA120.setVlCofinsImp(36.5);
        regA120.setVlPisImp(16.5);
        regA120.setVlTotServ(1000.0);
        
        return Collections.singletonList(regA120);
    }

    private List<RegA170> createRegA170List() {
       RegA170 regA170 = new RegA170();
       
       regA170.setAliqCofins(3.65);
       regA170.setAliqPis(1.65);
       regA170.setCodCcus("01");
       regA170.setCodCta("010101");
       regA170.setCodItem("000000001");
       regA170.setCstCofins("01");
       regA170.setCstPis("01");
       regA170.setDescrCompl("Descrição Complementar");
       regA170.setIndOrigCred(IndicadorOrigemCredito.MERCADO_INTERNO);
       //regA170.setNatBcCred("");
       regA170.setNumItem(1);
       regA170.setVlBcCofins(1000.0);
       regA170.setVlBcPis(1000.0);
       regA170.setVlCofins(36.5);
       regA170.setVlDesc(0.0);
       regA170.setVlItem(1000.0);
       regA170.setVlPis(1000.0);
       
       return Collections.singletonList(regA170);
    }
    
    

}
