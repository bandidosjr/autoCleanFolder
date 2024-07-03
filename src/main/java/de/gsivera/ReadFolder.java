package de.gsivera;

import javax.swing.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReadFolder {
    public void readAndDisplayFolderContents() {
        // Insert now the exact path, in the future should be implemented for Win and UNIX to select the folder
        String inputPath = JOptionPane.showInputDialog("Insert the path");
        String folderPath = inputPath;

        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        if (files != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); // Date format without time
            for (File file : files) {
                if (file.isFile()) {
                    String lastModifiedDate = sdf.format(new Date(file.lastModified()));
                    System.out.println("File name: " + file.getName() + "\nLast modified: " + lastModifiedDate);
                } else if (file.isDirectory()) {
                    System.out.println("Folder name: " + file.getName());
                }
            }
        } else {
            System.out.println("The folder path is invalid or inaccessible.");
        }
    }
}
