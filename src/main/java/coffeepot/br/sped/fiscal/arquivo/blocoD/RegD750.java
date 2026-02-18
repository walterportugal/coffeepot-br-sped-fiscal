package coffeepot.br.sped.fiscal.arquivo.blocoD;

/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 - 2026 Jeandeson O. Merelis
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
 * Class: RegD750.
 *
 * <p>
 * REGISTRO D750: ESCRITURAÇÃO CONSOLIDADA DA NOTA FISCAL FATURA ELETRÔNICA DE SERVIÇOS DE COMUNICAÇÃO - NFCom (CÓDIGO 62)
 *
 * <p>
 * History:<br><br>
 *      - Walter L. Portugal - 12 de fev. de 2026: Criação do Arquivo<br>
 * </p>
 *
 * @author Walter L. Portugal
 * @since 2.1.0
 *
 */

@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "D750"),
    @Field(name = "codMod"),
    @Field(name = "ser"),
    @Field(name = "dtDoc"),
    @Field(name = "qtdCons"),
    @Field(name = "indPrepago"),
    @Field(name = "vlDoc"),
    @Field(name = "vlServ"),
    @Field(name = "vlServNt"),
    @Field(name = "vlTerc"),
    @Field(name = "vlDesc"),
    @Field(name = "vlDa"),
    @Field(name = "vlBcIcms"),
    @Field(name = "vlIcms"),
    @Field(name = "vlPis"),
    @Field(name = "vlCofins"),
    @Field(name = "ded"), // válido a partir de 01/2025
    // --- detalhes (filhos) ---
    @Field(name = "regD760List")
})
@Getter
@Setter
public class RegD750 {

    private DocumentoFiscal codMod;  // 62
    private String ser;
    private LocalDate dtDoc;         // data de referência da consolidação
    private Integer qtdCons;         // quantidade de documentos consolidados
    private String indPrepago;       // indicador de pré-pago
    private Double vlDoc;
    private Double vlServ;
    private Double vlServNt;
    private Double vlTerc;
    private Double vlDesc;
    private Double vlDa;
    private Double vlBcIcms;
    private Double vlIcms;
    private Double vlPis;            // enviar vazio na EFD-ICMS/IPI (se aplicável)
    private Double vlCofins;         // idem
    private Double ded;              // deduções (vigente a partir de 2025)

    // --- detalhes (filhos) ---
    private List<RegD760> regD760List;
}

