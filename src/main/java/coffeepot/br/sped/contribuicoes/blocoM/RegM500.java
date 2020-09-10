package coffeepot.br.sped.contribuicoes.blocoM;

/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 - 2020 Jeandeson O. Merelis
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
import coffeepot.br.sped.contribuicoes.tipos.IndicadorCreditoOriundo;
import coffeepot.br.sped.contribuicoes.tipos.IndicadorUtilizacaoCredito;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegM500.
 *
 * <p>
 * Crédito de Cofins Relativo Ao Período.
 * </p>
 *
 * <p>
 * History:<br><br>
 * - walter - Sep 10, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "M500"),
    @Field(name = "codCred", maxLength = 3),
    @Field(name = "indCredOri"),
    @Field(name = "vlBcCofins"),
    @Field(name = "aliqCofins"),
    @Field(name = "quantBcCofins"),
    @Field(name = "aliqCofinsQuant"),
    @Field(name = "vlCred"),
    @Field(name = "vlAjusAcres"),
    @Field(name = "vlAjusReduc"),
    @Field(name = "vlCredDifer"),
    @Field(name = "vlCredDisp"),
    @Field(name = "indDescCred"),
    @Field(name = "vlCredDesc"),
    @Field(name = "sldCred"),
    @Field(name = "regM505List"),
    @Field(name = "regM510List")
})
@Getter
@Setter
public class RegM500 {

    private String codCred;
    private IndicadorCreditoOriundo indCredOri;
    private Double vlBcCofins;
    private Double aliqCofins;
    private Double quantBcCofins;
    private Double aliqCofinsQuant;
    private Double vlCred;
    private Double vlAjusAcres;
    private Double vlAjusReduc;
    private Double vlCredDifer;
    private Double vlCredDisp;
    private IndicadorUtilizacaoCredito indDescCred;
    private Double vlCredDesc;
    private Double sldCred;

    private List<RegM505> regM505List;
    private List<RegM510> regM510List;

}
