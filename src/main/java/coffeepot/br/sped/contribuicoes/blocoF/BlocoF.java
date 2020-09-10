package coffeepot.br.sped.contribuicoes.blocoF;

import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import java.util.List;
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
 * Class: BlocoF.
 *
 * <p>
 * Demais Documentos e Operações. Neste bloco serão informadas pela pessoa jurídica, as demais operações geradoras de
 * contribuição ou de crédito, não informadas nos Blocos A, C e D.
 * </p>
 *
 * <p>
 * History:<br><br>
 * - walter - Sep 2, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "regF001"),
    @Field(name = "regF010List"),
    @Field(name = "regF990")
})
@Getter
@Setter
public class BlocoF {

    private RegF001 regF001;
    private List<RegF010> regF010List;
    private RegF990 regF990;
}
