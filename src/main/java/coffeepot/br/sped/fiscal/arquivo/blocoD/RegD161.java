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
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.br.sped.fiscal.tipos.TipoTransporte;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "D161"),
    @Field(name = "indCarga"),
    @Field(name = "cnpjCpfCol", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "ieCol"),
    @Field(name = "codMunCol"),
    @Field(name = "cnpjCpfEntg", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "ieEntg"),
    @Field(name = "codMunEntg")
})
@Getter
@Setter
public class RegD161 {

    private TipoTransporte indCarga;
    private String cnpjCpfCol;
    private String ieCol;
    private Long codMunCol;
    private String cnpjCpfEntg;
    private String ieEntg;
    private Long codMunEntg;
    
}
