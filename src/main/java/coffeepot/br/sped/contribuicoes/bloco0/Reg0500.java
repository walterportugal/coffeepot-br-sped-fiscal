package coffeepot.br.sped.contribuicoes.bloco0;

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
import coffeepot.br.sped.fiscal.tipos.NaturezaContaContabil;
import coffeepot.br.sped.fiscal.tipos.TipoContaContabil;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: Reg0500.
 *
 * <p>
 * Plano de Contas Contábeis – Contas Informadas.
 * </p>
 *
 * <p>
 * History:<br><br>
 *      - walter - Sep 2, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id=true, constantValue = "0500"),
    @Field(name = "dtAlt", length = 8),
    @Field(name = "codNatCc"),
    @Field(name = "indCta"),
    @Field(name = "nivel"),
    @Field(name = "codCta"),
    @Field(name = "nomeCta", maxLength = 60),
    @Field(name = "codCtaRef", maxLength = 60),
    @Field(name = "cnpjEst", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY})
})
@Getter
@Setter
public class Reg0500 {

    private LocalDate dtAlt;
    private NaturezaContaContabil codNatCc;
    private TipoContaContabil indCta;
    private Integer nivel;
    private String codCta;
    private String nomeCta;
    private String codCtaRef;
    private String cnpjEst;

}