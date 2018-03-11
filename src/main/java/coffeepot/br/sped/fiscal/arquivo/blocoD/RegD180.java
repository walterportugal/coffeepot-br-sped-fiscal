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
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import coffeepot.br.sped.fiscal.tipos.EmissaoDocumento;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "D180"),
    @Field(name = "numSeq"),
    @Field(name = "indEmit"),
    @Field(name = "cnpjCpfEmit", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "ufEmit"),
    @Field(name = "ieEmit"),
    @Field(name = "codMunOri"),
    @Field(name = "cnpjCpfTom", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "ufTom"),
    @Field(name = "ieTom"),
    @Field(name = "codMunDest"),
    @Field(name = "codMod"),
    @Field(name = "ser"),
    @Field(name = "sub"),
    @Field(name = "numDoc"),
    @Field(name = "dtDoc"),
    @Field(name = "vlDoc")
})
@Getter
@Setter
public class RegD180 {

    private Integer numSeq;
    private EmissaoDocumento indEmit;
    private String cnpjCpfEmit;
    private String ufEmit;
    private String ieEmit;
    private Long codMunOri;
    private String cnpjCpfTom;
    private String ufTom;
    private String ieTom;
    private Long codMunDest;
    private DocumentoFiscal codMod;
    private String ser;
    private String sub;
    private Long numDoc;
    private LocalDate dtDoc;
    private Double vlDoc;
    
}
