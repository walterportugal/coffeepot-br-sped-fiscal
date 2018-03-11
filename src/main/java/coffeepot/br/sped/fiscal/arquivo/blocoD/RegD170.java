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
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "D170"),
    @Field(name = "codPartConsg"),
    @Field(name = "codPartRed"),
    @Field(name = "codMunOrig"),
    @Field(name = "codMunDest"),
    @Field(name = "otm"),
    @Field(name = "indNatFrt"),
    @Field(name = "vlLiqFrt"),
    @Field(name = "vlGris"),
    @Field(name = "vlPdg"),
    @Field(name = "vlOut"),
    @Field(name = "vlFrt"),
    @Field(name = "veicId", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY}),
    @Field(name = "ufId")
})
@Getter
@Setter
public class RegD170 {

    private String codPartConsg;
    private String codPartRed;
    private Long codMunOrig;
    private Long codMunDest;
    private String otm;
    private IndicadorNaturezaFrete indNatFrt;
    private Double vlLiqFrt;
    private Double vlGris;
    private Double vlPdg;
    private Double vlOut;
    private Double vlFrt;
    private String veicId;
    private String ufId;

    public enum IndicadorNaturezaFrete implements EnumCodificado {

        NEGOCIAVEL(0),
        NAO_NEGOCIAVEL(1);

        private final int codigo;

        private IndicadorNaturezaFrete(int codigo) {
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
