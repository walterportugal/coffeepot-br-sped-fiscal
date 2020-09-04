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
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import coffeepot.br.sped.fiscal.tipos.EmissaoDocumento;
import coffeepot.br.sped.fiscal.tipos.SituacaoDocumento;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegD500.
 *
 * <p>
 * Nota Fiscal de Serviço de Comunicação (Código 21) e Nota Fiscal de Serviço de Telecomunicação (Código 22) –
 * Documentos de Aquisição com Direito a Crédito.
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
    @Field(name = "reg", id = true, constantValue = "D500"),
    @Field(name = "indOper", constantValue = "0"),
    @Field(name = "indEmit"),
    @Field(name = "codPart"),
    @Field(name = "codMod"),
    @Field(name = "codSit"),
    @Field(name = "ser"),
    @Field(name = "sub"),
    @Field(name = "numDoc"),
    @Field(name = "dtDoc"),
    @Field(name = "dtAp"),
    @Field(name = "vlDoc"),
    @Field(name = "vlDesc"),
    @Field(name = "vlServ"),
    @Field(name = "vlServNt"),
    @Field(name = "vlTerc"),
    @Field(name = "vlDa"),
    @Field(name = "vlBcIcms"),
    @Field(name = "vlIcms"),
    @Field(name = "codInf"),
    @Field(name = "vlPis"),
    @Field(name = "vlCofins"),
    @Field(name = "regD501List"),
    @Field(name = "regD505List"),
    @Field(name = "regD509List")

})
@Getter
@Setter
public class RegD500 {

    private EmissaoDocumento indEmit;
    private String codPart;
    private DocumentoFiscal codMod;
    private SituacaoDocumento codSit;
    private String ser;
    private String sub;
    private Long numDoc;
    private LocalDate dtDoc;
    private LocalDate dtAp;
    private Double vlDoc;
    private Double vlDesc;
    private Double vlServ;
    private Double vlServNt;
    private Double vlTerc;
    private Double vlDa;
    private Double vlBcIcms;
    private Double vlIcms;
    private String codInf;
    private Double vlPis;
    private Double vlCofins;

    private List<RegD501> regD501List;
    private List<RegD505> regD505List;
    private List<RegD509> regD509List;

}
