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
 * Enum: NaturezaCreditoDiferido.
 *
 * <p>
 * Natureza do Crédito Diferido, vinculado à receita tributada no mercado interno, a descontar:
 * <ul>
 * <li>01 – Crédito a Alíquota Básica;</li>
 * <li>02 – Crédito a Alíquota Diferenciada;</li>
 * <li>03 – Crédito a Alíquota por Unidade de Produto;</li>
 * <li>04 – Crédito Presumido da Agroindústria.</li>
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
public enum NaturezaCreditoDiferido implements EnumCodificado {
    CREDITO_ALIQ_BASICA("01"),
    CREDITO_ALIQ_DIFERENCIADA("02"),
    CREDITO_ALIQ_UNIDADE_PRODUTO("03"),
    CREDITO_PRESUMIDO_AGROINDUSTRIA("04");

    private final String codigo;

    private NaturezaCreditoDiferido(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    public static NaturezaCreditoDiferido valueOfStripToNull(final String v) {
        if (v == null || v.length() == 0) {
            return null;
        }
        return NaturezaCreditoDiferido.valueOf(v);
    }

    public static NaturezaCreditoDiferido valueOfCodigoStripToNull(final String codigo) {
        if (codigo == null || codigo.length() == 0) {
            return null;
        }

        return valueOfCodigo(codigo);
    }

    public static NaturezaCreditoDiferido valueOfCodigo(final String codigo) {
        for (NaturezaCreditoDiferido n : values()) {
            if (n.getCodigo().equalsIgnoreCase(codigo)) {
                return n;
            }
        }
        return null;
    }

}
