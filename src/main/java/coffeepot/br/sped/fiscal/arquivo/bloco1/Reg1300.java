/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco1;

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


import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "1300"),
    @Field(name = "codItem"),
    @Field(name = "dtFech"),
    @Field(name = "estoqAbert"),
    @Field(name = "volEntr"),
    @Field(name = "volDisp"),
    @Field(name = "volSaidas"),
    @Field(name = "estqEscr"),
    @Field(name = "valAjPerda"),
    @Field(name = "valAjGanho"),
    @Field(name = "fechFisico"),
    //--- detalhes ---
    @Field(name = "reg1310List")
})
@Getter
@Setter
public class Reg1300 {

    private String codItem;
    private LocalDate dtFech;
    private Double estoqAbert;
    private Double volEntr;
    private Double volDisp;
    private Double volSaidas;
    private Double estqEscr;
    private Double valAjPerda;
    private Double valAjGanho;
    private Double fechFisico;
    //--- detalhes ---
    private List<Reg1310> reg1310List;

}
