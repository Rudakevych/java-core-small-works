package com.yr.JavaCoreProject.tasks.custom_lists;

import java.util.ArrayList;
import java.util.LinkedList;

public class CustomArrayList implements Lists{

    ArrayList arrayList = new ArrayList();
    LinkedList linkedList = new LinkedList();

    @Override
    public boolean add() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }
}
