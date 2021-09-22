import java.util.Scanner;
import java.math.*;
// EP2 URI2397
// Hyun Min Cho \ nUSP: 11207992
public class uri2397 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String [] linha = scan.nextLine().split(" ");
        int l1 = Integer.parseInt(linha[0]);
        int l2 = Integer.parseInt(linha[1]);
        int l3 = Integer.parseInt(linha[2]);

        if(ehTriangulo(l1,l2,l3)){ // aplica lei dos cossenos para achar os angulos dos triangulos
            double cosA;
            double cosB;
            double cosC;
            cosA = ( - Math.pow(l3,2) + Math.pow(l1,2) + Math.pow(l2,2) ) / ( 2*(l1 * l2) );
            cosB = ( - Math.pow(l2,2) + Math.pow(l1,2) + Math.pow(l3,2) ) / ( 2*(l1 * l3) );
            cosC = ( - Math.pow(l1,2) + Math.pow(l2,2) + Math.pow(l3,2) ) / ( 2*(l2 * l3) );

            //angulos do triangulo
            double A = Math.acos(cosA) * (180/Math.PI);
            double B = Math.acos(cosB) * (180/Math.PI);
            double C = Math.acos(cosC) * (180/Math.PI);

            if(A < 90 && B < 90 && C < 90) System.out.println("a");
            else if (A == 90 || B == 90 || C == 90) System.out.println("r");
            else System.out.println("o");
        }

        else System.out.println("n");
        scan.close();    
    }

    public static boolean ehTriangulo(int l1, int l2, int l3){//checa se da para montar um triangulo com os lados
        if(Math.abs(l2 - l3) < l1 && l1 < l2 + l3 && Math.abs(l2 - l3) < l2 + l3 ){}
        else return false;
        if(Math.abs(l1 - l3) < l2 && l2 < l1 + l3 && Math.abs(l1 - l3) < l1 + l3 ){}
        else return false;
        if(Math.abs(l1 - l2) < l3 && l3 < l1 + l2 && Math.abs(l1 - l2) < l1 + l2 ){}
        else return false;

        return true;

    }
}
