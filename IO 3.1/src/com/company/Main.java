package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    private static Object java;

    public static void main(String[] args) throws IOException {

        StringBuilder s = new StringBuilder();

        File games = new File("Games");
        if (games.mkdir()) {
            s = s.append("Directory Games is created. \n");
        }
        File src = new File("Games", "src");
        if (src.mkdir()) {
            s = s.append("Directory src is created. \n");
        }
        File savegames = new File("Games", "savegames");
        if (savegames.mkdir()) {
            s = s.append("Directory savegames is created. \n");
        }
        File res = new File("Games", "res");
        if (res.mkdir()) {
            s = s.append("Directory res is created. \n");
        }
        File temp = new File("Games", "temp");
        if (temp.mkdir()) {
            s = s.append("Directory temp is created. \n");
        }
        File main = new File("Games/src", "main");
        if (main.mkdir()) {
            s = s.append("Directory main is created.\n");
        }
        File test = new File("Games/src", "test");
        if (test.mkdir()) {
            s = s.append("Directory test is created.\n");
        }
        File fileMain = new File("Games/src/main", "Main.java");
        try {
            if (fileMain.createNewFile()) {
                s = s.append("File Main.java is created.\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File util = new File("Games/src/main", "Utils.java");
        try {
            if (util.createNewFile()) {
                s = s.append("File Utils.java is created.\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File drawables = new File("Games/res", "drawables");
        if (drawables.mkdir()) {
            s = s.append("Directory drawables is created. \n");
        }
        File vectors = new File("Games/res", "vectors");
        if (vectors.mkdir()) {
            s = s.append("Directory vectors is created. \n");
        }
        File icons = new File("Games/res", "icons");
        if (icons.mkdir()) {
            s = s.append("Directory icons is created. \n");
        }
        File tempTxt = new File("Games/temp", "temp.txt");
        try {
            if (tempTxt.createNewFile()) {
                s = s.append("File temp.txt is created.\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        String text = s.toString();
        try (FileWriter fW = new FileWriter("Games/temp/temp.txt")) {
            fW.write(text);
            fW.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

