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
import coffeepot.br.sped.fiscal.arquivo.blocoK.RegK200.IndicadorTipoEstoque;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "reg", id=true, constantValue = "K280"),
    @Field(name = "dtEst"),
    @Field(name = "codItem"),
    @Field(name = "qtdCorPos"),
    @Field(name = "qtdCorNeg"),
    @Field(name = "indEst"),
    @Field(name = "codPart")
})
@Getter
@Setter
public class RegK280 {

    private LocalDate dtEst;
    private String codItem;
    private Double qtdCorPos;
    private Double qtdCorNeg;
    private IndicadorTipoEstoque indEst;
    private String codPart;
}
