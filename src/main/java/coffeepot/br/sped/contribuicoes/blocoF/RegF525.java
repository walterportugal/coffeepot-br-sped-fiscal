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
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegF525.
 *
 * <p>
 * Composição da Receita Escriturada no Período – Detalhamento da Receita Recebida pelo Regime de Caixa.
 * </p>
 *
 * <p>
 * History:<br><br>
 * - walter - Sep 10, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "F525"),
    @Field(name = "vlRec"),
    @Field(name = "indRec"),
    @Field(name = "cnpjCpf", maxLength = 14),
    @Field(name = "numDoc", maxLength = 60),
    @Field(name = "codItem"),
    @Field(name = "vlRecDet"),
    @Field(name = "cstPis", minLength = 2, align = Align.RIGHT, padding = '0'),
    @Field(name = "cstCofins", minLength = 2, align = Align.RIGHT, padding = '0'),
    @Field(name = "infoCompl"),
    @Field(name = "codCta")
})
@Getter
@Setter
public class RegF525 {

    private Double vlRec;
    private IndicadorComposicaoReceita indRec;
    private String cnpjCpf;
    private String numDoc;
    private String codItem;
    private Double vlRecDet;
    private String cstPis;
    private String cstCofins;
    private String infoCompl;
    private String codCta;

    /**
     * Enum: IndicadorComposicaoReceita.
     *
     * <p>
     * Indicador da composição da receita recebida no período (Campo 02), por:
     *
     * <ul>
     * <li>01- Clientes</li>
     * <li>02- Administradora de cartão de débito/crédito</li>
     * <li>03- Título de crédito - Duplicata, nota promissória, cheque, etc.</li>
     * <li>04- Documento fiscal</li>
     * <li>05- Item vendido (produtos e serviços)</li>
     * <li>99- Outros (Detalhar no campo 10 – Informação Complementar) </li>
     * </ul></p>
     */
    public enum IndicadorComposicaoReceita implements EnumCodificado {

        CLIENTES("01"),
        ADM_CARTAO("02"),
        TITULO_CREDITO("03"),
        DOCUMENTO_FISCAL("04"),
        ITEM_VENDIDO("05"),
        OUTROS("99");

        private final String codigo;

        private IndicadorComposicaoReceita(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

        public static IndicadorComposicaoReceita valueOfStripToNull(final String v) {
            if (v == null || v.length() == 0) {
                return null;
            }
            return IndicadorComposicaoReceita.valueOf(v);
        }

        public static IndicadorComposicaoReceita valueOfCodigoStripToNull(final String codigo) {
            if (codigo == null || codigo.length() == 0) {
                return null;
            }

            return valueOfCodigo(codigo);
        }

        public static IndicadorComposicaoReceita valueOfCodigo(final String codigo) {
            for (IndicadorComposicaoReceita n : values()) {
                if (n.getCodigo().equalsIgnoreCase(codigo)) {
                    return n;
                }
            }
            return null;
        }

    }

}
