package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {



    public static void main(String[] args)throws IOException {
        Scanner scanner = new Scanner(new File("input.txt")) ;
        Scanner scanner1 = new Scanner(new File("input1.txt"));
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner1.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String S=scanner.nextLine();
        Solution solution = new Solution(S);
        System.out.println(S);
        System.out.println();
        while(scanner1.hasNext()) {
            String s = scanner1.nextLine();
            System.out.println();
            solution.setfunc(s);
            System.out.println(s);
            solution.GetRes();
        }

	    scanner.close();
        scanner1.close();
    }

}
