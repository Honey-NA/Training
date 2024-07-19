public class Main {

    public static void main(String[] args) {
        //Задание №1
        //Создание животных
        System.out.println("Сейчас " + Animal.animalNumber + " животных.");
        Dog dog1 = new Dog("Бобик");
        Cat cat1 = new Cat("Масик");
        Cat cat2 = new Cat("Киса");
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
        //Проверки счетчика животных, котов и собак
        System.out.println(Animal.number());
        //Наполнение миски и кормление котов
        Miska.getFood(50);
        cat1.eat(10);
        cat2.eat(20);
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
        //Создание фигур
        Figure rect1 =  new Rectangle("Прямоугольник №1",4,5);
        Figure tri1 =  new Triangle("Треугольник №1",3,4,5);
        Figure cir1 =  new Circle("Круг №1",5);
        //Рассчет перимета и площади фигур. Присваивание цветов заливки и границ.
        rect1.p();
        rect1.s();
        rect1.bgColor("black");
        rect1.brColor("white");
        tri1.p();
        tri1.s();
        tri1.bgColor("red");
        tri1.brColor("yellow");
        cir1.p();
        cir1.s();
        cir1.bgColor("blue");
        cir1.brColor("pink");
        //Вывод характеристик в консоль
        rect1.info();
        tri1.info();
        cir1.info();
    }
}
