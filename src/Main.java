import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        LinkedList<Integer> integers =  new LinkedList<>();
//        integers.add(67);
//        integers.addFirst(66);
//        System.out.println(LinkedList);
//        System.out.println(integers.peekFirst());
//        System.out.println(integers.peekLast());
//        System.out.println(integers.pollFirst());
//        System.out.println(integers.peekFirst());

        LinkedList<Animal> animals = new LinkedList<>();


        Random random = new Random();
        for (int i = 0; i < 5; i++) {

            animals.add(new Cat(i, random.nextInt(1, 10)));
            animals.add(new Mouse(i, random.nextInt(1, 10)));
            animals.add(new Dog(i, random.nextInt(1, 10)));
        }

        LinkedList<Animal> sortAnimal = new LinkedList<>();
       for (Animal animal : animals) {
        if(animal instanceof  Cat){
            sortAnimal.addFirst(animal);
        }
        else if (animal instanceof Dog){
            sortAnimal.addLast(animal);
        }
    }
        for (int i = 0; i < animals.size(); i++) {
            if(animals.get(i) instanceof Mouse){
                sortAnimal.addLast(animals.get(i));
            }
            for (Animal animal :sortAnimal){   //sout(sortAnimal);
                System.out.println(animal);
            }
        }
    }
}