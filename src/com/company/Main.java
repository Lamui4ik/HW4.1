package com.company;

import java.io.File;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        String[] namesDir = new String[]{"src", "res", "savegames", "temp"};
        for (int i = 0; i < 4; i++) {
            File file = new File("C://Games//" + namesDir[i]);
            if (!file.exists()) {
                if (file.mkdir()) {
                    sb.append(namesDir[i] + " directory is created!\n");
                } else {
                    sb.append("Failed to create " + namesDir[i] + " directory!\n");
                }
            } else {
                sb.append(namesDir[i] + " directory is already exist!\n");
            }
        }
        String[] namesSrcDir = new String[]{"main", "test"};
        for (int i = 0; i < 2; i++) {
            File file = new File("C://Games/src/" + namesSrcDir[i]);
            if (!file.exists()) {
                if (file.mkdir()) {
                    sb.append(namesSrcDir[i] + " directory is created!\n");
                } else {
                    sb.append("Failed to create " + namesSrcDir[i] + " directory!\n");
                }
            } else {
                sb.append(namesSrcDir[i] + " directory is already exist!\n");
            }
        }
        String[] namesResDir = new String[]{"drawables", "vectors", "icons"};
        for (int i = 0; i < 3; i++) {
            File file = new File("C://Games/res/" + namesResDir[i]);
            if (!file.exists()) {
                if (file.mkdir()) {
                    sb.append(namesResDir[i] + " directory is created!\n");
                } else {
                    sb.append("Failed to create " + namesResDir[i] + " directory!\n");
                }
            } else {
                sb.append(namesResDir[i] + " directory is already exist!\n");
            }
        }
        try {
            String[] fileMain = new String[]{"Main.java", "Utils.java"};
            for (int i = 0; i < 2; i++) {
                File file = new File("C://Games/src/main/" + fileMain[i]);
                if (file.createNewFile())
                    sb.append("File " + fileMain[i] + " is created!\n");
                else
                    sb.append("File " + fileMain[i] + "is already exists!\n");
            }

            File file = new File("C:/Games/temp/temp.txt");
            if (file.createNewFile())
                sb.append("File temp.txt is created!\n");
            else
                sb.append("File temp.txt is already exists!\n");
            FileWriter writer = new FileWriter(file);
            writer.write(String.valueOf(sb));
            writer.close();
        } catch (Exception e) {
            sb.append(e);
        }
        System.out.println(sb);
    }
}

