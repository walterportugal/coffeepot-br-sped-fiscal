/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.commons;

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


import coffeepot.br.sped.fiscal.tipos.IndicadorMovimento;
import lombok.Getter;
import lombok.Setter;

/**
 * Registro de abertura de bloco.
 *
 * @author Jeandeson O. Merelis
 */
@Getter
@Setter
public class RegAberturaBlocoBase {

    protected String reg;
    protected IndicadorMovimento indMov;

}
