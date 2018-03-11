/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoE;

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
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;

import coffeepot.br.sped.fiscal.config.Config;
import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;
import coffeepot.br.sped.fiscal.util.Util;
import coffeepot.br.sped.fiscal.writer.SpedFiscalWriter;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import org.junit.Test;

/**
 *
 * @author Mauricio R. Morais
 */
public class BlocoETest {

    @Test
    public void testBloco0() throws Exception {

        System.out.println("**** Teste de escrita do BLOCO E inteiro ***");

        File file = new File(Config.TEST_BLOCO_OUT_DIR + "BlocoETest.txt");

        Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8));
        SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

        BlocoE bloco = createBlocoE(file, spedFiscalWriter);
        spedFiscalWriter.close();

        /*
        try {
            Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8));
            SpedFiscalWriter spedFiscalWriter = new SpedFiscalWriter(fw);

            spedFiscalWriter.write(bloco);

            spedFiscalWriter.flush();
            spedFiscalWriter.close();

            System.out.println("Arquivo gerado em: " + file.getAbsolutePath());
        } catch (IOException ex) {
            Logger.getLogger(BlocoETest.class.getName()).log(Level.SEVERE, null, ex);
        }
         */
    }

    public static BlocoE createBlocoE(File file, SpedFiscalWriter spedFiscalWriter) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
        BlocoE bloco = getDataBlocoE();
        return (BlocoE) Util.createFileFromBloco(bloco, file, spedFiscalWriter);
    }

    public static BlocoE getDataBlocoE() {
        BlocoE bloco = new BlocoE();
        bloco.setRegE001(createRegE001());
        bloco.setRegE100List(createRegE100List());
        //TODO: completar testes bloco E
        //bloco.setRegE300List(createRegE300List());

        return bloco;
    }

    public static RegE001 createRegE001() {
        RegE001 reg = new RegE001(IndicadorMovimento.COM_DADOS);
        return reg;
    }

    public static List<RegE100> createRegE100List() {
        List<RegE100> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add(createRegE100());
        }
        return list;
    }

    public static RegE100 createRegE100() {

        RegE100 reg = new RegE100();
        reg.setDtIni(LocalDate.now());
        reg.setDtFin(LocalDate.now());

        RegE110 re110 = new RegE110();
        re110.setVlTotDebitos(2000.00);
        re110.setVlAjDebitos(3000.00);
        re110.setVlTotAjDebitos(4000.00);
        re110.setVlEstornosCred(5000.00);
        re110.setVlTotCreditos(6000.00);;
        re110.setVlAjCreditos(7000.00);
        re110.setVlTotAjCreditos(8000.00);
        re110.setVlEstornosDeb(9000.00);
        re110.setVlSldCredorAnt(10000.00);
        re110.setVlSldApurado(11000.00);
        re110.setVlTotDed(12000.00);
        re110.setVlIcmsRecolher(13000.00);
        re110.setVlSldCredorTransportar(14000.00);
        re110.setDebEsp(15000.00);
        //TODO: completar testes bloco E
        //re110.setRegE111List(createRegE111List());
        //re110.setRegE115List(createRegE115List());
        //re110.setRegE116List(createRegE116List());

        reg.setRegE110(re110);
        return reg;
    }

}
