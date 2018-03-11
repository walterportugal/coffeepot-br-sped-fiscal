/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

import coffeepot.br.sped.fiscal.arquivo.bloco0.Bloco0;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0000;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0990;
import coffeepot.br.sped.fiscal.arquivo.bloco1.Bloco1;
import coffeepot.br.sped.fiscal.arquivo.bloco1.Reg1001;
import coffeepot.br.sped.fiscal.arquivo.bloco1.Reg1990;
import coffeepot.br.sped.fiscal.arquivo.bloco9.Bloco9;
import coffeepot.br.sped.fiscal.arquivo.bloco9.Reg9001;
import coffeepot.br.sped.fiscal.arquivo.bloco9.Reg9990;
import coffeepot.br.sped.fiscal.arquivo.blocoC.BlocoC;
import coffeepot.br.sped.fiscal.arquivo.blocoC.RegC001;
import coffeepot.br.sped.fiscal.arquivo.blocoC.RegC990;
import coffeepot.br.sped.fiscal.arquivo.blocoD.BlocoD;
import coffeepot.br.sped.fiscal.arquivo.blocoD.RegD001;
import coffeepot.br.sped.fiscal.arquivo.blocoD.RegD990;
import coffeepot.br.sped.fiscal.arquivo.blocoE.BlocoE;
import coffeepot.br.sped.fiscal.arquivo.blocoE.RegE001;
import coffeepot.br.sped.fiscal.arquivo.blocoE.RegE990;
import coffeepot.br.sped.fiscal.arquivo.blocoG.BlocoG;
import coffeepot.br.sped.fiscal.arquivo.blocoG.RegG001;
import coffeepot.br.sped.fiscal.arquivo.blocoG.RegG990;
import coffeepot.br.sped.fiscal.arquivo.blocoH.BlocoH;
import coffeepot.br.sped.fiscal.arquivo.blocoH.RegH001;
import coffeepot.br.sped.fiscal.arquivo.blocoH.RegH990;
import coffeepot.br.sped.fiscal.arquivo.blocoK.BlocoK;
import coffeepot.br.sped.fiscal.arquivo.blocoK.RegK001;
import coffeepot.br.sped.fiscal.arquivo.blocoK.RegK990;
import java.util.logging.Level;
import java.util.logging.Logger;

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
/**
 * @author Edivaldo Merlo Stens
 */
public enum BlocoEnum implements EnumCodificado {
    BLOCO_0('0', Bloco0.class, Reg0000.class, Reg0990.class),
    BLOCO_C('C', BlocoC.class, RegC001.class, RegC990.class),
    BLOCO_D('D', BlocoD.class, RegD001.class, RegD990.class),
    BLOCO_E('E', BlocoE.class, RegE001.class, RegE990.class),
    BLOCO_G('G', BlocoG.class, RegG001.class, RegG990.class),
    BLOCO_H('H', BlocoH.class, RegH001.class, RegH990.class),
    BLOCO_K('K', BlocoK.class, RegK001.class, RegK990.class),
    BLOCO_1('1', Bloco1.class, Reg1001.class, Reg1990.class),
    BLOCO_9('9', Bloco9.class, Reg9001.class, Reg9990.class);

    private final char codigo;
    private final Class classeBloco;
    private final Class classeAbertura;
    private final Class classeFechamento;

    private BlocoEnum(char codigo, Class classeBloco, Class classeAbertura, Class classeFechamento) {
        this.codigo = codigo;
        this.classeBloco = classeBloco;
        this.classeAbertura = classeAbertura;
        this.classeFechamento = classeFechamento;
    }

    @Override
    public String getCodigo() {
        return String.valueOf(codigo);
    }

    public Class getClasseBloco() {
        return classeBloco;
    }

    public Class getClasseAbertura() {
        return classeAbertura;
    }

    public Class getClasseFechamento() {
        return classeFechamento;
    }

    public static BlocoEnum valueOfClasseBloco(final Class classeBloco) {
        BlocoEnum s = null;
        for (BlocoEnum n : values()) {
            if (n.getClasseBloco().equals(classeBloco)) {
                s = n;
                break;
            }
        }
        if (s == null) {
            try {
                throw new Exception("Classe [" + classeBloco.getName() + "] não encontrada em [" + BlocoEnum.class.getName() + "].");
            } catch (Exception ex) {
                Logger.getLogger(BlocoEnum.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return s;
    }

}
