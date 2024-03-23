package Less3Inheritance;

class Dog extends Animals {
    static int dogsNumer = 0;

    public Dog(String name){
        super(name,500, 10);
        dogsNumer++;
    }
}