package com.company;

public class Main {



    public static void main(String[] args) {
        
        Bosss boss = new Bosss(1000,55,"Fire");
        System.out.println("Boss Health " +  ":" + boss.getBosssHealth()  + " BossDamage "
                + ":" + boss.getBosssDamage() +  " Boss Defence " + ":" + boss.getBosssDefence());
        Hero[] triple = createHeroes();

        for (int i = 0; i < triple.length  ; i++) {
            System.out.println(triple[i].getHeroDamage() + " " + triple[i].getHeroHealth() + "" + triple[i].getSuperPower());

        }


    }
    public static Hero[] createHeroes() {
    Hero naruto = new Hero(200,80,"Clone");
    Hero sasuke = new Hero(180,70,"Chidori");
    Hero sakura = new Hero(100,30);
    Hero[] triple = {naruto,sasuke,sakura};
    return triple;



    }



        }









