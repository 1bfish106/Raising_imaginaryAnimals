package com.himedia.yyyHimedia.game.model;

public class Alien extends Animal {
    @Override
    public void wash() {
        System.out.println(" 외계인이 샤워해서 청결해졌습니다. 하얘졌다!");
    }

    @Override
    public void eat() {
        System.out.println(" 외계인이 인간을 먹습니다. 우리는 잠시 비켜줍시다..");
    }

    @Override
    public void play() {
        System.out.println(" 외계인이 인간수업을 듣습니다.. ");
    }

    @Override
    public void sleep() {
        System.out.println(" 외계인을 재웁니다~ 빨리 자렴~");
    }
}
