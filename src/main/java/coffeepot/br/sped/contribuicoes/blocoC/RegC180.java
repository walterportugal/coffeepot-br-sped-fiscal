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
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegC180.
 *
 * <p>
 * Consolidação de Notas Fiscais Eletrônicas Emitidas Pela Pessoa Jurídica (Códigos 55 e 65) – Operações de Vendas.
 * </p>
 *
 * <p>
 * History:<br><br>
 * - walter - Sep 3, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "C180"),
    @Field(name = "codMod"),
    @Field(name = "dtDocIni"),
    @Field(name = "dtDocFin"),
    @Field(name = "codItem"),
    @Field(name = "codNcm", maxLength = 8),
    @Field(name = "exIpi", maxLength = 3),
    @Field(name = "vlTotItem"),
    
    @Field(name = "regC181List"),
    @Field(name = "regC185List"),
    @Field(name = "regC188List")
})
@Getter
@Setter
public class RegC180 {

    private DocumentoFiscal codMod;
    private LocalDate dtDocIni;
    private LocalDate dtDocFin;
    private String codItem;
    private String codNcm;
    private String exIpi;
    private Double vlTotItem;

    private List<RegC181> regC181List;
    private List<RegC185> regC185List;
    private List<RegC188> regC188List;

}
