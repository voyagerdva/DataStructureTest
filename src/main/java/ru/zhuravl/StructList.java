package ru.zhuravl;

public class StructList implements DataStructureInterface {
    List list = new List();

    @Override
    public void add(String[] arr, String item) {
        list.push(arr, item);
    }

    @Override
    public void remove() {
        System.out.println("Mock/blanc/remove");
    }

    @Override
    public String pop() {
        return "Return Mock/blanc/pop";
    }

    @Override
    public void show() {
        System.out.println("Mock/blanc/show");

    }

    @Override
    public void reset() {
        System.out.println("Mock/blanc/reset");
    }
}
