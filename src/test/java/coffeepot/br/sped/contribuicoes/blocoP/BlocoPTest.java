package coffeepot.br.sped.contribuicoes.blocoP;

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

import coffeepot.br.sped.contribuicoes.tipos.IndicadorTipoAjuste;
import coffeepot.br.sped.contribuicoes.tipos.OrigemProcesso;
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
 * Class: BlocoPTest.
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

public class BlocoPTest {
    
    @Test
    public void testBlocoP() throws Exception {
        System.out.println("*** Teste de escrita do BLOCO P inteiro ***");
        File file = new File(Config.TEST_BLOCO_OUT_DIR + "BlocoPContribuicoesTest.txt");

        Writer fw = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(file), StandardCharsets.UTF_8));
        SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

        BlocoP blocoP = createBlocoP(file, spedFiscalWriter);

        spedFiscalWriter.close();

        System.out.println("Arquivo gerado em: " + file.getAbsolutePath());
    }

    public static BlocoP createBlocoP(File file, SpedFiscalWriter spedFiscalWriter) throws NoSuchMethodException,
            InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
            IOException {
        BlocoP blocoP = createBlocoP();

        return (BlocoP) Util.createFileFromBloco(blocoP, file, spedFiscalWriter);
    }

    public static BlocoP createBlocoP() {
        BlocoP blocoP = new BlocoP();
        
        blocoP.setRegP001(new RegP001(IndicadorMovimento.COM_DADOS));
        blocoP.setRegP010List(createRegP010List());
        blocoP.setRegP200List(createRegP200List());
                
        return blocoP;
    }

    private static List<RegP010> createRegP010List() {
        RegP010 reg = new RegP010();
        
        reg.setCnpj("00.000.000/0001-01");
        reg.setRegP100List(createRegP100List());
        
        return Collections.singletonList(reg);
    }

    private static List<RegP200> createRegP200List() {
        RegP200 reg = new RegP200();
        
        reg.setCodRec("012345");
        reg.setPerRef("122020");
        reg.setVlTotAjAcres(0.0);
        reg.setVlTotAjReduc(0.0);
        reg.setVlTotContApu(0.0);
        reg.setVlTotContDev(0.0);
        
        reg.setRegP210List(createRegP210List());
        
        return Collections.singletonList(reg);
    }

    private static List<RegP100> createRegP100List() {
        RegP100 reg = new RegP100();
        
        reg.setCodigoEmpresa("001");//Campo não existente no SPED. Utilizado para mapeamento das informações por empresa.
        reg.setAliqCont(0.0);
        reg.setCodAtivEcon("12345678");
        reg.setCodCta("010101");
        reg.setDescCompl("Texto Complementar");
        reg.setDtFin(LocalDate.now());
        reg.setDtIni(LocalDate.now());
        reg.setVlBcCont(0.0);
        reg.setVlContApu(0.0);
        reg.setVlExc(0.0);
        reg.setVlRecAtivEstab(0.0);
        reg.setVlRecTotEst(0.0);
        
        reg.setRegP110List(createRegP110List());
        reg.setRegP199List(createRegP199List());
        
        return Collections.singletonList(reg);
    }

    private static List<RegP110> createRegP110List() {
        RegP110 reg = new RegP110();
        
        reg.setCodDet("01234567");
        reg.setDetValor(100.0);
        reg.setInfCompl("Teste complementar");
        reg.setNumCampo("01");
                
        return Collections.singletonList(reg);
    }

    private static List<RegP199> createRegP199List() {
        RegP199 reg = new RegP199();
        
        reg.setNumProc("0123456");
        reg.setIndProc(OrigemProcesso.JUSTICA_FEDERAL);
        
        return Collections.singletonList(reg);
    }

    private static List<RegP210> createRegP210List() {
        RegP210 reg = new RegP210();
        
        reg.setCodAj("01");
        reg.setDescrAj("Teste de Ajuste");
        reg.setDtRef(LocalDate.now());
        reg.setIndAj(IndicadorTipoAjuste.AJUSTE_REDUCAO);
        reg.setNumDoc("012345");
        reg.setVlAj(0.0);
        
        return Collections.singletonList(reg);
    }

}
