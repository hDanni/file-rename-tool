**File Rename Tool**

This is a small project that I was inspired by at my previous company where we had to rename a large number of images at once (1000+) to fit different retailer needs.

The original application idea came from a previous employee who wrote an application that had a GUI and interface. I was always curious at the logic behind it, and so I thought it'd be fun to recreate it using the tools I've learned.

Here's how it works:

Some caveats:

* The number of files in the folder and the lines on the **"rename.txt"** file must match.
* There can't be duplicate names or an error will be thrown.

1. Run the **ReadFolder** application first, it will prompt you for the path of the folder of the files you'd like to rename.
2. If a path is found, it'll create a new folder named "**RenamedFiles**" in this tool's folder with the files in the folder you input copied over.
3. It will also create a **"rename.txt"** file that has all the file names. This will be where you make your edits.
4. You can make manual edits to the **"rename.txt"** file as you see fit. However, with a larger number of files, I recommend using Excel or Google Sheets to ensure each file is being renamed appropriately.
5. Once done, save **"rename.txt"** and close out.
6. Run the **RenameFile** application and the files in **"RenamedFiles"** will be renamed accordingly.
7. You do not have to delete "rename.txt" but you will need to delete **"RenamedFiles"** folder to reuse.

**TODO**:
1. Build in constraints on the size of the file and the number of lines on the rename.txt file.
2. Check for duplicates in the saved text file (renameFilesInFolder).
3. Build in auto delete between runs so user doesn't have to manually delete **"RenamedFiles"**.
4. Include a banner for the prompt and success log if it worked.
5. Possibly log each old file name, new file name, timestamp to a database for record keeping.