import java.util.Scanner;

public class uri1551 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        int linhas = scan.nextInt();
        scan.nextLine();
        
        for(int i = 0; i < linhas; i++){
            String frase = scan.nextLine();
            char [] array = frase.toCharArray();
            resposta(array);
        }
        scan.close();
    }

    public static void resposta(char[] array){
        int contador = 0;
        char [] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < alfabeto.length; j++){

                if(array[i] == alfabeto[j]){
                    contador++;
                    alfabeto[j] = '#';
                    continue;
                }
                
            }
        }

        if(contador == 26) System.out.println("frase completa");
        else if(contador >= 13) System.out.println("frase quase completa");
        else System.out.println("frase mal elaborada");
    }
}
