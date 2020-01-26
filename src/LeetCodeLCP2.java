import java.util.Scanner;

public class LeetCodeLCP2 {
    public static void main(String[] args) {
        int count[] = input();

        int array[] = fraction(count);
        System.out.println(array);
    }

    private static int[] input() {
        Scanner cin = new Scanner(System.in);
        int[] result=new int[10];
        for (int i = 0; i <10 ; i++) {
            int num=cin.nextInt();
            result[i] = num;
        }
        return result;
    }

    public static int[] fraction(int[] cont) {




    }
}
