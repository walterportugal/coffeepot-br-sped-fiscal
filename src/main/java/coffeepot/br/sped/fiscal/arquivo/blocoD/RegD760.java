package coffeepot.br.sped.fiscal.arquivo.blocoD;

/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 - 2026 Jeandeson O. Merelis
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
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegD760.
 *
 * <p>
 * REGISTRO D760: REGISTRO ANALÍTICO DA ESCRITURAÇÃO CONSOLIDADA DA NOTA FISCAL FATURA ELETRÔNICA DE SERVIÇOS DE
 * COMUNICAÇÃO - NFCom (CÓDIGO 62)
 * </p>
 *
 * <p>
 * History:<br><br>
 * - Walter L. Portugal - 12 de fev. de 2026: Criação do Arquivo<br>
 * </p>
 *
 * @author Walter L. Portugal
 * @since 2.1.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "D760"),
    @Field(name = "cstIcms"),
    @Field(name = "cfop"),
    @Field(name = "aliqIcms"),
    @Field(name = "vlOpr"),
    @Field(name = "vlBcIcms"),
    @Field(name = "vlIcms"),
    @Field(name = "vlRedBc"),
    @Field(name = "codObs"),
    // --- filho ---
    @Field(name = "regD761")
})
@Getter
@Setter
public class RegD760 {

    private String cstIcms;
    private Integer cfop;
    private Double aliqIcms;   // %
    private Double vlOpr;
    private Double vlBcIcms;
    private Double vlIcms;
    private Double vlRedBc;
    private String codObs;     // (0460)

    // FCP - 1:1
    private RegD761 regD761;
}
