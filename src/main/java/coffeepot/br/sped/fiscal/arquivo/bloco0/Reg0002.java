package coffeepot.br.sped.fiscal.arquivo.bloco0;

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
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Class: Reg0002.
 *
 * <p>
 * Classificação do estabelecimento industrial ou equiparado a industrial.
 * </p>
 *
 * <p>
 * History:<br><br>
 * - walter - Jul 13, 2020: Criação do Arquivo<br>
 * <p>
 *
 * @author walter
 * @since 1.0.0-SOFTLAND.1
 *
 */
@Record(fields = {
    @Field(name = "reg", id = true, constantValue = "0002"),
    @Field(name = "classEstabInd")
})
@Getter
@Setter
@NoArgsConstructor
public class Reg0002 {

    private ClassificacaoEstabIndustrial classEstabInd;

    public enum ClassificacaoEstabIndustrial implements EnumCodificado {
        INDUSTRIAL_TRANSFORMACAO("00"),
        INDUSTRIAL_BENEFICIAMENTO("01"),
        INDUSTRIAL_MONTAGEM("02"),
        INDUSTRIAL_ACOND_REACONDICIONAMENTO("03"),
        INDUSTRIAL_RENOVACAO_RECONDICIONAMENTO("04"),
        EQUIPARADO_IND_POR_OPCAO("05"),
        EQUIPARADO_IND_IMP_DIRETA("06"),
        EQUIPARADO_IND_POR_LEI_ESPECIFICA("07"),
        EQUIPARADO_IND_NAOENQUADRADO050607("08"),
        OUTROS("09");

        private final String codigo;

        private ClassificacaoEstabIndustrial(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

        public static ClassificacaoEstabIndustrial getByCodigo(String codigo)
                throws Exception {
            List<ClassificacaoEstabIndustrial> classificacaoEstabIndustrialList = Arrays.asList(
                    ClassificacaoEstabIndustrial.values());

            try {
                return classificacaoEstabIndustrialList.stream().filter(
                        c -> c.getCodigo().equals(codigo)).findFirst().get();
            } catch (NoSuchElementException ex) {
                throw new Exception(String.format(
                        "Código de Classificação Inválido: %s", codigo));
            }
        }

    }
}
