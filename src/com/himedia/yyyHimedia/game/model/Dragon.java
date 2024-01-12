package com.himedia.yyyHimedia.game.model;

public class Dragon extends Animal {
    @Override
    public String toString(){
        return "드래곤";
    }
    @Override
    public void wash() {
        System.out.println(" 을씻기다가 불에 머리카락 탔습니다.. 뜨거워!! ");
    }


    @Override
    public void eat() {
        System.out.println(" 에게 여의주를 먹입니다. 꿀꺽~ ");
    }

    @Override
    public void play() {
        System.out.println(" 과 함께 터그놀이를 합니다! ");
    }

    @Override
    public void sleep() {
        System.out.println("을 재웁니다..잘자~ Zzz... ");
    }


}
