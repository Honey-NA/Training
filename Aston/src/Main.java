import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //Задание №1
        //Создаем животных
        System.out.println("Сейчас " + Animal.number + " животных.");
        Animal dog1 = new Dog("Бобик");
        Animal cat1 = new Cat("Масик");
        Animal cat2 = new Cat("Киса");
        //Проверки животных на бег и плавание
        cat1.run(200);
        cat1.run(0);
        cat1.run(-10);
        cat1.run(201);
        cat1.swim(5);
        dog1.run(500);
        dog1.run(501);
        dog1.run(0);
        dog1.run(-10);
        dog1.swim(10);
        dog1.swim(0);
        dog1.swim(-1);
        dog1.swim(11);
        //Проверка счетчика животных, котов и собак
        System.out.println("Сейчас " + Animal.number + " животных.");
        System.out.println("Сейчас " + Cat.catNumber + " котов.");
        System.out.println("Сейчас " + Dog.dogNumber + " собак.");
        //Наполнение миски и кормление котов
        Miska.getFood(50);
        ((Cat) cat1).eat(10);
        ((Cat) cat2).eat(20);
        System.out.println("В миске осталось " + Miska.miska + " еды.");
        //Создание массива котов
        Cat[] catArray = new Cat[3];
        catArray[0] = new Cat("Котя");
        catArray[1] = new Cat("Котик");
        catArray[2] = new Cat("Котяра");
        //Кормление массива котов
        for (int i = 0; i<3;i++)
            catArray[i].eat(10);
        //Проверка сытости массива котов
        for(int i = 0; i<3;i++)
            System.out.println(catArray[i].name + " сыт? - " + catArray[i].fullness);
        System.out.println("В миске осталось " + Miska.miska + " еды.");
        //Повторное наполнение миски и проверка сколько в ней еды
        Miska.getFood(100);
        //Задание №2.
        //Вычисление периметра и площади фигур
        Figure rect1 = new Figure("Прямоугольник №1");
        rect1.Prec(4,5);
        rect1.Srec(4,5);
    }
}
