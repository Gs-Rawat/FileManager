package com.gsrawat.filemanager;

import java.io.File;

public class Remove {
    public static void removeFile(String fileName) throws Exception {
        File file = new File(fileName);
        if(file.delete());
        else
            System.out.println("Can't Delete File");
    }

    public static void removeDir(String dirName) throws Exception {
        File dir = new File(dirName);
        if(dir.delete());
        else
            System.out.println("Can't Delete Directory");
    }

}