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
 * Class: Reg1020.
 *
 * <p>
 * Processo Referenciado – Processo Administrativo.
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
    @Field(name = "reg", id = true, constantValue = "1020"),
    @Field(name = "numProc", maxLength = 20),
    @Field(name = "indNatAcao"),
    @Field(name = "dtDecAdm")
})
@Getter
@Setter
public class Reg1020 {
    
    private String numProc;
    private IndicadorNaturezaAcao indNatAcao;
    private LocalDate dtDecAdm;

    /**
     * Enum: IndicadorNaturezaAcao.
     *
     * <p>
     * Indicador da Natureza da Ação, decorrente de Processo Administrativo na Secretaria da Receita Federal do Brasil.
     *
     * <ul>
     * <li></li>
     * <li>01 - Processo Administrativo de Consulta.</li>
     * <li>02 - Despacho Decisório.</li>
     * <li>03 - Ato Declaratório Executivo.</li>
     * <li>04 - Ato Declaratório Interpretativo.</li>
     * <li>05 - Decisão Administrativa de DRJ ou do CARF.</li>
     * <li>06 - Auto de Infração.</li>
     * <li>99 - Outros.</li>
     *
     * </ul>
     * </p>
     */
    public enum IndicadorNaturezaAcao implements EnumCodificado {

        PROCESSO_ADM_CONSULTA("01"),
        DESPACHO_DECISORIO("02"),
        ATO_DECLARATORIO_EXECUTIVO("03"),
        ATO_DECLARATORIO_INTERPRETATIVO("04"),
        DECISAO_ADMINISTRATIVA_DRJ_CARF("05"),
        AUTO_DE_INFRACAO("06"),
        OUTROS("99");

        private final String codigo;

        private IndicadorNaturezaAcao(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

        public static IndicadorNaturezaAcao valueOfStripToNull(final String v) {
            if (v == null || v.length() == 0) {
                return null;
            }
            return IndicadorNaturezaAcao.valueOf(v);
        }

        public static IndicadorNaturezaAcao valueOfCodigoStripToNull(final String codigo) {
            if (codigo == null || codigo.length() == 0) {
                return null;
            }

            return valueOfCodigo(codigo);
        }

        public static IndicadorNaturezaAcao valueOfCodigo(final String codigo) {
            for (IndicadorNaturezaAcao n : values()) {
                if (n.getCodigo().equalsIgnoreCase(codigo)) {
                    return n;
                }
            }
            return null;
        }

    }

}
