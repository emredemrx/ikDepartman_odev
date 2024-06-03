package org.example;

public class Person {

    String name;
    String email;
    double wage;

    int defaultday = 25;//bir ayda varsayılan çalışma günü
    double overtimeWage = 1000; // gunluk mesai ücreti


    void maasHesapla(int workingDay){
        if (workingDay == defaultday ){
            System.out.println(name +" isimli personelin bu ay maası: "+wage);
        }else if (workingDay < defaultday) {
            double gunlukMaas = wage / defaultday;
            System.out.println(name +" isimli personelin bu ay maası: "+ gunlukMaas * workingDay);
        }else{

            String bilgilendirme  = (workingDay >= 1 && workingDay <= 31) ?  primMaas(workingDay) : "Girilen günler maaş için geçerli değildir. Maaslar aylık gun sayısına göre hesaplanmaktadır.";
            System.out.println(bilgilendirme);

           /* if (workingDay >= 1 && workingDay <= 31) {
                primMaas(workingDay);
            }else {
                System.out.println(hakMesaji);
            }*/
        }
    }

    public String primMaas (int workingDay) {
        int calisilanEkGunSayisi = workingDay - defaultday;
        double mesaiUcreti = overtimeWage * calisilanEkGunSayisi;
        String mesaj = name + " isimli personelin bu ay maası: " + (mesaiUcreti + wage);

        return mesaj;
    }
}
