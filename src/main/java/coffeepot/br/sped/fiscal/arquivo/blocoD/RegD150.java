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
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "", id = true, constantValue = "D150"),
    @Field(name = "codMunOrig"),
    @Field(name = "codMunDest"),
    @Field(name = "veicId"),
    @Field(name = "viagem"),
    @Field(name = "indTfa"),
    @Field(name = "vlPesoTx"),
    @Field(name = "vlTxTerr"),
    @Field(name = "vlTxRed"),
    @Field(name = "vlOut"),
    @Field(name = "vlTxAdv")
})
@Getter
@Setter
public class RegD150 {

    private Long codMunOrig;
    private Long codMunDest;
    private String veicId;
    private Long viagem;
    private IndicadorTarifaAplicada indTfa;
    private Double vlPesoTx;
    private Double vlTxTerr;
    private Double vlTxRed;
    private Double vlOut;
    private Double vlTxAdv;

    public enum IndicadorTarifaAplicada implements EnumCodificado {

        EXP(0),
        ENC(1),
        CI(2),
        OUTRA(9);

        private final int codigo;

        private IndicadorTarifaAplicada(int codigo) {
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
