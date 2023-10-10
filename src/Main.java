import java.text.Normalizer;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavraSecreta = "JAVÁ";
        char[] vetorPalavraSecreta = palavraSecreta.toCharArray();
        char[] secredo = new char[vetorPalavraSecreta.length];
        Arrays.fill(secredo,'*');
        boolean pararJogo = false;
        int chances = 6;

        while (!pararJogo){

            System.out.println(secredo);
            System.out.println(chances);
            char chute = sc.next().charAt(0);
            boolean letraEncontrada =false;

            for (int i =0;i<secredo.length;i++){
                if(Character.toUpperCase(removerAcentos(chute)) ==
                  Character.toUpperCase(removerAcentos(vetorPalavraSecreta[i]))){
                    secredo[i] = vetorPalavraSecreta[i];
                    letraEncontrada =true;
                }

            }
            if(letraEncontrada == false){chances--;}

            if(chances==0){pararJogo=true;
                System.out.println("vc perdeu");
            }




    }
        System.out.println(vetorPalavraSecreta);
        sc.close();
    }
    static char removerAcentos(char c) {
        String comAcento = Character.toString(c);
        String semAcento = Normalizer.normalize(comAcento, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        return semAcento.charAt(0);
    }
}