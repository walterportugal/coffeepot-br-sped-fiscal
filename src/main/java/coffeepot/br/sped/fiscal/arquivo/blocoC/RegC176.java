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
import coffeepot.br.sped.fiscal.tipos.ModeloDocumentoArecadacao;
import coffeepot.br.sped.fiscal.tipos.ResponsalvelRetencaoIcmsSt;
import coffeepot.br.sped.fiscal.tipos.MotivoRessarcimento;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "C176"),
    @Field(name = "codModUltE"),
    @Field(name = "numDocUltE"),
    @Field(name = "serUltE"),
    @Field(name = "dtUltE"),
    @Field(name = "codPartUltE"),
    @Field(name = "quantUltE"),
    @Field(name = "vlUnitUltE"),
    @Field(name = "vlUnitBcSt"),
    @Field(name = "chaveNfeUltE"),
    @Field(name = "numItemUltE"),
    @Field(name = "vlUnitBcIcmsUltE"),
    @Field(name = "aliqIcmsUltE"),
    @Field(name = "vlUnitLimiteBcIcmsUltE"),
    @Field(name = "vlUnitIcmsUltE"),
    @Field(name = "aliqStUltE"),
    @Field(name = "vlUnitRes"),
    @Field(name = "codRespRet"),
    @Field(name = "codMotRes"),
    @Field(name = "chaveNfeRet"),
    @Field(name = "codPartNfeRet"),
    @Field(name = "serNfeRet"),
    @Field(name = "numNfeRet"),
    @Field(name = "itemNfeRet"),
    @Field(name = "codDa"),
    @Field(name = "numDa"),
})
@Getter
@Setter
public class RegC176 {

    private String codModUltE;
    private Long numDocUltE;
    private String serUltE;
    private LocalDate dtUltE;
    private String codPartUltE;
    private Double quantUltE;
    private Double vlUnitUltE;
    private Double vlUnitBcSt;
    private String chaveNfeUltE;
    private Long numItemUltE;
    private Double vlUnitBcIcmsUltE;
    private Double aliqIcmsUltE;
    private Double vlUnitLimiteBcIcmsUltE;
    private Double vlUnitIcmsUltE;
    private Double aliqStUltE;
    private Double vlUnitRes;
    private ResponsalvelRetencaoIcmsSt codRespRet;
    private MotivoRessarcimento codMotRes;
    private String chaveNfeRet;
    private String codPartNfeRet;
    private String serNfeRet;
    private Long numNfeRet;
    private Long itemNfeRet;
    private ModeloDocumentoArecadacao codDa;
    private String numDa;

}
