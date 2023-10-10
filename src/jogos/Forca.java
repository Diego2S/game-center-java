package jogos;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.Scanner;

public class Forca {
    
    private Palavras palavras = new Palavras();
    private String palavraSecreta = palavras.getPalavraSelecionada();
    char[] palavraSecretaVetor = this.palavraSecreta.toCharArray();
    char[] secredo = new char[palavraSecretaVetor.length];
    boolean pararJogo = false;
    int chances = 6;
    public void jogarForca() {
        Scanner sc = new Scanner(System.in);
        Arrays.fill(secredo, '*');

        while (!pararJogo) {


            System.out.printf("%s      %d chances",new String(secredo),chances);
            System.out.println();
            char chute = sc.next().charAt(0);

            boolean letraEncontrada = encontarLetra(chute);

            vitoria(secredo);
            derrota(letraEncontrada);

        }
        System.out.println(palavraSecretaVetor);
        sc.close();
    }

    public char removerAcentos(char c) {
        String comAcento = Character.toString(c);
        String semAcento = Normalizer.normalize(comAcento, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        return semAcento.charAt(0);
    }

    public boolean encontarLetra(char chute){
        boolean letraEncontrada = false;

        for (int i = 0; i < secredo.length; i++) {
            if (Character.toUpperCase(removerAcentos(chute)) ==
                    Character.toUpperCase(removerAcentos(palavraSecretaVetor[i]))) {
                secredo[i] = palavraSecretaVetor[i];
                letraEncontrada = true;
            }
        }
    return letraEncontrada;
    }

    public void vitoria(char[] secredo){
        int falta= 0;
        for(char c:secredo){
            if(c == '*'){
                falta++;
            }
        }
        if (falta == 0){
            System.out.println("vc ganhou!!");
            pararJogo=true;
        }


    }
    public void derrota(boolean letraEncontrada){
        if (letraEncontrada == false) {
            chances--;
        }
        if (chances == 0) {
            pararJogo = true;
            System.out.println("vc perdeu");
        }

    }

}
