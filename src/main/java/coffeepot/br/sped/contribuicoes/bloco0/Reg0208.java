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
 * Class: Reg0208.
 *
 * <p>
 * Código de Grupos por Marca Comercial – Refri (bebidas frias).
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
    @Field(name = "reg", id = true, constantValue = "0208"),
    @Field(name = "codTab"),
    @Field(name = "codGru"),
    @Field(name = "marcaCom")
})
@Getter
@Setter
public class Reg0208 {

    private CodigoTabelaAnexoIII codTab;
    private String codGru;
    private String marcaCom;

    /**
     * Enum: CodigoTabelaAnexoIII.
     *
     * Código indicador da incidência tributária no período:
     * <ul>
     * <li>01 – Tabela I</li>
     * <li>02 – Tabela II</li>
     * <li>03 – Tabela III</li>
     * <li>04 – Tabela IV</li>
     * <li>05 – Tabela V</li>
     * <li>06 – Tabela VI</li>
     * <li>07 – Tabela VII</li>
     * <li>08– Tabela VIII</li>
     * <li>09 – Tabela IX</li>
     * <li>10 – Tabela X</li>
     * <li>11 – Tabela XI</li>
     * <li>12 – Tabela XII</li>
     * <li>13 – Tabela XIII</li>
     * </ul>
     */
    public enum CodigoTabelaAnexoIII implements EnumCodificado {

        TABELA_I("01"),
        TABELA_II("02"),
        TABELA_III("03"),
        TABELA_IV("04"),
        TABELA_V("05"),
        TABELA_VI("06"),
        TABELA_VII("07"),
        TABELA_VIII("08"),
        TABELA_IX("09"),
        TABELA_X("10"),
        TABELA_XI("11"),
        TABELA_XII("12"),
        TABELA_XIII("13");

        private final String codigo;

        private CodigoTabelaAnexoIII(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

        public static CodigoTabelaAnexoIII valueOfStripToNull(final String v) {
            if (v == null || v.length() == 0) {
                return null;
            }
            return CodigoTabelaAnexoIII.valueOf(v);
        }

        public static CodigoTabelaAnexoIII valueOfCodigoStripToNull(final String codigo) {
            if (codigo == null || codigo.length() == 0) {
                return null;
            }

            return valueOfCodigo(codigo);
        }

        public static CodigoTabelaAnexoIII valueOfCodigo(final String codigo) {
            for (CodigoTabelaAnexoIII n : values()) {
                if (n.getCodigo().equalsIgnoreCase(codigo)) {
                    return n;
                }
            }
            return null;
        }

    }

}
