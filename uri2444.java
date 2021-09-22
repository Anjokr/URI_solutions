import java.util.Scanner;
// EP2 URI2444
// Hyun Min Cho \ nUSP: 11207992
public class uri2444 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        int V = scan.nextInt();// volume inicial
        int T = scan.nextInt();// numero de modificacoes de volume

        scan.nextLine();

        String [] linha = scan.nextLine().split(" ");
        int [] mods = new int[T];

        for(int i = 0; i < T; i++){
            
            mods[i] = Integer.parseInt(linha[i]);
        }

        resposta(mods, V);
        scan.close();
    }

    public static void resposta(int [] mods, int V){//calcula volume
        int vfinal = V;

        for(int i = 0; i < mods.length; i++){
            vfinal = vfinal + mods[i];
            if(vfinal > 100) vfinal = 100;
            if(vfinal < 0) vfinal = 0;
        }
    
        System.out.println(vfinal);
    }
}




