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
import coffeepot.br.sped.contribuicoes.tipos.IndicadorTipoAjuste;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegM220.
 *
 * <p>
 * Ajustes da Contribuição para o PIS/Pasep Apurada.
 * </p>
 *
 * <p>
 * History:<br><br>
 * - walter - Sep 10, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "M220"),
    @Field(name = "indAj"),
    @Field(name = "vlAj"),
    @Field(name = "codAj"),
    @Field(name = "numDoc"),
    @Field(name = "descrAj"),
    @Field(name = "dtRef"),
    @Field(name = "regM225List")
})
@Getter
@Setter
public class RegM220 {

    private IndicadorTipoAjuste indAj;
    private Double vlAj;
    private String codAj;
    private String numDoc;
    private String descrAj;
    private LocalDate dtRef;

    private List<RegM225> regM225List;

}
