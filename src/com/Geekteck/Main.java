package com.Geekteck;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setDefenceType("Лю кэнг");
        System.out.println(boss.getHealth() + "  " + boss.getDamage() + "  " + boss.getDefenceType());

        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getAbility() + "  " + createHeroes()[i].getDamage() + "  " + createHeroes()[i].getHealth());
        }
    }


    public static Hero[] createHeroes (){
        Hero hero = new Hero(300, 30, "Medic");
        Hero hero1 = new Hero(250, 35,"Thor");
        Hero hero2 = new Hero(350, 15);
        Hero[] heroes = {hero, hero1,hero2};
        return heroes;
    }
}
