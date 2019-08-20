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
    public static int [] Merge(int [] A,int p,int q,int r){
        //1,3,4,2,5
        //p=0,q=2,r=4
        int n1=q-p+1;
        int n2=r-q;
        int [] L=new int [n1+1];
        int [] R=new int[n2+1];
        L[n1]=Integer.MAX_VALUE;
        R[n2]=Integer.MAX_VALUE;
        for(int i=0;i<n1;i++)
            L[i]=A[p+i];
        for(int j=0;j<n2;j++)
            R[j]=A[q+j+1];
        int i=0;
        int j=0;
        for(int k=p;k<=r;k++){
            if(L[i]<=R[j]){
                A[k]=L[i];
                i++;
            }
            else{
                A[k]=R[j];
                j++;
            }
        }
        return A;
    }
    public static int [] MergeSort(int [] A,int p,int r){
        if(p<r){
            int q=(p+r)/2;
            MergeSort(A,p,q);
            MergeSort(A,q+1,r);
            Merge(A,p,q,r);
        }
        return A;
    }
    public static void main(String[] args){
        //System.out.println(Arrays.toString(InsertionSort(ReadArray())));
        System.out.println(Arrays.toString(MergeSort(ReadArray(),0,4)));
    }
}