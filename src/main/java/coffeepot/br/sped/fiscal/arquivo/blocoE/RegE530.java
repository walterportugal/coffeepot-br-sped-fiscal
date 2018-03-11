/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoE;


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
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "E530"),
    @Field(name = "indAj"),
    @Field(name = "vlAj"),
    @Field(name = "indDoc"),
    @Field(name = "numDoc"),
    @Field(name = "descrAj"),
    //
    @Field(name = "regE531List")
})
@Getter
@Setter
public class RegE530 {

    private IndicadorTipoAjusteIpi indAj;
    private Double vlAj;
    private IndicadorOrigemDocIpi indDoc;
    private String numDoc;
    private String descrAj;
    //
    private List<RegE531> regE531List;

    public enum IndicadorTipoAjusteIpi implements EnumCodificado {

        AJUSTE_DEBITO(0),
        AJUSTE_CREDITO(1);

        private final int codigo;

        private IndicadorTipoAjusteIpi(int codigo) {
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
    
    public enum IndicadorOrigemDocIpi implements EnumCodificado {

        PROCESSO_JUDICIAL(0),
        PROCESSO_ADMINISTRATIVO(1),
        PER_DCOMP(2),
        DOC_FISCAL(3),
        OUTROS(9);

        private final int codigo;

        private IndicadorOrigemDocIpi(int codigo) {
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
