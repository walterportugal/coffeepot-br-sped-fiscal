package coffeepot.br.sped.contribuicoes.blocoD;

import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.br.sped.fiscal.arquivo.blocoD.RegD001;
import coffeepot.br.sped.fiscal.arquivo.blocoD.RegD990;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

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
/**
 * Class: BlocoD.
 *
 * <p>
 * Documentos Fiscais – II - Serviços (ICMS).
 *
 * Este registro deve ser gerado para abertura do Bloco D e indica se há informações sobre prestações ou contratações de
 * serviços de comunicação, transporte interestadual e intermunicipal, com o devido suporte do correspondente documento
 * fiscal.
 * </p>
 *
 * <p>
 * History:<br><br>
 * - walter - Sep 2, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "regD001"),
    @Field(name = "regD010List"),
    @Field(name = "regD990")
})
@Getter
@Setter
public class BlocoD {
    
    private RegD001 regD001;
    private List<RegD010> regD010List;
    private RegD990 regD990;

}
