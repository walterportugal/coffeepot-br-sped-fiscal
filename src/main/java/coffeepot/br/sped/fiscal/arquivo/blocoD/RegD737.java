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
 * Class: RegD737.
 *
 * <p>
 * REGISTRO D737: OUTRAS OBRIGAÇÕES TRIBUTÁRIAS, AJUSTES E INFORMAÇÕES DE VALORES PROVENIENTES DE DOCUMENTO FISCAL
 * </p>
 *
 * <p>
 * History:<br><br>
 *      - Walter L. Portugal - 12 de fev. de 2026: Criação do Arquivo<br>
 * </p>
 *
 * @author Walter L. Portugal
 * @since 2.1.0
 *
 */

@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "D737"),
    @Field(name = "codAj"),
    @Field(name = "descrComplAj"),
    @Field(name = "codItem"),
    @Field(name = "vlBcIcms"),
    @Field(name = "aliqIcms"),
    @Field(name = "vlIcms"),
    @Field(name = "vlOutros")
})
@Getter
@Setter
public class RegD737 {

    private String codAj;         // Tabela 5.3
    private String descrComplAj;  // descrição complementar
    private String codItem;       // (0200) - se aplicável
    private Double vlBcIcms;
    private Double aliqIcms;      // %
    private Double vlIcms;
    private Double vlOutros;
}