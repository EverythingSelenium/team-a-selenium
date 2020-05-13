package amazon;

import java.util.ArrayList;

public class Java2020 {

    public void forLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public void arrayPractice() {
        String[] a = new String[5];
        a[0] = "poonam";
        a[1] = "Gaurang";
        a[2] = "Krish";
        a[3] = "kush";
        for (String i : a) {
            System.out.println(i);
        }
    }

    public void arrayList() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("moon");
        arr.add("Earth");
        arr.add("sun");
        arr.set(0, "Jupiter");
        for (String a : arr) {
            System.out.println(a);
        }
    }

    public void switchLoop(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("have a great day!");

        }
    }

    public void ifLoop(int time) {
        if (time < 20) {
            System.out.println("good day");
        } else {
            System.out.println("good night!");
        }
    }

    public void continueLoop(int number) {
        for (int i = 0; i < 20; i++) {

            if (i == 10) {
                break;
            }
            if (i == 5) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}



