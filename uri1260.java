import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class uri1260{

    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        scan.nextLine();
        
        boolean conjunto = false;

        ArrayList<String> especies = new ArrayList<String>();

        int numConj = 0;
        while( scan.hasNextLine() ){
            String arvore = scan.nextLine();
            
            if( arvore.isEmpty() ) {// linha vazia
                if( conjunto == false ){
                    conjunto = true;
                }
                else {//fechou o conjunto
                    
                    resposta(especies, numConj, casos);
                    especies.clear();
                    numConj ++;
                }
            }

            else{
                especies.add(arvore);
            }

            if(numConj == casos) break;
        }

        scan.close();

    }

    public static void resposta(ArrayList<String> especies, int numConj, int casos){
        String[] species = especies.toArray(new String[especies.size()]);
        Arrays.sort(species);

        String arvore = species[0];
        int quantia = 0;

        for(int i = 0; i < species.length; i++){
            if( arvore.equals(species[i]) ){
                quantia++;
            }
            else{
                double porcentagem = quantia/species.length;
                System.out.printf("%s %.4f%n", species[i], porcentagem);
                quantia = 0;
                arvore = species[i-1];
            }
            
        }
        if(numConj != casos) System.out.println();

    }
}