package com.gsrawat.filemanager;

public class Main {
    public static void main(String[] args) {
        String choice = args[0];
        switch (choice) {
            // case "read":
            //     Reader.read();  
            //     break;
            
            // case "write":
            //     Writer.write();
            //     break;

            // case "mkdir":
            //     Directory.mkdir(); 
            //     break;
            
            case "cp":
                try {
                    Copy.copy(args[1], args[2]);
                }
                catch(Exception ex) {
                    ex.printStackTrace();
                }
                break;
            
            // case "del":
            //     Delete.del();
            //     break;

            // case "lsdir":
            //     Directory.listdir();
            //     break;
        
            default:
                break;
        }

    }
}