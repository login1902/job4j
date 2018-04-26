package ru.job4j.loop;

public  class Factorial {

    public int calc(int n) {
       int temp = 1;
        if (n == 0) {
            temp = 1;

        }
       for (int index = 1; index <= n; index++) {
            temp = temp * index;
        }
           return temp;
    }
}