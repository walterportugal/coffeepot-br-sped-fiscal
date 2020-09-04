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
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: Reg0145.
 *
 * <p>
 * Regime de Apuração da Contribuição Previdenciária sobre a Receita Bruta.
 * </p>
 *
 * <p>
 * History:<br><br>
 * - walter - Sep 2, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "0145"),
    @Field(name = "codIncTrib"),
    @Field(name = "vlRecTot"),
    @Field(name = "vlRecAtiv"),
    @Field(name = "vlRecDemaisAtiv"),
    @Field(name = "infoCompl")
})
@Getter
@Setter
public class Reg0145 {

    private IndicadorIncidenciaTributaria codIncTrib;
    private Double vlRecTot;
    private Double vlRecAtiv;
    private Double vlRecDemaisAtiv;
    private String infoCompl;
    
    /**
     * Enum: IndicadorIncidenciaTributaria.
     *
     * Código indicador da incidência tributária no período:
     *
     * <ul>
     * <li>1 – Contribuição Previdenciária apurada no período, exclusivamente com base na Receita Bruta; </li>
     * <li>2 – Contribuição Previdenciária apurada no período, com base na Receita Bruta e com base nas Remunerações
     * pagas, na forma dos nos incisos I e III do art. 22 da Lei n o 8.212, de 1991.</li>
     * </ul>
     *
     */
    public enum IndicadorIncidenciaTributaria implements EnumCodificado {

        CONTRIBUICAO_PREV_EXCLUSIVA_REC_BRUTA("1"),
        CONTRIBUICAO_PREV_REMUNERACOES_PAGAS("2");

        private final String codigo;

        private IndicadorIncidenciaTributaria(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

        public static IndicadorIncidenciaTributaria valueOfStripToNull(final String v) {
            if (v == null || v.length() == 0) {
                return null;
            }
            return IndicadorIncidenciaTributaria.valueOf(v);
        }

        public static IndicadorIncidenciaTributaria valueOfCodigoStripToNull(final String codigo) {
            if (codigo == null || codigo.length() == 0) {
                return null;
            }

            return valueOfCodigo(codigo);
        }

        public static IndicadorIncidenciaTributaria valueOfCodigo(final String codigo) {
            for (IndicadorIncidenciaTributaria n : values()) {
                if (n.getCodigo().equalsIgnoreCase(codigo)) {
                    return n;
                }
            }
            return null;
        }

    }

}
