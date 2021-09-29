import java.util.Scanner;

public class uri1168 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numbers = scan.nextInt();
        scan.nextLine();

        while (numbers > 0){
            numbers--;
            String line = scan.nextLine();
            int [] values = new int [line.length()];
            for(int i = 0; i < line.length(); i++){
                values[i] = Character.getNumericValue(line.charAt(i));
            }
            calculator(values);

        }
        scan.close();
    }

    static void calculator(int value[]){ // calculate how many sticks the value needs
        int answer = 0;
        int [] sticks = {2, 5, 5, 4, 5, 6, 3, 7, 6, 6};
        for(int i = 0 ; i < value.length; i++){

            if(value[i] - 1 < 0){ //value equals 0
                answer += sticks[ 9 ];
                continue;
            }
            answer += sticks[ value[i] - 1 ];
        }
        System.out.println(answer + " leds");
    }
}
