package practical;

class Animal {
void eat() {
    System.out.println("eating...");
}
}  
class Dog extends Animal {
    void eat() {
        System.out.println("eating bread...");
    }
    public static void main(String[] args) {

        Animal cow = new Animal();
        Dog leb = new Dog();

        cow.eat();
        leb.eat();

    }
}
