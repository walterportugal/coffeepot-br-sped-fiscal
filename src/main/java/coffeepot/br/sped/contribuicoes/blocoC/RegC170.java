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
import coffeepot.bean.wr.types.Align;
import coffeepot.br.sped.fiscal.tipos.ApuracaoIpi;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegC170.
 *
 * <p>
 * Complemento do Documento - Itens do Documento (Códigos 01, 1B, 04 e 55).
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
    @Field(name = "reg", id=true, constantValue = "C170"),
    @Field(name = "numItem"),
    @Field(name = "codItem"),
    @Field(name = "descrCompl"),
    @Field(name = "qtd"),
    @Field(name = "unid"),
    @Field(name = "vlItem"),
    @Field(name = "vlDesc"),
    @Field(name = "indMov", params = {"true=0;false=1"}),
    @Field(name = "cstIcms", length = 3, align = Align.RIGHT, padding = '0'),
    @Field(name = "cfop"),
    @Field(name = "codNat"),
    @Field(name = "vlBcIcms"),
    @Field(name = "aliqIcms"),
    @Field(name = "vlIcms"),
    @Field(name = "vlBcIcmsSt"),
    @Field(name = "aliqSt"),
    @Field(name = "vlIcmsSt"),
    @Field(name = "indApur"),
    @Field(name = "cstIpi", minLength = 2, align = Align.RIGHT, padding = '0'),
    @Field(name = "codEnq"),
    @Field(name = "vlBcIpi"),
    @Field(name = "aliqIpi"),
    @Field(name = "vlIpi"),
    @Field(name = "cstPis", minLength = 2, align = Align.RIGHT, padding = '0'),
    @Field(name = "vlBcPis"),
    @Field(name = "aliqPisPerc"),
    @Field(name = "quantBcPis"),
    @Field(name = "aliqPisReal"),
    @Field(name = "vlPis"),
    @Field(name = "cstCofins", minLength = 2, align = Align.RIGHT, padding = '0'),
    @Field(name = "vlBcCofins"),
    @Field(name = "aliqCofinsPerc"),
    @Field(name = "quantBcCofins"),
    @Field(name = "aliqCofinsReal"),
    @Field(name = "vlCofins"),
    @Field(name = "codCta")
})
@Getter
@Setter
public class RegC170 {
    
    private Integer numItem;
    private String codItem;
    private String descrCompl;
    private Double qtd;
    private String unid;
    private Double vlItem;
    private Double vlDesc;
    private Boolean indMov;
    private String cstIcms;
    private Integer cfop;
    private String codNat;
    private Double vlBcIcms;
    private Double aliqIcms;
    private Double vlIcms;
    private Double vlBcIcmsSt;
    private Double aliqSt;
    private Double vlIcmsSt;
    private ApuracaoIpi indApur;
    private String cstIpi;
    private String codEnq;
    private Double vlBcIpi;
    private Double aliqIpi;
    private Double vlIpi;
    private String cstPis;
    private Double vlBcPis;
    private Double aliqPisPerc;
    private Double quantBcPis;
    private Double aliqPisReal;
    private Double vlPis;
    private String cstCofins;
    private Double vlBcCofins;
    private Double aliqCofinsPerc;
    private Double quantBcCofins;
    private Double aliqCofinsReal;
    private Double vlCofins;
    private String codCta;

}
