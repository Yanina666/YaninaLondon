package lesson3;

public class Employee {
    public String fio;
    public String position;
    public String email;
    public String phone;
    public int salary;
    public int age;

    public int getAge() {
        return age;
    }
    public Employee(String fio, String position, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
        public void print() {
            System.out.println("Имя: " + fio + " | " + " Должность: " + position + " | " + " e-mail: " + email + " | " +
                    " Тел.: " + phone + " | " + " ЗП: " + salary + " | " + " Возраст: " + age);
        }

        public static void main (String[] args){
            Employee[] employeeArray = new Employee[5];
            employeeArray[0] = new Employee("Rd Ewd WQ", "REW", "ff@gmail.com", "+545789876", 3000, 45);
            employeeArray[1] = new Employee("RY KL JH", "KJ", "hj@gmail.com", "+567987543", 633, 67);
            employeeArray[2] = new Employee("IU IU OP", "TY", "fgh@gmail.com", "+56787654321", 900, 30);
            employeeArray[3] = new Employee("YT NH WE", "REW", "ghj@gmail.com", "+567876543", 4000, 57);
            employeeArray[4] = new Employee("YT TR TT", "Df", "hhh@gmail.com", "+57786666666", 6000, 46);
            for (int i = 0; i < employeeArray.length; i++) {
                if (employeeArray[i].getAge() > 40) {
                    employeeArray[i].print();
                }
            }
        }
    }



    //Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

//    4. Создать массив из 5 сотрудников.
//
//Пример:
//// Вначале объявляем массив объектов
//Person[] persArray = new Person[5];
//// потом для каждой ячейки массива задаем объект
//persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
//persArray[1] = new Person(...);
//...
//persArray[4] = new Person(...);
//
//    5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.