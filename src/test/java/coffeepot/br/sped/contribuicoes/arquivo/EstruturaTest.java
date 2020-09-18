package coffeepot.br.sped.contribuicoes.arquivo;

import coffeepot.br.sped.commons.bloco9.Bloco9;
import coffeepot.br.sped.contribuicoes.bloco0.Bloco0Test;
import coffeepot.br.sped.contribuicoes.bloco1.Bloco1Test;
import coffeepot.br.sped.contribuicoes.blocoA.BlocoATest;
import coffeepot.br.sped.contribuicoes.blocoC.BlocoCTest;
import coffeepot.br.sped.contribuicoes.blocoD.BlocoDTest;
import coffeepot.br.sped.contribuicoes.blocoF.BlocoFTest;
import coffeepot.br.sped.contribuicoes.blocoM.BlocoMTest;
import coffeepot.br.sped.contribuicoes.blocoP.BlocoPTest;
import coffeepot.br.sped.fiscal.config.Config;
import coffeepot.br.sped.fiscal.util.Util;
import coffeepot.br.sped.fiscal.writer.SpedFiscalWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;

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

/**
 * Class: EstruturaTest.
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

public class EstruturaTest {
    
    @Test
    public void testEstrutura() throws Exception {

        System.out.println("**** Teste de escrita do arquivo inteiro ***");
        File file = new File(Config.TEST_BLOCO_OUT_DIR + "SpedContribuicoesTestEstrutura.txt");

        Estrutura estrutura = new Estrutura();
        estrutura.setBloco0(Bloco0Test.getDataBloco0());
        estrutura.setBlocoA(BlocoATest.createBlocoA());
        estrutura.setBlocoC(BlocoCTest.createBlocoC());
        estrutura.setBlocoD(BlocoDTest.createBlocoD());
        estrutura.setBlocoF(BlocoFTest.createBlocoF());
        estrutura.setBlocoM(BlocoMTest.createBlocoM());
        estrutura.setBlocoP(BlocoPTest.createBlocoP());
        estrutura.setBloco1(Bloco1Test.createBloco1());

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
