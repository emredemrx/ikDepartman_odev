package org.example;

import lombok.Builder;


public class Person {
    public String name;
    public String email;
    public double wage;
    int defaultday = 25;//bir ayda varsayılan çalışma günü
    double overtimeWage = 1000; // gunluk mesai ücreti

    public Person(String name, String email, double wage) {
        this.name = name;
        this.email = email;
        this.wage = wage;
    }

    public double maasHesapla(int workingDay){
        if (workingDay == defaultday ){
            //System.out.println(name +" isimli personelin bu ay maası: "+wage);
            return wage;
        }else if (workingDay < defaultday) {
            double gunlukMaas = wage / defaultday;
            //System.out.println(name +" isimli personelin bu ay maası: "+ gunlukMaas * workingDay);
            return gunlukMaas;
        }else{

            //String bilgilendirme  = (workingDay >= 1 && workingDay <= 31) ?  primMaas(workingDay) : "Girilen günler maaş için geçerli değildir. Maaslar aylık gun sayısına göre hesaplanmaktadır.";
            //System.out.println(bilgilendirme);

            if (workingDay >= 1 && workingDay <= 31) {
                return primMaas(workingDay);
            }else {
                System.out.println("hakMesaji");
                return wage;
            }
        }
    }

    public double primMaas (int workingDay) {
        int calisilanEkGunSayisi = workingDay - defaultday;
        double mesaiUcreti = overtimeWage * calisilanEkGunSayisi;
        //String mesaj = name + " isimli personelin bu ay maası: " + (mesaiUcreti + wage);
        return mesaiUcreti+wage;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public double getWage() {
        return wage;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setWage(double wage) {
        this.wage = wage;
    }
}
