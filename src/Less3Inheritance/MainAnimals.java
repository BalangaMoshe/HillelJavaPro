package Less3Inheritance;

public class MainAnimals {
    public static void main(String[] args) {
        Dog dogBarsik = new Dog("Барсік");
        Cat catMurchik = new Cat("Мурчик");

        dogBarsik.run(500);
        dogBarsik.swim(10);
        catMurchik.run(200);
        catMurchik.swim(0);

        System.out.println("Кількість собак: " + Dog.dogsNumer);
        System.out.println("Кількість котів: " + Cat.catsNumer);
    }
}
