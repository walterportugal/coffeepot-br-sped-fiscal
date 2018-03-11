/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco1;

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
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "1100"),
    @Field(name = "indDoc"),
    @Field(name = "nroDe"),
    @Field(name = "dtDe"),
    @Field(name = "natExp"),
    @Field(name = "nroRe"),
    @Field(name = "dtRe"),
    @Field(name = "chcEmb"),
    @Field(name = "dtChc"),
    @Field(name = "dtAvb"),
    @Field(name = "tpChc"),
    @Field(name = "pais"),
    //--- detalhes ---
    @Field(name = "reg1105List")
})
@Getter
@Setter
public class Reg1100 {

    private IndicadorDocumento indDoc;
    private String nroDe;
    private LocalDate dtDe;
    private NaturezaExportacao natExp;
    private String nroRe;
    private LocalDate dtRe;
    private String chcEmb;
    private LocalDate dtChc;
    private LocalDate dtAvb;
    private TipoConhecimentoEmbarque tpChc;
    private Long pais;
    //--- detalhes ---
    private List<Reg1105> reg1105List;

    public enum IndicadorDocumento implements EnumCodificado {

        DECLARACAO_EXPORTACAO(0),
        DECLARACAO_SIMPLIFICADA_EXPORTACAO(1),
        DECLARACAO_UNICA_EXPORTACAO(2);

        private final int codigo;

        private IndicadorDocumento(int codigo) {
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
    
    public enum NaturezaExportacao implements EnumCodificado {

        EXPORTACAO_DIRETA(0),
        EXPORTACAO_INDIRETA(1);

        private final int codigo;

        private NaturezaExportacao(int codigo) {
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
    
    public enum TipoConhecimentoEmbarque implements EnumCodificado {

        AWB("01"),
        MAWB("02"),
        HAWB("03"),
        COMAT("04"),
        R_EXPRESSAS("06"),
        ETIQ_REXPRESSAS("07"),
        HR_EXPRESSAS("08"),
        AV7("09"),
        BL("10"),
        MBL("11"),
        HBL("12"),
        CRT("13"),
        DSIC("14"),
        COMAT_BL("16"),
        RWB("17"),
        HRWB("18"),
        TIF_DTA("19"),
        CP2("20"),
        NAO_IATA("91"),
        MNAO_IATA("92"),
        HNAO_IATA("93"),
        OUTROS("99");

        private final String codigo;

        private TipoConhecimentoEmbarque(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }
    }
}
