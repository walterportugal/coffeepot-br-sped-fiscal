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
import coffeepot.bean.wr.types.AccessorType;
import coffeepot.br.sped.commons.RegEncerramentoBlocoBase;

/**
 * Class: Reg1990.
 *
 * <p>
 * Encerramento do Bloqo 1.
 * </p>
 *
 * <p>
 * History:<br><br>
 *      - walter - Sep 11, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(accessorType = AccessorType.PROPERTY,
        fields = {
            @Field(name = "reg", id = true, constantValue = "1990"),
            @Field(name = "qtdLin", classType = Long.class)
        })
public class Reg1990  extends RegEncerramentoBlocoBase {

    public Reg1990() {
        this.reg = "1990";
    }

    public Reg1990(Long qtdLin) {
        this.reg = "1990";
        this.qtdLin = qtdLin;
    }
}
