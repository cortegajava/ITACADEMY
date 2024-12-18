package Sprint1.s01_05.lv1.ex1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Directory implements Serializable {
    private final File directory;
    transient private FileWriter myWriter;

    public Directory(String dir) {
        directory = new File(dir);
    }

    /**
     * Prints directory to console and to output file
     * @param dir to list recursively
     * @param depth used for formatting
     */
    private void list(File dir, int depth) {
        File save = new File("output/" + directory.getName());
        boolean printToFile = Files.isWritable(save.toPath());

        try {
            if(depth == 0) {
                if(printToFile) myWriter = new FileWriter(save);
            }
            if(dir.exists() && dir.isDirectory()) {
                File[] files = dir.listFiles();
                if(files != null) {
                    Arrays.sort(files, Comparator.comparing(File::getName));

                    if(depth == 0){
                        String msg = " ".repeat(40)+"Last Modified";
                        if(printToFile) myWriter.write(msg+"\n");
                        System.out.println(msg);
                    }
                    for (File file : files) {

                        StringBuilder strb = new StringBuilder();

                        String signature = file.isFile() ? " (F) " : " (D) ";
                        String lastModified = (new Timestamp(file.lastModified())).toString();
                        strb.append("  ".repeat(depth));
                        strb.append(file.getName());
                        strb.append(" ".repeat(Math.max(30 - strb.length(), 2)));
                        strb.append(signature);
                        strb.append(" ".repeat(5));
                        strb.append(lastModified);

                        System.out.println(strb.toString());
                        if(printToFile) myWriter.write(strb.append("\n").toString());

                        if(file.isDirectory()) {
                            list(new File(file.getPath()), depth+1);
                        }
                    }
                }
            }
            if(depth == 0) {
                myWriter.write("\n");
                System.out.println();

                if(printToFile) myWriter.close();
            }
        } catch (IOException e) {
            System.out.println("Cannot print list to file. ");
        }
    }
    public void list() {
        list(directory, 0);
    }

    public void readTxt(String fileName) {

        if(Files.notExists(Path.of(fileName))) {
            String[] name_ext = fileName.split(".");
            if(name_ext.length == 1) {
                if(Files.exists(Path.of(fileName+".txt"))) {
                    fileName = fileName+".txt";
                }
            }
        }

        File txt = new File(fileName);

        try {
            Scanner myReader = new Scanner(txt);
            System.out.println(fileName+":");

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
            System.out.println();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. ");
        }

    }

    public Path getPath() {
        return directory.toPath();
    }

}
