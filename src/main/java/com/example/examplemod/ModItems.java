package com.example.examplemod;

import com.example.examplemod.firstitem.FirstItem;

public class ModItems {

    public static FirstItem firstItem;

    public static void init() {
        firstItem = new FirstItem();
    }
}