/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco1;

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
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "1920"),
    @Field(name = "vlTotTransfDebitosOA"),
    @Field(name = "vlTotAjDebitosOA"),
    @Field(name = "vlEstornosCredOA"),
    @Field(name = "vlTotTransfCreditosOA"),
    @Field(name = "vlTotAjCreditosOA"),
    @Field(name = "vlEstornosDebOA"),
    @Field(name = "vlSldCredorAntOA"),
    @Field(name = "vlSldApuradoOA"),
    @Field(name = "vlTotDed"),
    @Field(name = "vlCimsRecolherOA"),
    @Field(name = "vlSldCredorTranspOA"),
    @Field(name = "debEspOA"),
    //--- detalhes ---
    @Field(name = "reg1921List"),
    @Field(name = "reg1925List"),
    @Field(name = "reg1926List")
})
@Getter
@Setter
public class Reg1920 {

    private Double vlTotTransfDebitosOA;
    private Double vlTotAjDebitosOA;
    private Double vlEstornosCredOA;
    private Double vlTotTransfCreditosOA;
    private Double vlTotAjCreditosOA;
    private Double vlEstornosDebOA;
    private Double vlSldCredorAntOA;
    private Double vlSldApuradoOA;
    private Double vlTotDed;
    private Double vlCimsRecolherOA;
    private Double vlSldCredorTranspOA;
    private Double debEspOA;
    //--- detalhes ---
    private List<Reg1921> reg1921List;
    private List<Reg1925> reg1925List;
    private List<Reg1926> reg1926List;

}
