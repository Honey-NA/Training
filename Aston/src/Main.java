public class Main {
    public static void main(String[] args) {
    Employee employee1 = new Employee("Иван Иванов", "Бухгалтер", "ivanivanov@mail.ru","+79991234567", 50000, 25);
    Employee employee2 = new Employee("Василий Пупкин", "Курьер", "vasilipup@mail.ru","+79998765432", 45000, 30);
    Employee employee3 = new Employee("Анатолий Крюков", "Кассир", "tolyakryk@mail.ru","+79990001234", 40000, 28);
    Employee employee4 = new Employee("Максим Круглов", "Механик", "maxcircle@mail.ru","+79990000000", 1000000, 44);
    Employee employee5 = new Employee("Елизавета Медведева", "Директор", "lizmedved@mail.ru","+79997777777", 177000, 55);
    Employee[] empArray = new Employee[5];
    empArray[0] = new Employee("Иван Васичкин", "Инженер","ivivanov@mail.ru", "892312312", 30000, 30);
    empArray[1] = new Employee("Максим Максимов", "Механик","maxmaximov@mail.ru", "892345645", 40000, 40);
    empArray[2] = new Employee("Олег Олегов", "Слесарь","ololegov@mail.ru", "892378978", 50000, 50);
    empArray[3] = new Employee("Артем Артемов", "Сантехник","artartemov@mail.ru", "892301201", 60000, 60);
    empArray[4] = new Employee("Никита Никитин", "Электрик","niknikitin@mail.ru", "892334534", 70000, 70);
    Park.Attraction attraction1 = new Park.Attraction("Карусель", "9:00-18:00",200);
    }
}
