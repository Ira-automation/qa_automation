package Homework4;

public class TriangleSecondTry {
        public  void showTriangleSecondTry (){
            int rows = 5;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows - i - 1; j++) {
                    System.out.print(" ");
                }

                int j = 0;
                while (j < 2 * i + 1) {
                    System.out.print("*");
                    j++;
                }

                System.out.println();
            }
        }
    }