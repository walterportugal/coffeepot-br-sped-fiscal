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
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "reg", id=true, constantValue = "K260"),
    @Field(name = "codOpOs"),
    @Field(name = "codItem"),
    @Field(name = "dtSaida"),
    @Field(name = "qtdSaida"),
    @Field(name = "dtRet"),
    @Field(name = "qtdRet"),
    //
    @Field(name = "regK265List")
})
@Getter
@Setter
public class RegK260 {

    private String codOpOs;
    private String codItem;
    private LocalDate dtSaida;
    private Double qtdSaida;
    private LocalDate dtRet;
    private Double qtdRet;
    //
    private List<RegK265> regK265List;
}
