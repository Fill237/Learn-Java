package masha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int x = input.nextInt();
       int x1 = input.nextInt();
       int z = x + x1;
       int v = x - x1;
       System.out.println("Сложение: "+ x+ " + " +x1+ " " + "= " + z);
      // System.out.println("Вычитание: "+ x+ " - " +x1+ " " + "= " + v);

    }
}
