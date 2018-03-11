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
import coffeepot.br.sped.fiscal.arquivo.blocoC.RegC500.CodigoConsumo;
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
    @Field(name = "reg", id=true, constantValue = "C600"),
    @Field(name = "codMod"),
    @Field(name = "codMun"),
    @Field(name = "ser"),
    @Field(name = "sub"),
    @Field(name = "codCons"),
    @Field(name = "qtdCons"),
    @Field(name = "qtdCanc"),
    @Field(name = "dtDoc"),
    @Field(name = "vlDoc"),
    @Field(name = "vlDesc"),
    @Field(name = "cons"),
    @Field(name = "vlFonr"),
    @Field(name = "vlServNt"),
    @Field(name = "vlTerc"),
    @Field(name = "vlDa"),
    @Field(name = "vlBcIcms"),
    @Field(name = "vlIcms"),
    @Field(name = "vlBcIcmsSt"),
    @Field(name = "vlIcmsSt"),
    @Field(name = "vlPis"),
    @Field(name = "vlCofins"),
    //--- detalhes ---
    @Field(name = "regC601List"),
    @Field(name = "regC610List"),
    @Field(name = "regC690List")
})
@Getter
@Setter
public class RegC600 {

    private DocumentoFiscal codMod;
    private Long codMun;
    private String ser;
    private String sub;
    private CodigoConsumo codCons;
    private Integer qtdCons;
    private Integer qtdCanc;
    private LocalDate dtDoc;
    private Double vlDoc;
    private Double vlDesc;
    private Integer cons;
    private Double vlFonr;
    private Double vlServNt;
    private Double vlTerc;
    private Double vlDa;
    private Double vlBcIcms;
    private Double vlIcms;
    private Double vlBcIcmsSt;
    private Double vlIcmsSt;
    private Double vlPis;
    private Double vlCofins;
    //--- detalhes ---
    private List<RegC601> regC601List;
    private List<RegC610> regC610List;
    private List<RegC690> regC690List;
    
}
