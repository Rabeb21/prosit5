package tn.esprit.gestionzoo.entities;

public class Animal {
    
    private   String family ;
    private String name ;
    private  int age ;
   private  boolean isMammal;

    public Animal() {

    }

    public String getName(){
    return this.name ;
}
public void setName(String name){
    this.name = name;
}
public String getFamily(){
        return this.family ;
}
public void setFamily(String family){
    this.family = family ;
}
public int getAge(){
    return this.age ;
}
public void setAge(int age){
    if (age < 0)
        System.out.println("The age of an animal can't be negative ");
    this.age = age ;
}
public boolean isMammal(){
    return this.isMammal ;
}
    public void setMammal(boolean mammal){
    isMammal = mammal ;
    }

    public Animal(String family, String name, int age, boolean isMammal){
        this.family = family;
        this.name = name;
            if (age <0){
            this.age = 0;
        }else {
            this.age = age;
        }
        this.isMammal = isMammal;
    }
@Deprecated
    public String toString(){
        return  getName() + " " + getAge() + " " + getFamily() + " " + isMammal();
    }
}
