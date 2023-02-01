
public class Review02 {

    public static void main(String[] args) {
        
        // iの値が１から100までの間、処理を繰り返す
        for(int i = 1; i <= 100; i++) {
            
            // iの値が3でも5で割り切れるとき
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");

            // iの値が3で割り切れるとき
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            
            // iの値が5で割り切れるとき
            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            // それ以外の数
            } else {
                System.out.println(i);
            }
        }

    }
}