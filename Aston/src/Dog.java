//Задание №1
public class Dog extends Animal{
    public static int dogNumber = 0;
    public Dog(String name) {
        super(name);
        animalNumber+=1;
        dogNumber+=1;
    }

    @Override
    public void run(int x){
        if (x<=500 && x>0)
            System.out.println("Собака пробежала " + x + " м.");
        else
            System.out.println("Собака не может столько пробежать!" + "("+x+")");
    }

    @Override
    public void swim(int x){
        if (x <=10 && x >0)
            System.out.println("Собака проплыла " + x + " м.");
        else
            System.out.println("Собака не может столько проплыть!" + "("+x+")");
    }
}
