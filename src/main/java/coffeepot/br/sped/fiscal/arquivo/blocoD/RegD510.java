/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoD;


/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 Jeandeson O. Merelis
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
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "D510"),
    @Field(name = "numItem"),
    @Field(name = "codItem"),
    @Field(name = "codClass"),
    @Field(name = "qtd"),
    @Field(name = "unid"),
    @Field(name = "vlItem"),
    @Field(name = "vlDesc"),
    @Field(name = "cstIcms", length = 3, align = Align.RIGHT, padding = '0'),
    @Field(name = "cfop"),
    @Field(name = "vlBcIcms"),
    @Field(name = "vlIcms"),
    @Field(name = "vlBcIcmsUf"),
    @Field(name = "vlIcmsUf"),
    @Field(name = "indRec"),
    @Field(name = "codPart"),
    @Field(name = "vlPis"),
    @Field(name = "vlCofins"),
    @Field(name = "codCta")
})
@Getter
@Setter
public class RegD510 {

    private Long numItem;
    private String codItem;
    private String codClass;
    private Double qtd;
    private String unid;
    private Double vlItem;
    private Double vlDesc;
    private String cstIcms;
    private String cfop;
    private Double vlBcIcms;
    private Double vlIcms;
    private Double vlBcIcmsUf;
    private Double vlIcmsUf;
    private IndicadorReceita indRec;
    private String codPart;
    private Double vlPis;
    private Double vlCofins;
    private String codCta;

    public enum IndicadorReceita implements EnumCodificado {

        RECEITA_PROPRIA_SERV_PREST(0),
        RECEITA_PROPRIA_COBR_DEBITOS(1),
        RECEITA_PROPRIA_VENDA_MERCADORIA(2),
        RECEITA_PROPRIA_VENDA_SERV_PRE_PAGO(3),
        OUTRAS_RECEITAS_PROPRIAS(4),
        RECEITAS_TERCEIROS_CO_FATURADO(5),
        OUTRAS_RECEITAS_TERCEIROS(9);

        private final int codigo;

        private IndicadorReceita(int codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return String.valueOf(codigo);
        }

        public int getCodigoAsInt() {
            return codigo;
        }
    }
}
