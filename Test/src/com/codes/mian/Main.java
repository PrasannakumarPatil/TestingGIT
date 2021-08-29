package com.codes.mian;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        int[] a= {10,20,20,10,30};
        for (int i=0; i<a.length;i++){
            int c=1;
            for(int j=i+1;j<a.length;j++) {
                if (a[i] ==a[j]){
                    c=c+1;
                    System.out.println(a[i]+" is "+ c);
                    //System.out.println(a[i]);
                }
                else{
                    System.out.println(a[i]+"is "+"1");
                }

            }
        }
    }
}
