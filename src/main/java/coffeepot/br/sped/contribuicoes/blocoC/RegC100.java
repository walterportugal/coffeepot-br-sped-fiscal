package coffeepot.br.sped.contribuicoes.blocoC;

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
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import coffeepot.br.sped.fiscal.tipos.EmissaoDocumento;
import coffeepot.br.sped.fiscal.tipos.Frete;
import coffeepot.br.sped.fiscal.tipos.Operacao;
import coffeepot.br.sped.fiscal.tipos.SituacaoDocumento;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegC100.
 *
 * <p>
 * Documento - Nota Fiscal (Código 01), Nota Fiscal Avulsa (Código 1B), Nota Fiscal de Produtor (Código 04), NF-e
 * (Código 55) e NFC-e (Código 65).
 * </p>
 *
 * <p>
 * History:<br><br>
 * - walter - Sep 3, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "C100"),
    @Field(name = "indOper"),
    @Field(name = "indEmit"),
    @Field(name = "codPart"),
    @Field(name = "codMod"),
    @Field(name = "codSit"),
    @Field(name = "ser"),
    @Field(name = "numDoc"),
    @Field(name = "chvNfe", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "dtDoc"),
    @Field(name = "dtES"),
    @Field(name = "vlDoc"),
    @Field(name = "indPgto"),
    @Field(name = "vlDesc"),
    @Field(name = "vlAbatNt"),
    @Field(name = "vlMerc"),
    @Field(name = "indFrt"),
    @Field(name = "vlFrt"),
    @Field(name = "vlSeg"),
    @Field(name = "vlOutDa"),
    @Field(name = "vlBcIcms"),
    @Field(name = "vlIcms"),
    @Field(name = "vlBcIcmsSt"),
    @Field(name = "vlIcmsSt"),
    @Field(name = "vlIpi"),
    @Field(name = "vlPis"),
    @Field(name = "vlCofins"),
    @Field(name = "vlPisSt"),
    @Field(name = "vlCofinsSt"),
    @Field(name = "regC110List"),
    @Field(name = "regC111List"),
    @Field(name = "regC120List"),
    @Field(name = "regC170List"),
    @Field(name = "regC175List")
})
@Getter
@Setter
public class RegC100 {

    private Operacao indOper;
    private EmissaoDocumento indEmit;
    private String codPart;
    private DocumentoFiscal codMod;
    private SituacaoDocumento codSit;
    private String ser;
    private Long numDoc;
    private String chvNfe;
    private LocalDate dtDoc;
    private LocalDate dtES;
    private Double vlDoc;
    private CondicaoPagamento indPgto;
    private Double vlDesc;
    private Double vlAbatNt;
    private Double vlMerc;
    private Frete indFrt;
    private Double vlFrt;
    private Double vlSeg;
    private Double vlOutDa;
    private Double vlBcIcms;
    private Double vlIcms;
    private Double vlBcIcmsSt;
    private Double vlIcmsSt;
    private Double vlIpi;
    private Double vlPis;
    private Double vlCofins;
    private Double vlPisSt;
    private Double vlCofinsSt;

    private List<RegC110> regC110List;
    private List<RegC111> regC111List;
    private List<RegC120> regC120List;
    private List<RegC170> regC170List;
    private List<RegC175> regC175List;

}
