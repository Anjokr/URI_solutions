import java.util.Scanner;

//Hyun Min Cho - nUSP: 11207992
public class uri2450 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();//linha
        int M = scan.nextInt();//coluna

        scan.nextLine();

        int [][] matriz = new int[N][M];
        int i = 0;

        while(scan.hasNextLine()){
            
            if(i<N){
                String[] linha = scan.nextLine().split(" ");
                for(int j = 0; j < M; j++){
                    matriz[i][j] = Integer.parseInt(linha[j]);
                }
                i++;
            }
            else break;

        }
 
        resposta(matriz, N, M);
        scan.close();
    }
    
    public static void resposta( int [][] matriz, int lin, int col){
        int i;
        int j;
        int limite = -1;//limite esquerda da coluna quando aparece numero diferente de 0

        for( i = 0; i < lin; i++){//linha

            boolean linhaZero = true;
            for( j = 0; j < col; j++){//coluna

                if(matriz[i][j] != 0){//encontrou numero diferente de 0

                    if(linhaZero){//primeiro numero diferente de 0 encontrado na linha
                        if( j > limite){//se estiver em coluna valido
                            limite = j;
                            linhaZero = false;//linha tem numero diferente de 0;
                            continue; 
                        }
                        else{
                            System.out.println("N");
                            return;
                        }
                    }
                    else break;
                }
            }

            if(linhaZero) {
                checkZeros(matriz, i, lin, col);
                return;
            }
        }

        System.out.println("S");
    }

    public static void checkZeros(int [][] matriz, int i, int lin, int col){//resto das linhas precisam ser preenchidos por zero
        for(int k = i; k < lin; k++){
            for(int j = 0; j < col; j++){
                if(matriz[k][j] != 0){
                    System.out.println("N");
                    return;
                } 
            }
        }
        System.out.println("S");
    }
    
}