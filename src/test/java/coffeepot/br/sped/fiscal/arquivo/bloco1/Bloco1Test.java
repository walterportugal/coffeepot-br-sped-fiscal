/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco1;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

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
import coffeepot.br.sped.fiscal.config.Config;
import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;
import coffeepot.br.sped.fiscal.util.Util;
import coffeepot.br.sped.fiscal.writer.SpedFiscalWriter;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Jeandeson O. Merelis &amp; Edivaldo Merlo Stens
 */
public class Bloco1Test {

    @Test
    public void testBloco1() throws Exception {

        System.out.println("**** Teste de escrita do BLOCO 1 inteiro ***");

        File file = new File(Config.TEST_BLOCO_OUT_DIR + "Bloco1Test.txt");

        Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8));
        SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

        Bloco1 bloco = createBloco1(file, spedFiscalWriter);
        spedFiscalWriter.close();

        /*
        try {
            Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8));
            SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

            spedFiscalWriter.write(bloco);

            spedFiscalWriter.flush();
            spedFiscalWriter.close();

        } catch (IOException ex) {
            Logger.getLogger(Bloco1Test.class.getName()).log(Level.SEVERE, null, ex);
        }
         */
        System.out.println("Arquivo gerado em: " + file.getAbsolutePath());

    }

    public static Bloco1 createBloco1(File file, SpedFiscalWriter spedFiscalWriter) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
        Bloco1 bloco = getDataBloco1();
        return (Bloco1) Util.createFileFromBloco(bloco, file, spedFiscalWriter);
    }

    public static Bloco1 getDataBloco1() {
        Bloco1 bloco = new Bloco1();
        bloco.setReg1001(createReg1001());
        //bloco.setReg1100List(createReg1100List());
        //TODO: completar testes bloco C
        //bloco.setReg1300List(createReg1300List());
        return bloco;
    }

    public static Reg1001 createReg1001() {
        Reg1001 reg = new Reg1001(IndicadorMovimento.SEM_DADOS);
        return reg;
    }

}
