package coffeepot.br.sped.contribuicoes.blocoP;

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
 * Class: RegP200.
 *
 * <p>
 * Consolidação da Contribuição Previdenciária sobre a Receita Bruta.
 * </p>
 *
 * <p>
 * History:<br><br>
 *      - walter - Sep 11, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "P200"),
    @Field(name = "vlTotContApu", length = 6),
    @Field(name = "vlTotAjReduc"),
    @Field(name = "vlTotAjAcres"),
    @Field(name = "vlTotContDev"),
    @Field(name = "codRec"),
    @Field(name = "regP210List")
})
@Getter
@Setter
public class RegP200 {
    
    private String perRef;
    private Double vlTotContApu;
    private Double vlTotAjReduc;
    private Double vlTotAjAcres;
    private Double vlTotContDev;
    private String codRec;
    
    private List<RegP210> regP210List;

}
