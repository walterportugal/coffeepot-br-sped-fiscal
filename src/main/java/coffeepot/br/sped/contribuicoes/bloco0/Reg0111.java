package coffeepot.br.sped.contribuicoes.bloco0;

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
 * Class: Reg0111.
 *
 * <p>
 * Tabela de Receita Bruta Mensal para Fins de Rateio de Créditos Comuns.
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
    @Field(name = "reg", id = true, constantValue = "0111"),
    @Field(name = "recBruNcumTribMi"),
    @Field(name = "recBruNcumNtMi"),
    @Field(name = "recBruNcumExp"),
    @Field(name = "recBruCum"),
    @Field(name = "recBruTotal"),
})
@Getter
@Setter
public class Reg0111 {
    
    private Double recBruNcumTribMi;
    private Double recBruNcumNtMi;
    private Double recBruNcumExp;
    private Double recBruCum;
    private Double recBruTotal;    

}
