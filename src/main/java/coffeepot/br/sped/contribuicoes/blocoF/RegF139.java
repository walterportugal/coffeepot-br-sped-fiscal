package coffeepot.br.sped.contribuicoes.blocoF;

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
import coffeepot.br.sped.contribuicoes.tipos.OrigemProcesso;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegF139.
 *
 * <p>
 * Processo Referenciado.
 * </p>
 *
 * <p>
 * History:<br><br>
 * - Walter Portugal - Sep 28, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author Walter Portugal
 * @since 3.1.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "F139"),
    @Field(name = "numProc", maxLength = 20),
    @Field(name = "indProc")
})
@Getter
@Setter
public class RegF139 {

    private String numProc;
    private OrigemProcesso indProc;

}
