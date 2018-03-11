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
import coffeepot.bean.wr.types.Align;
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "D410"),
    @Field(name = "codMod"),
    @Field(name = "ser"),
    @Field(name = "sub"),
    @Field(name = "numDocIni"),
    @Field(name = "numDocFim"),
    @Field(name = "dtDoc"),
    @Field(name = "cstIcms", length = 3, align = Align.RIGHT, padding = '0'),
    @Field(name = "cfop"),
    @Field(name = "aliqIcms"),
    @Field(name = "vlOpr"),
    @Field(name = "vlDesc"),
    @Field(name = "vlServ"),
    @Field(name = "vlBcIcms"),
    @Field(name = "vlIcms"),
    //--- detalhes ---
    @Field(name = "regD411List")
})
@Getter
@Setter
public class RegD410 {

    private DocumentoFiscal codMod;
    private String ser;
    private String sub;
    private Long numDocIni;
    private Long numDocFim;
    private LocalDate dtDoc;
    private String cstIcms;
    private Integer cfop;
    private Double aliqIcms;
    private Double vlOpr;
    private Double vlDesc;
    private Double vlServ;
    private Double vlBcIcms;
    private Double vlIcms;
    //--- detalhes ---
    private List<RegD411> regD411List;

}
