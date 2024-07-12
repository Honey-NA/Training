import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Сейчас " + Animal.number + " животных.");
        Animal bobik = new Dog("Бобик");
        Animal masik = new Cat("Масик");
        Animal kisa = new Cat("Киса");
        masik.run(200);
        bobik.swim(10);
        System.out.println("Сейчас " + Animal.number + " животных.");
        System.out.println("Сейчас " + Cat.catNumber + " котов.");
        System.out.println("Сейчас " + Dog.dogNumber + " собак.");
        System.out.println("В миске осталось " + Miska.miska + " еды.");
        ((Cat) masik).eat(10);
        ((Cat) kisa).eat(20);
        System.out.println("В миске осталось " + Miska.miska + " еды.");
        Cat[] catArray = new Cat[3];
        catArray[0] = new Cat("Котя");
        catArray[1] = new Cat("Котик");
        catArray[2] = new Cat("Котяра");
        for (int i = 0; i<3;i++)
            catArray[i].eat(10);
        for(int i = 0; i<3;i++)
            System.out.println("Сытость " + catArray[i].name + ": " + catArray[i].fullness);
        System.out.println("В миске осталось " + Miska.miska + " еды.");
        Miska.getFood(100);
        System.out.println("В миске осталось " + Miska.miska + " еды.");
    }
}
