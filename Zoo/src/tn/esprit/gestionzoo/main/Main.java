package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args) {
        Dolphin d1 = new Dolphin("whale", "whaly", 10, true, "sea",1.5f);


        Penguin p1 = new Penguin("penguin", "peng", 7,  true, "snow", 0.5f);
        System.out.println(d1);
        System.out.println(p1);
        d1.swim();
        p1.swim();
    }
}

