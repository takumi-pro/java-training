import comment.Zenhan;

public class Part1 {
  public static void main(String[] args) {

    // 変数
    int n = 11;
    double d = 2.3;
    System.out.println(n);
    // intとdoubleの乗算はdouble型にキャストされる
    System.out.println(n * 1.2);
    System.out.println(d * n);

    // 配列
    System.out.println("============== 配列 ==============");

    // 0で初期化
    int[] intArray = new int[5];
    // 初期化
    int[] intArray2 = new int[] {1,2,3,4,5};
    int[] intArray3 = {1,2,3,4,5};
    // 拡張for
    for (int v : intArray3) System.out.print(v);
    System.out.println();

    // メソッド
    System.out.println("============== メソッド ==============");
    System.out.println(add(100));
    System.out.println(add(100, 200));
    doubleArray(intArray3);
    for (int v : intArray3) System.out.print(v);
    int diff = Calc.diff(100, 23);
    System.out.println();
    System.out.println("diff: " + diff);

    Zenhan.talk();
    Zenhan.explosion();
  }

  public static void doubleArray(int[] array) {
    for (int i = 0; i < array.length; i++) array[i] *= 2;
  }

  // オーバーロード
  public static int add(int x) {
    return x + 100;
  }

  public static int add(int x, int y) {
    return x + y;
  }
}