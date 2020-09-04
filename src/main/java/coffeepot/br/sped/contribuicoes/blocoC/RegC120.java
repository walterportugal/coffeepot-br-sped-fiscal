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
import coffeepot.br.sped.fiscal.tipos.DocumentoImportacao;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegC120.
 *
 * <p>
 * Complemento do Documento - Operações de Importação (Código 01).
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
    @Field(name = "reg", id=true, constantValue = "C120"),
    @Field( name = "codDocImp"),
    @Field( name = "numDocImp"),
    @Field( name = "vlPisImp"),
    @Field( name = "vlCofinsImp"),
    @Field( name = "numAcdraw")
})
@Getter
@Setter
public class RegC120 {

    private DocumentoImportacao codDocImp;
    private String numDocImp;
    private Double vlPisImp;
    private Double vlCofinsImp;
    private String numAcdraw;

}
