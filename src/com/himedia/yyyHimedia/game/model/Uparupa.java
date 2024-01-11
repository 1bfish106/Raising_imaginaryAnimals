package com.himedia.yyyHimedia.game.model;

public class Uparupa extends Animal{
    @Override
    public void eat() {
        System.out.println("우파루파가 플랑크톤을 먹습니다, 냠냠~");
    }

    @Override
    public void wash() {
        System.out.println("우파루파를 씻깁니다. 첨벙첨벙");
    }

    @Override
    public void sleep() {
        System.out.println("우파루파를 재웁니다.. 잘자~");
    }

    @Override
    public void play() {
        System.out.println("우파루파와 기포놀이를 합니다! 뽀글뽀글!~");
    }
}
