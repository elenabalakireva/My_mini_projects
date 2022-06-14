package com.company;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        GameProgress gameProgress = new GameProgress(10, 3, 2, 35.45);
        GameProgress gameProgress1 = new GameProgress(20, 1, 1, 12.65);
        GameProgress gameProgress2 = new GameProgress(15, 5, 5, 78.65);
        gameProgress.saveGame("C://Users/Admin/IdeaProjects/Core 3.1/Games/savegames/save1.dat", gameProgress);
        gameProgress1.saveGame("C://Users/Admin/IdeaProjects/Core 3.1/Games/savegames/save2.dat", gameProgress1);
        gameProgress2.saveGame("C://Users/Admin/IdeaProjects/Core 3.1/Games/savegames/save3.dat", gameProgress2);
        ArrayList<String> list = new ArrayList<>();
        list.add("C://Users/Admin/IdeaProjects/Core 3.1/Games/savegames/save1.dat");
        list.add("C://Users/Admin/IdeaProjects/Core 3.1/Games/savegames/save2.dat");
        list.add("C://Users/Admin/IdeaProjects/Core 3.1/Games/savegames/save3.dat");
        GameProgress.zipFiles("C://Users/Admin/IdeaProjects/Core 3.1/Games/savegames/zip.zip", list);
    }
}
