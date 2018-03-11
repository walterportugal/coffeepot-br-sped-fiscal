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
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Mauricio R. Morais
 */
@Record(accessorType = AccessorType.PROPERTY, fields = {
    @Field(name = "reg", id = true, constantValue="G126"),
	@Field(name = "dtIni"),
	@Field(name = "dtFim"),
	@Field(name = "numParc"),
	@Field(name = "vlParcPass"),
	@Field(name = "vlTribOc"),
	@Field(name = "vlTotal"),
	@Field(name = "indPerSai"),
	@Field(name = "vlParcAprop")
})
@Getter
@Setter
public class RegG126{
	private LocalDate dtIni;
	private LocalDate dtFim;
	private Integer numParc;
	private Double vlParcPass;
	private Double vlTribOc;
	private Double vlTotal;
	private Double indPerSai;
	private Double vlParcAprop;
	
}
