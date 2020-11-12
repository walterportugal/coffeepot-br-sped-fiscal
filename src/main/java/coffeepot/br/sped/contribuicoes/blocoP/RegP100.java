package coffeepot.br.sped.contribuicoes.blocoP;

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
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Class: RegP100.
 *
 * <p>
 * Contribuição Previdenciária sobre a Receita Bruta.
 * </p>
 *
 * <p>
 * History:<br><br>
 *      - walter - Sep 11, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "P100"),
    @Field(name = "dtIni"),
    @Field(name = "dtFin"),
    @Field(name = "vlRecTotEst"),
    @Field(name = "codAtivEcon", maxLength = 8),
    @Field(name = "vlRecAtivEstab"),
    @Field(name = "vlExc"),
    @Field(name = "vlBcCont"),
    @Field(name = "aliqCont"),
    @Field(name = "vlContApu"),
    @Field(name = "codCta"),
    @Field(name = "descCompl"),
    @Field(name = "regP110List"),
    @Field(name = "regP199List")
})
@Getter
@Setter
public class RegP100 {
    
    private String codigoEmpresa;//Campo não existente no SPED. Utilizado para mapeamento das informações por empresa.
    private LocalDate dtIni;
    private LocalDate dtFin;
    private Double vlRecTotEst;
    private String codAtivEcon;
    private Double vlRecAtivEstab;
    private Double vlExc;
    private Double vlBcCont;
    private Double aliqCont;
    private Double vlContApu;
    private String codCta;
    private String descCompl;

    private List<RegP110> regP110List;
    private List<RegP199> regP199List;
    
}
