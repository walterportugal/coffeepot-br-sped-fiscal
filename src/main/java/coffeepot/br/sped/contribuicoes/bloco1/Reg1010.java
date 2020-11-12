package coffeepot.br.sped.contribuicoes.bloco1;

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
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: Reg1010.
 *
 * <p>
 * Processo Referenciado – Ação Judicial.
 * </p>
 *
 * <p>
 * History:<br><br>
 * - walter - Sep 11, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "1010"),
    @Field(name = "numProc", maxLength = 20),
    @Field(name = "idSecJud"),
    @Field(name = "idVara", maxLength = 2),
    @Field(name = "indNatAcao"),
    @Field(name = "descDecJud", maxLength = 100),
    @Field(name = "dtSentJud")
})
@Getter
@Setter
public class Reg1010 {

    private String numProc;
    private String idSecJud;
    private String idVara;
    private IndicadorNaturezaAcaoJudicial indNatAcao;
    private String descDecJud;
    private LocalDate dtSentJud;

    /**
     * Enum: IndicadorNaturezaAcaoJudicial.
     *
     * <p>
     * Indicador da Natureza da Ação Judicial, impetrada na Justiça Federal:
     *
     * <ul>
     * <li></li>
     * <li>01 - Decisão judicial transitada em julgado, a favor da pessoa jurídica.</li>
     * <li>02 - Decisão judicial não transitada em julgado, a favor da pessoa jurídica.</li>
     * <li>03 - Decisão judicial oriunda de liminar em mandado de segurança.</li>
     * <li>04 - Decisão judicial oriunda de liminar em medida cautelar.</li>
     * <li>05 - Decisão judicial oriunda de antecipação de tutela.</li>
     * <li>06 - Decisão judicial vinculada a depósito administrativo ou judicial em montante integral.</li>
     * <li>07 - Medida judicial em que a pessoa jurídica não é o autor.</li>
     * <li>08 - Súmula vinculante aprovada pelo STF ou STJ.</li>
     * <li>09 - Decisão judicial oriunda de liminar em mandado de segurança coletivo.</li>
     * <li>99 - Outros.</li>
     *
     * </ul>
     * </p>
     */
    public enum IndicadorNaturezaAcaoJudicial implements EnumCodificado {

        TRANSITADA_EM_JULGADO("01"),
        NAO_TRANSITADA_EM_JULGADO("02"),
        LIMINUAR_EM_MANDADO_DE_SEGURANCA("03"),
        LIMINAR_COM_MEDIDA_CAUTELAR("04"),
        ANTECIPACAO_DE_TUTELA("05"),
        VINCULADA_A_DEPOSITO_ADM("06"),
        PESSOA_JUR_NAO_E_AUTOR("07"),
        SUMULA_VINCULAND_STF_STJ("08"),
        LIMINAR_MANDATO_SEG_COLETIVO("09"),
        OUTROS("99");

        private final String codigo;

        private IndicadorNaturezaAcaoJudicial(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

        public static IndicadorNaturezaAcaoJudicial valueOfStripToNull(final String v) {
            if (v == null || v.length() == 0) {
                return null;
            }
            return IndicadorNaturezaAcaoJudicial.valueOf(v);
        }

        public static IndicadorNaturezaAcaoJudicial valueOfCodigoStripToNull(final String codigo) {
            if (codigo == null || codigo.length() == 0) {
                return null;
            }

            return valueOfCodigo(codigo);
        }

        public static IndicadorNaturezaAcaoJudicial valueOfCodigo(final String codigo) {
            for (IndicadorNaturezaAcaoJudicial n : values()) {
                if (n.getCodigo().equalsIgnoreCase(codigo)) {
                    return n;
                }
            }
            return null;
        }

    }

}
