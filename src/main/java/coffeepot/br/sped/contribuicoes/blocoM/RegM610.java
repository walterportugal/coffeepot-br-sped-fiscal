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
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegM610.
 *
 * <p>
 * Detalhamento da Contribuição para a Seguridade Social - Cofins do Período.
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
    @Field(name = "reg", id = true, constantValue = "M610"),
    @Field(name = "codCont", length = 2),
    @Field(name = "vlRecBrt"),
    @Field(name = "vlBcCont"),
    @Field(name = "aliqCofins"),
    @Field(name = "quantBcCofins"),
    @Field(name = "aliqCofinsQuant"),
    @Field(name = "vlContApur"),
    @Field(name = "vlAjusAcres"),
    @Field(name = "vlAjusReduc"),
    @Field(name = "vlContDifer"),
    @Field(name = "vlContDiferAnt"),
    @Field(name = "vlContPer"),
    @Field(name = "regM611"),
    @Field(name = "regM620List"),
    @Field(name = "regM630List")
})
@Getter
@Setter
public class RegM610 {
    
    private String codCont;
    private Double vlRecBrt;
    private Double vlBcCont;
    private Double aliqCofins;
    private Double quantBcCofins;
    private Double aliqCofinsQuant;
    private Double vlContApur;
    private Double vlAjusAcres;
    private Double vlAjusReduc;
    private Double vlContDifer;
    private Double vlContDiferAnt;
    private Double vlContPer;
    
    private RegM611 regM611;
    private List<RegM620> regM620List;
    private List<RegM630> regM630List;

}
