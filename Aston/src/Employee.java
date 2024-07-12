public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;
    public Employee(String name, String position, String email, String phone, int salary, int age) {
        System.out.println("\nСотрудник создан.");
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        System.out.println("Name: " + name +"\n" + "Position: " + position +"\n" + "Email: " + email +"\n"
                + "Phone: " + phone +"\n" + "Salary: " + salary +"\n" + "Age: " + age);
    }
}
