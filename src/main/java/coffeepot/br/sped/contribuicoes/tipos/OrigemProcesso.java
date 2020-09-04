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
 * Enum: OrigemProcesso.
 *
 * <p>
 * Indicador da origem do processo:
 *
 * <ul>
 * <li>1 - Justiça Federal;</li>
 * <li>3 – Secretaria da Receita Federal do Brasil</li>
 * <li>9 – Outros.</li>
 * </ul>
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
public enum OrigemProcesso implements EnumCodificado {

    JUSTICA_FEDERAL("1"),
    SECRETARIA_RECEIRA_FEDERAL("3"),
    OUTROS("9");

    private final String codigo;

    private OrigemProcesso(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }
}
