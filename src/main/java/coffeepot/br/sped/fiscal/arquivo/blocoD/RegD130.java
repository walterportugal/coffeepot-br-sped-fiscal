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
import coffeepot.br.sped.fiscal.tipos.Frete;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "D130"),
    @Field(name = "codPartConsg"),
    @Field(name = "codPartRed"),
    @Field(name = "indFrtRed"),
    @Field(name = "codMunOrig"),
    @Field(name = "codMunDest"),
    @Field(name = "veicId", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY}),
    @Field(name = "vlLiqFrt"),
    @Field(name = "vlSecCat"),
    @Field(name = "vlDesp"),
    @Field(name = "vlPedg"),
    @Field(name = "vlOut"),
    @Field(name = "vlFrt"),
    @Field(name = "ufId")
})
@Getter
@Setter
public class RegD130 {

    private String codPartConsg;
    private String codPartRed;
    private Frete indFrtRed;
    private Long codMunOrig;
    private Long codMunDest;
    private String veicId;
    private Double vlLiqFrt;
    private Double vlSecCat;
    private Double vlDesp;
    private Double vlPedg;
    private Double vlOut;
    private Double vlFrt;
    private String ufId;

}
