package ru.zhuravl;

public class TestApplication {
    public static void main(String[] args) {
        Test test = new Test();
        Fixture fixture = new Fixture();

        StructList structList = new StructList();

        String item = "SSS0";

//        structList.add(item);
        structList.show();

        System.out.println("DONE!!!");
    }
}
