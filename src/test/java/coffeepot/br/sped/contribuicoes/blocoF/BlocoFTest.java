package coffeepot.br.sped.contribuicoes.blocoF;

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

import coffeepot.br.sped.contribuicoes.tipos.IdentificadorBensAtivoImobilizado;
import coffeepot.br.sped.contribuicoes.tipos.IndicadorOrigemCredito;
import coffeepot.br.sped.contribuicoes.tipos.OrigemProcesso;
import coffeepot.br.sped.fiscal.config.Config;
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
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
 * Class: BlocoFTest.
 *
 * <p>
 * History:<br><br>
 *      - walter - Sep 17, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */

public class BlocoFTest {

    @Test
    public void testBlocoF() throws Exception {
        System.out.println("*** Teste de escrita do BLOCO F inteiro ***");
        File file = new File(Config.TEST_BLOCO_OUT_DIR + "BlocoFContribuicoesTest.txt");

        Writer fw = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(file), StandardCharsets.UTF_8));
        SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

        BlocoF blocoF = createBlocoF(file, spedFiscalWriter);

        spedFiscalWriter.close();

        System.out.println("Arquivo gerado em: " + file.getAbsolutePath());
    }

    public static BlocoF createBlocoF(File file, SpedFiscalWriter spedFiscalWriter) throws NoSuchMethodException,
            InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
            IOException {
        BlocoF blocoF = createBlocoF();
        
        return (BlocoF) Util.createFileFromBloco(blocoF, file, spedFiscalWriter);
    }

    public static BlocoF createBlocoF() {
        BlocoF blocoF = new BlocoF();
        
        blocoF.setRegF001(new RegF001(IndicadorMovimento.COM_DADOS));
        blocoF.setRegF010List(createRegF010List());
        
        return blocoF;
    }

    private static List<RegF010> createRegF010List() {
        RegF010 reg = new RegF010();
        
        reg.setCnpj("36.293.264/0001-28");
        
        reg.setRegF100List(createRegF100List());
        reg.setRegF120List(createRegF120List());
        reg.setRegF500List(createRegF500List());
        reg.setRegF525List(createRegF525List());
        reg.setRegF550List(createRegF550List());
        reg.setRegF560List(createRegF560List());
        reg.setRegF600List(createRegF600List());
        
        return Collections.singletonList(reg);
    }

    private static List<RegF100> createRegF100List() {
        RegF100 reg = new RegF100();
        
        reg.setAliqCofins(3.65);
        reg.setAliqPis(1.65);
        reg.setCodCcus("01");
        reg.setCodCta("0123456");
        reg.setCodItem("01010101");
        reg.setCodPart("C000001");
        reg.setCstCofins("01");
        reg.setCstPis("01");
        reg.setDescDocOper("");
        reg.setDtOper(LocalDate.now());
        reg.setIndOper(RegF100.IndicadorTipodeOperacao.OPERACAO_SUJEITA_CREDITO_PIS_COFINS);
        reg.setIndOrigCred(IndicadorOrigemCredito.MERCADO_INTERNO);
        reg.setNatBcCred("001");
        reg.setVlBcCofins(100.0);
        reg.setVlBcPis(100.0);
        reg.setVlCofins(3.65);
        reg.setVlOper(100.0);
        reg.setVlPis(1.65);
        
        reg.setRegF111List(createRegF111List());
        
        return Collections.singletonList(reg);
    }

    private static List<RegF120> createRegF120List() {
        RegF120 reg = new RegF120();
        
        reg.setAliqCofins(3.65);
        reg.setAliqPis(1.65);
        reg.setCodCcus("01");
        reg.setCodCta("0123456");
        reg.setCstCofins("01");
        reg.setCstCofins("01");
        reg.setDescDocOper("");
        reg.setIndOrigCred(IndicadorOrigemCredito.MERCADO_INTERNO);
        reg.setIndUtilBemImob(RegF120.IndicadorBensIncorporados.PRODUCAO_DESTINADO_VENDA);
        reg.setIndentBemImob(IdentificadorBensAtivoImobilizado.VEICULOS);
        reg.setNatBcCred("");
        reg.setParcOperNaoBcCred(100.0);
        reg.setVlBcCofins(100.0);
        reg.setVlBcPis(100.0);
        reg.setVlCofins(3.65);
        reg.setVlOperDep(100.0);
        reg.setVlPis(1.65);
        
        reg.setRegF129List(createRegF129List());
        
        return Collections.singletonList(reg);
    }

    private static List<RegF500> createRegF500List() {
        RegF500 reg = new RegF500();
        
        reg.setAliqCofins(3.65);
        reg.setAliqPis(1.65);
        reg.setCfop(1202);
        reg.setCodCta("012345");
        reg.setCodMod(DocumentoFiscal.M55);
        reg.setCstCofins("01");
        reg.setCstPis("01");
        reg.setInfoCompl("");
        reg.setVlBcCofins(100.0);
        reg.setVlBcPis(100.0);
        reg.setVlCofins(3.65);
        reg.setVlDescCofins(0.0);
        reg.setVlDescPis(0.0);
        reg.setVlPis(1.65);
        reg.setVlRecCaixa(0.0);
        
        reg.setRegF509List(createReg509List());
        
        return Collections.singletonList(reg);
    }

    private static List<RegF525> createRegF525List() {
        RegF525 reg = new RegF525();
        
        reg.setCnpjCpf("36.293.264/0001-28");
        reg.setCodCta("0123456");
        reg.setCodItem("0123456");
        reg.setCstCofins("01");
        reg.setCstPis("01");
        reg.setIndRec(RegF525.IndicadorComposicaoReceita.CLIENTES);
        reg.setInfoCompl("");
        reg.setNumDoc("0123456");
        reg.setVlRec(100.0);
        reg.setVlRecDet(0.0);
        
        return Collections.singletonList(reg);
    }

    private static List<RegF550> createRegF550List() {
        RegF550 reg = new RegF550();
        
        reg.setAliqCofins(3.65);
        reg.setAliqPis(1.65);
        reg.setCfop(1202);
        reg.setCodCta("012345");
        reg.setCodMod(DocumentoFiscal.M55);
        reg.setCstCofins("01");
        reg.setCstPis("01");
        reg.setInfoCompl("");
        reg.setVlBcCofins(100.0);
        reg.setVlBcPis(100.0);
        reg.setVlCofins(3.65);
        reg.setVlDescCofins(0.0);
        reg.setVlDescPis(0.0);
        reg.setVlPis(1.65);
        reg.setVlRecComp(0.0);
        
        return Collections.singletonList(reg);
    }

    private static List<RegF560> createRegF560List() {
        RegF560 reg = new RegF560();
        
        reg.setAliqCofinsQuant(0.0);
        reg.setAliqPisQuant(0.0);
        reg.setCfop(1202);
        reg.setCodCta("0123456");
        reg.setCodMod(DocumentoFiscal.M55);
        reg.setCstCofins("01");
        reg.setCstPis("01");
        reg.setInfoCompl("");
        reg.setQuantBcCofins(0.0);
        reg.setQuantBcPis(0.0);
        reg.setVlCofins(0.0);
        reg.setVlDescCofins(0.0);
        reg.setVlDescPis(0.0);
        reg.setVlPis(0.0);
        reg.setVlRecComp(0.0);
        
        reg.setRegF569List(createRegF569List());
        
        return Collections.singletonList(reg);
    }

    private static List<RegF600> createRegF600List() {
        RegF600 reg = new RegF600();
        
        reg.setCnpj("16.932.651/0003-40");
        reg.setCodRec("001");
        reg.setDtRet(LocalDate.now());
        reg.setIndDec(RegF600.IndicadorCondicaoPjDeclarante.RESPONSAVEL_RECOLHIMENTO);
        reg.setIndNatRec(RegF600.IndicadorNaturezaReceita.RETENCAO_ENTIDADE_ADM_PUBLICA_FEDERAL);
        reg.setIndNatRet(RegF600.IndicadorNaturezaRetencao.RETENCAO_FABRICANTE_MAQUINAS);
        reg.setVlBcRet(0.0);
        reg.setVlRet(0.0);
        reg.setVlRetCofins(0.0);
        reg.setVlRetPis(0.0);
        
        return Collections.singletonList(reg);
    }

    private static List<RegF111> createRegF111List() {
        RegF111 reg = new RegF111();
        
        reg.setNumProc("0123456");
        reg.setIndProc(OrigemProcesso.JUSTICA_FEDERAL);
        
        return Collections.singletonList(reg);
    }

    private static List<RegF129> createRegF129List() {
        RegF129 reg = new RegF129();
        
        reg.setNumProc("0123456");
        reg.setIndProc(OrigemProcesso.JUSTICA_FEDERAL);
        
        return Collections.singletonList(reg);
    }

    private static List<RegF509> createReg509List() {
        RegF509 reg = new RegF509();
        
        reg.setNumProc("0123456");
        reg.setIndProc(OrigemProcesso.JUSTICA_FEDERAL);
        
        return Collections.singletonList(reg);
    }

    private static List<RegF569> createRegF569List() {
         RegF569 reg = new RegF569();
        
        reg.setNumProc("0123456");
        reg.setIndProc(OrigemProcesso.JUSTICA_FEDERAL);
        
        return Collections.singletonList(reg);
    }
    
}
