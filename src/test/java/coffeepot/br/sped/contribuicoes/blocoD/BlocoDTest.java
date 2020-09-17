package coffeepot.br.sped.contribuicoes.blocoD;

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

import coffeepot.br.sped.contribuicoes.tipos.NaturezaFreteContratado;
import coffeepot.br.sped.contribuicoes.tipos.OrigemProcesso;
import coffeepot.br.sped.fiscal.arquivo.blocoD.RegD001;
import coffeepot.br.sped.fiscal.config.Config;
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import coffeepot.br.sped.fiscal.tipos.EmissaoDocumento;
import coffeepot.br.sped.fiscal.tipos.Frete;
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
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;

/**
 * Class: BlocoDTest.
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
public class BlocoDTest {

    @Test
    public void testBlocoD() throws Exception {
        System.out.println("*** Teste de escrita do BLOCO D inteiro ***");
        File file = new File(Config.TEST_BLOCO_OUT_DIR + "BlocoDContribuicoesTest.txt");

        Writer fw = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(file), StandardCharsets.UTF_8));
        SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

        BlocoD blocoD = createBlocoD(file, spedFiscalWriter);

        spedFiscalWriter.close();

        System.out.println("Arquivo gerado em: " + file.getAbsolutePath());
    }

    private BlocoD createBlocoD(File file, SpedFiscalWriter spedFiscalWriter) throws NoSuchMethodException,
            InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
            IOException {
        BlocoD blocoD = createBlocoD();

        return (BlocoD) Util.createFileFromBloco(blocoD, file, spedFiscalWriter);
    }

    private BlocoD createBlocoD() {
        BlocoD blocoD = new BlocoD();

        blocoD.setRegD001(new RegD001(IndicadorMovimento.COM_DADOS));
        blocoD.setRegD010List(createRegD010List());

        return blocoD;
    }

    private List<RegD010> createRegD010List() {
        RegD010 reg = new RegD010();

        reg.setCnpj("36.293.264/0001-28");
        reg.setRegD100List(createRegD100List());
        reg.setRegD500List(createRegD500List());

        return Collections.singletonList(reg);
    }

    private List<RegD100> createRegD100List() {
        List<RegD100> list = new LinkedList<>();
        for (int i = 0; i < 2; i++) {
            list.add(createRegD100());
        }
        return list;
    }

    private List<RegD500> createRegD500List() {
        RegD500 reg = new RegD500();
        
        reg.setCodInf("123");
        reg.setCodMod(DocumentoFiscal.M21);
        reg.setCodPart("F00003");
        reg.setCodSit(SituacaoDocumento.REGULAR);
        reg.setDtAp(LocalDate.now());
        reg.setDtDoc(LocalDate.now());
        reg.setIndEmit(EmissaoDocumento.TERCEIROS);
        reg.setNumDoc(new Long(12345));
        reg.setSer("1");
        reg.setSub("");
        reg.setVlBcIcms(100.0);
        reg.setVlCofins(3.65);
        reg.setVlDa(0.0);
        reg.setVlDesc(0.0);
        reg.setVlDoc(100.0);
        reg.setVlIcms(18.0);
        reg.setVlPis(1.65);
        reg.setVlServ(0.0);
        reg.setVlServNt(0.0);
        reg.setVlTerc(0.0);
        
        reg.setRegD501List(createRegD501List());
        reg.setRegD505List(createRegD505List());
        reg.setRegD509List(createRegD509List());
        
        return Collections.singletonList(reg);
    }

    private RegD100 createRegD100() {
        RegD100 reg = new RegD100();

        reg.setChvCte("1234567890 1234567890 1234567890 1234567890 1234");
        reg.setChvCteRef("");
        reg.setCodCta("0123456789");
        reg.setCodInf("");
        reg.setCodMod(DocumentoFiscal.M57);
        reg.setCodPart("F000001");
        reg.setDtAp(LocalDate.now());
        reg.setDtDoc(LocalDate.now());
        reg.setIndEmit(EmissaoDocumento.TERCEIROS);
        reg.setIndFrt(Frete.SEM_FRETE);
        reg.setNumDoc(Long.parseLong("12345678"));
        reg.setSer("1");
        reg.setSub("");
        //reg.setTpCte(Integer.SIZE);
        reg.setVlBcIcms(100.0);
        reg.setVlDesc(0.0);
        reg.setVlDoc(100.0);
        reg.setVlIcms(18.0);
        reg.setVlNt(0.0);
        reg.setVlServ(0.0);

        reg.setRegD101List(createRegD101List());
        reg.setRegD105List(createRegD105List());
        reg.setRegD111List(createRegD111List());

        return reg;
    }

    private List<RegD101> createRegD101List() {
        RegD101 reg = new RegD101();
        
        reg.setAliqPis(1.65);
        reg.setCodCta("000001");
        reg.setCstPis("01");
        reg.setIndNatFrt(NaturezaFreteContratado.COMPRAS_GERADOR_CREDITO);
        reg.setNatBcCred("0001");
        reg.setVlBcPis(100.0);
        reg.setVlItem(100.0);
        reg.setVlPis(1.65);
        
        return Collections.singletonList(reg);
    }

    private List<RegD105> createRegD105List() {
        RegD105 reg = new RegD105();
        
        reg.setAliqCofins(3.65);
        reg.setCodCta("000001");
        reg.setCstCofins("01");
        reg.setIndNatFrt(NaturezaFreteContratado.COMPRAS_GERADOR_CREDITO);
        reg.setNatBcCred("0001");
        reg.setVlBcCofins(100.0);
        reg.setVlItem(100.0);
        reg.setVlCofins(3.65);

        return Collections.singletonList(reg);

    }

    private List<RegD111> createRegD111List() {
        RegD111 reg = new RegD111();
        
        reg.setNumProc("123456");
        reg.setIndProc(OrigemProcesso.JUSTICA_FEDERAL);

        return Collections.singletonList(reg);

    }

    private List<RegD501> createRegD501List() {
        RegD501 reg = new RegD501();
        
        reg.setAliqPis(1.65);
        reg.setCodCta("000001");
        reg.setCstPis("01");
        reg.setNatBcCred("0001");
        reg.setVlBcPis(100.0);
        reg.setVlItem(100.0);
        reg.setVlPis(1.65);
        
        return Collections.singletonList(reg);
    }

    private List<RegD505> createRegD505List() {
        RegD505 reg = new RegD505();
        
        reg.setAliqCofins(3.65);
        reg.setCodCta("000001");
        reg.setCstCofins("01");
        reg.setNatBcCred("0001");
        reg.setVlBcCofins(100.0);
        reg.setVlItem(100.0);
        reg.setVlCofins(3.65);
        
        return Collections.singletonList(reg);
    }

    private List<RegD509> createRegD509List() {
        RegD509 reg = new RegD509();
        
        reg.setNumProc("123456");
        reg.setIndProc(OrigemProcesso.JUSTICA_FEDERAL);
        
        return Collections.singletonList(reg);
    }

}
