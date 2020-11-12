package coffeepot.br.sped.contribuicoes.blocoF;

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
import coffeepot.bean.wr.types.Align;
import coffeepot.br.sped.contribuicoes.tipos.IndicadorOrigemCredito;
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegF100.
 *
 * <p>
 * Demais Documentos e Operações Geradoras de Contribuição e Créditos.
 * </p>
 *
 * <p>
 * History:<br><br>
 * - walter - Sep 9, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "F100"),
    @Field(name = "indOper"),
    @Field(name = "codPart"),
    @Field(name = "codItem"),
    @Field(name = "dtOper"),
    @Field(name = "vlOper"),
    @Field(name = "cstPis", minLength = 2, align = Align.RIGHT, padding = '0'),
    @Field(name = "vlBcPis"),
    @Field(name = "aliqPis"),
    @Field(name = "vlPis"),
    @Field(name = "cstCofins", minLength = 2, align = Align.RIGHT, padding = '0'),
    @Field(name = "vlBcCofins"),
    @Field(name = "aliqCofins"),
    @Field(name = "vlCofins"),
    @Field(name = "natBcCred"),
    @Field(name = "indOrigCred"),
    @Field(name = "codCta"),
    @Field(name = "codCcus"),
    @Field(name = "descDocOper"),
    @Field(name = "regF111List")
    
})
@Getter
@Setter
public class RegF100 {

    private IndicadorTipodeOperacao indOper;
    private String codPart;
    private String codItem;
    private LocalDate dtOper;
    private Double vlOper;
    private String cstPis;
    private Double vlBcPis;
    private Double aliqPis;
    private Double vlPis;
    private String cstCofins;
    private Double vlBcCofins;
    private Double aliqCofins;
    private Double vlCofins;
    private String natBcCred;
    private IndicadorOrigemCredito indOrigCred;
    private String codCta;
    private String codCcus;
    private String descDocOper;
    private List<RegF111> regF111List;

    /**
     * Enum: IndicadorTipodeOperacao.
     *
     * <p>
     * Indicador do Tipo da Operação:
     *
     * <ul>
     * <li>0 – Operação Representativa de Aquisição, Custos, Despesa ou Encargos, ou Receitas, Sujeita à Incidência de
     * Crédito de PIS/Pasep ou Cofins (CST 50 a 66).</li>
     * <li>1 – Operação Representativa de Receita Auferida Sujeita ao Pagamento da Contribuição para o PIS/Pasep e da
     * Cofins (CST 01, 02, 03 ou 05).</li>
     * <li>2 - Operação Representativa de Receita Auferida Não Sujeita ao Pagamento da Contribuição para o PIS/Pasep e
     * da Cofins (CST 04, 06, 07, 08, 09, 49 ou 99).</li>
     * </ul>
     * </p>
     */
    public enum IndicadorTipodeOperacao implements EnumCodificado {

        OPERACAO_SUJEITA_CREDITO_PIS_COFINS("0"),
        OPERACAO_SUJEITA_DEBITO_PIS_COFINS("1"),
        OPERACAO_NAO_SUJEITA_PIS_COFINS("2");

        private final String codigo;

        private IndicadorTipodeOperacao(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

        public static IndicadorTipodeOperacao valueOfStripToNull(final String v) {
            if (v == null || v.length() == 0) {
                return null;
            }
            return IndicadorTipodeOperacao.valueOf(v);
        }

        public static IndicadorTipodeOperacao valueOfCodigoStripToNull(final String codigo) {
            if (codigo == null || codigo.length() == 0) {
                return null;
            }

            return valueOfCodigo(codigo);
        }

        public static IndicadorTipodeOperacao valueOfCodigo(final String codigo) {
            for (IndicadorTipodeOperacao n : values()) {
                if (n.getCodigo().equalsIgnoreCase(codigo)) {
                    return n;
                }
            }
            return null;
        }

    }

}
