public class Dog extends Animal{
    protected static int dogNumber = 0;
    protected Dog(String name) {
        super(name);
        System.out.println("Появилась собака " + name +".");
        number+=1;
        dogNumber+=1;
    }
    @Override
    protected void run(int x){
        if (x<=500 && x>0)
            System.out.println("Собака пробежала " + x + " м.");
        else
            System.out.println("Собака не может столько пробежать!");
    }
    @Override
    protected void swim(int x){
        if (x <=10 && x >0)
            System.out.println("Собака проплыла " + x + " м.");
        else
            System.out.println("Собака не может столько проплыть.");
    }
}
