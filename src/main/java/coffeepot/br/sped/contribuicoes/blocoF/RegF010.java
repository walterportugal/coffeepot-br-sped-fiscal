package coffeepot.br.sped.contribuicoes.blocoF;

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
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegF010.
 *
 * <p>
 * Identificação do Estabelecimento.
 * </p>
 *
 * <p>
 * History:<br><br>
 *      - walter - Sep 9, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id=true, constantValue = "F010"),
    @Field(name = "cnpj", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "regF100List"),
    @Field(name = "regF120List"),
    @Field(name = "regF500List"),
    @Field(name = "regF525List"),
    @Field(name = "regF550List"),
    @Field(name = "regF560List"),
    @Field(name = "regF600List")
})
@Getter
@Setter
public class RegF010 {
    
    private String cnpj;
    private List<RegF100> regF100List;
    private List<RegF120> regF120List;
    private List<RegF500> regF500List;
    private List<RegF525> regF525List;
    private List<RegF550> regF550List;
    private List<RegF560> regF560List;
    private List<RegF600> regF600List;    

}
