package coffeepot.br.sped.contribuicoes.bloco1;

import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.br.sped.fiscal.arquivo.bloco1.Reg1001;
import coffeepot.br.sped.fiscal.arquivo.bloco1.Reg1990;
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
 * Class: Bloco1.
 *
 * <p>
 * Complemento da Escrituração – Controle de Saldos de Créditos e de Retenções, Operações Extemporâneas e Outras
 * Informações.
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
    @Field(name = "reg1001"),
    @Field(name = "reg1010List"),
    @Field(name = "reg1020List"),
    @Field(name = "reg1100List"),
    @Field(name = "reg1500List"),
    @Field(name = "reg1900List"),
    @Field(name = "reg1990")
})
@Getter
@Setter
public class Bloco1 {
    
    private Reg1001 reg1001;
    
    private List<Reg1010> reg1010List;
    private List<Reg1020> reg1020List;
    private List<Reg1100> reg1100List;
    private List<Reg1500> reg1500List;
    private List<Reg1900> reg1900List;
    
    private Reg1990 reg1990;

}
