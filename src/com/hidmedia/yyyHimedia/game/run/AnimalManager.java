package com.hidmedia.yyyHimedia.game.run;

import com.hidmedia.yyyHimedia.game.model.*;

import java.util.Random;

public class AnimalManager {

    public Animal randomAnimal() {
        // 애니멀매니저 클래스는 Animal 클래스와 관련된 메소드를 관리하는 클래스
        // randomAnimal() 4가지 동물 중 랜덤으로 한 종류를 반환하는 메소드
        // 모든동물들이 애니멀클래스에 상속이 되어있고 그 객체를 반환해야하니
        // 반환타입을 애니멀로 지정

        Animal a2 = null;
        //해당 변수가 참조할 객체가 아직 생성되어 있지 않으므로 레퍼런스 변수를 null값으로 초기화

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
