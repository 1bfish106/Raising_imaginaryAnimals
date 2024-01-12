package com.himedia.yyyHimedia.game.run;

import com.himedia.yyyHimedia.game.model.*;

import java.util.Random;

public class AnimalManager {
    Random random = new Random();
    Animal[] animals = {new Alien(), new Unicorn(), new Uparupa(), new Dragon()};

    public Animal randomAnimal() {
        int randomIndex = random.nextInt(animals.length);
        return animals[randomIndex];
    }
}
