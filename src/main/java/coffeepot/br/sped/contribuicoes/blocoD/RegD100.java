package coffeepot.br.sped.contribuicoes.blocoD;

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
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import coffeepot.br.sped.fiscal.tipos.EmissaoDocumento;
import coffeepot.br.sped.fiscal.tipos.Frete;
import coffeepot.br.sped.fiscal.tipos.SituacaoDocumento;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegD100.
 *
 * <p>
 * Aquisição de Serviços de Transporte - Nota Fiscal de Serviço de Transporte (Código 07) d Conhecimentos de Transporte
 * Rodoviário de Cargas (Código 08), Conhecimento de Transporte de Cargas Avulso (Código 8B), Aquaviário de Cargas
 * (Código 09), Aéreo (Código 10), Ferroviário de Cargas (Código 11), Multimodal de Cargas (Código 26), Nota Fiscal de
 * Transporte Ferroviário de Carga (Código 27) e Conhecimento de Transporte Eletrônico – CT-E (Código 57)
 * </p>
 *
 * <p>
 * History:<br><br>
 * - walter - Sep 4, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "D100"),
    @Field(name = "indOper", constantValue = "0"),
    @Field(name = "indEmit"),
    @Field(name = "codPart"),
    @Field(name = "codMod"),
    @Field(name = "codSit"),
    @Field(name = "ser"),
    @Field(name = "sub"),
    @Field(name = "numDoc"),
    @Field(name = "chvCte", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "dtDoc"),
    @Field(name = "dtAp"),
    @Field(name = "tpCte"),
    @Field(name = "chvCteRef"),
    @Field(name = "vlDoc"),
    @Field(name = "vlDesc"),
    @Field(name = "indFrt"),
    @Field(name = "vlServ"),
    @Field(name = "vlBcIcms"),
    @Field(name = "vlIcms"),
    @Field(name = "vlNt"),
    @Field(name = "codInf"),
    @Field(name = "codCta"),
    
    @Field(name = "regD101List"),
    @Field(name = "regD105List"),
    @Field(name = "regD111List")
})
@Getter
@Setter
public class RegD100 {
    
    private EmissaoDocumento indEmit;
    private String codPart;
    private DocumentoFiscal codMod;
    private SituacaoDocumento codSit;
    private String ser;
    private String sub;
    private Long numDoc;
    private String chvCte;
    private LocalDate dtDoc;
    private LocalDate dtAp;
    private Integer tpCte;
    private String chvCteRef;
    private Double vlDoc;
    private Double vlDesc;
    private Frete indFrt;
    private Double vlServ;
    private Double vlBcIcms;
    private Double vlIcms;
    private Double vlNt;
    private String codInf;
    private String codCta;

    private List<RegD101> regD101List;
    private List<RegD105> regD105List;
    private List<RegD111> regD111List;

}
