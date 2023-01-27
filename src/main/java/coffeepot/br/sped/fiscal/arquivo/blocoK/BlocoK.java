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


import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Djeison A. Selzlein &amp; Anderson A. Mallmann &amp; Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "regK001"),
    @Field(name = "regK010"),
    @Field(name = "regK100List"),
    @Field(name = "regK990")
})
@Getter
@Setter
public class BlocoK {

    private RegK001 regK001;
    private RegK010 regK010;
    private List<RegK100> regK100List;
    private RegK990 regK990;

}
