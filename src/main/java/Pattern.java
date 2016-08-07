public class Pattern {
  public static void printAsterick() {
    System.out.print("*");
  }

  public static void printAsterick(int n) {
    for (int i = 0; i < n; i++)
      System.out.print("*");
  }

  public static void printAsterickVertical(int n) {
    for (int i = 0; i < n; i++) {
      printAsterick();
      System.out.println();
    }
  }

  public static void printRightAngle(int n) {
    for (int i = 1; i <= n; i++) {
      printAsterick(i);
      System.out.println();
    }
  }

  public static void printIsosceles(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++)
        System.out.print(" ");
      printAsterick(i * 2 + 1);
      System.out.println();
    }
  }

  public static void printIsoscelesInverted(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++)
        System.out.print(" ");
      printAsterick((n - 1 - i) * 2 + 1);
      System.out.println();
    }
  }

  public static void printDiamond(int n) {
    printIsosceles(n);
    printIsoscelesInverted(n - 1);
  }

  public static void printDiamondWithName(int n, String name) {
    --n;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= n - i - 1; j++)
        System.out.print(" ");
      printAsterick(i * 2 + 1);
      System.out.println();
    }
    System.out.println(name);
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++)
        System.out.print(" ");
      printAsterick((n - 1 - i) * 2 + 1);
      System.out.println();
    }
  }

}
