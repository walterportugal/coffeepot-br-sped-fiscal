package coffeepot.br.sped.contribuicoes.arquivo;

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
import coffeepot.br.sped.commons.bloco9.Bloco9;
import coffeepot.br.sped.contribuicoes.bloco0.Bloco0;
import coffeepot.br.sped.contribuicoes.bloco1.Bloco1;
import coffeepot.br.sped.contribuicoes.blocoA.BlocoA;
import coffeepot.br.sped.contribuicoes.blocoC.BlocoC;
import coffeepot.br.sped.contribuicoes.blocoD.BlocoD;
import coffeepot.br.sped.contribuicoes.blocoF.BlocoF;
import coffeepot.br.sped.contribuicoes.blocoM.BlocoM;
import coffeepot.br.sped.contribuicoes.blocoP.BlocoP;

/**
 * Class: Estrutura.
 *
 * <p>
 * Estrutura de montagem de Blocos do SPED Contribuições.
 * </p>
 *
 * <p>
 * History:<br><br>
 *      - walter - Sep 2, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 2.0.0
 *
 */
@Record(fields = {
    @Field(name = "bloco0"),
    @Field(name = "blocoA"),
    @Field(name = "blocoC"),
    @Field(name = "blocoD"),
    @Field(name = "blocoF"),
    //@Field(name = "blocoI"),
    @Field(name = "blocoM"),
    @Field(name = "blocoP"),
    @Field(name = "bloco1"),
    @Field(name = "bloco9")
})
public class Estrutura {
    
    private Bloco0 bloco0;
    private BlocoA blocoA;
    private BlocoC blocoC;
    private BlocoD blocoD;
    private BlocoF blocoF;
    //private BlocoI blocoI;
    private BlocoM blocoM;
    private BlocoP blocoP;
    private Bloco1 bloco1;
    private Bloco9 bloco9;

    public Bloco0 getBloco0() {
        return bloco0;
    }

    public void setBloco0(Bloco0 bloco0) {
        this.bloco0 = bloco0;
    }

    public BlocoA getBlocoA() {
        return blocoA;
    }

    public void setBlocoA(BlocoA blocoA) {
        this.blocoA = blocoA;
    }

    public BlocoC getBlocoC() {
        return blocoC;
    }

    public void setBlocoC(BlocoC blocoC) {
        this.blocoC = blocoC;
    }

    public BlocoD getBlocoD() {
        return blocoD;
    }

    public void setBlocoD(BlocoD blocoD) {
        this.blocoD = blocoD;
    }

    public BlocoF getBlocoF() {
        return blocoF;
    }

    public void setBlocoF(BlocoF blocoF) {
        this.blocoF = blocoF;
    }

    public BlocoM getBlocoM() {
        return blocoM;
    }

    public void setBlocoM(BlocoM blocoM) {
        this.blocoM = blocoM;
    }

    public BlocoP getBlocoP() {
        return blocoP;
    }

    public void setBlocoP(BlocoP blocoP) {
        this.blocoP = blocoP;
    }

    public Bloco1 getBloco1() {
        return bloco1;
    }

    public void setBloco1(Bloco1 bloco1) {
        this.bloco1 = bloco1;
    }

    public Bloco9 getBloco9() {
        return bloco9;
    }

    public void setBloco9(Bloco9 bloco9) {
        this.bloco9 = bloco9;
    }

}
