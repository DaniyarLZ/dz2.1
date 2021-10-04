package com.company;

import java.sql.SQLOutput;

public class Main {
    /*b) Создать иерархию из 3х классов (1й -> 2й -> 3й уровень иерархии),
           последний 3й класс сделать не наследуемым
           c) Все поля классов должны быть приватными, одно из полей должно быть
           сложного типа созданного вами же (4й класс), одно из полей сделать сложного типа (enum)
           d) В классах не должно быть setter-ов, только getter-ы и конструкторы92
           e) Добавить перегруженные методы (2-3 шт.) в класс 2-го уровня иерархии,
           один из них сделать неперезаписываемым
           f) В классе 3-го уровня перезаписать один из методов родителя
           g) В главном классе (Main) Создать объект класса 2-го уровня (objectA) и 2
           объекта класса 3-го уровня (objectB, objectC), также распечатать все свойства
           объектов и вызвать перегруженные методы через каждый из экземпляров ваших объектов.*/
    public static void main(String[] args) {

        Piple piple = new Piple("Даня", 95,180,CvetVolos.Light_Gray);
        Father father = new Father("Альтаир",45,170,CvetVolos.Gray,"Каменьщик");
        Soon soon = new Soon("Альтрахмуд",18,191,CvetVolos.Black,"каменщик");

        System.out.println(piple.getInfo());
        System.out.println(father.getInfo());
        System.out.println(soon.getInfo());


    }
}
