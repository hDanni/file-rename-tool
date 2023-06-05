package com.filerename.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.apache.commons.io.FileExistsException;
import org.apache.commons.io.FileUtils;

public class Writer {

    private static final String writeToFile = "rename.txt";
    private static final String destFolderName = "RenamedFiles";
    private static File copiedFileDestination = null;
    private File fileDestination = null;

    public Writer(){
        fileDestination = new File(writeToFile);
        copiedFileDestination = new File(destFolderName);
    }

    public void writeToRenameFile(String filesInDirectory) {

        try(PrintWriter fileWriter = new PrintWriter(new FileOutputStream(fileDestination, true))){
            fileDestination.createNewFile();
            fileWriter.println(filesInDirectory);
        }catch (Exception ex){
            //alligator
        }
    }

    // takes in a folder/directory to copy and copies it to this application's folder.
    // this is where the renamed files will live.
    public void copyToFolder(File srcDir) {
        if (!copiedFileDestination.exists()){
            try {
                FileUtils.copyDirectory(srcDir,copiedFileDestination);
            } catch (Exception ex){
                //Alligator
            }
        }
    }

    public void renameFilesInFolder(){
        File[] listFiles = copiedFileDestination.listFiles();

        try(Scanner fileReader = new Scanner(fileDestination)){
            int counter = 0;

            while(fileReader.hasNextLine()){
                File oldName = new File(destFolderName + "/" + listFiles[counter].getName());
                File newName = new File(destFolderName + "/" + fileReader.nextLine()+ extensionParser(oldName));

                oldName.renameTo(newName);
                counter++;
                System.out.println(oldName.getName() + " renamed to: " + newName.getName());
            }
        } catch (Exception ex){

        }
    }

    public void deleteLog(){
        if(fileDestination.exists()){
            fileDestination.delete();
        }
    }

    public String extensionParser(File file){

        String extToAdd = null;
        String fileName = file.getName();
        int dotIndex = fileName.lastIndexOf(".");

        if (dotIndex >= 0){
            extToAdd = "." + fileName.substring(dotIndex + 1);
        }
        return extToAdd;
    }
}
