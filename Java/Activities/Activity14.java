package com.ibm.activities;

import org.apache.commons.io.FileUtils;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Activity14 {

    public static void main(String[] args) throws IOException {
        File file = new File("sampleFile.txt");

        file.createNewFile();
        FileOutputStream fo = new FileOutputStream(file);
        fo.write("This is a file".getBytes(StandardCharsets.UTF_8));
        fo.close();

        File createdFile = FileUtils.getFile("sampleFile.txt");
        System.out.println("The content of the file is:\n" + FileUtils.readFileToString(createdFile, StandardCharsets.UTF_8));

        File folder = new File("resources");
        FileUtils.copyFileToDirectory(createdFile, folder);

        File copiedFile = FileUtils.getFile(folder, "sampleFile.txt");
        System.out.println("The content of the file now are:\n" + FileUtils.readFileToString(copiedFile, StandardCharsets.UTF_8));
    }
}
