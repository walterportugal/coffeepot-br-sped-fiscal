package coffeepot.br.sped.fiscal.tipos;

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

/**
 * Enum: VersaoLayoutSpedContribuicoes.
 *
 * <p>
 * Tabela de versões do EFD Contribuições. O sistema será vai trabalhar com a última versão para gerar os arquivos.
 * </p>
 *
 * <p>
 * History:<br><br>
 *      - Walter Portugal - Oct 15, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author Walter Portugal
 * @since 3.1.0
 *
 */
public enum VersaoLayoutSpedContribuicoes implements EnumCodificado {
    
    /**
     * Vigência a partir de 01/01/2020.
     */
    VERSAO_006("006");
    
    private final String codigo;

    private VersaoLayoutSpedContribuicoes(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    /**
     * Obtém a última versão do layout que este projeto implementa.
     *
     * @return última versão implementada.
     */
    public static VersaoLayoutSpedContribuicoes getLastVersionImpl() {
        return VersaoLayoutSpedContribuicoes.values()[VersaoLayoutSpedContribuicoes.values().length - 1];
    }

}
