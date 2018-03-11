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
    @Field(name = "", id=true, constantValue = "1900"),
    @Field(name = "indApurIcms"),
    @Field(name = "descrComplOutApur"),
    //--- detalhes ---
    @Field(name = "reg1910List")
})
@Getter
@Setter
public class Reg1900 {

    private IndicadorOutraApuracaoIcms indApurIcms;
    private String descrComplOutApur;
    //--- detalhes ---
    private List<Reg1910> reg1910List;

    public enum IndicadorOutraApuracaoIcms implements EnumCodificado {

        APURACAO_1("1"),
        APURACAO_2("2"),
        APURACAO_3("3"),
        APURACAO_4("4"),
        APURACAO_5("5"),
        APURACAO_6("6");

        private final String codigo;

        private IndicadorOutraApuracaoIcms(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }
    }
    
}
