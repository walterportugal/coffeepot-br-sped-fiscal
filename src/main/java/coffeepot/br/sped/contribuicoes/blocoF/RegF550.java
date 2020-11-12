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
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegF550.
 *
 * <p>
 * Consolidação das Operações da Pessoa Jurídica Submetida ao Regime de Tributação com Base no Lucro Presumido –
 * Incidência do PIS/Pasep e da Cofins pelo Regime de Competência.
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
    @Field(name = "reg", id = true, constantValue = "F550"),
    @Field(name = "vlRecComp"),
    @Field(name = "cstPis", minLength = 2, align = Align.RIGHT, padding = '0'),
    @Field(name = "vlDescPis"),
    @Field(name = "vlBcPis"),
    @Field(name = "aliqPis"),
    @Field(name = "vlPis"),
    @Field(name = "cstCofins", minLength = 2, align = Align.RIGHT, padding = '0'),
    @Field(name = "vlDescCofins"),
    @Field(name = "vlBcCofins"),
    @Field(name = "aliqCofins"),
    @Field(name = "vlCofins"),
    @Field(name = "codMod"),
    @Field(name = "cfop"),
    @Field(name = "codCta"),
    @Field(name = "infoCompl"),
    @Field(name = "regF559List")
})
@Getter
@Setter
public class RegF550 {

    private Double vlRecComp;
    private String cstPis;
    private Double vlDescPis;
    private Double vlBcPis;
    private Double aliqPis;
    private Double vlPis;
    private String cstCofins;
    private Double vlDescCofins;
    private Double vlBcCofins;
    private Double aliqCofins;
    private Double vlCofins;
    private DocumentoFiscal codMod;
    private Integer cfop;
    private String codCta;
    private String infoCompl;

    private List<RegF559> regF559List;

}
