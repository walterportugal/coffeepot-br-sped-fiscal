/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoE;

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


import java.util.List;

import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.bean.wr.types.AccessorType;
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(accessorType = AccessorType.PROPERTY, fields = {
    @Field(name = "reg", id = true, constantValue="E310"),
	@Field(name = "indMovFcpDifal"),
	@Field(name = "vlSldCredAntDifal"),
	@Field(name = "vlTotDebitosDifal"),
	@Field(name = "vlOutDebDifal"),
	@Field(name = "vlTotCreditosDifal"),
	@Field(name = "vlOutCredDifal"),
	@Field(name = "vlSldDevAntDifal"),
	@Field(name = "vlDeducoesDifal"),
	@Field(name = "vlRecolDifal"),
	@Field(name = "vlSldCredTransportarDifal"),
	@Field(name = "debEspDifal"),
	@Field(name = "vlSldCredAntFcp"),
	@Field(name = "vlTotDebFcp"),
	@Field(name = "vlOutDebFcp"),
	@Field(name = "vlTotCredFcp"),
	@Field(name = "vlOutCredFcp"),
	@Field(name = "vlSldDevAntFcp"),
	@Field(name = "vlDeducoesFcp"),
	@Field(name = "vlRecolFcp"),
	@Field(name = "vlSldCredTransportarFcp"),
	@Field(name = "debEspFcp"),
        //
	@Field(name = "regE311List"),
	@Field(name = "regE316List")
})
@Getter
@Setter
public class RegE310{
	private IndicadorMovimentoFcpDifal indMovFcpDifal;
	private Double vlSldCredAntDifal;
	private Double vlTotDebitosDifal;
	private Double vlOutDebDifal;
	private Double vlTotCreditosDifal ;
	private Double vlOutCredDifal;
	private Double vlSldDevAntDifal;
	private Double vlDeducoesDifal;
	private Double vlRecolDifal;
	private Double vlSldCredTransportarDifal;
	private Double debEspDifal;
	private Double vlSldCredAntFcp;
	private Double vlTotDebFcp;
	private Double vlOutDebFcp;
	private Double vlTotCredFcp;
	private Double vlOutCredFcp;
	private Double vlSldDevAntFcp;
	private Double vlDeducoesFcp;
	private Double vlRecolFcp;
	private Double vlSldCredTransportarFcp;
	private Double debEspFcp;
        //
	private List<RegE311> regE311List;
	private List<RegE316> regE316List;
	
        public enum IndicadorMovimentoFcpDifal implements EnumCodificado {

        SEM_OPERACAO(0),
        COM_OPERACAO(1);

        private final int codigo;

        private IndicadorMovimentoFcpDifal(int codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return String.valueOf(codigo);
        }

        public int getCodigoAsInt() {
            return codigo;
        }
    }
}
