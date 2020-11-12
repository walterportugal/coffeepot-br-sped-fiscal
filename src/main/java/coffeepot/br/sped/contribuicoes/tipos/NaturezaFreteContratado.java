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
 * Enum: NaturezaFreteContratado.
 *
 * <p>
 *
 * Indicador da Natureza do Frete Contratado, referente a:
 * <li>0 – Operações de vendas, com ônus suportado pelo estabelecimento vendedor;</li>
 * <li>1 – Operações de vendas, com ônus suportado pelo adquirente; 2 – Operações de compras (bens para revenda,
 * matérias-prima e outros produtos, geradores de crédito); </li>
 * <li>3 – Operações de compras (bens para revenda, matérias-prima e outros produtos, não geradores de crédito);
 * </li>
 * <li>4 – Transferência de produtos acabados entre estabelecimentos da pessoa jurídica; </li>
 * <li>5 – Transferência de produtos em elaboração entre estabelecimentos da pessoa jurídica </li>
 * <li>9 – Outras</li>
 *
 * </ul </p>
 *
 * <p>
 * History:<br><br>
 * - walter - Sep 4, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
public enum NaturezaFreteContratado implements EnumCodificado {

    VENDAS_ONUS_ESTABELECIMENTO("0"),
    VENDAS_ONUS_ADQUIRENTE("1"),
    COMPRAS_GERADOR_CREDITO("2"),
    COMPRAS_NAO_GERADOR_CREDITO("3"),
    TRANSFERENCIA_PRODUTO_ACABADO("4"),
    TRANSFERENCIA_PRODUTO_ELABORACAO("5"),
    OUTRAS("9");

    private final String codigo;

    private NaturezaFreteContratado(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    public static NaturezaFreteContratado valueOfStripToNull(final String v) {
        if (v == null || v.length() == 0) {
            return null;
        }
        return NaturezaFreteContratado.valueOf(v);
    }

    public static NaturezaFreteContratado valueOfCodigoStripToNull(final String codigo) {
        if (codigo == null || codigo.length() == 0) {
            return null;
        }

        return valueOfCodigo(codigo);
    }

    public static NaturezaFreteContratado valueOfCodigo(final String codigo) {
        for (NaturezaFreteContratado n : values()) {
            if (n.getCodigo().equalsIgnoreCase(codigo)) {
                return n;
            }
        }
        return null;
    }

}
