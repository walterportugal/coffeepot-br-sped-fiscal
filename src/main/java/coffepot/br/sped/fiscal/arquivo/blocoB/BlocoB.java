/*
 * Copyright 2013 - Jeandeson O. Merelis
 */

 /*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 Jeandeson O. Merelis
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
package coffepot.br.sped.fiscal.arquivo.blocoB;

import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: BlocoB.
 *
 * <p>
 * Documentos Fiscais - Apenas para Distrito Federal. Os estabelecimentos NÃO domiciliados no Distrito Federal deverão
 * informar apenas os registros B001 e B990.
 * </p>
 *
 * <p>
 * History:<br><br>
 * - walter - Jan 2, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 1.0
 *
 */
@Record(fields = {
    @Field(name = "regB001"),
    @Field(name = "regB990")
})
@Getter
@Setter
public class BlocoB {
    
    private RegB001 regB001;
    private RegB990 regB990;

}
