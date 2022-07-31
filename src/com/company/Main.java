package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumprint());
    }
    static int sumprint(int num){
        if(num==0) return 0;
       return sumprint(num-1)+num;
    }
}
