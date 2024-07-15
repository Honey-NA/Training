//Задание №1
public class Cat extends Animal {
    public static int catNumber = 0;
    public boolean fullness = false;
    public Cat(String name) {
        super(name);
        System.out.println("Появился кот " + name + ".");
        animalNumber += 1;
        catNumber += 1;
    }

    @Override
    public void run(int x) {
        if (x <= 200 && x > 0)
            System.out.println("Кот пробежал " + x + " м.");
        else
            System.out.println("Кот не может столько пробежать!" + "("+x+")");
    }

    @Override
    public void swim(int x) {
        System.out.println("Кот не умеет плавать!");
    }

    public void eat(int x) {
        if ((Miska.miska - x) >= 0) {
            Miska.miska -= x;
            fullness = true;
            System.out.print(name + " поел. ");
            System.out.println(name + " сыт? - " + fullness);
        } else {
            System.out.print(name + " не может поесть, не хватает еды. ");
            System.out.println(name + " сыт? - " + fullness);
        }
    }
}