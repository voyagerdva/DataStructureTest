package ru.zhuravl;

import java.util.Arrays;

public class Test {
    List listLib = new List();
    StructList structList = new StructList();

    Fixture fixt = new Fixture();
    String[] arr = fixt.arr;

    public void test_1_single_add() {
        structList.add(arr, fixt.Item_SSS0);
        System.out.println(Arrays.toString(arr));

        if (Arrays.equals(arr, fixt.arrEthalon)) System.out.println("Тест пройден!");
        else System.out.println("Тест НЕ пройден! :-((( ");

    }


}
