package Lesson5;

public class Lesson5 {



    public static void main(String[] args) {
//         Staff staff1 = new Staff("ИвановАВ", "инженер", "ivanovA@mail.ru", 89991231234L,60000, 45 );
////        Staff staff1 = new Staff();
//        staff1.info();

        Staff[] persArray = new Staff[5];
        persArray[0]= new Staff("Иванов А.В.","Инженер","ivanov_a@mailbox.com",89215674356L,700000,50);
        persArray[1]= new Staff("Верник С.Б.","Программист","vernik_s@mail.com",89113436577L,55000,45);
        persArray[2]= new Staff("Петров Г.А.","Технический писатель","petrov_g@mail.com",89054543534L,45000,38);
        persArray[3]= new Staff("Ожигов И.А.","Стажер-программист","ojegov_ivan@yandex.com",89991123567L,20000,20);
        persArray[4]= new Staff("Березкин С.М.","Сисадмин","beryzkin_admin@gmail.com",89116784567L, 48000,35);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() >=40) {
                persArray[i].info();
            }

        }

    }

}
   class Staff {
        String fullName;
        String position;
        String email;
        long phone;
        int salary;
        int age;


        Staff(String fullName, String position, String email, long phone, int salary, int age) {
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

    public void setAge(int age) {
        if (age >= 18) {
            System.out.println("Сотрудник должен быть старше 18 лет");
        } else {
            this.age = age;
        }
    }
    public int getAge() {
        return age;
    }


        public void info() {
            System.out.println("ФИО: " + fullName + ", Должность: " + position + ", Email: " + email + ", Телефон: " + phone +
                    ", Зарплата: " + salary + ", Возраст: " + age);

        }



}
