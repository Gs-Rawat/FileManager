package com.gsrawat.filemanager;

public class Main {
    public static void main(String[] args) {
        String choice = args[0];
        switch (choice) {
            case "read":
                Reader.read();  
                break;
            
            case "write":
                Writer.write();
                break;

            case "mkdir":
                Directory.mkdir(); 
                break;
            
            case "cp":
                Copy.cp();
                break;
            
            case "del":
                Delete.del();
                break;
        
            default:
                break;
        }

    }
}