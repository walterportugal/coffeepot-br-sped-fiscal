/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco1;


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
    @Field(name = "", id=true, constantValue = "1510"),
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
    @Field(name = "aliqIcms"),
    @Field(name = "vlIcms"),
    @Field(name = "vlBcIcmsSt"),
    @Field(name = "aliqSt"),
    @Field(name = "vlIcmsSt"),
    @Field(name = "indRec"),
    @Field(name = "codPart"),
    @Field(name = "vlPis"),
    @Field(name = "vlCofins"),
    @Field(name = "codCta")
})
@Getter
@Setter
public class Reg1510 {

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
    private Double aliqIcms;
    private Double vlIcms;
    private Double vlBcIcmsSt;
    private Double aliqSt;
    private Double vlIcmsSt;
    private IndicadorReceita indRec;
    private String codPart;
    private Double vlPis;
    private Double vlCofins;
    private String codCta;

    public enum IndicadorReceita implements EnumCodificado {

        RECEITA_PROPRIA(0),
        RECEITA_TERCEIROS(1);

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
