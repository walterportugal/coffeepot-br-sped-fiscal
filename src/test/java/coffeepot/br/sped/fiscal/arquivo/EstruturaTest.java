/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

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
import coffeepot.br.sped.fiscal.arquivo.bloco1.Bloco1Test;
import coffeepot.br.sped.commons.bloco9.Bloco9;
import coffeepot.br.sped.fiscal.arquivo.blocoC.BlocoCTest;
import coffeepot.br.sped.fiscal.arquivo.blocoD.BlocoDTest;
import coffeepot.br.sped.fiscal.arquivo.blocoE.BlocoETest;
import coffeepot.br.sped.fiscal.arquivo.blocoG.BlocoGTest;
import coffeepot.br.sped.fiscal.arquivo.blocoH.BlocoHTest;
import coffeepot.br.sped.fiscal.config.Config;
import coffeepot.br.sped.fiscal.util.Util;
import coffeepot.br.sped.fiscal.writer.SpedFiscalWriter;
import java.nio.charset.StandardCharsets;

//private [^+ ]+ regex util.
/**
 *
 * @author Jeandeson O. Merelis
 */
@Deprecated
public class EstruturaTest {

    //@Test
    public void testEstrutura() throws Exception {

        System.out.println("**** Teste de escrita do arquivo inteiro ***");
        File file = new File(Config.TEST_BLOCO_OUT_DIR + "SpedFiscalTest2.txt");

        Estrutura estrutura = new Estrutura();
        estrutura.setBloco0(Bloco0Test.getDataBloco0());
        estrutura.setBlocoC(BlocoCTest.getDataBlocoC());
        estrutura.setBlocoD(BlocoDTest.getDataBlocoD());
        estrutura.setBlocoE(BlocoETest.getDataBlocoE());
        estrutura.setBlocoG(BlocoGTest.getDataBlocoG());
        estrutura.setBlocoH(BlocoHTest.getDataBlocoH());
        estrutura.setBloco1(Bloco1Test.getDataBloco1());

        try {

            Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8));
            SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

            //Grava todos blocos, exceto o Bloco9
            spedFiscalWriter.write(estrutura);
            spedFiscalWriter.flush();

            //Gera o bloco9 apartir do arquivo, e o grava no arquivo.
            Bloco9 bloco9 = Util.createBloco9(file);
            //estrutura.setBloco9(bloco9);
            spedFiscalWriter.write(bloco9);
            spedFiscalWriter.flush();

            spedFiscalWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(BlocoCTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
