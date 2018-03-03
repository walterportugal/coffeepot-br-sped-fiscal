/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco0;

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
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "0175"),
    @Field(name = "dtAlt"),
    @Field(name = "nrCamp"),
    @Field(name = "contAnt")
})
@Getter
@Setter
public class Reg0175 {

    private LocalDate dtAlt;
    private NumeroCampo nrCamp;
    private String contAnt;

    /**
     * Indicador de Número do campo alterado, referenciado no registro C175.
     *
     * @author Edivaldo Merlo Stens
     */
    public enum NumeroCampo implements EnumCodificado {
        NOME("03"),
        CODIGO_PAIS("04"),
        CNPJ("05"),
        CPF("06"),
        CODIGO_MUNICIPIO("08"),
        INSCRICAO_SUFRAMA("09"),
        LOGRADOURO("10"),
        NUMERO("11"),
        COMPLEMENTO("12"),
        BAIRRO("13");

        private final String codigo;

        private NumeroCampo(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return String.valueOf(codigo);
        }
    }
}
