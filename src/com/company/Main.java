package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        makeDir(new String[]{"src", "res", "savegames", "temp"}, sb, "C://Games/");
        makeDir(new String[]{"main", "test"}, sb, "C://Games/src/");
        makeDir(new String[]{"drawables", "vectors", "icons"}, sb, "C://Games/res/");
        try {
            makeFile(new String[]{"Main.java", "Utils.java"}, sb, "C://Games/src/main/");
            makeFile(new String[]{"temp.txt"}, sb, "C:/Games/temp/");
            FileWriter writer = new FileWriter("C:/Games/temp/temp.txt");
            writer.write(String.valueOf(sb));
            writer.close();
        } catch (Exception e) {
            sb.append(e);
        }
        System.out.println(sb);
    }

    public static void makeDir(String[] names, StringBuilder log, String path) {
        for (String dir : names) {
            File file = new File(path + dir);
            if (!file.exists()) {
                if (file.mkdir()) {
                    log.append(dir + " directory is created!\n");
                } else {
                    log.append("Failed to create " + dir + " directory!\n");
                }
            } else {
                log.append(dir + " directory is already exist!\n");
            }
        }
    }

    public static void makeFile(String[] fileName, StringBuilder log, String path) throws IOException {
        for (String files : fileName) {
            File file = new File(path + files);
            if (file.createNewFile())
                log.append("File " + files + " is created!\n");
            else
                log.append("File " + files + "is already exists!\n");
        }
    }
}

