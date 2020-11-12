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
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegC190.
 *
 * <p>
 * Consolidação de Notas Fiscais Eletrônicas (Código 55) – Operações de Aquisição com Direito a Crédito, e Operações de
 * Devolução de Compras e Vendas.
 * </p>
 *
 * <p>
 * History:<br><br>
 * - walter - Sep 4, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "C190"),
    @Field(name = "codMod", constantValue = "55"),
    @Field(name = "dtRefIni"),
    @Field(name = "dtRefFin"),
    @Field(name = "codItem"),
    @Field(name = "codNcm", maxLength = 8),
    @Field(name = "exIpi", maxLength = 3),
    @Field(name = "vlTotItem"),
    @Field(name = "regC191List"),
    @Field(name = "regC195List"),
    @Field(name = "regC198List"),
    @Field(name = "regC199List")
})
@Getter
@Setter
public class RegC190 {

    private LocalDate dtRefIni;
    private LocalDate dtRefFin;
    private String codItem;
    private String codNcm;
    private String exIpi;
    private Double vlTotItem;

    private List<RegC191> regC191List;
    private List<RegC195> regC195List;
    private List<RegC198> regC198List;
    private List<RegC199> regC199List;

}
