package coffeepot.br.sped.contribuicoes.blocoA;

/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 - 2020 Jeandeson O. Merelis
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
 * Class: RegA120.
 *
 * <p>
 * Informação Complementar – Operações de Importação.
 * </p>
 *
 * <p>
 * History:<br><br>
 *      - walter - Sep 3, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id=true, constantValue = "A120"),
    @Field(name = "vlTotServ"),
    @Field(name = "vlBcPis"),
    @Field(name = "vlPisImp"),
    @Field(name = "dtPagPis"),
    @Field(name = "vlBcCofins"),
    @Field(name = "vlCofinsImp"),
    @Field(name = "dtPagCofins"),
    @Field(name = "locExeServ")
})
@Getter
@Setter
public class RegA120 {
    
    private Double vlTotServ;
    private Double vlBcPis;
    private Double vlPisImp;
    private LocalDate dtPagPis;
    private Double vlBcCofins;
    private Double vlCofinsImp;
    private LocalDate dtPagCofins;
    private LocalExecServico locExeServ;
    
    /**
     * Enum: LocalExecServico.
     *
     * <p>
     * Local da execução do serviço:
     * <ul>
     * <li>0 – Executado no País;</li>
     * <li>1 – Executado no Exterior, cujo resultado se verifique no País.</li>
     * </ul </p>
     */
    public enum LocalExecServico implements EnumCodificado {

        EXECUTADO_PAIS("0"),
        EXECUTARO_EXTERIOR("1");

        private final String codigo;

        private LocalExecServico(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

        public static LocalExecServico valueOfStripToNull(final String v) {
            if (v == null || v.length() == 0) {
                return null;
            }
            return LocalExecServico.valueOf(v);
        }

        public static LocalExecServico valueOfCodigoStripToNull(final String codigo) {
            if (codigo == null || codigo.length() == 0) {
                return null;
            }

            return valueOfCodigo(codigo);
        }

        public static LocalExecServico valueOfCodigo(final String codigo) {
            for (LocalExecServico n : values()) {
                if (n.getCodigo().equalsIgnoreCase(codigo)) {
                    return n;
                }
            }
            return null;
        }

    }

}
