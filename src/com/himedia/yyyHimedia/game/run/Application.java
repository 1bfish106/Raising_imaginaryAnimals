package com.himedia.yyyHimedia.game.run;

import com.himedia.yyyHimedia.game.model.Animal;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("당신은 길을 가다 알을 주웠습니다. 그 알을 집에" +
                "가져와보니 부화하려합니다. 이 알의 정체는...!");

        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        AnimalManager animalManager = new AnimalManager();
        Animal a1 = animalManager.randomAnimal();
        System.out.println("당신이 주운 알의 정체는 ...! " + a1 + " 이였습니다!");
        sc.nextLine();
        System.out.println("당신의 " + a1 + "의 이름을 지어주세요");
        String name2 = sc.nextLine();
        System.out.println("이제 " + name2 + " 을 키워야합니다.");
        sc.nextLine();


        while (true) {
            System.out.println(name2 + "와(과) 무엇을 할까요?" + "1. 먹기" + "2. 씻기" + "3. 자기" + "4. 놀기");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    a1.eat();
                    break;
                case 2:
                    a1.wash();
                    break;
                case 3:
                    a1.sleep();
                    break;
                case 4:
                    a1.play();
                    break;
                default:
                    System.out.println("올바른 선택이 아닙니다.");

                    int count = 0;
                    for (int i = 0; i < 6; i++) {
                        count += i;
                        System.out.println(a1 + "가 준성체가 되었습니다!");
                        if (count == 5) {
                        }
                    }

                    for (int j = 5; j < 11; j++) {
                        count += j;
                        System.out.println(a1 + "가 성체가 되었습니다.");
                    }
            }

        }
    }
}
