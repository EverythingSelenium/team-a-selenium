import org.testng.annotations.Test;

import javax.jws.Oneway;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PoonamTest1 {

    PoonamPage poonamPage = new PoonamPage(1001, "pooja");
    PoonamPage poonamPage1 = new PoonamPage(1010, "neela");
    InterfaceClass interfaceClass = new InterfaceClass();
    HybridClassPractice hybridClassPractice = new HybridClassPractice();


    @Test
    public void verifyWhileLoop() {
        poonamPage.whileLoop();
    }

    @Test
    public void verifySwitchLoop() {
        poonamPage.switchLoop(5);
        poonamPage.switchLoop(7);
        poonamPage.switchLoop(10);
    }

    @Test
    public void verifyForLoop() {
        poonamPage.forLoop();
    }

    @Test
    public void verifyArrayExample() {
        poonamPage.arrayExample();
    }

    @Test
    public void verifyArrayExample2() {
        poonamPage.arrayExample2();
    }

    @Test
    public void verifyStringExample() {
        poonamPage.stringExample();
    }

    @Test
    public void verifyMethodExample() {
//        poonamPage.methodExampleStudent(101,"mona",78, 59);
//        poonamPage.methodExampleStudent(44,"john", 80,90);
    }

    @Test
    public void constTest() {
        System.out.println(poonamPage.getId());
        System.out.println(poonamPage.getName());

        System.out.println(poonamPage1.getId());
        System.out.println(poonamPage1.getName());

        List<PoonamPage> poonamPageList = new ArrayList<>();
        poonamPageList.add(new PoonamPage(15, "someName1"));
        poonamPageList.add(new PoonamPage(12, "someName2"));
        poonamPageList.add(new PoonamPage(13, "someName3"));

        System.out.println("poonamPageList.size() = " + poonamPageList.size());
        System.out.println("poonamPageList = " + poonamPageList);

        for (PoonamPage poonamPage : poonamPageList) {
            System.out.println(poonamPage);
        }

        List<String> stringList = new ArrayList<String>();
        stringList.add("jnkk");
        stringList.add("gddfd");
        stringList.add("trekj");
        stringList.add("jnj;';y");

        for (String string : stringList) {
            System.out.println(string);
        }


    }

    @Test
    public void verifyOverlordingMethod() {
        poonamPage.sumNum(55, 66);
        poonamPage.sumNum(87, 54, "some");
    }

    @Test
    public void verifyInterface() {
        interfaceClass.a1();
        interfaceClass.practice();
        hybridClassPractice.a1();
        hybridClassPractice.h1();
        hybridClassPractice.practice();
    }

    @Test
    public void verifyTryCatchExamples(){
        poonamPage.tryCatchExample(5,2);
    }

    @Test
    public void verifyArrayListExample(){
        poonamPage.arrayListExample();
    }

    @Test
    public void hashMapExample() {
        Map<Integer, String> hs = new HashMap<>();

        hs.put(101, "one");
        hs.put(102, "two");
        hs.put(103, "three");
        hs.put(104, "four");

        System.out.println(hs.containsKey(103));
        System.out.println("hs.containsValue(\"some\") = " + hs.containsValue("some"));

        for (Map.Entry map : hs.entrySet()) {
            System.out.println("map.getKey() = " + map.getKey());
            System.out.println("map.getKey() = " + map.getValue());
        }
    }
}
