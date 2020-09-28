package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int numbers = Integer.valueOf(s.nextLine()).intValue();
        String line = s.nextLine();
        s.close();
        String[] all = line.split("\\s");
        int elements[] = new int[numbers];
        for (int i = 0; i < numbers; i++)
            elements[i] = Integer.valueOf(all[i]).intValue();

        int count = 0;
        for (int i = 0; i < numbers; i++)
            if (elements[i] > 0)
                count++;
        System.out.println(count);

    }
}
