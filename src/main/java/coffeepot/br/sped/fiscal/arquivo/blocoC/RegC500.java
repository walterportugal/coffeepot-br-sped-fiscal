/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoC;


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
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "C500"),
    @Field(name = "indOper"),
    @Field(name = "indEmit"),
    @Field(name = "codPart"),
    @Field(name = "codMod"),
    @Field(name = "codSit"),
    @Field(name = "ser"),
    @Field(name = "sub"),
    @Field(name = "codCons"),
    @Field(name = "numDoc"),
    @Field(name = "dtDoc"),
    @Field(name = "dtES"),
    @Field(name = "vlDoc"),
    @Field(name = "vlDesc"),
    @Field(name = "vlForn"),
    @Field(name = "vlServNt"),
    @Field(name = "vlTerc"),
    @Field(name = "vlDa"),
    @Field(name = "vlBcIcms"),
    @Field(name = "vlIcms"),
    @Field(name = "vlBcIcmsSt"),
    @Field(name = "vlIcmsSt"),
    @Field(name = "codInf"),
    @Field(name = "vlPis"),
    @Field(name = "vlCofins"),
    @Field(name = "tpLigacao"),
    @Field(name = "codGrupoTensao"),
    @Field(name = "chvDoce"),
    @Field(name = "finDoce"),
    @Field(name = "chvDoceRef"),
    @Field(name = "indDest"),
    @Field(name = "codMunDest"),
    @Field(name = "codCta"),
    
    //--- detalhes ---
    @Field(name = "regC510List"),
    @Field(name = "regC590List")
})
@Getter
@Setter
public class RegC500 {

    private Operacao indOper;
    private EmissaoDocumento indEmit;
    private String codPart;
    private DocumentoFiscal codMod;
    private SituacaoDocumento codSit;
    private String ser;
    private String sub;
    private CodigoConsumo codCons;
    private Long numDoc;
    private LocalDate dtDoc;
    private LocalDate dtES;
    private Double vlDoc;
    private Double vlDesc;
    private Double vlForn;
    private Double vlServNt;
    private Double vlTerc;
    private Double vlDa;
    private Double vlBcIcms;
    private Double vlIcms;
    private Double vlBcIcmsSt;
    private Double vlIcmsSt;
    private String codInf;
    private Double vlPis;
    private Double vlCofins;
    private TipoLigacao tpLigacao;
    private CodigoGrupoTensao codGrupoTensao;
    private String chvDoce;
    private FinalidadeDocumento finDoce;
    private String chvDoceRef;
    private IndicadorDestinatarioAcessante indDest;
    private String codMunDest;
    private String codCta;
    //--- detalhes ---
    private List<RegC510> regC510List;
    private List<RegC590> regC590List;

    public enum CodigoConsumo implements EnumCodificado {

        COMERCIAL("01"),
        CONSUMO_PROPRIO("02"),
        ILUMINACAO_PUBLICA("03"),
        INDUSTRIAL("04"),
        PODER_PUBLICO("05"),
        RESIDENCIAL("06"),
        RURAL("07"),
        SERVICO_PIBLICO("08");

        private final String codigo;

        private CodigoConsumo(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }
    }

    public enum TipoLigacao implements EnumCodificado {

        MONOFASICO("1"),
        BIFASICO("2"),
        TRIFASICO("3");

        private final String codigo;

        private TipoLigacao(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }
    }

    public enum CodigoGrupoTensao implements EnumCodificado {

        A1_ALTA_TENSAO_240v_MAIS("01"),
        A2_ALTA_TENSAO_88_138kV("02"),
        A3_ALTA_TENSAO_69kV("03"),
        A3a_ALTA_TENSAO_30_44kV("04"),
        A4_ALTA_TENSAO_2ponto3_25kV("05"),
        AS_ALTA_TENSAO_SUBTERRANEO("06"),
        B1_RESIDENCIAL("07"),
        B1_RESIDENCIAL_BAIXA_RENDA("08"),
        B2_RURAL("09"),
        B2_COOPERATIVA_ELETRIFICACAO_RURAL("10"),
        B2_SERVICO_PUBLICO_IRRIGACAO("11"),
        B3_DEMAIS_CLASSES("12"),
        B4a_ILUMINACAO_PUBLICA_REDE_DISTRIBUICAO("13"),
        B4b_ILUMINACAO_PUBLICA_BULBO_LAMPADA("14");

        private final String codigo;

        private CodigoGrupoTensao(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }
    }

    public enum FinalidadeDocumento implements EnumCodificado {
        NORMAL("1"),
        SUBSTITUICAO("2"),
        NORMAL_COM_AJUSTE("3");

        private final String codigo;

        private FinalidadeDocumento(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }
    }

    public enum IndicadorDestinatarioAcessante implements EnumCodificado {
        CONTRIBUINTE_ICMS("1"),
        CONTRIBUINTE_ISENTO("2"),
        NAO_CONTRUIBUINTE("9")
        ;
        
         private final String codigo;

        private IndicadorDestinatarioAcessante(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

    }

}
