package com.gsrawat.filemanager;

import java.io.File;

public class Directory {
    public static void listDir(String name) throws Exception{
        File file = new File(name);
        String[] path = file.list();
        for(String x : path)
            System.out.print(x + "\t");
        System.out.println();
    }
}