public class Dog extends Animal{
    static int dogNumber = 0;
    public Dog(String name) {
        super(name);
        System.out.println("Появилась собака " + name +".");
        number+=1;
        dogNumber+=1;
    }
    @Override
    public void run(int x){
        if (x<=500 && x>0)
            System.out.println("Собака пробежала " + x + " м.");
        else
            System.out.println("Собака не может столько пробежать!");
    }
    @Override
    public void swim(int y){
        if (y<=10 && y>0)
            System.out.println("Собака проплыла " + y + " м.");
        else
            System.out.println("Собака не может столько проплыть.");
    }
}
