public class Cat extends Animal {
    static int catNumber = 0;
    public boolean fullness = false;
    public Cat(String name) {
        super(name);
        System.out.println("Появился кот " + name + ".");
        number += 1;
        catNumber += 1;
    }
    @Override
    public void run(int x) {
        if (x <= 200 && x > 0)
            System.out.println("Кот пробежал " + x + " м.");
        else
            System.out.println("Кот не может столько пробежать!");
    }
    @Override
    public void swim(int y) {
        System.out.println("Кот не умеет плавать.");
    }
    public void eat(int z) {
        if ((Miska.miska - z) >= 0) {
            Miska.miska -= z;
            fullness = true;
            System.out.println(name + " сытость: " + fullness);
        } else {
            System.out.println("Еды не хватает, кот не может покушать.");
            System.out.println(name + " сытость: " + fullness);
        }
    }
}