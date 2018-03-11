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
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import coffeepot.br.sped.fiscal.tipos.EmissaoDocumento;
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import coffeepot.br.sped.fiscal.tipos.Operacao;
import coffeepot.br.sped.fiscal.tipos.SituacaoDocumento;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "reg", id=true, constantValue = "D500"),
    @Field(name = "indOper"),
    @Field(name = "indEmit"),
    @Field(name = "codPart"),
    @Field(name = "codMod"),
    @Field(name = "codSit"),
    @Field(name = "ser"),
    @Field(name = "sub"),
    @Field(name = "numDoc"),
    @Field(name = "dtDoc"),
    @Field(name = "dtAP"),
    @Field(name = "vlDoc"),
    @Field(name = "vlDesc"),
    @Field(name = "vlServ"),
    @Field(name = "vlServNT"),
    @Field(name = "vlTerc"),
    @Field(name = "vlDA"),
    @Field(name = "vlBcIcms"),
    @Field(name = "vlIcms"),
    @Field(name = "codInf"),
    @Field(name = "vlPis"),
    @Field(name = "vlCofins"),
    @Field(name = "codCta"),
    @Field(name = "tpAssinante"),
    //--- detalhes ---
    @Field(name = "regD510List"),
    @Field(name = "regD530List"),
    @Field(name = "regD590List")
})
@Getter
@Setter
public class RegD500 {

    private Operacao indOper;
    private EmissaoDocumento indEmit;
    private String codPart;
    private DocumentoFiscal codMod;
    private SituacaoDocumento codSit;
    private String ser;
    private String sub;
    private Long numDoc;
    private LocalDate dtDoc;
    private LocalDate dtAP;
    private Double vlDoc;
    private Double vlDesc;
    private Double vlServ;
    private Double vlServNT;
    private Double vlTerc;
    private Double vlDA;
    private Double vlBcIcms;
    private Double vlIcms;
    private String codInf;
    private Double vlPis;
    private Double vlCofins;
    private String codCta;
    private TipoAssinante tpAssinante;
    //--- detalhes ---
    private List<RegD510> regD510List;
    private List<RegD530> regD530List;
    private List<RegD590> regD590List;

    public enum TipoAssinante implements EnumCodificado {

        COMERCIAL_INDUSTRIAL(1),
        PODER_PUBLICO(2),
        RESIDENCIAL_PESSOA_FISICA(3),
        PUBLICO(4),
        SEMI_PUBLICO(5),
        OUTROS(6);

        private final int codigo;

        private TipoAssinante(int codigo) {
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
