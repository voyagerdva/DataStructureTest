package ru.zhuravl;

public class Fixture {
    String test1_valueEthalon = "WORD";
    String[] test2_data = {"ONE", "TWO", "THREE", "FOUR", "FIVE"};
    String[] test2_listEthalon = {"ONE", "TWO", "THREE"};
    int test3_qty = 3;

    String test4_data1[] = {"11", "22", "33", "44"};
    String test4_data2[] = {"55", "66", "77"};
    String test4_listEthalon[] = {"11", "22", "33", "44", "55", "66", "77"};

    String intersect_data1[] = {"11", "22", "33", "44", "55", "66", "77", "88", "99", "X", "XI", "XII"};
    String intersect_data2[] = {"44", "22", "11", "X", "XII"};
    String intersect_listEthalon[] = {"11", "22", "44", "X", "XII"};

    String test6_data[] =        {"00", "11", "22", "33", "44", "55", "66"};
    String test6_listEthalon[] = {"11", "22", "33", "44", "55", "66"};
    int test6_sizeEthalon = 6;
    String test7_listEthalon[] = {"00", "11", "22", "44", "55", "66"};
    int test7_sizeEthalon = 6;
    String test8_listEthalon[] = {"00", "11", "22", "33", "44", "55"};
    int test8_sizeEthalon = 6;




}
