/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo;

import coffeepot.br.sped.fiscal.arquivo.bloco0.Bloco0;
import java.io.File;

import org.junit.Test;

/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 Jeandeson O. Merelis
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
import coffeepot.br.sped.fiscal.arquivo.bloco0.Bloco0Test;
import coffeepot.br.sped.fiscal.arquivo.bloco1.Bloco1;
import coffeepot.br.sped.fiscal.arquivo.bloco1.Bloco1Test;
import coffeepot.br.sped.fiscal.arquivo.bloco9.Bloco9;
import coffeepot.br.sped.fiscal.arquivo.bloco9.Bloco9Test;
import coffeepot.br.sped.fiscal.arquivo.blocoC.BlocoC;
import coffeepot.br.sped.fiscal.arquivo.blocoC.BlocoCTest;
import coffeepot.br.sped.fiscal.arquivo.blocoD.BlocoD;
import coffeepot.br.sped.fiscal.arquivo.blocoD.BlocoDTest;
import coffeepot.br.sped.fiscal.arquivo.blocoE.BlocoE;
import coffeepot.br.sped.fiscal.arquivo.blocoE.BlocoETest;
import coffeepot.br.sped.fiscal.arquivo.blocoG.BlocoG;
import coffeepot.br.sped.fiscal.arquivo.blocoG.BlocoGTest;
import coffeepot.br.sped.fiscal.arquivo.blocoH.BlocoH;
import coffeepot.br.sped.fiscal.arquivo.blocoH.BlocoHTest;
import coffeepot.br.sped.fiscal.arquivo.blocoK.BlocoK;
import coffeepot.br.sped.fiscal.arquivo.blocoK.BlocoKTest;
import coffeepot.br.sped.fiscal.config.Config;
import coffeepot.br.sped.fiscal.writer.SpedFiscalWriter;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Jeandeson O. Merelis &amp; Edivaldo Merlo Stens
 */
public class SemEstruturaTest2 {

    @Test
    public void testSemEstrutura() throws Exception {

        System.out.println("**** Teste de escrita do arquivo inteiro ***");
        File file = new File(Config.TEST_BLOCO_OUT_DIR + "SpedFiscalTest2.txt");

        Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8));
        SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

        Bloco0 bloco0 = Bloco0Test.createBloco0(file, spedFiscalWriter);
        BlocoC blocoC = BlocoCTest.createBlocoC(file, spedFiscalWriter);
        BlocoD blocoD = BlocoDTest.createBlocoD(file, spedFiscalWriter);
        BlocoE blocoE = BlocoETest.createBlocoE(file, spedFiscalWriter);
        BlocoG blocoG = BlocoGTest.createBlocoG(file, spedFiscalWriter);
        BlocoH blocoH = BlocoHTest.createBlocoH(file, spedFiscalWriter);
        BlocoK blocoK = BlocoKTest.createBlocoK(file, spedFiscalWriter);
        Bloco1 bloco1 = Bloco1Test.createBloco1(file, spedFiscalWriter);
        Bloco9 bloco9 = Bloco9Test.createBloco9(file, spedFiscalWriter);

        spedFiscalWriter.close();
        
        System.out.println("Arquivo gerado em: " + file.getAbsolutePath());

    }

}
