package com.filerename;

import com.filerename.util.Reader;
import com.filerename.util.Writer;

public class ReadFolder {

    private static ReadFolder readFolder;
    private Reader reader;
    private Writer writer;

    public void run(){
        reader = new Reader();
        writer = new Writer();

        writer.deleteLog();
        reader.searchForDirectory();
    }

    public static void main(String[] args) {
        readFolder = new ReadFolder();
        readFolder.run();
    }
}
