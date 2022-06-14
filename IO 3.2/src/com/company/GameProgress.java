package com.company;

import java.io.*;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class GameProgress implements Serializable {
    private static final long serialVersionUID = 1L;

    private int health;
    private int weapons;
    private int lvl;
    private double distance;

    public GameProgress(int health, int weapons, int lvl, double distance) {
        this.health = health;
        this.weapons = weapons;
        this.lvl = lvl;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "GameProgress{" +
                "health=" + health +
                ", weapons=" + weapons +
                ", lvl=" + lvl +
                ", distance=" + distance +
                '}';
    }

    public void saveGame(String path, GameProgress gameProgress) {
        try (FileOutputStream fos = new FileOutputStream(path);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(gameProgress);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void zipFiles(String filename, List<String> fileForZip) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("C://Users/Admin/IdeaProjects/Core 3.1/Games/savegames/zipSave.zip");
             ZipOutputStream zipOut = new ZipOutputStream(fos)) {
            for (String forZip : fileForZip) {
                File fileToZip = new File(forZip);
                FileInputStream fis = new FileInputStream(fileToZip);
                ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
                zipOut.putNextEntry(zipEntry);
                byte[] bytes = new byte[1024];
                int length;
                while ((length = fis.read(bytes)) >= 0) {
                    zipOut.write(bytes, 0, length);
                }
                zipOut.closeEntry();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        File dir = new File("C://Users/Admin/IdeaProjects/Core 3.1/Games/savegames");
        for (File item : dir.listFiles()) {
            if (item.getName().contains(".dat")) {
                item.delete();

            }
        }
    }
}




