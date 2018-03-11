/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoK;

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
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;
import coffeepot.br.sped.fiscal.util.Util;
import coffeepot.br.sped.fiscal.writer.SpedFiscalWriter;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import org.junit.Test;

/**
 *
 * @author Edivaldo Merlo Stens
 */
public class BlocoKTest {

    @Test
    public void testBloco0() throws Exception {

        System.out.println("**** Teste de escrita do BLOCO K inteiro ***");

        File file = new File(Config.TEST_BLOCO_OUT_DIR + "BlocoKTest.txt");

        Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8));
        SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

        BlocoK bloco = createBlocoK(file, spedFiscalWriter);
        spedFiscalWriter.close();

        /*
        try {
            Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8));
            SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

            spedFiscalWriter.write(bloco);

            spedFiscalWriter.flush();
            spedFiscalWriter.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BlocoKTest.class.getName()).log(Level.SEVERE, null, ex);
        }
         */
        System.out.println("Arquivo gerado em: " + file.getAbsolutePath());

    }

    public static BlocoK createBlocoK(File file, SpedFiscalWriter spedFiscalWriter) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
        BlocoK bloco = getDataBlocoK();
        return (BlocoK) Util.createFileFromBloco(bloco, file, spedFiscalWriter);
    }

    public static BlocoK getDataBlocoK() {
        BlocoK bloco = new BlocoK();
        bloco.setRegK001(createRegK001());
        //bloco.setRegK100List(createRegK100List());
        //TODO: completar testes bloco E
        //bloco.setRegK200List(createRegK200List());
        //bloco.setRegK500List(createRegK500List());

        return bloco;
    }

    public static RegK001 createRegK001() {
        RegK001 reg = new RegK001(IndicadorMovimento.SEM_DADOS);
        return reg;
    }

}
