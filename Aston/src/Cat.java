public class Cat extends Animal {
    protected static int catNumber = 0;
    protected boolean fullness = false;
    protected Cat(String name) {
        super(name);
        System.out.println("Появился кот " + name + ".");
        number += 1;
        catNumber += 1;
    }
    @Override
    protected void run(int x) {
        if (x <= 200 && x > 0)
            System.out.println("Кот пробежал " + x + " м.");
        else
            System.out.println("Кот не может столько пробежать!");
    }
    @Override
    protected void swim(int x) {
        System.out.println("Кот не умеет плавать.");
    }
    protected void eat(int x) {
        if ((Miska.miska - x) >= 0) {
            Miska.miska -= x;
            fullness = true;
            System.out.println(name + " поел.");
            System.out.println(name + " сыт? - " + fullness);
        } else {
            System.out.println(name + " не может поесть, не хватает еды.");
            System.out.println(name + " сыт? - " + fullness);
        }
    }
}