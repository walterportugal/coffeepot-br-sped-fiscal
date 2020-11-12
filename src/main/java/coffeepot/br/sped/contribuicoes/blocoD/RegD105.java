package coffeepot.br.sped.contribuicoes.blocoD;

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
import coffeepot.bean.wr.types.Align;
import coffeepot.br.sped.contribuicoes.tipos.NaturezaFreteContratado;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegD105.
 *
 * <p>
 * Complemento do Documento de Transporte (Códigos 07, 08, 8B, 09, 10, 11, 26, 27 e 57) – Cofins.
 * </p>
 *
 * <p>
 * History:<br><br>
 * - walter - Sep 4, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "D105"),
    @Field(name = "indNatFrt"),
    @Field(name = "vlItem"),
    @Field(name = "cstCofins", minLength = 2, align = Align.RIGHT, padding = '0'),
    @Field(name = "natBcCred"),
    @Field(name = "vlBcCofins"),
    @Field(name = "aliqCofins"),
    @Field(name = "vlCofins"),
    @Field(name = "codCta")
})
@Getter
@Setter
public class RegD105 {

    private NaturezaFreteContratado indNatFrt;
    private Double vlItem;
    private String cstCofins;
    private String natBcCred;
    private Double vlBcCofins;
    private Double aliqCofins;
    private Double vlCofins;
    private String codCta;

}
