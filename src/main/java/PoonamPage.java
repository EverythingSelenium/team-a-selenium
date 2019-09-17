import com.sun.javafx.collections.MappingChange;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PoonamPage {

    private int id;
    private String name;
    private int sub1;
    private int sub2;
    static int idNum = 99;


    PoonamPage(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void whileLoop() {
        int i = 0;
        while (i < 5) {
            i++;
            System.out.println("i = " + i);
        }
    }

    public void switchLoop(int day) {

        switch (day) {
            case 1:
                System.out.println("monday");
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
                System.out.println("friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("enjoy Sunday");
        }
    }

    public void forLoop() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void arrayExample() {

        int a[] = new int[5]; // or int a[] = {10,20,30,40,50};
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
        for (int num : a) {
            System.out.println(num);
        }
    }

    public void arrayExample2() {
        int num[][] = new int[3][2];
        num[0][0] = 100;
        num[0][1] = 200;
        num[1][0] = 300;
        num[1][1] = 400;
        num[2][0] = 500;
        num[2][1] = 600;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++)
                System.out.println(num[i][j]);
        }

        for (int num1[] : num) {
            for (int l : num1) {
                System.out.println("for each loop  :" + l);
            }
        }
    }

    public void stringExample() {
        String s = "Welcome to Java";
        String s1 = "Selenium";
        System.out.println("lower case  :" + (s.toLowerCase()));
        System.out.println("upper case  : " + (s.toUpperCase()));
        System.out.println("contains methods: " + (s.contains("Java")));
        System.out.println("charAt methods : " + s.charAt(5));
        System.out.println(s.indexOf("to"));
        System.out.println(s + "  and  " + s1);
        System.out.println(s.lastIndexOf("e"));
        System.out.println(s1.contentEquals("Welcome to Java"));
        System.out.println(s.indexOf("java"));
        System.out.println(s.replace("java", "selenium"));
    }

//    @Override
//    public String toString() {
//        return "The name is " + this.name + ". The ID is " + this.id;
//    }

    public void sumNum(int x, int y) {
        System.out.println(x + y);
    }

    public void sumNum(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    public void sumNum(int x, int y, String n) {
        System.out.println(x + y);
    }

    public void tryCatchExample(int enterNumber,int index) {
        try {
            System.out.println(100 / enterNumber);
        } catch (Exception e) {
            System.out.println("entered in catch block.." + e);
        } finally {
            System.out.println("Happy ending");
        }
        int[] a = new int[10];
        try {
            a[index] = 15;
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println(a[index]);

    }

    public void arrayListExample(){
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Object> objects = new ArrayList<>();

        objects.add(90);
        objects.add("mona");
        objects.add('a');
        objects.add(67.99);

        list.add("Texas");
        list.add("il");
        list.add("michigon");
        list.add("chicago");

        for(String s1 :list){
            System.out.println(s1);
        }

        for (Object o : objects){
            System.out.println(o);
        }

    }

    public void hashMapExample(){
        Map<Integer, String> hs =new HashMap<>();

        hs.put(100,"one");
        hs.put(101,"two");
        hs.put(102,"three");
        hs.put(104,"four");

        for(Map.Entry map: hs.entrySet()){
            System.out.println("map.getKey() = " + map.getKey());
            System.out.println("map.getKey() = " + map.getValue());
        }

    }
}














