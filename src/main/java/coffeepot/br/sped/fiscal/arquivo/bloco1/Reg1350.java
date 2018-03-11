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
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "1350"),
    @Field(name = "serie"),
    @Field(name = "fabricante"),
    @Field(name = "modelo"),
    @Field(name = "tipoMedicao"),
    //--- detalhes ---
    @Field(name = "reg1360List"),
    @Field(name = "reg1370List")
})
@Getter
@Setter
public class Reg1350 {

    private String serie;
    private String fabricante;
    private String modelo;
    private TipoMedicao tipoMedicao;
    //--- detalhes ---
    private List<Reg1360> reg1360List;
    private List<Reg1370> reg1370List;
    
    public enum TipoMedicao implements EnumCodificado {

        ANALOGICO(0),
        DIGITAL(1);

        private final int codigo;

        private TipoMedicao(int codigo) {
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
