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
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "1921"),
    @Field(name = "codAjApur"),
    @Field(name = "descrComplAj"),
    @Field(name = "vlAjApur"),
    //--- detalhes ---
    @Field(name = "reg1922List"),
    @Field(name = "reg1923List")
})
@Getter
@Setter
public class Reg1921 {

    private String codAjApur;
    private String descrComplAj;
    private Double vlAjApur;
    //--- detalhes ---
    private List<Reg1922> reg1922List;
    private List<Reg1923> reg1923List;

//    public enum CodigoAjusteSubOperacao implements EnumCodificado {
//
//        OUTROS_DEBITOS("0"),
//        ESTORNO_CRETIDOS("1"),
//        OUTROS_CREDITOS("2"),
//        ESTORNO_DEBITOS("3"),
//        DEDUCOES_IMPOSTO_APURADO("4"),
//        DEBITOS_ESPECIAIS("5");
//
//        private final String codigo;
//
//        private CodigoAjusteSubOperacao(String codigo) {
//            this.codigo = codigo;
//        }
//
//        @Override
//        public String getCodigo() {
//            return codigo;
//        }
//    }
}
