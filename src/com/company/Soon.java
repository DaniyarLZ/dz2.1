package com.company;

public  final class Soon extends Father {
    private String hobbi;

    public Soon(String name, int age, int rost, CvetVolos cvetVolos, String profession) {
        super(name, age, rost, cvetVolos, profession);
    }

    public String getHobbi() {
        return hobbi;
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
