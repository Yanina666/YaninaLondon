package lesson2;

public class ArrMassive {
    public static void main(String[] args) {
        for (int a = 0; a < 6; a++){
            for (int b = 0; b < 6; b++) {
                if (a < b) {
                    System.out.print(" 0");
                }
                else if  (a>b) {
                    System.out.print(" 0");
                } else {
                    System.out.print(" 1");
                }
            }
            System.out.println();
        }
    }
}


//Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
// заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
// то есть [0][0], [1][1], [2][2], …, [n][n];