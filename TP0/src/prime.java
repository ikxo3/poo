/* static int  f(int ARR[][],int x) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == j) {
                    s = s + ARR[i][i];
                }}}
        return s;}*/

import java.sql.SQLOutput;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*ex1 System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int c=0;
       for(int i=2; i<n; i++){
           if (n%i==0){
               c++ ;
           }

           }
        if(c==0){System.out.println("Prime Number");}
        else{System.out.println("Not Prime Number");}*/
       /*ex2 double [] arr = new double[5];
        double sum = 0;
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter number "+(i+1)+": ");
            arr[i] = sc.nextDouble();
            sum=arr[i]+sum;
        }
        System.out.println("The sum of the numbers is: "+sum);*/
        /*ex3 int a , b ;
        do{
            System.out.print("Enter a number a a>0: ");
            System.out.print("Enter a number b b>0: ");
        a = sc.nextInt();
        b = sc.nextInt();
        }while (a<0 || b<0);
       if(b%a==0){
        System.out.print("b divided by a");}
       else{System.out.print("b no divided by a");}
        char []u = new char[10];
        System.out.println("Enter  characters: ");
        for (int i = 0; i < u.length; i++) {
            u[i] = sc.next().charAt(0);}
        char k ; int m =0;
        System.out.println("Enter character to count it: ");
        k = sc.next().charAt(0);
        for (int i = 0; i < u.length; i++) {
            if(u[i] == k){
                m++ ;}
        }System.out.print(m+" times");*/
        // calculate diagonal of a square matrix
       /* System.out.print("Enter nxn: ");
        int n = sc.nextInt();
        System.out.println(" compait it: ");
        int s = 0;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if (i == j) {
                    s = s + arr[i][i];}}}
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "  ");}
            System.out.println();}
        System.out.println(f(arr, n));*/
        System.out.println("Enter n m");
        int m = sc.nextInt();
        int n = sc.nextInt();
        double [][]tab= new double [n][m] ;
        System.out.println("compait matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tab[i][j] = sc.nextInt();
                }}

        //]g(tab,n,m);
        System.out.println("M1");
        print(tab);
        System.out.println("M2");
        System.out.println(g(tab));
    }

    static double[][] g (double T[][]){
        Scanner sc = new Scanner(System.in);
        double [][]t = new double[T.length][T[0].length];
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[0].length; j++) {
                t[i][j]= Math.pow(T[i][j],3);
            }
        }
    return t;
    }
    static void print(double [][]t){

        for (int i = 0; i <t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                System.out.print(t[i][j]+"    ");
            }
            System.out.println();
        }
    }
}



