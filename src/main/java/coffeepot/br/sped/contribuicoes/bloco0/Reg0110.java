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
 * Class: Reg0110.
 *
 * <p>
 * Regimes de Apuração da Contribuição Social e de Apropriação de Crédito.
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
    @Field(name = "reg", id = true, constantValue = "0110"),
    @Field(name = "codIncTrib"),
    @Field(name = "indAproCred"),
    @Field(name = "codTipoCont"),
    @Field(name = "indRegCum"),
    @Field(name = "reg0111")    
})
@Getter
@Setter
public class Reg0110 {

    private CodigoIncidenciaTributaria codIncTrib;
    private IndicadorApropriacaoCredito indAproCred;
    private ContribuicaoApuradaPeriodo codTipoCont;
    private IndicadorRegimeCumulativo indRegCum;
    private Reg0111 reg0111;

    /**
     * Enum: CodigoIncidenciaTributaria.
     * 
     * Código indicador da incidência tributária no período: 
     * <ul>
     * <li>1 – Escrituração de operações com incidência exclusivamente no regime não-cumulativo;</li>
     * <li>2 – Escrituração de operações com incidência exclusivamente no regime cumulativo;</li>
     * <li>3 – Escrituração de operações com incidência nos regimes não-cumulativo e cumulativo.</li>
     * </ul>
     */
    public enum CodigoIncidenciaTributaria implements EnumCodificado {

        INCIDENCIA_EXCLUSIVAMENTE_NAO_CUMULATIVO("1"),
        INCIDENCIA_EXCLUSIVAMENTE_CUMULATIVO("2"),
        NAO_CUMULATIVO_E_CUMULATIVO("3");

        private final String codigo;

        private CodigoIncidenciaTributaria(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

        public static CodigoIncidenciaTributaria valueOfStripToNull(final String v) {
            if (v == null || v.length() == 0) {
                return null;
            }
            return CodigoIncidenciaTributaria.valueOf(v);
        }

        public static CodigoIncidenciaTributaria valueOfCodigoStripToNull(final String codigo) {
            if (codigo == null || codigo.length() == 0) {
                return null;
            }

            return valueOfCodigo(codigo);
        }

        public static CodigoIncidenciaTributaria valueOfCodigo(final String codigo) {
            for (CodigoIncidenciaTributaria n : values()) {
                if (n.getCodigo().equalsIgnoreCase(codigo)) {
                    return n;
                }
            }
            return null;
        }

    }

    /**
     * Enum: IndicadorApropriacaoCredito.
     *
     * <p>
     * Código indicador de método de apropriação de créditos comuns, no caso de incidência no regime não-cumulativo
     * (COD_INC_TRIB = 1 ou 3):
     * <ul>
     * <li>1 – Método de Apropriação Direta;</li>
     * <li>2 – Método de Rateio Proporcional (Receita Bruta)</li>
     * </ul </p>
     */
    public enum IndicadorApropriacaoCredito implements EnumCodificado {

        APROPRIACAO_DIRETA("1"),
        APROPRIACAO_ALIQUOTAS_ESPECIFICAS("2");

        private final String codigo;

        private IndicadorApropriacaoCredito(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

        public static IndicadorApropriacaoCredito valueOfStripToNull(final String v) {
            if (v == null || v.length() == 0) {
                return null;
            }
            return IndicadorApropriacaoCredito.valueOf(v);
        }

        public static IndicadorApropriacaoCredito valueOfCodigoStripToNull(final String codigo) {
            if (codigo == null || codigo.length() == 0) {
                return null;
            }

            return valueOfCodigo(codigo);
        }

        public static IndicadorApropriacaoCredito valueOfCodigo(final String codigo) {
            for (IndicadorApropriacaoCredito n : values()) {
                if (n.getCodigo().equalsIgnoreCase(codigo)) {
                    return n;
                }
            }
            return null;
        }

    }

    /**
     * Enum: ContribuicaoApuradaPeriodo.
     *
     * <p>
     * Código indicador do Tipo de Contribuição Apurada no Período
     * <ul>
     * <li>1 – Apuração da Contribuição Exclusivamente a Alíquota Básica</li>
     * <li>2 – Apuração da Contribuição a Alíquotas Específicas (Diferenciadas e/ou por Unidade de Medida de
     * Produto)</li>
     * </ul>
     * </p>
     *
     */
    public enum ContribuicaoApuradaPeriodo implements EnumCodificado {

        APURACAO_CONTRIB_EXCLUSIVA_ALIQ_BASICA("1"),
        APURACAO_CONTRIB_ALIQUOTAS_ESPECIFICAS("2");

        private final String codigo;

        private ContribuicaoApuradaPeriodo(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

        public static ContribuicaoApuradaPeriodo valueOfStripToNull(final String v) {
            if (v == null || v.length() == 0) {
                return null;
            }
            return ContribuicaoApuradaPeriodo.valueOf(v);
        }

        public static ContribuicaoApuradaPeriodo valueOfCodigoStripToNull(final String codigo) {
            if (codigo == null || codigo.length() == 0) {
                return null;
            }

            return valueOfCodigo(codigo);
        }

        public static ContribuicaoApuradaPeriodo valueOfCodigo(final String codigo) {
            for (ContribuicaoApuradaPeriodo n : values()) {
                if (n.getCodigo().equalsIgnoreCase(codigo)) {
                    return n;
                }
            }
            return null;
        }

    }

    /**
     * Enum: IndicadorRegimeCumulativo.
     *
     * <p>
     * Código indicador do critério de escrituração e apuração adotado, no caso de incidência exclusivamente no regime
     * cumulativo (COD_INC_TRIB = 2), pela pessoa jurídica submetida ao regime de tributação com base no lucro
     * presumido:
     * <ul>
     * <li>1 – Regime de Caixa – Escrituração consolidada (Registro F500);</li>
     * <li>2 – Regime de Competência - Escrituração consolidada (Registro F550);</li>
     * <li>9 – Regime de Competência - Escrituração detalhada, com base nos registros dos Blocos “A”, “C”, “D” e
     * “F”.</li>
     * </ul>
     * </p>     
     */
    public enum IndicadorRegimeCumulativo implements EnumCodificado {

        REGIME_DE_CAIXA("1"),
        REGIME_DE_COMPETENCIA("2"),
        REGIME_DE_COMPETENCIA_ESCRIT_DETALHADA("9");

        private final String codigo;

        private IndicadorRegimeCumulativo(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

        public static IndicadorRegimeCumulativo valueOfStripToNull(final String v) {
            if (v == null || v.length() == 0) {
                return null;
            }
            return IndicadorRegimeCumulativo.valueOf(v);
        }

        public static IndicadorRegimeCumulativo valueOfCodigoStripToNull(final String codigo) {
            if (codigo == null || codigo.length() == 0) {
                return null;
            }

            return valueOfCodigo(codigo);
        }

        public static IndicadorRegimeCumulativo valueOfCodigo(final String codigo) {
            for (IndicadorRegimeCumulativo n : values()) {
                if (n.getCodigo().equalsIgnoreCase(codigo)) {
                    return n;
                }
            }
            return null;
        }

    }
}
