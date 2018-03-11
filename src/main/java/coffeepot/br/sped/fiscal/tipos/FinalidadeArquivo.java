/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

/*
* #%L
 * * coffeepot-br-sped-fiscal
 * *
 * %%
 * Copyright (C) 2013 Jeandeson O. Merelis
 * *
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
 * Finalidade do arquivo.
 *
 * @author Jeandeson O. Merelis
 */
public enum FinalidadeArquivo implements EnumCodificado {

    /**
     * Remessa do arquivo original.
     */
    ARQUIVO_ORIGINAL("0"),
    /**
     * Remessa do arquivo substituto.
     */
    ARQUIVO_SUBSTITUTO("1");

    private final String codigo;

    private FinalidadeArquivo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    public static FinalidadeArquivo valueOfStripToNull(final String v) {
        if (v == null || v.length() == 0) {
            return null;
        }
        return FinalidadeArquivo.valueOf(v);
    }

    public static FinalidadeArquivo valueOfCodigoStripToNull(final String codigo) {
        if (codigo == null || codigo.length() == 0) {
            return null;
        }

        return valueOfCodigo(codigo);
    }

    public static FinalidadeArquivo valueOfCodigo(final String codigo) {
        for (FinalidadeArquivo n : values()) {
            if (n.getCodigo().equalsIgnoreCase(codigo)) {
                return n;
            }
        }
        return null;
    }
}
