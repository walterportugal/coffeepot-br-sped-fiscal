/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.commons;

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


import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.bean.wr.types.AccessorType;

/**
 * Registro de encerramento de bloco.
 *
 * @author Jeandeson O. Merelis
 */
@Record(accessorType = AccessorType.PROPERTY,
        fields = {
    @Field(name = "reg", id = true, classType = String.class),
    @Field(name = "qtdLin", classType = Long.class)
})
public class RegEncerramentoBlocoGenerico extends RegEncerramentoBlocoBase {

    public RegEncerramentoBlocoGenerico() {
    }

    public RegEncerramentoBlocoGenerico(String reg, Long qtdLin) {
        this.reg = reg;
        this.qtdLin = qtdLin;
    }

    @Override
    public void setReg(String reg) {
        super.setReg(reg);
    }
}
