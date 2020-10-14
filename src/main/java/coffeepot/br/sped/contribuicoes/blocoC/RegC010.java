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
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegC010.
 *
 * <p>
 * Identificação do Estabelecimento.
 * </p>
 *
 * <p>
 * History:<br><br>
 * - walter - Sep 3, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "C010"),
    @Field(name = "cnpj"),
    @Field(name = "indEscri"),
    @Field(name = "regC100List"),
    @Field(name = "regC180List"),
    @Field(name = "regC190List"),
    @Field(name = "regC395List"),
    @Field(name = "regC500List")
})
@Getter
@Setter
public class RegC010 {

    private String cnpj;
    private IndicadorApuracaoContribuicoesCreditos indEscri;
    
    private List<RegC100> regC100List;
    private List<RegC180> regC180List;
    private List<RegC190> regC190List;
    private List<RegC395> regC395List;
    private List<RegC500> regC500List;

    /**
     * Enum: IndicadorApuracaoContribuicoesCreditos.
     *
     * Indicador da apuração das contribuições e créditos, na escrituração das operações por NF-e e ECF, no período:
     *
     * <ul>
     * <li>1 – Apuração com base nos registros de consolidação das operações por NF-e (C180 e C190) e por ECF
     * (C490);</li>
     * <li>2 – Apuração com base no registro individualizado de NF-e (C100 e C170) e de ECF (C400)</li>
     * </ul>
     */
    public enum IndicadorApuracaoContribuicoesCreditos implements EnumCodificado {

        REGISTRO_CONSOLIDADO("1"),
        REGISTRO_INDIVIDUALIZADO("2");

        private final String codigo;

        private IndicadorApuracaoContribuicoesCreditos(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }
    }

}
