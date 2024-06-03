package org.example;
public class Main {
    public static void main(String[] args) {
        Person person  = new Person();

        person.name = "Emre";
        person.email = "emre@emre.com";
        person.wage = 50000;
        int workingDay = 32;
        person.maasHesapla(workingDay);

    }
}