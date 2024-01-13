package com.hidmedia.yyyHimedia.game.run;

import com.hidmedia.yyyHimedia.game.model.*;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("당신은 길을 가다 알을 주웠습니다. 그 알을 집에" +
                "가져와보니 부화하려합니다. 이 알의 정체는...!");
        //스캐너로 입력을 받고 동물을 랜덤으로 생성하기위해
        // 애니멀매니저 클래스에 있는 메소드를 호출함

        Scanner sc = new Scanner(System.in);
        sc.nextLine(); //게임에서 시각적으로 효과를 주기위해 엔터를 누르면 동물이 나오게 설정
        AnimalManager animalManager = new AnimalManager();
        Animal a1 = animalManager.randomAnimal();

        //처음엔 주운알은 동물의 종족이 무엇인지 나오게 했고
        //동물의 이름을 입력하면 그 이후는 종족이 아니고 입력한 이름을 불러오기위해
        //애니멀 클래스의 셋네임을
        System.out.println("당신이 주운 알의 정체는 ...! " + a1 + " 이였습니다!");
        sc.nextLine();
        System.out.println("당신의 " + a1 + "의 이름을 지어주세요");
        String name2 = sc.nextLine();
        a1.setName(name2);
        //애니멀 클래스의 셋네임을 플레이어가 입력한 이름(name2)로 설정하는 메소드로 호출
        System.out.println("이제 " + name2 + " 을 키워야합니다.");
        sc.nextLine();

        //while 구문을 활용하여 동물의 행동의 반복해서 선택할수있도록 함
        //선택을 해서 애니멀 클래스의 행동을 총 몇번을 하였는지 셀수있는 메소드를 각각 호출하였고
        //if 구문을 활용해서 5번이 되면 중성체가 되어서 다시 while구문의 처음으로 돌아와서 선택하게됨
        // 총 선택이 11번이 되면 instanceof로 다운캐스팅하여 성체가 각각 떠나는 메소드를 호출함

        while (true) {
            System.out.println(name2 + "와(과) 무엇을 할까요?" + "1. 먹기" + "2. 씻기" + "3. 자기" + "4. 놀기");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    a1.eat();
                    a1.incrementation();
                    break;
                case 2:
                    a1.wash();
                    a1.incrementation();
                    break;
                case 3:
                    a1.sleep();
                    a1.incrementation();
                    break;
                case 4:
                    a1.play();
                    a1.incrementation();
                    break;
                default:
                    System.out.println("올바른 선택이 아닙니다.");

            } //게이지를 보여줌
            System.out.println("현재까지 " + name2 + "의 행동 횟수: " + a1.getCount() + "입니다.");

            if (a1.getCount() == 11) {
                System.out.println("!!!!!!!!!!!!!" + name2 + "(이)가 성체가 되어 떠납니다!!!!!!!!!!! ㅃ2~!!");
                if(a1 instanceof Alien){
                    ((Alien)a1).leave();
                }
                if(a1 instanceof Dragon){
                    ((Dragon)a1).fly();
                }
                if(a1 instanceof Unicorn){
                    ((Unicorn)a1).trip();
                }
                if(a1 instanceof Uparupa){
                    ((Uparupa)a1).swim();
                }
                break; // 프로그램 종료
            } else if (a1.getCount() == 5) {
                System.out.println("!!!!!!!!!!!!!" + name2 + "(이)가 중성체가 되었습니다!!!!!!!!!!!");
            }
        }
    }

}