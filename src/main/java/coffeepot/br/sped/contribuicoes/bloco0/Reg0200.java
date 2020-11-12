package coffeepot.br.sped.contribuicoes.bloco0;

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
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0205;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0206;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: Reg0200.
 *
 * <p>
 * Tabela de Identificação do Item (Produtos e Serviços).
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
    @Field(name = "reg", id=true, constantValue = "0200"),
    @Field(name = "codItem", maxLength = 60),
    @Field(name = "descrItem"),
    @Field(name = "codBarra"),
    @Field(name = "codAntItem", maxLength = 60),
    @Field(name = "unidInv", maxLength = 6),
    @Field(name = "tipoItem"),
    @Field(name = "codNcm", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "exIpi"),
    @Field(name = "codGen", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "codLst", maxLength = 5),
    @Field(name = "aliqIcms"),
    @Field(name = "reg0205List"),
    @Field(name = "reg0206"),
    @Field(name = "reg0208")
})
@Getter
@Setter
public class Reg0200 {
    
    private String codItem;
    private String descrItem;
    private String codBarra;
    private String codAntItem;
    private String unidInv;
    private String tipoItem;
    private String codNcm;
    private String exIpi;
    private String codGen;
    private String codLst;
    private Double aliqIcms;
    private String cest;
    private List<Reg0205> reg0205List;
    private Reg0206 reg0206;
    private Reg0208 reg0208;

}
