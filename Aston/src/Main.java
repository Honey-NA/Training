public class Main {
    public static void main(String[] args) {
        //Задание №1
        Employee employee1 = new Employee("Иван Иванов", "Бухгалтер", "ivanivanov@mail.ru","+79991234567", 50000, 25);
        Employee employee2 = new Employee("Василий Пупкин", "Курьер", "vasilipup@mail.ru","+79998765432", 45000, 30);
        employee1.getValues();
        employee2.getValues();
        //Задание №2
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Иван Васичкин", "Инженер","ivivanov@mail.ru", "892312312", 30000, 30);
        empArray[1] = new Employee("Максим Максимов", "Механик","maxmaximov@mail.ru", "892345645", 40000, 40);
        empArray[2] = new Employee("Олег Олегов", "Слесарь","ololegov@mail.ru", "892378978", 50000, 50);
        empArray[3] = new Employee("Артем Артемов", "Сантехник","artartemov@mail.ru", "892301201", 60000, 60);
        empArray[4] = new Employee("Никита Никитин", "Электрик","niknikitin@mail.ru", "892334534", 70000, 70);
        for (int i = 0;i<5;i++){
            empArray[i].getValues();
        }
        //Задание №3
        Park.Attraction attraction1 = new Park().new Attraction("Карусель", "9:00-18:00",200);
    }
}