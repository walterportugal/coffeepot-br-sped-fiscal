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
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegM630.
 *
 * <p>
 * Informações Adicionais de Diferimento.
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
    @Field(name = "reg", id = true, constantValue = "M630"),
    @Field(name = "cnpj", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "vlVend"),
    @Field(name = "vlNaoReceb"),
    @Field(name = "vlContDif"),
    @Field(name = "vlCredDif"),
    @Field(name = "codCred", length = 3)
})
@Getter
@Setter
public class RegM630 {

    private String cnpj;
    private Double vlVend;
    private Double vlNaoReceb;
    private Double vlContDif;
    private Double vlCredDif;
    private String codCred;
}
