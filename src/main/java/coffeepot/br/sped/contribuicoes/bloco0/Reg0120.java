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
 * Class: Reg0120.
 *
 * <p>
 * Identificação de EFD-Contribuições sem dados a Escriturar.
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
    @Field(name = "reg", id = true, constantValue = "0120"),
    @Field(name = "mesRefer", length = 6),
    @Field(name = "infComp")
})
@Getter
@Setter
public class Reg0120 {

    private String mesRefer;
    private InfoComplementarRegistro infComp;

    /**
     * Enum: CodigoIncidenciaTributaria.
     *
     * Informação complementar do registro. No caso de escrituração sem dados, deve ser informado o real motivo dessa
     * situação, conforme indicadores abaixo:
     * <ul>
     * <li>01 - Pessoa jurídica imune ou isenta do IRPJ</li>
     * <li>02 - Órgãos públicos, autarquias e fundações públicas</li>
     * <li>03 - Pessoa jurídica inativa</li>
     * <li>04 - Pessoa jurídica em geral, que não realizou operações geradoras de receitas (tributáveis ou não) ou de
     * créditos</li>
     * <li>05 - Sociedade em Conta de Participação - SCP, que não realizou operações geradoras de receitas (tributáveis
     * ou não) ou de créditos</li>
     * <li>06 - Sociedade Cooperativa, que não realizou operações geradoras de receitas (tributáveis ou não) ou de
     * créditos</li>
     * <li>07 - Escrituração decorrente de incorporação, fusão ou cisão, sem operações geradoras de receitas
     * (tributáveis ou não) ou de créditos</li>
     * <li>99 - Demais hipóteses de dispensa de escrituração, relacionadas no art. 5o, da IN RFB no 1.252, de 2012</li>
     * </ul>
     */
    public enum InfoComplementarRegistro implements EnumCodificado {

        PESSOA_JURIDICA_IMUNE_OU_ISENTA("01"),
        ORGAOS_PUBLICOS_AUTARQUIAS("02"),
        PESSOA_JUR_INATIVA("03"),
        PESSOA_JUR_NAO_GERADORA_RECEITA("04"),
        SOCIEDADE_EM_CONTA_PARTICIPACAO("05"),
        SOCIEDADE_COOPERATIVA("06"),
        DECORRENTE_FUSAO_CISAO("07"),
        DEMAIS_HIPOTESES("99");

        private final String codigo;

        private InfoComplementarRegistro(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

        public static InfoComplementarRegistro valueOfStripToNull(final String v) {
            if (v == null || v.length() == 0) {
                return null;
            }
            return InfoComplementarRegistro.valueOf(v);
        }

        public static InfoComplementarRegistro valueOfCodigoStripToNull(final String codigo) {
            if (codigo == null || codigo.length() == 0) {
                return null;
            }

            return valueOfCodigo(codigo);
        }

        public static InfoComplementarRegistro valueOfCodigo(final String codigo) {
            for (InfoComplementarRegistro n : values()) {
                if (n.getCodigo().equalsIgnoreCase(codigo)) {
                    return n;
                }
            }
            return null;
        }

    }

}
