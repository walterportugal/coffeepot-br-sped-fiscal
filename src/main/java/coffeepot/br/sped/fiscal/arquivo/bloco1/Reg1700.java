/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco1;

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
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "1700"),
    @Field(name = "codDisp"),
    @Field(name = "codMod"),
    @Field(name = "ser"),
    @Field(name = "sub"),
    @Field(name = "numDocIni"),
    @Field(name = "numDocFin"),
    @Field(name = "numAut"),
    //--- detalhes ---
    @Field(name = "reg1710List")
})
@Getter
@Setter
public class Reg1700 {

    private CodigoDispositivoAutorizado codDisp;
    private DocumentoFiscal codMod;
    private String ser;
    private String sub;
    private Long numDocIni;
    private Long numDocFin;
    private String numAut;
    //--- detalhes ---
    private List<Reg1710> reg1710List;

    public enum CodigoDispositivoAutorizado implements EnumCodificado {

        FORMULARIO_SEGURANCA_IMPRESSOR_AUTONOMO("00"),
        FS_DA_IMPRESSAO_DANFE("01"),
        FORMULARIO_SEGURANCA_NFE("02"),
        FORMULARIO_CONTINUO("03"),
        BLOCOS("04"),
        JOGOS_SOLTOS("05");

        private final String codigo;

        private CodigoDispositivoAutorizado(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }
    }
    
}
