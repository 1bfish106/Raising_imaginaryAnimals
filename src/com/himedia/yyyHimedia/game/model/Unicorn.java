package com.himedia.yyyHimedia.game.model;

public class Unicorn extends Animal {
    @Override
    public void eat() {
        System.out.println("유니콘이 황금당근을 먹습니다. 으드득으드득");
    }

    @Override
    public void wash() {
        System.out.println("유니콘을 씻기다 뿔에 치였습니다! 으악!!");
    }

    @Override
    public void sleep() {
        System.out.println("유니콘이 잠을 잡니다..zzz 잘자~~");

    }

    @Override
    public void play() {
        System.out.println("유니콘과 산책을 합니다! 달려~~");
    }
}
