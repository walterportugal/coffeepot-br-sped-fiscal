/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoC;


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
    @Field(name = "reg", id=true, constantValue = "C800"),
    @Field(name = "codMod"),
    @Field(name = "codSit"),
    @Field(name = "numCfe"),
    @Field(name = "dtDoc"),
    @Field(name = "vlCfe"),
    @Field(name = "vlPis"),
    @Field(name = "vlCofins"),
    @Field(name = "cnpjCpf", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "nrSat"),
    @Field(name = "chvNfe"),
    @Field(name = "vlDesc"),
    @Field(name = "vlMerc"),
    @Field(name = "vlOutDa"),
    @Field(name = "vlIcms"),
    @Field(name = "vlPisSt"),
    @Field(name = "vlCofinsSt"),
    //--- detalhes ---
    @Field(name = "regC850List")
})
@Getter
@Setter
public class RegC800 {

    private DocumentoFiscal codMod;
    private SituacaoDocumento codSit;
    private String numCfe;
    private LocalDate dtDoc;
    private Double vlCfe;
    private Double vlPis;
    private Double vlCofins;
    private String cnpjCpf;
    private String nrSat;
    private String chvNfe;
    private Double vlDesc;
    private Double vlMerc;
    private Double vlOutDa;
    private Double vlIcms;
    private Double vlPisSt;
    private Double vlCofinsSt;
    //--- detalhes ---
    private List<RegC850> regC850List;
    
}
