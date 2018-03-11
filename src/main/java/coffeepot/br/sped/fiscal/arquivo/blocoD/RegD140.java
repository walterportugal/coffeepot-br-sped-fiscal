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
    @Field(name = "", id = true, constantValue = "D140")    ,
    @Field(name = "codPartConsg"),
    @Field(name = "codMunOrig"),
    @Field(name = "codMunDest"),
    @Field(name = "indVeic"),
    @Field(name = "veicId", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY}),
    @Field(name = "indNav"),
    @Field(name = "viagem"),
    @Field(name = "vlFrtLiq"),
    @Field(name = "vlDespPort"),
    @Field(name = "vlDespCarDesc"),
    @Field(name = "vlOut"),
    @Field(name = "vlFrtBrt"),
    @Field(name = "vlFrtMm")
})
@Getter
@Setter
public class RegD140 {

    private String codPartConsg;
    private Long codMunOrig;
    private Long codMunDest;
    private IndicadorVeiculo indVeic;
    private String veicId;
    private IndicadorNavegacao indNav;
    private Long viagem;
    private Double vlFrtLiq;
    private Double vlDespPort;
    private Double vlDespCarDesc;
    private Double vlOut;
    private Double vlFrtBrt;
    private Double vlFrtMm;

    public enum IndicadorVeiculo implements EnumCodificado {

        EMBARCACAO(0),
        REBOCADOR(1);

        private final int codigo;

        private IndicadorVeiculo(int codigo) {
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
    
    public enum IndicadorNavegacao implements EnumCodificado {

        INTERIOR(0),
        CABOTAGEM(1);

        private final int codigo;

        private IndicadorNavegacao(int codigo) {
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
