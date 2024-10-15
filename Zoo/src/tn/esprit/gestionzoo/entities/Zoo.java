package tn.esprit.gestionzoo.entities;

public class Zoo {


    final int NBR_CAGES = 25;
            Animal[] animals = new Animal[25];
    private String name;
    private String city ;
    private  int countAnimal = 0;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name.isEmpty())
           this.name = "zoo";
        this.name = name;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCountAnimal() {
        return this.countAnimal;
    }

    public void setCountAnimal(int countAnimal) {
        this.countAnimal = countAnimal;
    }

    public Zoo(String name, String city) {
        animals = new Animal[NBR_CAGES];
        if(name.isEmpty()){
            this.name = "zoo";
        }else {
            this.name = name;
        }
        this.city = city;

    }
void displayZoo(){
        System.out.println(this.name + " " + this.city + " " + NBR_CAGES);
}


    public boolean addAnimal(Animal animal) {
        if (isZooFull()){
            return false;
        }
        animals[countAnimal] = animal;
        countAnimal++;
        return true;

    }


    public int searchAnimal(Animal animal) {
        for (int i = 0; i < NBR_CAGES; i++) {
            if (animals[i]==animal) {
                return i;
            }
        }
        return -1;
    }
     boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);

        if (index == -1) {
            System.out.println("the animal " + animal.getName() + " does not exist in the zoo.");
            return false;
        }

        for (int i = index; i < NBR_CAGES - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[NBR_CAGES - 1] = null;

        return true;
    }
     boolean isZooFull() {
        return this.countAnimal == NBR_CAGES;
    }
     static Zoo comparerZoo(Zoo z1, Zoo z2) {
       if (z1.countAnimal> z2.countAnimal)
           return z1 ;
       return z2 ;
        }


}



