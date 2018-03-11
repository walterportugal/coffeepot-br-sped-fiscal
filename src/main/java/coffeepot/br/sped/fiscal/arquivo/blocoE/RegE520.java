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


import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "E520"),
    @Field(name = "vlSdAntIpi"),
    @Field(name = "vlDebIpi"),
    @Field(name = "vlCredIpi"),
    @Field(name = "vlOdIpi"),
    @Field(name = "vlOcIpi"),
    @Field(name = "vlScIpi"),
    @Field(name = "vlSdIpi"),
    //
    @Field(name = "regE530List")
})
@Getter
@Setter
public class RegE520 {

    private Double vlSdAntIpi;
    private Double vlDebIpi;
    private Double vlCredIpi;
    private Double vlOdIpi;
    private Double vlOcIpi;
    private Double vlScIpi;
    private Double vlSdIpi;
    //
    private List<RegE530> regE530List;

}
