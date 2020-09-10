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
import coffeepot.br.sped.contribuicoes.tipos.NaturezaCreditoDiferido;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegM700.
 *
 * <p>
 * Cofins Diferida em Períodos Anteriores – Valores a Pagar no Período.
 * </p>
 *
 * <p>
 * History:<br><br>
 *      - walter - Sep 10, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "M700"),
    @Field(name = "codCont", length = 2),
    @Field(name = "vlContApurDifer"),
    @Field(name = "natCredDesc"),
    @Field(name = "vlCredDescDifer"),
    @Field(name = "vlContDiferAnt"),
    @Field(name = "perApur", length = 6),
    @Field(name = "dtReceb")
})
@Getter
@Setter
public class RegM700 {
    
    private String codCont;
    private Double vlContApurDifer;
    private NaturezaCreditoDiferido natCredDesc;
    private Double vlCredDescDifer;
    private Double vlContDiferAnt;
    private String perApur;
    private LocalDate dtReceb;

}
