package coffeepot.br.sped.contribuicoes.arquivo;

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

import coffeepot.br.sped.commons.bloco9.Bloco9;
import coffeepot.br.sped.contribuicoes.bloco0.Bloco0;
import coffeepot.br.sped.contribuicoes.bloco0.Bloco0Test;
import coffeepot.br.sped.contribuicoes.bloco1.Bloco1;
import coffeepot.br.sped.contribuicoes.bloco1.Bloco1Test;
import coffeepot.br.sped.contribuicoes.blocoA.BlocoA;
import coffeepot.br.sped.contribuicoes.blocoA.BlocoATest;
import coffeepot.br.sped.contribuicoes.blocoC.BlocoC;
import coffeepot.br.sped.contribuicoes.blocoC.BlocoCTest;
import coffeepot.br.sped.contribuicoes.blocoD.BlocoD;
import coffeepot.br.sped.contribuicoes.blocoD.BlocoDTest;
import coffeepot.br.sped.contribuicoes.blocoF.BlocoF;
import coffeepot.br.sped.contribuicoes.blocoF.BlocoFTest;
import coffeepot.br.sped.contribuicoes.blocoM.BlocoM;
import coffeepot.br.sped.contribuicoes.blocoM.BlocoMTest;
import coffeepot.br.sped.contribuicoes.blocoP.BlocoP;
import coffeepot.br.sped.contribuicoes.blocoP.BlocoPTest;
import coffeepot.br.sped.fiscal.arquivo.bloco9.Bloco9Test;
import coffeepot.br.sped.fiscal.config.Config;
import coffeepot.br.sped.fiscal.writer.SpedFiscalWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import org.junit.Test;

/**
 * Class: SemEstruturaTest.
 *
 * <p>
 * Insert description here.
 * </p>
 *
 * <p>
 * History:<br><br>
 *      - Walter Portugal - Sep 18, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author Walter Portugal
 * @since 2.0.0
 *
 */

public class SemEstruturaTest {
    
    @Test
    public void testSemEstrutura() throws Exception {

        System.out.println("**** Teste de escrita do arquivo inteiro ***");
        File file = new File(Config.TEST_BLOCO_OUT_DIR + "SpedContribuicoesTestSemEstrutura.txt");

        Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8));
        SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

        Bloco0 bloco0 = Bloco0Test.createBloco0(file, spedFiscalWriter);
        BlocoA blocoA = BlocoATest.createBlocoA(file, spedFiscalWriter);
        BlocoC blocoC = BlocoCTest.createBlocoC(file, spedFiscalWriter);
        BlocoD blocoD = BlocoDTest.createBlocoD(file, spedFiscalWriter);
        BlocoF blocoF = BlocoFTest.createBlocoF(file, spedFiscalWriter);
        BlocoM blocoM = BlocoMTest.createBlocoM(file, spedFiscalWriter);
        BlocoP blocoP = BlocoPTest.createBlocoP(file, spedFiscalWriter);
        Bloco1 bloco1 = Bloco1Test.createBloco1(file, spedFiscalWriter);
        Bloco9 bloco9 = Bloco9Test.createBloco9(file, spedFiscalWriter);

        spedFiscalWriter.close();
        
        System.out.println("Arquivo gerado em: " + file.getAbsolutePath());

    }

}
