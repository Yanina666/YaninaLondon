package lesson2;

public class Boolean1 {
    static boolean sum(int a, int b) {
      //  a = 10;
      //  b = 20;
        if (a + b >= 10 || a + b <= 20) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
        System.out.println(sum(10,20));
    }
}






//Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.