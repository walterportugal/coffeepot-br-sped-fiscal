/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco1;

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
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "1320"),
    @Field(name = "numBico"),
    @Field(name = "nrInterv"),
    @Field(name = "motInterv"),
    @Field(name = "nomInterv"),
    @Field(name = "cnpjInterv"),
    @Field(name = "cpfInterv"),
    @Field(name = "valFecha"),
    @Field(name = "valAbert"),
    @Field(name = "volAferi"),
    @Field(name = "volVendas")
    //--- detalhes ---
})
@Getter
@Setter
public class Reg1320 {

    private String numBico;
    private String nrInterv;
    private String motInterv;
    private String nomInterv;
    private String cnpjInterv;
    private String cpfInterv;
    private Double valFecha;
    private Double valAbert;
    private Double volAferi;
    private Double volVendas;
    //--- detalhes ---

}
