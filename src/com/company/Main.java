package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static int [] ReadArray(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String input=reader.readLine();
            String[] p = input.split(",");
            int[] ans = new int[p.length];
            for (int i = 0; i < p.length; i++) {
                ans[i] = Integer.parseInt(p[i]);
            }
            return ans;
        }
        catch (IOException I){

        }
        return null;
    }
    public static int [] InsertionSort(int [] A){
        for(int j=1;j<A.length;j++){
            System.out.println(Arrays.toString(A));
            int key=A[j];
            int i=j-1;
            while(i>=0 && A[i]>key){
                A[i+1]=A[i];
                i=i-1;
            }
            A[i+1]=key;
        }
        return A;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(InsertionSort(ReadArray())));
    }
}