package coffeepot.br.sped.contribuicoes.blocoC;

import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.br.sped.fiscal.arquivo.blocoC.RegC001;
import coffeepot.br.sped.fiscal.arquivo.blocoC.RegC990;
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
 * Class: BlocoC.
 *
 * <p>
 * Documentos Fiscais – I - Mercadorias (ICMS/IPI).
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
    @Field(name = "regC001"),
    @Field(name = "regC010List"),
    @Field(name = "regC990")
})
@Getter
@Setter
public class BlocoC {
    
    private RegC001 regC001;
    private List<RegC010> regC010List;
    private RegC990 regC990;

}
