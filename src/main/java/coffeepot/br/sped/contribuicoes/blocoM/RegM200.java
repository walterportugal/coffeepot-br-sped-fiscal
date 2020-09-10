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
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegM200.
 *
 * <p>
 * Consolidação da Contribuição para o PIS/Pasep do Período.
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
    @Field(name = "reg", id = true, constantValue = "M200"),
    @Field(name = "vlTotContNcPer"),
    @Field(name = "vlTotCredDesc"),
    @Field(name = "vlTotCredDescAnt"),
    @Field(name = "vlTotContNcDev"),
    @Field(name = "vlRetNc"),
    @Field(name = "vlOutDedNc"),
    @Field(name = "vlContNcRec"),
    @Field(name = "vlTotContCumPer"),
    @Field(name = "vlRetCum"),
    @Field(name = "vlOutDedCum"),
    @Field(name = "vlContCumRec"),
    @Field(name = "vlTotContRec"),
    @Field(name = "regM205List"),
    @Field(name = "regM210List")
})
@Getter
@Setter
public class RegM200 {
    
    private Double vlTotContNcPer;
    private Double vlTotCredDesc;
    private Double vlTotCredDescAnt;
    private Double vlTotContNcDev;
    private Double vlRetNc;
    private Double vlOutDedNc;
    private Double vlContNcRec;
    private Double vlTotContCumPer;
    private Double vlRetCum;
    private Double vlOutDedCum;
    private Double vlContCumRec;
    private Double vlTotContRec;
    
    private List<RegM205> regM205List;
    private List<RegM210> regM210List;

}
