package com.hidmedia.yyyHimedia.game.model;

public class Alien extends Animal {
 //기본생성자로 기본값을 정해주고
    public Alien() {
    }

    @Override
    public String toString(){
        return "외계인";
    }
    //알이 랜덤으로 부화해서 그알이 누구의 알이었는지 toString 으로 name객체의 이름을 반환
    //그리고 사용자가 지정한 이름을 setname()으로 받아서 이름이 어떤행동을 한다로 실행
    @Override
    public void wash() {
        System.out.println(getName()+" 이 샤워해서 청결해졌습니다. 하얘졌다!");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" 이 인간을 먹습니다. 우리는 잠시 비켜줍시다..");
    }

    @Override
    public void play() {
        System.out.println(getName()+" 이 인간수업을 듣습니다.. ");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" 을 재웁니다~ 빨리 자렴~");
    }

    // 다형성을 더 활용해보기 위해 애니멀클래스에선 지정하지않은
    // 4가지 동물들의 클래스 각각 떠나는 문구를 따로 지정해주기위해 메소드를 만들어넣음
    public void leave(){
        System.out.println(getName() + " 이 우주선을 타고 날아갑니다~~");
    }
}
