import java.util.Scanner;

public class LeetCodeLCP1 {
    public static void main(String[] args) {
        int[] guess = input();
        int[] answer = input();
        int answerN = game(guess,answer);
        System.out.println(answerN);

    }

    public static int game(int[] guess, int[] answer) {
        int numSize=0;
        for (int i = 0; i < 3; i++) {
            if ( guess[i]==answer[i]){
                numSize++;
            }
        }
        return numSize;
    }

    private static int[] input() {
        int[] array = new int[3];
        Scanner cin= new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {

            int guessNumber = cin.nextInt();
            array[i] = guessNumber;
        }
        return array;
    }
}
