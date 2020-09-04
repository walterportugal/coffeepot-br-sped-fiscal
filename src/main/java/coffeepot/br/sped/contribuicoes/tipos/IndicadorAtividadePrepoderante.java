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
 * Enum: IndicadorAtividadePrepoderante.
 *
 * <p>
 * Indicador de tipo de atividade preponderante: 
 * <ul>
 * <li>0 – Industrial ou equiparado a industrial;</li>
 * <li>1 – Prestador de serviços;</li>
 * <li>2 - Atividade de comércio;</li>
 * <li>3 – Pessoas jurídicas referidas nos §§ 6o, 8o e 9o do art. 3o da Lei no 9.718, de 1998;</li>
 * <li>4 – Atividade imobiliária;</li>
 * <li>9 – Outros.</li>
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
public enum IndicadorAtividadePrepoderante implements EnumCodificado {

    INDUSTRIAL_OU_EQUIPARADO("0"),
    
    PRESTADOR_SERVICOS("1"),
    
    ATIVIDADE_DE_COMERCIO("2"),
    
    PESSOAS_JURIDICAS("3"),
    
    ATIVIDADE_IMOBILIARIA("4"),
    
    OUTROS("9");

     private final String codigo;

    private IndicadorAtividadePrepoderante(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }
    
    public static IndicadorAtividadePrepoderante valueOfStripToNull(final String v) {
        if (v == null || v.length() == 0) {
            return null;
        }
        return IndicadorAtividadePrepoderante.valueOf(v);
    }

    public static IndicadorAtividadePrepoderante valueOfCodigoStripToNull(final String codigo) {
        if (codigo == null || codigo.length() == 0) {
            return null;
        }

        return valueOfCodigo(codigo);
    }

    public static IndicadorAtividadePrepoderante valueOfCodigo(final String codigo) {
        for (IndicadorAtividadePrepoderante n : values()) {
            if (n.getCodigo().equalsIgnoreCase(codigo)) {
                return n;
            }
        }
        return null;
    }


}
