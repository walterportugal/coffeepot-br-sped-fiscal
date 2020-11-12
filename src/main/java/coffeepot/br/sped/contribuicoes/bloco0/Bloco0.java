package coffeepot.br.sped.contribuicoes.bloco0;

import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0600;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0990;
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
 * Class: Bloco0.
 *
 * <p>
 * Abertura, Identificação e Referências.
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
    @Field(name = "reg0000"),
    @Field(name = "reg0001"),
    @Field(name = "reg0100List"),
    @Field(name = "reg0110"),
    @Field(name = "reg0120List"),
    @Field(name = "reg0140List"),
    @Field(name = "reg0500List"),
    @Field(name = "reg0600List"),
    @Field(name = "reg0990")
})
@Getter
@Setter
public class Bloco0 {
    private Reg0000 reg0000;
    private Reg0001 reg0001;
    private List<Reg0100> reg0100List;
    private Reg0110 reg0110;
    private List<Reg0120> reg0120List;
    private List<Reg0140> reg0140List;
    private List<Reg0500> reg0500List;
    private List<Reg0600> reg0600List;
    private Reg0990 reg0990;
    
    
}
