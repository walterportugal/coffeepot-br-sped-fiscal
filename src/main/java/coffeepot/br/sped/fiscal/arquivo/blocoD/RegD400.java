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
import coffeepot.br.sped.fiscal.tipos.SituacaoDocumento;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "reg", id=true, constantValue = "D400"),
    @Field(name = "codPart"),
    @Field(name = "codMod"),
    @Field(name = "codSit"),
    @Field(name = "ser"),
    @Field(name = "sub"),
    @Field(name = "numDoc"),
    @Field(name = "dtDoc"),
    @Field(name = "vlDoc"),
    @Field(name = "vlDesc"),
    @Field(name = "vlServ"),
    @Field(name = "vlBcIcms"),
    @Field(name = "vlIcms"),
    @Field(name = "vlPis"),
    @Field(name = "vlCofins"),
    @Field(name = "codCta"),
    //--- detalhes ---
    @Field(name = "regD410List"),
    @Field(name = "regD420List")
})
@Getter
@Setter
public class RegD400 {

    private String codPart;
    private DocumentoFiscal codMod;
    private SituacaoDocumento codSit;
    private String ser;
    private String sub;
    private Long numDoc;
    private LocalDate dtDoc;
    private Double vlDoc;
    private Double vlDesc;
    private Double vlServ;
    private Double vlBcIcms;
    private Double vlIcms;
    private Double vlPis;
    private Double vlCofins;
    private String codCta;
    //--- detalhes ---
    private List<RegD410> regD410List;
    private List<RegD420> regD420List;

}
