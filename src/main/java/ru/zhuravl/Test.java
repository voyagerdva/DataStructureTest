package ru.zhuravl;

import java.util.Arrays;
import ru.zhuravl.InterfaceList;

public class Test {

    public void test_1_single_add() {
        InterfaceList list = new List();
        Fixture fixt = new Fixture();

        String[] arr = fixt.arr;
        list.add(arr, fixt.Item_SSS0);

        System.out.println(Arrays.toString(arr));

//        if (Arrays.equals(arr, fixt.arrEthalon)) System.out.println("Тест пройден!");
//        else System.out.println("Тест НЕ пройден! :-((( ");
        assert (Arrays.equals(arr, fixt.arrEthalon));
        System.out.println(Arrays.toString(arr));

    }


}
