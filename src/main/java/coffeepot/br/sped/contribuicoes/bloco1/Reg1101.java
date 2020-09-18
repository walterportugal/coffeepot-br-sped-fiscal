package coffeepot.br.sped.contribuicoes.bloco1;

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
import coffeepot.bean.wr.types.Align;
import coffeepot.br.sped.contribuicoes.tipos.IndicadorOrigemCredito;
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: Reg1101.
 *
 * <p>
 * Apuração de Crédito Extemporâneo - Documentos e Operações de Períodos Anteriores – PIS/Pasep.
 * </p>
 *
 * <p>
 * History:<br><br>
 * - walter - Sep 11, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "1101"),
    @Field(name = "codPart"),
    @Field(name = "codItem"),
    @Field(name = "codMod"),
    @Field(name = "ser"),
    @Field(name = "subSer"),
    @Field(name = "numDoc"),
    @Field(name = "dtOper"),
    @Field(name = "chvNfe"),
    @Field(name = "vlOper"),
    @Field(name = "cfop"),
    @Field(name = "natBcCred"),
    @Field(name = "indOrigCred"),
    @Field(name = "cstPis", minLength = 2, align = Align.RIGHT, padding = '0'),
    @Field(name = "vlBcPis"),
    @Field(name = "aliqPis"),
    @Field(name = "vlPis"),
    @Field(name = "codCta"),
    @Field(name = "codCcus"),
    @Field(name = "descCompl"),
    @Field(name = "perEscrit"),
    @Field(name = "cnpj", maxLength = 14, params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY})
})
@Getter
@Setter
public class Reg1101 {

    private String codPart;
    private String codItem;
    private DocumentoFiscal codMod;
    private String ser;
    private String subSer;
    private String numDoc;
    private LocalDate dtOper;
    private String chvNfe;
    private Double vlOper;
    private Integer cfop;
    private String natBcCred;
    private IndicadorOrigemCredito indOrigCred;
    private String cstPis;
    private Double vlBcPis;
    private Double aliqPis;
    private Double vlPis;
    private String codCta;
    private String codCcus;
    private String descCompl;
    private Double perEscrit;
    private String cnpj;

}
