package com.filerename.util;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Reader {

    Scanner userInput = new Scanner(System.in);
    Writer writer = new Writer();

    public Reader(){

    }

    public void searchForDirectory()  {
        System.out.println("Which directory would you like to rename?");
        String directoryToSearch = userInput.nextLine();
        File readFromDirectory = new File(directoryToSearch);

        File[] listOfFiles = readFromDirectory.listFiles();

        if (readFromDirectory.isDirectory()){

            writer.copyToFolder(readFromDirectory);

            for(File fileEntry : listOfFiles){
                System.out.println(fileEntry.getName());
                writer.writeToRenameFile(fileEntry.getName());
            }
        }
    }
}
