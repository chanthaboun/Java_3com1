package Weeks_2;

public class SampleDog {

    //    generate void main type: (psvm)
    public static void main(String[] args) {
//        Create object emp1 form Employee
        Dog dog1 = new Dog();
        dog1.setName("Kiwi");
        dog1.setAge(4);
        dog1.setBreed("Rice");
        dog1.setColor("White");

        
        System.out.println("Name dog is: " + dog1.getName());
        System.out.println("Age is " + dog1.getAge());
        System.out.println("Dog like " + dog1.getBreed()   );
        System.out.println("This dog color" + dog1.getColor());

//       generate  System.out.println type:  sout 
    }

    }
