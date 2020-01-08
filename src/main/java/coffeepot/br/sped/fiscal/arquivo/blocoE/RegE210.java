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


import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.bean.wr.types.AccessorType;
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(accessorType = AccessorType.PROPERTY, fields = {
    @Field(name = "reg", id = true, constantValue="E210"),
	@Field(name = "indMov"),
	@Field(name = "vlSldCredAntSt"),
	@Field(name = "vlDevolSt"),
	@Field(name = "vlRessarcSt"),
	@Field(name = "vlOutCredSt"),
	@Field(name = "vlAjCreditosSt"),
	@Field(name = "vlRecancaoSt"),
	@Field(name = "vlOutDebSt"),
	@Field(name = "vlAjDebitosSt"),
	@Field(name = "vlSldDevAntSt"),
	@Field(name = "vlDeducoesSt"),
	@Field(name = "vlIIcmsRecolSt"),
	@Field(name = "vlSldCredStTransportar"),
	@Field(name = "debEspSt"),
        //
	@Field(name = "regE220List")
})
@Getter
@Setter
public class RegE210{
	private IndicadorMovimentoSt indMov;
	private Double vlSldCredAntSt;
	private Double vlDevolSt;
	private Double vlRessarcSt;
	private Double vlOutCredSt;
	private Double vlAjCreditosSt;
	private Double vlRetencaoSt;
	private Double vlOutDebSt;
	private Double vlAjDebitosSt;
	private Double vlSldDevAntSt;
	private Double vlDeducoesSt;
	private Double vlIIcmsRecolSt;
	private Double vlSldCredStTransportar;
	private Double vlSldCredorAnt;
        private Double debEspSt;
        //
	private List<RegE220> regE220List;
	
        public enum IndicadorMovimentoSt implements EnumCodificado {

        SEM_OPERACAO_ST(0),
        COM_OPERACAO_ST(1);

        private final int codigo;

        private IndicadorMovimentoSt(int codigo) {
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
