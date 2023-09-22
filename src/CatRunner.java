public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Dave", 4, 2.7);
        cat1.introduce();
        cat1.printCatInfo();
        Cat cat2 = new Cat("Sam", 2,3.4);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
