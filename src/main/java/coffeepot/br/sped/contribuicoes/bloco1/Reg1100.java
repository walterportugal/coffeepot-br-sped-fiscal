package coffeepot.br.sped.contribuicoes.bloco1;

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
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: Reg1100.
 *
 * <p>
 * Controle de Créditos Fiscais – PIS/Pasep.
 * </p>
 *
 * <p>
 * History:<br><br>
 * - walter - Sep 11, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "1100"),
    @Field(name = "perApuCred", length = 6),
    @Field(name = "origCred"),
    @Field(name = "cnpjSuc", maxLength = 14, params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "codCred", maxLength = 3),
    @Field(name = "vlCredApu"),
    @Field(name = "vlCredExtApu"),
    @Field(name = "vlTotCredApu"),
    @Field(name = "vlCredDescPaAnt"),
    @Field(name = "vlCredPerPaAnt"),
    @Field(name = "vlCredDcompPaAnt"),
    @Field(name = "sdCredDispEfd"),
    @Field(name = "vlCredDescEfd"),
    @Field(name = "vlCredPerEfd"),
    @Field(name = "vlCredDcompEfd"),
    @Field(name = "vlCredTrans"),
    @Field(name = "vlCredOut"),
    @Field(name = "sldCredFim"),
    @Field(name = "reg1101List")
})
@Getter
@Setter
public class Reg1100 {

    private String perApuCred;
    private IndicadorOrigemCredito origCred;
    private String cnpjSuc;
    private String codCred;
    private Double vlCredApu;
    private Double vlCredExtApu;
    private Double vlTotCredApu;
    private Double vlCredDescPaAnt;
    private Double vlCredPerPaAnt;
    private Double vlCredDcompPaAnt;
    private Double sdCredDispEfd;
    private Double vlCredDescEfd;
    private Double vlCredPerEfd;
    private Double vlCredDcompEfd;
    private Double vlCredTrans;
    private Double vlCredOut;
    private Double sldCredFim;    

    private List<Reg1101> reg1101List;

    /**
     * Enum: IndicadorOrigemCredito.
     *
     * Indicador da origem do crédito:
     *
     * <ul>
     * <li>01 – Crédito decorrente de operações próprias;</li>
     * <li>02 – Crédito transferido por pessoa jurídica</li>
     * sucedida.
     * </ul>
     */
    public enum IndicadorOrigemCredito implements EnumCodificado {

        CREDITO_OPERACOES_PROPRIAS("01"),
        CREDITO_TRANSFERIDO_PJ("02");

        private final String codigo;

        private IndicadorOrigemCredito(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

        public static IndicadorOrigemCredito valueOfStripToNull(final String v) {
            if (v == null || v.length() == 0) {
                return null;
            }
            return IndicadorOrigemCredito.valueOf(v);
        }

        public static IndicadorOrigemCredito valueOfCodigoStripToNull(final String codigo) {
            if (codigo == null || codigo.length() == 0) {
                return null;
            }

            return valueOfCodigo(codigo);
        }

        public static IndicadorOrigemCredito valueOfCodigo(final String codigo) {
            for (IndicadorOrigemCredito n : values()) {
                if (n.getCodigo().equalsIgnoreCase(codigo)) {
                    return n;
                }
            }
            return null;
        }

    }

}
