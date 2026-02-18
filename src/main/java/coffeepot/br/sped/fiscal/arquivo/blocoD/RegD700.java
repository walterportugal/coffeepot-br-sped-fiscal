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
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import coffeepot.br.sped.fiscal.tipos.EmissaoDocumento;
import coffeepot.br.sped.fiscal.tipos.Operacao;
import coffeepot.br.sped.fiscal.tipos.SituacaoDocumento;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegD700.
 *
 * <p>
 * NOTA FISCAL FATURA COMUNICAÇÃO – NFCom (CÓDIGO 62). ELETRÔNICA DE SERVIÇOS DE COMUNICAÇÃO – NFCom (CÓDIGO 62)
 * </p>
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
    @Field(name = "reg", id = true, constantValue = "D700"),
    @Field(name = "indOper"),
    @Field(name = "indEmit"),
    @Field(name = "codPart"),
    @Field(name = "codMod"),
    @Field(name = "codSit"),
    @Field(name = "ser"),
    @Field(name = "numDoc"),
    @Field(name = "dtDoc"),
    @Field(name = "dtES"),
    @Field(name = "vlDoc"),
    @Field(name = "vlDesc"),
    @Field(name = "vlServ"),
    @Field(name = "vlServNt"),
    @Field(name = "vlTerc"),
    @Field(name = "vlDa"),
    @Field(name = "vlBcIcms"),
    @Field(name = "vlIcms"),
    @Field(name = "codInf"),
    @Field(name = "vlPis"),
    @Field(name = "vlCofins"),
    @Field(name = "chvDocE", params = { DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY }),
    @Field(name = "finDocE"),
    @Field(name = "tipFat"),
    @Field(name = "codModDocRef"),
    @Field(name = "chvDocERef", params = { DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY }),
    @Field(name = "hashDocRef"),
    @Field(name = "serDocRef"),
    @Field(name = "numDocRef"),
    @Field(name = "mesDocRef"),
    @Field(name = "codMunDest"),
    @Field(name = "ded"), // válido a partir de 01/2025
    // --- detalhes (filhos) ---
    @Field(name = "regD730List"),
    @Field(name = "regD735List"),
    @Field(name = "regD737List")
})
@Getter
@Setter
public class RegD700 {

    private Operacao indOper;                // 0-Entrada / 1-Saída
    private EmissaoDocumento indEmit;        // 0-Emissão própria / 1-Terceiros
    private String codPart;                  // participante (0150)
    private DocumentoFiscal codMod;          // deve ser 62 (NFCom)
    private SituacaoDocumento codSit;        // situação do doc
    private String ser;
    private Long numDoc;
    private LocalDate dtDoc;
    private LocalDate dtES;                  // data da entrada/saída
    private Double vlDoc;
    private Double vlDesc;
    private Double vlServ;
    private Double vlServNt;
    private Double vlTerc;
    private Double vlDa;                     // despesas/acessórias
    private Double vlBcIcms;
    private Double vlIcms;
    private String codInf;                   // (0450)
    private Double vlPis;                    // enviar vazio na EFD-ICMS/IPI (se aplicável)
    private Double vlCofins;                 // idem
    private String chvDocE;                  // chave eletrônica NFCom
    private String finDocE;                  // finalidade do doc eletrônico
    private String tipFat;                   // tipo de fatura
    private DocumentoFiscal codModDocRef;    // modelo do documento referenciado
    private String chvDocERef;               // chave eletrônica referenciada
    private String hashDocRef;               // hash doc ref
    private String serDocRef;
    private Long numDocRef;
    private String mesDocRef;                // MMAAAA (conforme Guia)
    private Long codMunDest;                 // IBGE
    private Double ded;                      // deduções (vigente a partir de 2025)

    // --- detalhes (filhos) ---
    private List<RegD730> regD730List;
    private List<RegD735> regD735List;
    private List<RegD737> regD737List;
}