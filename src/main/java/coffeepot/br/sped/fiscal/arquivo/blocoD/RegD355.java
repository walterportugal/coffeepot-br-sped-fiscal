/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoD;

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
    @Field(name = "", id=true, constantValue = "D355"),
    @Field(name = "dtDoc"),
    @Field(name = "cro"),
    @Field(name = "crz"),
    @Field(name = "numCodFin"),
    @Field(name = "gtFin"),
    @Field(name = "vlBrt"),
    //--- detalhes ---
    @Field(name = "regD360"),
    @Field(name = "regD365List")
})
@Getter
@Setter
public class RegD355 {

    private LocalDate dtDoc;
    private Integer cro;
    private Integer crz;
    private Integer numCodFin;
    private Double gtFin;
    private Double vlBrt;
    //--- detalhes ---
    private RegD360 regD360;
    private List<RegD365> regD365List;

}
