package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        ArrayList<Integer>massiv=new ArrayList<>();

        for(int i=0;i<50;i++){
            massiv.add(random.nextInt(1,100));
        }
        System.out.println("Massiv=  "+massiv);
        System.out.println("  ");
        ArrayList<Integer>taksandar=new ArrayList<>();
        ArrayList<Integer>jupsandar=new ArrayList<>();
        for(int i=0;i<50;i++){
            if(massiv.get(i)%2==0){
                jupsandar.add(massiv.get(i));
            }
            else {
                taksandar.add(massiv.get(i));
            }
        }
        System.out.println("Jup sandar=   "+jupsandar);
        System.out.println("Tak sandar=   "+taksandar);
    }
}


    /*ArrayList тузунуз
1ден 100го чейинки 50 сан менен толтурунуз
        Дагы 2 ArrayList тузуп бирисине так сандарды, экинчисине жуп сандарды салыныз
        Аларды консольго чыгарыныз*/
