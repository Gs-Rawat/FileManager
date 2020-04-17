package com.gsrawat.filemanager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Copy {
    public static void copy(String copyFrom, String copyTo) throws Exception {
        File src = new File(copyFrom);
        File dst = new File(copyTo);
        boolean srcAns = src.isFile();
        boolean dstAns = dst.createNewFile();
        if(srcAns && dstAns) {
               FileReader srcFile = new FileReader(src);
               FileWriter dstFile = new FileWriter(dst);
               BufferedReader reader = new BufferedReader(srcFile);
               BufferedWriter writer = new BufferedWriter(dstFile);
               String line = null;
               while((line = reader.readLine()) != null) {
                   writer.write(line + "\n");
               }
               reader.close();
               writer.close();
        }
        if(srcAns == false)
            System.out.println(copyFrom + " doesn't exists.");
        if(dstAns == false)
            System.out.println(copyTo + " file already exists.");
    }
}