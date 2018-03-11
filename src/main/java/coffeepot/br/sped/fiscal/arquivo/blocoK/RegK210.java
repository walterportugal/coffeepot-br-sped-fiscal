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
    @Field(name = "reg", id=true, constantValue = "K210"),
    @Field(name = "dtIniOs"),
    @Field(name = "dtFimOs"),
    @Field(name = "codDocOs"),
    @Field(name = "corItemOri"),
    @Field(name = "qtdOri"),
    //
    @Field(name = "regK215List"),
    @Field(name = "regK220List"),
    @Field(name = "regK230List"),
    @Field(name = "regK250List"),
    @Field(name = "regK260List"),
    @Field(name = "regK270List"),
    @Field(name = "regK280List"),
    @Field(name = "regK290List"),
    @Field(name = "regK300List")
})
@Getter
@Setter
public class RegK210 {

    private LocalDate dtIniOs;
    private LocalDate dtFimOs;
    private String codDocOs;
    private String corItemOri;
    private Double qtdOri;
    //
    private List<RegK215> regK215List;
    private List<RegK220> regK220List;
    private List<RegK230> regK230List;
    private List<RegK250> regK250List;
    private List<RegK260> regK260List;
    private List<RegK270> regK270List;
    private List<RegK280> regK280List;
    private List<RegK290> regK290List;
    private List<RegK300> regK300List;
}
