package jogos;
import java.util.concurrent.ThreadLocalRandom;
public class Palavras {

    private String[] palavrasSecretas;
    private String palavraSelecionada;

    public Palavras() {
        this.palavrasSecretas = new String[]{
                "alegre", "amigável", "belo", "brilhante", "calmo", "carinhoso", "charmoso", "cheio", "colorido",
                "compreensivo", "confiável", "corajoso", "criativo", "delicado", "determinado", "doce", "educado",
                "eficaz", "elegante", "encantador", "energético", "entusiástico", "esperto", "firme", "flexível",
                "forte", "gentil", "gracioso", "grato", "honesto", "humilde", "inteligente", "interessante",
                "inventivo", "irresistível", "leal", "lindo", "maduro", "otimista", "paciente", "poderoso", "rápido",
                "reconhecido", "sábio", "sincero", "sofisticado", "talentoso", "valente", "verdadeiro", "vibrante",
                "virtuoso", "vivo", "amável", "atencioso", "bravo", "caridoso", "comunicativo", "compassivo", "cooperação",
                "decidido", "dedicado", "divertido", "determinado", "elogiável", "empolgado", "energizado", "espontâneo",
                "estimulante", "extraordinário", "fascinante", "flexível", "generoso", "harmonioso", "inovador",
                "inspirador", "intuitivo", "jovial", "liberal", "motivado", "notável", "otimista", "poderoso", "refinado",
                "respeitável", "solidário", "tolerante", "visionário", "vivaz", "zeloso", "brilhante", "carismático",
                "carinhoso", "cheio de vida", "corajoso", "criativo", "decisivo", "efervescente", "eloquente", "equilibrado",
                "excepcional", "generoso", "inspirado", "irresistível", "magnífico", "paixonado", "respeitoso", "sensato",
                "talentoso", "vibrante"
        };
        this.palavraSelecionada = escolherAleatoriamente(palavrasSecretas);
    }

    public static String escolherAleatoriamente(String[] vetor) {
        if (vetor.length == 0) {
            throw new IllegalArgumentException("O vetor está vazio.");
        }

        int indiceAleatorio = ThreadLocalRandom.current().nextInt(vetor.length);

        return vetor[indiceAleatorio];
    }

    public String getPalavraSelecionada() {
        return palavraSelecionada;
    }
}
