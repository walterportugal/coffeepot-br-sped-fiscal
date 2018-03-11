/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoK;

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
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "reg", id=true, constantValue = "K270"),
    @Field(name = "dtIniAp"),
    @Field(name = "dtFimAp"),
    @Field(name = "codOpOs"),
    @Field(name = "codItem"),
    @Field(name = "qtdCorPos"),
    @Field(name = "qtdCorNeg"),
    @Field(name = "origem"),
    //
    @Field(name = "regK275List")
})
@Getter
@Setter
public class RegK270 {

    private LocalDate dtIniAp;
    private LocalDate dtFimAp;
    private String codOpOs;
    private String codItem;
    private Double qtdCorPos;
    private Double qtdCorNeg;
    private K270Origem origem;
    //
    private List<RegK275> regK275List;
    
    public enum K270Origem implements EnumCodificado {

        OR_1(1,"Correção de apontamento de produção e/ou consumo relativo aos Registros K230/K235;"),
        OR_2(2,"Correção de apontamento de produção e/ou consumo relativo aos Registros K250/K255"),
        OR_3(3,"Correção de apontamento de desmontagem e/ou consumo relativo aos Registros K210/K215"),
        OR_4(4,"Correção de apontamento de reprocessamento/reparo e/ou consumo relativo aos Registros K260/K265"),
        OR_5(5,"Correção de apontamento de movimentação interna relativo ao Registro K220"),
        OR_6(6,"Correção de apontamento de produção relativo ao Registro K291"),
        OR_7(7,"Correção de apontamento de consumo relativo ao Registro K292;"),
        OR_8(8,"Correção de apontamento de produção relativo ao Registro K301"),
        OR_9(9,"Correção de apontamento de consumo relativo ao Registro K302");

        private final int codigo;
        private final String descricao;

        private K270Origem(int codigo, String descricao) {
            this.codigo = codigo;
            this.descricao = descricao;
        }

        @Override
        public String getCodigo() {
            return String.valueOf(codigo);
        }

        public int getCodigoAsInt() {
            return codigo;
        }

        public String getDescricao() {
            return descricao;
        }
        
    }
}
