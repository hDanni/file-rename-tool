package com.filerename;

import com.filerename.util.Reader;
import com.filerename.util.Writer;

public class RenameFile {

    private static RenameFile renameFile;
    private Writer writer;

    public void run(){
        writer = new Writer();
        writer.renameFilesInFolder();
    }

    public static void main(String[] args) {
        renameFile = new RenameFile();
        renameFile.run();
    }
}
