package com.yr.JavaCoreProject.tasks.custom_lists;

public interface Lists {

    boolean add();
    int size();
    boolean remove(Object o);
    boolean addAll();
    void clear();
    Object get(int index);
    Object set(int index, Object element);

}