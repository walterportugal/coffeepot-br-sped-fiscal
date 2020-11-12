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
 * Enum: IndicadorSituacaoEspecial.
 *
 * <p>
 * Indicador de situação especial:
 * <ul>
 * <li>0 - Abertura</li>
 * <li>1 - Cisão</li>
 * <li>2 - Fusão</li>
 * <li>3 - Incorporação</li>
 * <li>4 – Encerramento</li>
 * </ul>
 * </p>
 *
 * <p>
 * History:<br><br>
 *      - walter - Sep 2, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
public enum IndicadorSituacaoEspecial implements EnumCodificado {
    
    ABERTURA("0"),
    
    CISAO("1"),
    
    FUSAO("2"),
    
    INCORPORACAO("3"),
    
    ENCERRAMENTO("4");
    
    private final String codigo;

    private IndicadorSituacaoEspecial(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    public static IndicadorSituacaoEspecial valueOfStripToNull(final String v) {
        if (v == null || v.length() == 0) {
            return null;
        }
        return IndicadorSituacaoEspecial.valueOf(v);
    }

    public static IndicadorSituacaoEspecial valueOfCodigoStripToNull(final String codigo) {
        if (codigo == null || codigo.length() == 0) {
            return null;
        }

        return valueOfCodigo(codigo);
    }

    public static IndicadorSituacaoEspecial valueOfCodigo(final String codigo) {
        for (IndicadorSituacaoEspecial n : values()) {
            if (n.getCodigo().equalsIgnoreCase(codigo)) {
                return n;
            }
        }
        return null;
    }

}
