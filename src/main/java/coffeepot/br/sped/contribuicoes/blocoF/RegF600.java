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
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegF600.
 *
 * <p>
 * Contribuição Retida na Fonte.
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
    @Field(name = "reg", id = true, constantValue = "F600"),
    @Field(name = "indNatRet"),
    @Field(name = "dtRet"),
    @Field(name = "vlBcRet"),
    @Field(name = "vlRet"),
    @Field(name = "codRec"),
    @Field(name = "indNatRec"),
    @Field(name = "cnpj", maxLength = 14, params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "vlRetPis"),
    @Field(name = "vlRetCofins"),
    @Field(name = "indDec")    
})
@Getter
@Setter
public class RegF600 {

    private IndicadorNaturezaRetencao indNatRet;
    private LocalDate dtRet;
    private Double vlBcRet;
    private Double vlRet;
    private String codRec;
    private IndicadorNaturezaReceita indNatRec;
    private String cnpj;
    private Double vlRetPis;
    private Double vlRetCofins;
    private IndicadorCondicaoPjDeclarante indDec;

    /**
     * Enum: IndicadorNaturezaRetencao.
     *
     * <p>
     * Indicador de Natureza da Retenção na Fonte:
     *
     * <ul>
     * <li>01 - Retenção por Órgãos, Autarquias e Fundações Federais</li>
     * <li>02 - Retenção por outras Entidades da Administração Pública Federal</li>
     * <li>03 - Retenção por Pessoas Jurídicas de Direito Privado</li>
     * <li>04 - Recolhimento por Sociedade Cooperativa</li>
     * <li>05 - Retenção por Fabricante de Máquinas e Veículos</li>
     * <li>99 - Outras Retenções</li>
     * </ul></p>
     */
    public enum IndicadorNaturezaRetencao implements EnumCodificado {

        RETENCAO_ORGAOS_FEDERAIS("01"),
        RETENCAO_ENTIDADE_ADM_PUBLICA_FEDERAL("02"),
        RETENCAO_PESSOAS_JURIDICAS_DIREITO_PRIVADO("03"),
        RECOLHIENTO_SOCIEDADE_COOPERATIVA("04"),
        RETENCAO_FABRICANTE_MAQUINAS("05"),
        OUTRAS_RETENCOES("99");

        private final String codigo;

        private IndicadorNaturezaRetencao(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

        public static IndicadorNaturezaRetencao valueOfStripToNull(final String v) {
            if (v == null || v.length() == 0) {
                return null;
            }
            return IndicadorNaturezaRetencao.valueOf(v);
        }

        public static IndicadorNaturezaRetencao valueOfCodigoStripToNull(final String codigo) {
            if (codigo == null || codigo.length() == 0) {
                return null;
            }

            return valueOfCodigo(codigo);
        }

        public static IndicadorNaturezaRetencao valueOfCodigo(final String codigo) {
            for (IndicadorNaturezaRetencao n : values()) {
                if (n.getCodigo().equalsIgnoreCase(codigo)) {
                    return n;
                }
            }
            return null;
        }

    }

    /**
     * Enum: IndicadorNaturezaReceita.
     *
     * <p>
     * Indicador da Natureza da Receita:
     *
     * <ul>
     * <li>0 – Receita de Natureza Não Cumulativa</li>
     * <li>1 – Receita de Natureza Cumulativa</li>
     * </ul></p>
     */
    public enum IndicadorNaturezaReceita implements EnumCodificado {

        RETENCAO_ORGAOS_FEDERAIS("0"),
        RETENCAO_ENTIDADE_ADM_PUBLICA_FEDERAL("1");

        private final String codigo;

        private IndicadorNaturezaReceita(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

        public static IndicadorNaturezaReceita valueOfStripToNull(final String v) {
            if (v == null || v.length() == 0) {
                return null;
            }
            return IndicadorNaturezaReceita.valueOf(v);
        }

        public static IndicadorNaturezaReceita valueOfCodigoStripToNull(final String codigo) {
            if (codigo == null || codigo.length() == 0) {
                return null;
            }

            return valueOfCodigo(codigo);
        }

        public static IndicadorNaturezaReceita valueOfCodigo(final String codigo) {
            for (IndicadorNaturezaReceita n : values()) {
                if (n.getCodigo().equalsIgnoreCase(codigo)) {
                    return n;
                }
            }
            return null;
        }

    }

    /**
     * Enum: IndicadorCondicaoPjDeclarante.
     *
     * <p>
     * Indicador da condição da pessoa jurídica declarante:
     *
     * <ul>
     * <li>0 – Beneficiária da Retenção / Recolhimento</li>
     * <li>1 – Responsável pelo Recolhimento</li>
     * </ul></p>
     */
    public enum IndicadorCondicaoPjDeclarante implements EnumCodificado {

        BENEFICIARIA_RETENCAO_RECOLHIMENTO("0"),
        RESPONSAVEL_RECOLHIMENTO("1");

        private final String codigo;

        private IndicadorCondicaoPjDeclarante(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

        public static IndicadorCondicaoPjDeclarante valueOfStripToNull(final String v) {
            if (v == null || v.length() == 0) {
                return null;
            }
            return IndicadorCondicaoPjDeclarante.valueOf(v);
        }

        public static IndicadorCondicaoPjDeclarante valueOfCodigoStripToNull(final String codigo) {
            if (codigo == null || codigo.length() == 0) {
                return null;
            }

            return valueOfCodigo(codigo);
        }

        public static IndicadorCondicaoPjDeclarante valueOfCodigo(final String codigo) {
            for (IndicadorCondicaoPjDeclarante n : values()) {
                if (n.getCodigo().equalsIgnoreCase(codigo)) {
                    return n;
                }
            }
            return null;
        }

    }

}
