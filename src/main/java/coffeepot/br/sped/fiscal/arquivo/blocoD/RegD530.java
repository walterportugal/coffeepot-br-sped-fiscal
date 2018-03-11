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
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "D530"),
    @Field(name = "indServ"),
    @Field(name = "dtIniServ"),
    @Field(name = "dtFinServ"),
    @Field(name = "perFiscal"),
    @Field(name = "codArea"),
    @Field(name = "terminal")
})
@Getter
@Setter
public class RegD530 {

    private IndicadorServico indServ;
    private LocalDate dtIniServ;
    private LocalDate dtFinServ;
    private String perFiscal;
    private String codArea;
    private String terminal;

    public enum IndicadorServico implements EnumCodificado {

        TELEFONIA(0),
        COMUNICACAO_DADOS(1),
        TV_ASSINATURA(2),
        PROVIMENTO_ACESSO_INTERNET(3),
        MULTIMIDIA(4),
        OUTROS(9);

        private final int codigo;

        private IndicadorServico(int codigo) {
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
