package homework9;

public class Veterinarian {
    public static void treatAnimal(Animal animal) {
        System.out.println("Это животное ест " + animal.getFood() + " и находится в " + animal.getLocation());
    }

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("рыбу", "доме", "бенгальский", "Барсик");
        animals[2] = new Dog("мясо", "будке", "охранная", "большая");
        animals[1]= new Horse("сено", "конюшне",110,true);
        for (Animal animal:animals){
            treatAnimal(animal);
            animal.eat();
            animal.makeNoise();
        }

    }
}
