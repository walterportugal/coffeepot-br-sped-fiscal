/*
 * Copyright 2013 - Jeandeson O. Merelis
 */

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
package coffepot.br.sped.fiscal.arquivo.blocoB;

import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.bean.wr.types.AccessorType;
import coffeepot.br.sped.commons.RegAberturaBlocoBase;
import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;

/**
 * Class: RegB001.
 *
 * <p>
 * Este registro tem por objetivo identificar a abertura do bloco B, indicando se há informações sobre documentos
 * fiscais.
 * </p>
 *
 * <p>
 * History:<br><br>
 * - walter - Jan 2, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 1.0
 *
 */
@Record(accessorType = AccessorType.PROPERTY, fields = {
    @Field(name = "reg", id = true, constantValue = "B001"),
    @Field(name = "indMov")
})
public class RegB001 extends RegAberturaBlocoBase {

    public RegB001() {
        this.reg = "B001";
    }

    public RegB001(IndicadorMovimento indDad) {
        this.reg = "B001";
        this.indMov = indDad;
    }

}
