package coffeepot.br.sped.fiscal.arquivo.blocoK;

import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import lombok.Getter;
import lombok.Setter;

/*
 * <p>
 * Este registro indica o tipo de leiaute que o contribuinte adotou na informação do bloco K.
 *
 * <ul>
 * <li>0 – Leiaute simplificado</li>
 * <li>1 - Leiaute completo</li>
 * <li>2 – Leiaute restrito aos saldos de estoque</li>
 * </ul>
 * </p>
 *
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 - 2023 Jeandeson O. Merelis
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
/**
 * Class: RegK010.
 *
 * 
 *
 * <p>
 * History:<br><br>
 * - Walter Portugal - 26 de jan de 2023: Criação do Arquivo<br>
 * <p>
 *
 * @author Walter Portugal
 * @since 3.2.0
 * */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "K010"),
    @Field(name = "tipoLeiaute")
})
@Getter
@Setter
public class RegK010 {

    private IndicadorTipoLeiaute tipoLeiaute;

    public RegK010(IndicadorTipoLeiaute tipoLeiaute) {
        this.tipoLeiaute = tipoLeiaute;
    }

    public enum IndicadorTipoLeiaute implements EnumCodificado {

        LEIAUTE_SIMPLIFICADO("0"),
        LEIAUTE_COMPLETO("1"),
        LEIAUTE_RESTRITO_SALDOS_ESTOQUE("2");

        private final String codigo;

        private IndicadorTipoLeiaute(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

    }

}
