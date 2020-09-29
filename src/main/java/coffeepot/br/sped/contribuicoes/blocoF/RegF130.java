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
import coffeepot.br.sped.contribuicoes.tipos.IdentificadorBensAtivoImobilizado;
import coffeepot.br.sped.contribuicoes.tipos.IndicadorOrigemCredito;
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegF130.
 *
 * <p>
 * Bens Incorporados ao Ativo Imobilizado – Operações Geradoras de Créditos com Base no Valor de Aquisição/Contribuição.
 * </p>
 *
 * <p>
 * History:<br><br>
 * - Walter Portugal - Sep 28, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author Walter Portugal
 * @since 3.1.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "F130"),
    @Field(name = "natBcCred"),
    @Field(name = "indentBemImob"),
    @Field(name = "indOrigCred"),
    @Field(name = "indUtilBemImob"),
    @Field(name = "mesOperAquis", length = 6),
    @Field(name = "vlOperAquis"),
    @Field(name = "parcOperNaoBcCred"),
    @Field(name = "indNrParc"),
    @Field(name = "cstPis", minLength = 2, align = Align.RIGHT, padding = '0'),
    @Field(name = "vlBcPis"),
    @Field(name = "aliqPis"),
    @Field(name = "vlPis"),
    @Field(name = "cstCofins", minLength = 2, align = Align.RIGHT, padding = '0'),
    @Field(name = "vlBcCofins"),
    @Field(name = "aliqCofins"),
    @Field(name = "vlCofins"),
    @Field(name = "codCta"),
    @Field(name = "codCcus"),
    @Field(name = "descBemImob"),
    @Field(name = "regF139List")
})
@Getter
@Setter
public class RegF130 {

    private String natBcCred;
    private IdentificadorBensAtivoImobilizado indentBemImob;
    private IndicadorOrigemCredito indOrigCred;
    private RegF120.IndicadorBensIncorporados indUtilBemImob;
    private String mesOperAquis;
    private Double vlOperAquis;
    private Double parcOperNaoBcCred;
    private IndicadorNrParcelasApropriadas indNrParc;
    private String cstPis;
    private Double vlBcPis;
    private Double aliqPis;
    private Double vlPis;
    private String cstCofins;
    private Double vlBcCofins;
    private Double aliqCofins;
    private Double vlCofins;
    private String codCta;
    private String codCcus;
    private String descBemImob;
    private List<RegF139> regF139List;

    /**
     * Enum: IndicadorNrParcelasApropriadas.
     *
     * <p>
     *
     * Indicador do Número de Parcelas a serem apropriadas (Crédito sobre Valor de Aquisição):
     *
     * <ul>
     * <li>1 – Integral (Mês de Aquisição);</li>
     * <li>2 – 12 Meses;</li>
     * <li>3 – 24 Meses;</li>
     * <li>4 – 48 Meses;</li>
     * <li>5 – 6 Meses;</li>
     * <li>9 – Outra periodicidade definida em Lei.</li>
     * </ul>
     * </p>
     */
    public enum IndicadorNrParcelasApropriadas implements EnumCodificado {

        INTEGRAL("1"),
        DOZE_MESES("2"),
        VINTE_QUATRO_MESES("3"),
        TRINTA_SEIS_MESES("4"),
        SEIS_ANOS("5"),
        OUTROS("9");

        private final String codigo;

        private IndicadorNrParcelasApropriadas(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

        public static IndicadorNrParcelasApropriadas valueOfStripToNull(final String v) {
            if (v == null || v.length() == 0) {
                return null;
            }
            return IndicadorNrParcelasApropriadas.valueOf(v);
        }

        public static IndicadorNrParcelasApropriadas valueOfCodigoStripToNull(final String codigo) {
            if (codigo == null || codigo.length() == 0) {
                return null;
            }

            return valueOfCodigo(codigo);
        }

        public static IndicadorNrParcelasApropriadas valueOfCodigo(final String codigo) {
            for (IndicadorNrParcelasApropriadas n : values()) {
                if (n.getCodigo().equalsIgnoreCase(codigo)) {
                    return n;
                }
            }
            return null;
        }

    }

}
