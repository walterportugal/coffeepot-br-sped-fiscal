package coffeepot.br.sped.contribuicoes.blocoA;

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

import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.bean.wr.types.Align;
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegA170.
 *
 * <p>
 * Insert description here.
 * </p>
 *
 * <p>
 * History:<br><br>
 *      - walter - Sep 3, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id=true, constantValue = "A170"),
    @Field(name = "numItem"),
    @Field(name = "codItem"),
    @Field(name = "descrCompl"),
    @Field(name = "vlItem"),
    @Field(name = "vlDesc"),
    @Field(name = "natBcCred"),
    @Field(name = "indOrigCred"),
    @Field(name = "cstPis", minLength = 2, align = Align.RIGHT, padding = '0'),
    @Field(name = "vlBcPis"),
    @Field(name = "aliqPis"),
    @Field(name = "vlPis"),
    @Field(name = "cstCofins", minLength = 2, align = Align.RIGHT, padding = '0'),
    @Field(name = "vlBcCofins"),
    @Field(name = "aliqCofins"),
    @Field(name = "vlCofins"),
    @Field(name = "codCta"),
    @Field(name = "codCcus")
})
@Getter
@Setter
public class RegA170 {
    
    private Integer numItem;
    private String codItem;
    private String descrCompl;
    private Double vlItem;
    private Double vlDesc;
    private String natBcCred;
    private IndicadorOrigemCredito indOrigCred;
    private String cstPis;
    private Double vlBcPis;
    private Double aliqPis;
    private Double vlPis;
    private String cstCofins;
    private Double vlBcCofins;
    private Double aliqCofins;
    private Double vlCofins;
    private String codCta;
    private String codCcus;
    
    /**
     * Enum: IndicadorOrigemCredito.
     *
     * <p>
     * Indicador da origem do crédito:
     * <ul>
     * <li>0 – Operação no Mercado Interno;</li>
     * <li>1 – Operação de Importação.</li>
     * </ul </p>
     */
    public enum IndicadorOrigemCredito implements EnumCodificado {

        MERCADO_INTERNO("0"),
        IMPORTACAO("1");

        private final String codigo;

        private IndicadorOrigemCredito(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

        public static IndicadorOrigemCredito valueOfStripToNull(final String v) {
            if (v == null || v.length() == 0) {
                return null;
            }
            return IndicadorOrigemCredito.valueOf(v);
        }

        public static IndicadorOrigemCredito valueOfCodigoStripToNull(final String codigo) {
            if (codigo == null || codigo.length() == 0) {
                return null;
            }

            return valueOfCodigo(codigo);
        }

        public static IndicadorOrigemCredito valueOfCodigo(final String codigo) {
            for (IndicadorOrigemCredito n : values()) {
                if (n.getCodigo().equalsIgnoreCase(codigo)) {
                    return n;
                }
            }
            return null;
        }

    }

}
