package coffeepot.br.sped.contribuicoes.blocoC;

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
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegC501.
 *
 * <p>
 * Complemento da Operação (Códigos 06, 28 e 29) – PIS/Pasep.
 * </p>
 *
 * <p>
 * History:<br><br>
 *      - walter - Sep 4, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "C501"),
    @Field(name = "cstPis", minLength = 2, align = Align.RIGHT, padding = '0'),
    @Field(name = "vlItem"),
    @Field(name = "natBcCred"),
    @Field(name = "vlBcPis"),
    @Field(name = "aliqPis"),
    @Field(name = "vlPis"),
    @Field(name = "codCta"),
})
@Getter
@Setter
public class RegC501 {
    
    private String cstPis;
    private Double vlItem;
    private String natBcCred;
    private Double vlBcPis;
    private Double aliqPis;
    private Double vlPis;
    private String codCta;

}
