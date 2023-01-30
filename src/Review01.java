
public class Review01 {

    public static void main(String[] args) {
        // int型変数numの宣言及び初期化
        int num = 1500;

        // doubleとintの2つの型の引数を持つtaxメソッドを呼び出し、処理結果をdouble型変数に代入
        double result = tax(num, 0.1);

        // 少数をint化して演算結果を表示する
        System.out.println(num + "円の商品の税込価格は" + (int) (num + result) + "円（消費税は" + (int) result + "円）です。");
    }

    // doubleとintの引数を2つ受け取るtaxメソッドの定義（戻り値あり）
    public static double tax(int num, double num2) {
        double result = num * num2;
        return result;
    }

}