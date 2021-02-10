package com.company;

public class Prime {
    public void primeCheck(int number){
        int counter = 0;
        for(int i = 1; i<=1000; i++){
            if(number%i==0){
                counter++;
            }
            if(counter==2){
                int prime = counter;
            }
        }
    }

}
