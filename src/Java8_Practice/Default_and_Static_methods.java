package Java8_Practice;

interface Animal{

    public void breed(String s);

    default public void legs(String s, int a) {

        System.out.println(s+" have "+a+" legs");
    }

    static public void parent() {

        System.out.println("Static method invoked inside Animal interface");
    }
}

 
public class Default_and_Static_methods {

    public static void main(String[] args) {

        //Abstract method
        Animal dog = (s) -> System.out.println("The breed is "+s);
        dog.breed("Labradog");

        //Default method
        dog.legs("Dogs", 4);

        //Static method
        Animal.parent();

    }

 

}