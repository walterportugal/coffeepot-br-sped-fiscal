/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoG;

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
import coffeepot.bean.wr.types.AccessorType;
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import coffeepot.br.sped.fiscal.tipos.EmissaoDocumento;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Mauricio R. Morais
 */
@Record(accessorType = AccessorType.PROPERTY, fields = {
    @Field(name = "reg", id = true, constantValue="G130"),
	@Field(name = "indEmit"),
	@Field(name = "codPart"),
	@Field(name = "codMod"),
	@Field(name = "serie"),
	@Field(name = "numDoc"),
	@Field(name = "chvNfeCte"),
	@Field(name = "dtDoc"),
        //
	@Field(name = "regG140List")
})
@Getter
@Setter
public class RegG130{
	private EmissaoDocumento indEmit;
	private String codPart;
	private DocumentoFiscal codMod;
	private String serie;
	private String numDoc;
	private String chvNfeCte;
	private LocalDate dtDoc;
        //
	private List<RegG140> regG140List;
	
}