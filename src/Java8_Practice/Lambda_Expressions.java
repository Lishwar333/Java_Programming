package Java8_Practice;

interface Computer{

    public void company();
}

class Dell implements Computer{

    public void company() {

        System.out.println("The Computer Company is Dell");    
    }
}

interface Car{

    public int speed(int d, int t);

    }


public class Lambda_Expressions {

    public static void main(String[] args) {

        Dell dell = new Dell();
        dell.company();

        Computer mac = ()-> System.out.println("The company is Mac");
        mac.company();        

        Car benz = (d,t)->{return d/t;};
        System.out.println(benz.speed(10, 2));

        Car toyota = (d,t)-> d/t;
        System.out.println(benz.speed(100, 2));
 
    }

}