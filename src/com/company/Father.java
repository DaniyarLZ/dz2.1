package com.company;

public class Father extends Piple {
    private  String profession;

    public String getProfession() {
        return profession;
    }

    public Father(String name, int age, int rost, CvetVolos cvetVolos, String profession) {
        super(name, age, rost, cvetVolos);
        this.profession = profession;
    }

    @Override
    public String getInfo(){
        return "\nИмя: " + getName() +
                "\nВозраст: " + getAge() +
                "\nРост: " + getRost() +
                "\nЦвет волос: " + getCvetVolos()+
                "\nПрофессия: " + getProfession();

    }
}
