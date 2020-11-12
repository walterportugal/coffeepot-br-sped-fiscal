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
 * Enum: IndicadorNaturezaPj.
 *
 * <p>
 * Indicador da natureza da pessoa jurídica, a partir do ano-calendário de 2014:
 * <ul>
 * <li>00 – Pessoa jurídica em geral (não participante de SCP como sócia ostensiva)</li>
 * <li>01 – Sociedade cooperativa (não participante de SCP como sócia ostensiva)</li>
 * <li>02 – Entidade sujeita ao PIS/Pasep exclusivamente com base na Folha de Salários</li>
 * <li>03 - Pessoa jurídica em geral participante de SCP como sócia ostensiva</li>
 * <li>04 – Sociedade cooperativa participante de SCP como sócia ostensiva</li>
 * <li>05 – Sociedade em Conta de Participação - SCP</li>
 * </ul>
 * </p>
 *
 * <p>
 * History:<br><br>
 * - walter - Sep 2, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
public enum IndicadorNaturezaPj implements EnumCodificado {

    PESSOA_JUR_GERAL("00"),
    
    SOCIEDADE_COOPERATIVA("01"),
    
    ENTIDADE_SUJEITA_PISPASEP("02"),
    
    PESSOA_JUR_SCP("03"),
    
    SOCIEDADE_COOPERATIVA_SCP("04"),
    
    SOCIEDADE_CONTA_PARTICIPACAO("05");

     private final String codigo;

    private IndicadorNaturezaPj(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }
    
    public static IndicadorNaturezaPj valueOfStripToNull(final String v) {
        if (v == null || v.length() == 0) {
            return null;
        }
        return IndicadorNaturezaPj.valueOf(v);
    }

    public static IndicadorNaturezaPj valueOfCodigoStripToNull(final String codigo) {
        if (codigo == null || codigo.length() == 0) {
            return null;
        }

        return valueOfCodigo(codigo);
    }

    public static IndicadorNaturezaPj valueOfCodigo(final String codigo) {
        for (IndicadorNaturezaPj n : values()) {
            if (n.getCodigo().equalsIgnoreCase(codigo)) {
                return n;
            }
        }
        return null;
    }

}
