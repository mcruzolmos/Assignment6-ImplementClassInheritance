class Animal {
    public int age;
    public String gender;

    public void isMammal() {
        System.out.println("This is a public method isMammal() from Animal class");
    }

    public void mate() {
        System.out.println("This is a public method mate() from Animal class");
    }

 //end of animal class

public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Zebra myZebra = new Zebra();
    Fish myFish = new Fish();
    
    //calling public methods from Animal class
    myAnimal.isMammal();
    myAnimal.mate();

    //calling public methods from Zebra class
    myZebra.run();

    }   
}