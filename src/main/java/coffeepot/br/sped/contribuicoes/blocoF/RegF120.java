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
 * Class: RegF120.
 *
 * <p>
 * Insert description here.
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
    @Field(name = "reg", id = true, constantValue = "F120"),
    @Field(name = "natBcCred"),
    @Field(name = "indentBemImob"),
    @Field(name = "indOrigCred"),
    @Field(name = "indUtilBemImob"),
    @Field(name = "vlOperDep"),
    @Field(name = "parcOperNaoBcCred"),
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
    @Field(name = "descDocOper"),
    @Field(name = "regF129List")
})
@Getter
@Setter
public class RegF120 {

    private String natBcCred;
    private IdentificadorBensAtivoImobilizado indentBemImob;
    private IndicadorOrigemCredito indOrigCred;
    private IndicadorBensIncorporados indUtilBemImob;
    private Double vlOperDep;
    private Double parcOperNaoBcCred;
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
    private String descDocOper;  
    private List<RegF129> regF129List;

    /**
     * Enum: IndicadorBensIncorporados.
     *
     * <p>
     *
     * Indicador da Utilização dos Bens Incorporados ao Ativo Imobilizado:
     *
     * <ul>
     * <li>1 – Produção de Bens Destinados a Venda;</li>
     * <li>2 – Prestação de Serviços;</li>
     * <li>3 – Locação a Terceiros;</li>
     * <li>9 – Outros.</li>
     * </ul>
     * </p>
     */
    public enum IndicadorBensIncorporados implements EnumCodificado {

        PRODUCAO_DESTINADO_VENDA("1"),
        PRESTACAO_SERVICOS("2"),
        LOCACAO_TERCEIROS("3"),
        OUTROS("9");

        private final String codigo;

        private IndicadorBensIncorporados(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

        public static IndicadorBensIncorporados valueOfStripToNull(final String v) {
            if (v == null || v.length() == 0) {
                return null;
            }
            return IndicadorBensIncorporados.valueOf(v);
        }

        public static IndicadorBensIncorporados valueOfCodigoStripToNull(final String codigo) {
            if (codigo == null || codigo.length() == 0) {
                return null;
            }

            return valueOfCodigo(codigo);
        }

        public static IndicadorBensIncorporados valueOfCodigo(final String codigo) {
            for (IndicadorBensIncorporados n : values()) {
                if (n.getCodigo().equalsIgnoreCase(codigo)) {
                    return n;
                }
            }
            return null;
        }

    }

}
