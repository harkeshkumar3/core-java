package com.core.Collections;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyOnWriteArrayList {

    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<String>();
        list.add("Ind");
        list.add("Pak");
        list.add(null);    //synchronized and does  allow null elements?
        for (String s : list) {
            System.out.println(s + "");
            list.add("new add");
        }


    }
}
