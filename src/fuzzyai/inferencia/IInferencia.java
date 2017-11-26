package fuzzyai.inferencia;

import fuzzyai.ModeloFuzzy;
import java.util.List;

/**
 * Interface que deve ser implementada por qualquer classe que queira realizar a etapa de inferencia
 */
public interface IInferencia {
    /**
     * Realiza a etapa de inferencia da logica fuzzy
     * @param varaiveisFuzzyficadas Lista com as variaveis fuzzyficadas
     * @param modeloFuzzy Modelo fuzzy com todas as informações contidas no JSON de configuração
     * @throws Exception Toda exceção deve ser tratada pelo chamador da função
     */
    public void inferir(List<VariavelFuzzyficada> varaiveisFuzzyficadas, ModeloFuzzy modeloFuzzy) throws Exception;
}
