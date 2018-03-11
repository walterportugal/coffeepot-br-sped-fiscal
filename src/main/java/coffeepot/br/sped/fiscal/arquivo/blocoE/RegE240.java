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
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "reg", id=true, constantValue = "D240"),
    @Field(name = "codPart"),
    @Field(name = "codMod"),
    @Field(name = "ser"),
    @Field(name = "sub"),
    @Field(name = "numDoc"),
    @Field(name = "dtDoc"),
    @Field(name = "codItem"),
    @Field(name = "vlAjItem"),
    @Field(name = "chvDOCe")
    //--- detalhes ---
})
@Getter
@Setter
public class RegE240 {

    private String codPart;
    private DocumentoFiscal codMod;
    private String ser;
    private String sub;
    private Long numDoc;
    private LocalDate dtDoc;
    private String codItem;
    private Double vlAjItem;
    private String chvDOCe;
    //--- detalhes ---


}
