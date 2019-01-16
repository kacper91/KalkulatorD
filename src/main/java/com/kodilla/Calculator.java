package com.kodilla;
import java.util.*;
import java.lang.*;
import java.io.*;

class Kalculator {

    public void addAtoB(){
        System.out.println("method addAtoB");
    }

    public void minusAB(){
        System.out.println("method minusAB");
    }

    public static void main(String[] args) {
        Kalculator calculator = new Kalculator();
        calculator.addAtoB();
        calculator.minusAB();
    }
}