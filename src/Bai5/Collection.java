package Bai5;

import java.util.ArrayList;

public class Collection {
    public static void main(String[] agrs) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }

        for (int i : list) {
            System.out.print(" " + i);
        }

        ArrayList<String> employeeInfo = new ArrayList<>();

        employeeInfo.add("Nguyen Van A");
        employeeInfo.add("25 years old");
        employeeInfo.add("Accountant");
        employeeInfo.add("Ha Noi");
        employeeInfo.add("Experience - 5 years");

//        System.out.println("Các phần tử của Set");
//        System.out.print("\t" + employeeInfo + "\n");

        System.out.println();
        for (int i = 0; i < employeeInfo.size(); i++) {
            System.out.println(employeeInfo.get(i));
        }
    }
}


