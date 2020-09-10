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
 * Enum: IndicadorTipoSociedadeCooperativa.
 *
 * <p>
 * Indicador do Tipo de Sociedade Cooperativa:
 *
 * <ul>
 * <li>01 – Cooperativa de Produção Agropecuária;</li>
 * <li>02 – Cooperativa de Consumo;</li>
 * <li>03 – Cooperativa de Crédito;</li>
 * <li>04 – Cooperativa de Eletrificação Rural;</li>
 * <li>05 – Cooperativa de Transporte Rodoviário de Cargas;</li>
 * <li>06 – Cooperativa de Médicos;</li>
 * <li>99 – Outras.</li>
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
public enum IndicadorTipoSociedadeCooperativa implements EnumCodificado {

    PRODUCAO_AGROPECUARIA("01"),
    CONSUMO("02"),
    CREDITO("03"),
    ELETRIFICACAO_RURAL("04"),
    TRANSPORTE_RODOVIARIO("05"),
    MEDICOS("06"),
    OUTRAS("99");

    private final String codigo;

    private IndicadorTipoSociedadeCooperativa(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    public static IndicadorTipoSociedadeCooperativa valueOfStripToNull(final String v) {
        if (v == null || v.length() == 0) {
            return null;
        }
        return IndicadorTipoSociedadeCooperativa.valueOf(v);
    }

    public static IndicadorTipoSociedadeCooperativa valueOfCodigoStripToNull(final String codigo) {
        if (codigo == null || codigo.length() == 0) {
            return null;
        }

        return valueOfCodigo(codigo);
    }

    public static IndicadorTipoSociedadeCooperativa valueOfCodigo(final String codigo) {
        for (IndicadorTipoSociedadeCooperativa n : values()) {
            if (n.getCodigo().equalsIgnoreCase(codigo)) {
                return n;
            }
        }
        return null;
    }

}
