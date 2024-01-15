package com.hidmedia.yyyHimedia.game.model;

public abstract class Animal { //각 동물의 공통된 행동을 Animal 클래스에서 추상메소드로 선언
    public abstract void eat();

    public abstract void wash();

    public abstract void sleep();

    public abstract void play();

    //플레이어가 입력한 이름을 저장하기 위해 String 변수 name 추가
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    } //toString 메소드를 사용해서 name 변수를 반환해준다.


    /* getCount() 메서드는 count 변수의 값을 반환
       setCount(int count) 메서드는 count 변수의 값을 설정
       incrementation() 메서드는 count 변수의 값을 1 증가*/
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void incrementation() {
        count++;
    }
}
