package main.java.by.jrr.sheremet.task2;

import main.java.by.jrr.sheremet.task2.algorithms.*;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Algorithm> algorithms = new ArrayList<>();

        algorithms.add(new Cocktail());
        algorithms.add(new Coffee());
        algorithms.add(new Grass());
        algorithms.add(new Music());
        algorithms.add(new Pasta());
        algorithms.add(new Teeth());

        for(Algorithm algorithm : algorithms){
            algorithm.doAlgorithm();
            System.out.println("----------------------------");
        }
    }
}
