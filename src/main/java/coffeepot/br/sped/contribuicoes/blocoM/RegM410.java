package coffeepot.br.sped.contribuicoes.blocoM;

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
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegM410.
 *
 * <p>
 * Detalhamento das Receitas Isentas, não Alcançadas pela Incidência da Contribuição, Sujeitas a Alíquota Zero ou de
 * Vendas com Suspensão – Cofins.
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
    @Field(name = "reg", id = true, constantValue = "M410"),
    @Field(name = "natRec", maxLength = 3),
    @Field(name = "vlRec"),
    @Field(name = "codCta"),
    @Field(name = "descCompl")
})
@Getter
@Setter
public class RegM410 {

    private String natRec;
    private Double vlRec;
    private String codCta;
    private String descCompl;
}
