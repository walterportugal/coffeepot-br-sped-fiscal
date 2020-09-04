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
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegD010.
 *
 * <p>
 * Insert description here.
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
    @Field(name = "reg", id = true, constantValue = "D010"),
    @Field(name = "cnpj"),
    @Field(name = "regD100List"),
    @Field(name = "regD500List")
})
@Getter
@Setter
public class RegD010 {
    
    private String cnpj;
    private List<RegD100> regD100List;
    private List<RegD500> regD500List;

}