package lab1;

public class Multiples {

    public static void main(String[] args) {
        int num = multiples(1000,3,5);
        System.out.println(num);
    }

    public static int multiples(int n, int a, int b) {
        int count = 0; //initiate count
        int i = 1;
        while (i < n){
            // increment count
            if (i % a == 0 || i % b == 0) {
                count++;
            }
            i++;
        }
        return count;
    }
}
