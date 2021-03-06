package com.AQAS.main;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Logger {

    private String folderName;
    private static Logger ourInstance = null;

    public static Logger getInstance() {
        if (ourInstance == null) {
            ourInstance = new Logger("tmp");
        }
        return ourInstance;
    }

//    private Logger() {
//        ourInstance = new Logger();
//    }

    public Logger(String folderName) {
        this.folderName = "Logs/" + folderName;
        ourInstance = this;
        initializeLogger();
    }

    public static boolean deleteDirectory(File dir) {


        if (dir.isDirectory()) {
            File[] children = dir.listFiles();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDirectory(children[i]);
                if (!success) {
                    return false;
                }
            }
        }

        System.out.println(dir + " deleted");
        return dir.delete();
    }

    public void createDirectory(String name) {
        File theDir = new File(name);

        // if the directory does not exist, create it
        if (!theDir.exists()) {
            System.out.println("creating directory: " + theDir.getName());
            boolean result = false;

            try {
                theDir.mkdir();
                result = true;
            } catch (SecurityException se) {
                //handle it
            }
            if (result) {
                System.out.println("DIR created");
            }
        }
    }

    private void initializeLogger() {

        createDirectory("Logs");
        deleteDirectory(new File(this.folderName));
        createDirectory(this.folderName);

        String[] folders = new String[]{
                ConfigM.LogFolders.ANSWER_EXTRACTION,
                ConfigM.LogFolders.DOC_RETRIEVAL,
                ConfigM.LogFolders.PASSAGE_EXTRACTION,
                ConfigM.LogFolders.PREPROCESSING,

        };
        for (String folder : folders) {
            createDirectory(getFullPath(folder));
        }
    }


    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = "Logs/" + folderName;
    }

    public String getFullPath(String path) {
        return this.folderName + "/" + path;
    }

    public void log(String path, String message) throws IOException {
        PrintWriter out = null;
        try {
            File file = new File(getFullPath(path));
            file.getParentFile().mkdirs();//make parent directory if not exist

            if (!file.exists()) {
                file.createNewFile();
            }
            out = new PrintWriter(new FileOutputStream(file, true));
            out.println(message);
            out.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            if (out != null) {
                out.close();
            }
        }

    }
}
