package ru.zhuravl;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//      TEST 1. Single add()
        List listLib = new List();
        StructList structList = new StructList();
        Fixture fixt = new Fixture();

        String[] arr = fixt.arr;

        structList.add(arr, fixt.Item_SSS0);
        System.out.println(Arrays.toString(arr));

        if (Arrays.equals(arr, fixt.arrEthalon)) System.out.println("Тест пройден!");
        else System.out.println("Тест НЕ пройден! :-((( ");

    }


}
