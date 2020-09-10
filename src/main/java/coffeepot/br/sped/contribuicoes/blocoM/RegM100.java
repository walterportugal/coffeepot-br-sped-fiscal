package coffeepot.br.sped.contribuicoes.blocoM;

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
import coffeepot.br.sped.contribuicoes.tipos.IndicadorCreditoOriundo;
import coffeepot.br.sped.contribuicoes.tipos.IndicadorUtilizacaoCredito;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegM100.
 *
 * <p>
 * Crédito de PIS/PASEP Relativo ao Período.
 * </p>
 *
 * <p>
 * History:<br><br>
 *      - walter - Sep 10, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "M100"),
    @Field(name = "codCred", maxLength = 3),
    @Field(name = "indCredOri"),
    @Field(name = "vlBcPis"),
    @Field(name = "aliqPis"),
    @Field(name = "quantBcPis"),
    @Field(name = "aliqPisQuant"),
    @Field(name = "vlCred"),
    @Field(name = "vlAjusAcres"),
    @Field(name = "vlAjusReduc"),
    @Field(name = "vlCredDif"),
    @Field(name = "vlCredDisp"),
    @Field(name = "indDescCred"),
    @Field(name = "vlCredDesc"),
    @Field(name = "sldCred"),
    @Field(name = "regM105List"),
    @Field(name = "regM110List")
})
@Getter
@Setter
public class RegM100 {
    
    private String codCred;
    private IndicadorCreditoOriundo indCredOri;
    private Double vlBcPis;
    private Double aliqPis;
    private Double quantBcPis;
    private Double aliqPisQuant;
    private Double vlCred;
    private Double vlAjusAcres;
    private Double vlAjusReduc;
    private Double vlCredDif;
    private Double vlCredDisp;
    private IndicadorUtilizacaoCredito indDescCred;
    private Double vlCredDesc;
    private Double sldCred;
    
    private List<RegM105> regM105List;
    private List<RegM110> regM110List;
    
    

}
