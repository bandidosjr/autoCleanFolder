package de.gsivera;

import javax.swing.*;
import java.io.File;

public class ReadFolder {
    public void readAndDisplayFolderContents() {
        String inputPath = JOptionPane.showInputDialog("Insert the path");
        String folderPath = inputPath;
        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println("File name: " + file.getName() + "\nLast modified: " + file.lastModified());
                } else if (file.isDirectory()) {
                    System.out.println("Folder name: " + file.getName());
                }
            }
        } else {
            System.out.println("The folder path is invalid or inaccessible.");
        }
    }
}
