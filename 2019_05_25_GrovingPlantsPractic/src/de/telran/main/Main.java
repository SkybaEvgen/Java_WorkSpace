package de.telran.main;

import de.telran.model.Flovers;
import de.telran.model.Plant;
import de.telran.model.Tree;


public class Main {
    public static void main(String[] args) {
        Plant tree = new Tree("Tree", 10);
        Plant flower = new Flovers("Flower", 5);

        Plant[] plants = {tree, flower};

        growPlants(plants, 3);
    }

    public static void growPlants(Plant[] plants, int years){
        for (int i = 0; i <years ; i++) {
            for(Plant plant:plants){
                plant.doYear();
            }
        }
    }
}
