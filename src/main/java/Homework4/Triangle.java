package Homework4;
public class Triangle {
  public void showTriangle() {
        int rows = 5;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < 2 * rows - 1; j++) {

                if (j >= rows - i - 1 && j <= rows + i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
