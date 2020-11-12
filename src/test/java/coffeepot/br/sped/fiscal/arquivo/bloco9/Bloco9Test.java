/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco9;

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
import coffeepot.br.sped.commons.bloco9.Reg9001;
import coffeepot.br.sped.commons.bloco9.Bloco9;
import coffeepot.br.sped.fiscal.config.Config;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;
import coffeepot.br.sped.fiscal.util.Util;
import coffeepot.br.sped.fiscal.writer.SpedFiscalWriter;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import org.junit.Test;

/**
 *
 * @author Edivaldo Merlo Stens
 */
public class Bloco9Test {

    @Test
    public void testBloco0() throws Exception {

        System.out.println("**** Teste de escrita do BLOCO 9 inteiro ***");

        File file = new File(Config.TEST_BLOCO_OUT_DIR + "Bloco9Test.txt");

        Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8));
        SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

        Bloco9 bloco = createBloco9(file, spedFiscalWriter);
        spedFiscalWriter.close();

        /*
        try {
            Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8));
            SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

            spedFiscalWriter.write(bloco);

            spedFiscalWriter.flush();
            spedFiscalWriter.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Bloco9Test.class.getName()).log(Level.SEVERE, null, ex);
        }
         */
        System.out.println("Arquivo gerado em: " + file.getAbsolutePath());

    }

    public static Bloco9 createBloco9(File file, SpedFiscalWriter spedFiscalWriter) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
        Bloco9 bloco = getDataBloco9();
        return (Bloco9) Util.createFileFromBloco(bloco, file, spedFiscalWriter);
    }

    public static Bloco9 getDataBloco9() {
        Bloco9 bloco9 = new Bloco9();

        return bloco9;
    }

    public static Reg9001 createReg0001() {
        Reg9001 reg = new Reg9001(IndicadorMovimento.COM_DADOS);
        return reg;
    }

}
