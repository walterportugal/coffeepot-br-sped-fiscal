/*
 * Copyright 2018 - Edivaldo Merlo Stens
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
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import coffeepot.br.sped.fiscal.arquivo.EstruturaTest;
import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;
import coffeepot.br.sped.fiscal.util.RecordCounter;
import coffeepot.br.sped.fiscal.writer.SpedFiscalWriter;
import java.time.LocalDate;
import org.junit.Test;

/**
 *
 * @author Edivaldo Merlo Stens
 */
public class BlocoKTest {

    @Test
    public void testBloco0() throws Exception {

        System.out.println("**** Teste de escrita do BLOCO E inteiro ***");

        BlocoK bloco = createBlocoK();

        try {
            String file = EstruturaTest.TEST_BLOCO_OUT_DIR + "BlocoKTest.tmp";
            Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "ISO-8859-1"));
            SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

            spedFiscalWriter.write(bloco);

            spedFiscalWriter.flush();
            spedFiscalWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(BlocoKTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static BlocoK createBlocoK() {
        BlocoK bloco = new BlocoK();
        RegK001 r1 = new RegK001(IndicadorMovimento.SEM_DADOS);
        bloco.setRegK001(r1);
        bloco.setRegK001(createReg0001());
        //bloco.setRegK100List(createRegK100List());
        //TODO: completar testes bloco E
        //bloco.setRegK200List(createRegK200List());
        //bloco.setRegK500List(createRegK500List());

        long sizeOf = RecordCounter.count(bloco);
        RegK990 regE990 = new RegK990(sizeOf + 1);

        bloco.setRegK990(regE990);
        return bloco;
    }

    public static RegK001 createReg0001() {
        RegK001 reg = new RegK001(IndicadorMovimento.COM_DADOS);
        return reg;
    }

}
