package com.company;

import java.util.Random;

public class Piple {
  private String name ;
  private int age;
  private int rost;
  private CvetVolos cvetVolos;

  public Piple(String name, int age, int rost, CvetVolos cvetVolos) {
    this.name = name;
    this.age = age;
    this.rost = rost;
    this.cvetVolos = cvetVolos;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getRost() {
    return rost;
  }

  public CvetVolos getCvetVolos() {
    return cvetVolos;
  }
public String getInfo(){
return "\nИмя: " + getName() +
        "\nВозраст: " + getAge() +
        "\nРост: " + getRost() +
        "\nЦвет волос: " + getCvetVolos();
}
}


