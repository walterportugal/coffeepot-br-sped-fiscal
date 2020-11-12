package coffeepot.br.sped.contribuicoes.tipos;

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

import coffeepot.br.sped.fiscal.tipos.EnumCodificado;

/**
 * Enum: IndicadorUtilizacaoCredito.
 *
 * <p>
 * Indicador de opção de utilização do crédito disponível no período:
 *
 * <ul>
 * <li>0 – Utilização do valor total para desconto da contribuição apurada no período, no Registro M200;</li>
 * <li>1 – Utilização de valor parcial para desconto da contribuição apurada no período, no Registro M200.</li>
 * </ul>
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
public enum IndicadorUtilizacaoCredito implements EnumCodificado {

    UTILIZACAO_TOTAL("0"),
    UTILIZACAO_PARCIAL("1");

    private final String codigo;

    private IndicadorUtilizacaoCredito(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    public static IndicadorUtilizacaoCredito valueOfStripToNull(final String v) {
        if (v == null || v.length() == 0) {
            return null;
        }
        return IndicadorUtilizacaoCredito.valueOf(v);
    }

    public static IndicadorUtilizacaoCredito valueOfCodigoStripToNull(final String codigo) {
        if (codigo == null || codigo.length() == 0) {
            return null;
        }

        return valueOfCodigo(codigo);
    }

    public static IndicadorUtilizacaoCredito valueOfCodigo(final String codigo) {
        for (IndicadorUtilizacaoCredito n : values()) {
            if (n.getCodigo().equalsIgnoreCase(codigo)) {
                return n;
            }
        }
        return null;
    }

}
