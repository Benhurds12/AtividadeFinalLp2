package provafinal.br.ufrn.imd.modelecontrole;

import java.util.HashMap;
import java.util.Map;

import provafinal.br.ufrn.imd.excecao.FraseVaziaException;

public class ContaPalavras {
    public void checarTexto(String txt) throws FraseVaziaException {
        if (txt.trim().isEmpty()) {
            throw new FraseVaziaException();
        }
    }

    public Map<String, Integer>  contarPalavrasTexto(String txt) throws FraseVaziaException {
        checarTexto(txt);
        String[] palavras = txt.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        Map<String, Integer> contagem = new HashMap<>();
        for (String palavra : palavras) {
            if (contagem.containsKey(palavra)) {
                contagem.put(palavra, contagem.get(palavra) + 1);
            } else {
                contagem.put(palavra, 1);
            }
        }
        return contagem;
    }
}

