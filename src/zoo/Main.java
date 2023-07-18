package zoo;

public class Main {
    public static void main(String[] args) {
        Mammalian[] mammalian = new Mammalian[7];

        mammalian[0] = new Lion("Africa", 160, 2, "Panthera leo", 1.5, 74, 20, 100);
        mammalian[1] = new Tiger("Nepal", 110, 310, "Panthera tigris tigris", 7.5, 90, "Bengala");
        mammalian[2] = new Chettah("Africa", 94, 150, "Acinonyx jubatus", 1, 130);
        mammalian[3] = new Wolf("Groelandia", 85, 160, "Canis lupus", "black", 5, 7, "Common wolf");
        mammalian[4] = new Dog("Sahara", 75, 92, "Canis lupus", "Black, yellow and white", 5, 317);
        mammalian[5] = new Wolf("Mexico", 80, 120, "Canis lupus", "gray", 4, 5, "Wolf gray");
        mammalian[6] = new Tiger("India", 130, 335, "Panthera tigris", 10, 90, "Tiger White");

        for (Mammalian animal : mammalian) {
            System.out.println("Habitad: " + animal.habitad);
            System.out.println("Height: " + animal.height);
            System.out.println("Long: " + animal.longs);
            System.out.println("Scientific name: " + animal.scientificName);
            if (animal instanceof Feline) {
                Feline feline = (Feline) animal;
                System.out.println("Claw size: " + feline.getClawSize() + " Cm");
                System.out.println("Speed: " + feline.getSpeed() + "km/h");
            } else if (animal instanceof Canine) {
                Canine canine = (Canine) animal;
                System.out.println("Color: " + canine.getColor());
                System.out.println("Tusk size: " + canine.getTuskSize() + " Cm");
            }
            if (animal instanceof Lion) {
                Lion lion = (Lion) animal;
                System.out.println("Number herd: " + lion.getHerdNumber());
                System.out.println("Roar power: " + lion.getRoarPower() + " Decibels");
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                System.out.println("Tiger species: " + tiger.getTigerSpecies());
            } else if (animal instanceof Wolf) {
                Wolf wolf = (Wolf) animal;
                System.out.println("Litter number: " + wolf.getLitterNumber());
                System.out.println("Wolf species: " + wolf.getWolfSpice());
            } else if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                System.out.println("PSI bite force: " + dog.getPsiBiteForce());
            }
            System.out.println(animal.eat());
            System.out.println(animal.sleep());
            System.out.println(animal.run());
            System.out.println(animal.Communicate());
            System.out.println("================================================================");

        }

    }
}
