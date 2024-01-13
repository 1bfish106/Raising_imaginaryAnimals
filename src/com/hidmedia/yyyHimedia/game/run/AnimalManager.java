package com.hidmedia.yyyHimedia.game.run;

import com.hidmedia.yyyHimedia.game.model.*;

import java.util.Random;

public class AnimalManager {

    public Animal randomAnimal() {
        // 애니멀매니저 클래스는 4가지 동물들을 랜덤을 돌려 한마리 지정해야하는 클래스
        // 모든동물들이 애니멀클래스에 상속이 되어있어서 그걸 반환해야하니
        // 반환타입을 애니멀로 지정

        Animal a2 = null;
        //해당 변수가 모든 동물 클래스의 인스턴스를 참조하기 위해서 초기화..

        Random random = new Random();
        int randomIndex = random.nextInt(4);
        switch (randomIndex) {
            case 0:
                return new Alien();
            case 1:
                return new Dragon();
            case 2:
                return new Unicorn();
            case 3:
                return new Uparupa();

        }
        return a2;
    }
}
