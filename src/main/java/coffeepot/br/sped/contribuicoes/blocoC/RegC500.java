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
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import coffeepot.br.sped.fiscal.tipos.SituacaoDocumento;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegC500.
 *
 * <p>
 * Nota Fiscal/Conta de Energia Elétrica (Código 06), Nota Fiscal/Conta de Fornecimento D'água Canalizada (Código 29) e
 * Nota Fiscal Consumo Fornecimento de Gás (Código 28) e NF-e (Código 55) – Documentos de Entrada/Aquisição com Crédito
 * </p>
 *
 * <p>
 * History:<br><br>
 * - walter - Sep 4, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "C500"),
    @Field(name = "codPart"),
    @Field(name = "codMod"),
    @Field(name = "codSit"),
    @Field(name = "ser"),
    @Field(name = "sub"),
    @Field(name = "numDoc"),
    @Field(name = "dtDoc"),
    @Field(name = "dtES"),
    @Field(name = "vlDoc"),
    @Field(name = "vlIcms"),
    @Field(name = "codInf"),
    @Field(name = "vlPis"),
    @Field(name = "vlCofins"),
    
    @Field(name = "regC501List"),
    @Field(name = "regC505List"),
    @Field(name = "regC509List")
})
@Getter
@Setter
public class RegC500 {

    private String codPart;
    private DocumentoFiscal codMod;
    private SituacaoDocumento codSit;
    private String ser;
    private String sub;
    private Integer numDoc;
    private LocalDate dtDoc;
    private LocalDate dtES;
    private Double vlDoc;
    private Double vlIcms;
    private String codInf;
    private Double vlPis;
    private Double vlCofins;

    private List<RegC501> regC501List;
    private List<RegC505> regC505List;
    private List<RegC509> regC509List;
}
