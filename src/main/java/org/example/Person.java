package org.example;

public class Person {

    String name;
    String email;
    double wage;
    int workingDay;

    int defaultday = 25;//bir ayda varsayılan çalışma günü
    double overtimeWage = 1000; // gunluk mesai ücreti


    void maasHesapla(){

        String hakMesaji  =  ( workingDay > 1 && workingDay < 31) ? "Personel maaş almaya hak kazanmış Personel maaşı: " : "Girilen günler maaş için geçerli değildir. Maaslar aylık gun sayısına göre hesaplanmaktadır.";

        if (workingDay == defaultday ){
            System.out.println(name +" isimli personelin bu ay maası: "+wage);
        }else if (workingDay < defaultday) {
            double gunlukMaas = wage / defaultday;
            System.out.println(name +" isimli personelin bu ay maası: "+ gunlukMaas * workingDay);
        }else{
            if (workingDay >= 1 && workingDay <= 31) {
                primMaas();
            }else {
                System.out.println(hakMesaji);
            }
        }
    }

    void primMaas () {
        int calisilanEkGunSayisi = workingDay - defaultday;
        double mesaiUcreti = overtimeWage * calisilanEkGunSayisi;
        System.out.println(name + " isimli personelin bu ay maası: " + (mesaiUcreti + wage));

    }
}
