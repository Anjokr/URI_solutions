import java.util.Scanner;
import java.util.*;
// EP2 URI2410
// Hyun Min Cho \ nUSP: 11207992
public class uri2410{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int quantia = scan.nextInt();//quantidade de numeros marcados na lista de presenca
        scan.nextLine();

        int [] numeros = new int [1000001];//array para verificar se aluno ja tem presenca
        Arrays.fill(numeros,-1);

        int presenca = 0;

        for(int i = 0; i < quantia; i++){
            int num = scan.nextInt();
            if(numeros[num] == -1){
                presenca++;
                numeros[num] = num;  
            }
            scan.nextLine();
        }

        System.out.println(presenca);
        scan.close();
    }
}
