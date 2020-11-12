package coffeepot.br.sped.contribuicoes.bloco1;

import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.bean.wr.types.Align;
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import coffeepot.br.sped.fiscal.tipos.SituacaoDocumento;
import lombok.Getter;
import lombok.Setter;

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
/**
 * Class: Reg1900.
 *
 * <p>
 * Consolidação dos Documentos Emitidos no Período por Pessoa Jurídica Submetida ao Regime de Tributação Com Base no
 * Lucro Presumido – Regime de Caixa ou de Competência.
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
    @Field(name = "reg", id = true, constantValue = "1900"),
    @Field(name = "cnpj", maxLength = 14, params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "codMod"),
    @Field(name = "ser"),
    @Field(name = "subSer"),
    @Field(name = "codSit"),
    @Field(name = "vlTotRec"),
    @Field(name = "quantDoc"),
    @Field(name = "cstPis", minLength = 2, align = Align.RIGHT, padding = '0'),
    @Field(name = "cstCofins", minLength = 2, align = Align.RIGHT, padding = '0'),
    @Field(name = "cfop"),
    @Field(name = "infCompl"),
    @Field(name = "codCta")
})
@Getter
@Setter
public class Reg1900 {

    private String cnpj;
    private DocumentoFiscal codMod;
    private String ser;
    private String subSer;
    private SituacaoDocumento codSit;
    private Double vlTotRec;
    private Integer quantDoc;
    private String cstPis;
    private String cstCofins;
    private Integer cfop;
    private String infCompl;
    private String codCta;

}
