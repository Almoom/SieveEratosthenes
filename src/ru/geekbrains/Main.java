package ru.geekbrains;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int repeatQuestion = 1;
        here: while(repeatQuestion!=0){
            System.out.println("Введите предел поиска простых чисел методом Решето Эратосфена - n");
            int n = scanner.nextInt();
            int [] tab = new int[n];
            for (int i = 0; i < n; i++) {
                tab[i] = i+1;
            }
            for (int p = 2; p <= n/2; p++){
                for (int i = p*p-1; i < n; i++) {
                    if (tab[i]%p == 0 && tab[i]>=p){
                        tab[i] = 0;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(tab[i]+" ");
            }
            System.out.println("");
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            repeatQuestion = scanner.nextInt();
            if (repeatQuestion==1) continue here;
            else break;
        }
    }
}
