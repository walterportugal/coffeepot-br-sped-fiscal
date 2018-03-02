/*
 * Copyright 2018 - Edivaldo Merlo Stens
 */
package coffeepot.br.sped.fiscal.tipos;

/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2018 Edivaldo Merlo Stens
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
/**
 * Código do modelo do documento de arrecadaçã, referenciado no registro C176.
 *
 * @author Edivaldo Merlo Stens
 */
public enum ModeloDocumentoArecadacao implements EnumCodificado {
    DEA('0'), // Documento estadual de arrecadação
    GNRE('1');

    private final char codigo;

    private ModeloDocumentoArecadacao(char codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return String.valueOf(codigo);
    }
}
