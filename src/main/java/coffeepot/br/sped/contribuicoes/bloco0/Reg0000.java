package coffeepot.br.sped.contribuicoes.bloco0;

import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.bean.wr.types.Align;
import coffeepot.br.sped.contribuicoes.tipos.IndicadorAtividadePrepoderante;
import coffeepot.br.sped.contribuicoes.tipos.IndicadorNaturezaPj;
import coffeepot.br.sped.contribuicoes.tipos.IndicadorSituacaoEspecial;
import coffeepot.br.sped.fiscal.tipos.FinalidadeArquivo;
import coffeepot.br.sped.fiscal.tipos.VersaoLayout;
import java.time.LocalDate;
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
 * Class: Reg0000.
 *
 * <p>
 * Abertura do Arquivo Digital e Identificação da Pessoa Jurídica.
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
    @Field(name = "reg", id = true, constantValue = "0000"),
    @Field(name = "codVer", length = 3, align = Align.RIGHT, padding = '0'),
    @Field(name = "tipoEscrit"),
    @Field(name = "indSitEsp"),
    @Field(name = "numRecAnterior"),
    @Field(name = "dtIni"),
    @Field(name = "dtFin"),
    @Field(name = "nome", maxLength = 100),
    @Field(name = "cnpj", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "cpf", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "uf"),
    @Field(name = "codMun", length = 7, align = Align.RIGHT, padding = '0', paddingIfNullOrEmpty = true),
    @Field(name = "suframa", length = 9, params = {DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY}),
    @Field(name = "indNatPj"),
    @Field(name = "indAtiv")
})
@Getter
@Setter
public class Reg0000 {

    private VersaoLayout codVer;
    private FinalidadeArquivo tipoEscrit;
    private IndicadorSituacaoEspecial indSitEsp;
    private String numRecAnterior;
    private LocalDate dtIni;
    private LocalDate dtFin;
    private String nome;
    private String cnpj;
    private String cpf;
    private String uf;
    private Integer codMun;
    private String suframa;
    private IndicadorNaturezaPj indNatPj;
    private IndicadorAtividadePrepoderante indAtiv;
}
