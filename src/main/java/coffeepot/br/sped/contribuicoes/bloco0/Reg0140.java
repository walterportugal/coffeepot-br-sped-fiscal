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
import coffeepot.bean.wr.types.Align;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0400;
import coffeepot.br.sped.fiscal.arquivo.bloco0.Reg0450;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: Reg0140.
 *
 * <p>
 * Tabela de Cadastro de Estabelecimento.
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
    @Field(name = "reg", id = true, constantValue = "0140"),
    @Field(name = "reg0145"),
    @Field(name = "codEst", maxLength = 60),
    @Field(name = "nome", maxLength = 100),
    @Field(name = "cnpj", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "uf", length = 2),
    @Field(name = "ie", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY}),
    @Field(name = "codMun", length = 7, align = Align.RIGHT, padding = '0', paddingIfNullOrEmpty = true),
    @Field(name = "im", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY}),
    @Field(name = "suframa", length = 9, params = {DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY}),
    @Field(name = "reg0150List"),
    @Field(name = "reg0190List"),
    @Field(name = "reg0200List"),
    @Field(name = "reg0400List"),
    @Field(name = "reg0450List")
})
@Getter
@Setter
public class Reg0140 {
    
    private String codEst;
    private String nome;
    private String cnpj;
    private String uf;
    private String ie;
    private String codMun;
    private String im;
    private String suframa;
    private Reg0145 reg0145;
    private List<Reg0150> reg0150List;
    private List<Reg0190> reg0190List;
    private List<Reg0200> reg0200List;
    private List<Reg0400> reg0400List;
    private List<Reg0450> reg0450List;

}
