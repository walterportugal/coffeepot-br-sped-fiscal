package coffeepot.br.sped.contribuicoes.blocoM;

import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

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

/**
 * Class: BlocoM.
 *
 * <p>
 * Apuração da Contribuição e Crédito de PIS/PASEP e da COFINS.
 * </p>
 *
 * <p>
 * History:<br><br>
 *      - walter - Sep 2, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "regM001"),
    @Field(name = "regM100List"),
    @Field(name = "regM200"),
    @Field(name = "regM300List"),
    @Field(name = "regM350"),
    @Field(name = "regM400List"),
    @Field(name = "regM500List"),
    @Field(name = "regM600List"),
    @Field(name = "regM700List"),
    @Field(name = "regM800List"),
    @Field(name = "regM990")
})
@Getter
@Setter
public class BlocoM {
    
    private RegM001 regM001;
    
    private List<RegM100> regM100List;
    private RegM200 regM200;
    private List<RegM300> regM300List;
    private RegM350 regM350;
    private List<RegM400> regM400List;
    private List<RegM500> regM500List;
    private List<RegM600> regM600List;
    private List<RegM700> regM700List;
    private List<RegM800> regM800List;
    
    private RegM990 regM990;

}
