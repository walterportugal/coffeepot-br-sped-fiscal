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
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "reg", id=true, constantValue = "D695"),
    @Field(name = "codMod"),
    @Field(name = "ser"),
    @Field(name = "nroOrdIni"),
    @Field(name = "nroOrdFim"),
    @Field(name = "dtDocIni"),
    @Field(name = "dtDocFim"),
    @Field(name = "nomMest"),
    @Field(name = "chvCodDig"),
    //--- detalhes ---
    @Field(name = "regD696List")
})
@Getter
@Setter
public class RegD695 {

    private DocumentoFiscal codMod;
    private String ser;
    private Integer nroOrdIni;
    private Integer nroOrdFim;
    private LocalDate dtDocIni;
    private LocalDate dtDocFim;
    private String nomMest;
    private Double chvCodDig;
    //--- detalhes ---
    private List<RegD696> regD696List;

}
