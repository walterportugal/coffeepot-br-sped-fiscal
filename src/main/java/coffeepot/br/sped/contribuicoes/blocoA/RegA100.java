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
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.br.sped.fiscal.tipos.CondicaoPagamento;
import coffeepot.br.sped.fiscal.tipos.EmissaoDocumento;
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import coffeepot.br.sped.fiscal.tipos.SituacaoDocumento;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegA100.
 *
 * <p>
 * Documento – Nota Fiscal de Serviço.
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
    @Field(name = "reg", id=true, constantValue = "A100"),
    @Field(name = "indOper"),
    @Field(name = "indEmit"),
    @Field(name = "codPart"),
    @Field(name = "codSit"),
    @Field(name = "ser"),
    @Field(name = "sub"),
    @Field(name = "numDoc"),
    @Field(name = "chvNfse", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "dtDoc"),
    @Field(name = "dtExeServ"),
    @Field(name = "vlDoc"),
    @Field(name = "indPgto"),
    @Field(name = "vlDesc"),
    @Field(name = "vlBcPis"),
    @Field(name = "vlPis"),
    @Field(name = "vlBcCofins"),
    @Field(name = "vlCofins"),
    @Field(name = "vlPisRet"),
    @Field(name = "vlCofinsRet"),
    @Field(name = "vlIss"),
    @Field(name = "regA120List"),
    @Field(name = "regA170List")
})
@Getter
@Setter
public class RegA100 {
    
    private TipoOperacaoServico indOper;
    private EmissaoDocumento indEmit;
    private String codPart;
    private SituacaoDocumento codSit;//Usa apenas o 00-Documento Regular ou 02-Dicumento Cancelado.
    private String ser;
    private String sub;
    private Long numDoc;
    private String chvNfse;
    private LocalDate dtDoc;
    private LocalDate dtExeServ;
    private Double vlDoc;
    private CondicaoPagamento indPgto;
    private Double vlDesc;
    private Double vlBcPis;
    private Double vlPis;
    private Double vlBcCofins;
    private Double vlCofins;
    private Double vlPisRet;
    private Double vlCofinsRet;
    private Double vlIss;

    private List<RegA120> regA120List;
    private List<RegA170> regA170List;
    
    /**
     * Enum: TipoOperacaoServico.
     *
     * <p>
     * Indicador do tipo de operação:
     * <ul>
     * <li>0 - Serviço Contratado pelo Estabelecimento;</li>
     * <li>1 - Serviço Prestado pelo Estabelecimento.</li>
     * </ul> </p>
     */
    public enum TipoOperacaoServico implements EnumCodificado {

        APROPRIACAO_DIRETA("0"),
        APROPRIACAO_ALIQUOTAS_ESPECIFICAS("1");

        private final String codigo;

        private TipoOperacaoServico(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

        public static TipoOperacaoServico valueOfStripToNull(final String v) {
            if (v == null || v.length() == 0) {
                return null;
            }
            return TipoOperacaoServico.valueOf(v);
        }

        public static TipoOperacaoServico valueOfCodigoStripToNull(final String codigo) {
            if (codigo == null || codigo.length() == 0) {
                return null;
            }

            return valueOfCodigo(codigo);
        }

        public static TipoOperacaoServico valueOfCodigo(final String codigo) {
            for (TipoOperacaoServico n : values()) {
                if (n.getCodigo().equalsIgnoreCase(codigo)) {
                    return n;
                }
            }
            return null;
        }

    }
}
