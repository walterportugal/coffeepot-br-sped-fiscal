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
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegM605.
 *
 * <p>
 * Cofins a Recolher – Detalhamento por Código de Receita.
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
    @Field(name = "reg", id = true, constantValue = "M605"),
    @Field(name = "numCampo", length = 2),
    @Field(name = "codRec", length = 6),
    @Field(name = "vlDebito")
})
@Getter
@Setter
public class RegM605 {

    private String numCampo;
    private String codRec;
    private Double vlDebito;
}
