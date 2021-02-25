package com.company.hw2;

import java.util.ArrayList;
import java.util.List;

public class CreateList {
    private static final int LIST_SIZE = 1_000_000;
    private List<Integer> list;
    private int number;

    public CreateList() {
        this.list = new ArrayList<>();
    }

    public CreateList(int number) {
        this.list = new ArrayList<>();
        this.number = number;
        createList(number);
    }

    public List<Integer> createList() {
        while (list.size() < LIST_SIZE) {
            list.add(number);
        }
            return list;
    }

    public List<Integer> createList(int number) {
        while (list.size() < LIST_SIZE) {
            list.add(number);
        }
        return list;
    }
}
