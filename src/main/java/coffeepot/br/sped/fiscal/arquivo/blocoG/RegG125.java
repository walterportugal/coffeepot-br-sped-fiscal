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


import java.util.List;

import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.bean.wr.types.AccessorType;
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Mauricio R. Morais
 */
@Record(accessorType = AccessorType.PROPERTY, fields = {
    @Field(name = "reg", id = true, constantValue="G125"),
	@Field(name = "codIndBem"),
	@Field(name = "dtMov"),
	@Field(name = "tipoMov"),
	@Field(name = "vlImobIcmsOp"),
	@Field(name = "vlImobIcmsSt"),
	@Field(name = "vlImobIcmsFrt"),
	@Field(name = "vlImobIcmsDif"),
	@Field(name = "numParc"),
	@Field(name = "vlParcPass"),
        //
	@Field(name = "regG126List"),
	@Field(name = "regG130List")
})
@Getter
@Setter
public class RegG125{
	private String codIndBem;
	private LocalDate dtMov;
	private TipoMovimentacaoBem tipoMov;
	private Double vlImobIcmsOp;
	private Double vlImobIcmsSt;
	private Double vlImobIcmsFrt;
	private Double vlImobIcmsDif;
	private Integer numParc;
	private Double vlParcPass;
        //
	private List<RegG126> regG126List;
	private List<RegG130> regG130List;
        
        public enum TipoMovimentacaoBem implements EnumCodificado {

        SI("SI","Saldo inicial de bens imobilizados"),
        IM("IM","Imobilização de bem individual"),
        IA("IA","Imobilização em Andamento - Componente"),
        CI("CI","Conclusão de Imobilização em Andamento – Bem Resultante"),
        MC("MC","Imobilização oriunda do Ativo Circulante"),
        BA("BA","Baixa do bem - Fim do período de apropriação"),
        AT("AT","Alienação ou Transferência"),
        PE("PE","Perecimento, Extravio ou Deterioração"),
        OT("OT","Outras Saídas do Imobilizado");

        private final String codigo;
        private final String descricao;

        private TipoMovimentacaoBem(String codigo, String descricao) {
            this.codigo = codigo;
            this.descricao = descricao;
        }

        @Override
        public String getCodigo() {
            return String.valueOf(codigo);
        }

        public String getDescricao() {
            return descricao;
        }
        

    }
	
}
