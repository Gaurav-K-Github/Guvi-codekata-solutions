import java.util.ArrayList;
import java.util.Scanner;

abstract class Animal {
    abstract String speak();
}

class Lion extends Animal {
    //..... YOUR CODE STARTS HERE .....
    
    @Override
    String speak() {
        return "Roar";
    }    
    
    //..... YOUR CODE ENDS HERE .....

}

class Elephant extends Animal {
    //..... YOUR CODE STARTS HERE .....
    
    @Override
    String speak() {
        return "Trumpet";
    }    
    
    //..... YOUR CODE ENDS HERE .....
}

class Monkey extends Animal {
    //..... YOUR CODE STARTS HERE .....
    
    @Override
    String speak() {
        return "Ooh Ooh Aah Aah";
    }    
    
    //..... YOUR CODE ENDS HERE .....
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();  // Consume the newline character
        ArrayList<Animal> zoo = new ArrayList<>();
        //..... YOUR CODE STARTS HERE .....
        
        for (int i = 0; i < N; i++) {
            String animalType = sc.nextLine();
            if (animalType.equalsIgnoreCase("Lion")) {
                zoo.add(new Lion());
            } else if (animalType.equalsIgnoreCase("Elephant")) {
                zoo.add(new Elephant());
            } else if (animalType.equalsIgnoreCase("Monkey")) {
                zoo.add(new Monkey());
            } else {
                System.out.println("Unknown animal type");
            }
        }        
        
        //..... YOUR CODE ENDS HERE .....
        for (Animal animal : zoo) {
            System.out.println(animal.speak());
        }
    }
}
