package Less3Inheritance;

class Cat extends Animals {
    static int catsNumer = 0;

    public Cat(String name){
        super(name,200, 0);
        catsNumer++;
    }
    @Override
    public void swim(int distance) {
        System.out.println(name + " не вміє пливти");
    }
}