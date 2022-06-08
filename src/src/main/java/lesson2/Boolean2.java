package lesson2;

public class Boolean2 {
    static boolean num(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
        public static void main (String[] args){
            System.out.println(num(-5));
        }

    }

//Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
// если число отрицательное, и вернуть false если положительное. Замечание: ноль считаем положительным числом.