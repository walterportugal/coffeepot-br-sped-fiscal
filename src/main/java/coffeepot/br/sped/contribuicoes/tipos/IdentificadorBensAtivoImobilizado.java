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
 * Enum: IdentificadorBensAtivoImobilizado.
 *
 * <p>
 * Identificação dos Bens/Grupo de Bens Incorporados ao Ativo Imobilizado:
 *
 * <ul>
 * <li>01 = Edificações e Benfeitorias em Imóveis Próprios;</li>
 * <li>02 = Edificações e Benfeitorias em Imóveis de Terceiros;</li>
 * <li>03 = Instalações;</li>
 * <li>04 = Máquinas;</li>
 * <li>05 = Equipamentos;</li>
 * <li>06 = Veículos;</li>
 * <li>99 = Outros.</li>
 * </ul>
 * </p>
 *
 * <p>
 * History:<br><br>
 * - walter - Sep 9, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
public enum IdentificadorBensAtivoImobilizado implements EnumCodificado {

    EDIFICACOES_IMOVEIS_PROPRIO("01"),
    EDIFICACOES_IMOVEIS_TERCEIROS("02"),
    INSTALACOES("03"),
    MAQUINAS("04"),
    EQUIPAMENTOS("05"),
    VEICULOS("06"),
    OUTROS("99");

    private final String codigo;

    private IdentificadorBensAtivoImobilizado(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    public static IdentificadorBensAtivoImobilizado valueOfStripToNull(final String v) {
        if (v == null || v.length() == 0) {
            return null;
        }
        return IdentificadorBensAtivoImobilizado.valueOf(v);
    }

    public static IdentificadorBensAtivoImobilizado valueOfCodigoStripToNull(final String codigo) {
        if (codigo == null || codigo.length() == 0) {
            return null;
        }

        return valueOfCodigo(codigo);
    }

    public static IdentificadorBensAtivoImobilizado valueOfCodigo(final String codigo) {
        for (IdentificadorBensAtivoImobilizado n : values()) {
            if (n.getCodigo().equalsIgnoreCase(codigo)) {
                return n;
            }
        }
        return null;
    }

}
