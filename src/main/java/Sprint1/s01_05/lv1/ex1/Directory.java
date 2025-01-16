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
     * @param depth recursion depth, used for formatting
     */
    private void list(File dir, int depth) {
        File save = new File("output" + File.separator + directory.getName());
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
    // TODO: test it works
        String filePath = directory.toString() + File.separator + fileName;
        if(Files.notExists(Path.of(filePath))) {
            String[] name_ext = fileName.split(".");
            if(name_ext.length == 1) {
                if(Files.exists(Path.of(filePath+".txt"))) {
                    fileName = fileName+".txt";
                }
            }
        }

        File txt = new File(filePath);

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

    public static void serializeDir(Directory obj){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("output" + File.separator + "serializedDir.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(obj);
            objectOutputStream.flush();
            objectOutputStream.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static Directory deserializeDir(){
        Directory dir = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("output" + File.separator + "serializedDir.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            dir = (Directory) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return dir;
    }

    public static void main(String[] args) {
        Directory dir = null; // TODO: handle null directory

        if(args.length > 0) {
            if(args[0].equals("-cd")) {
                if(args.length > 1) {
                    dir = new Directory("resources" + File.separator + args[1]);
                    serializeDir(dir);
                }
                else {  }
            }
            if(args[0].equals("-ls")) {
                dir = deserializeDir();
                dir.list();
            }
            if(args[0].equals("-cat")) {
                if(args.length > 1) {
                    dir = deserializeDir();
                    dir.readTxt("resources" + File.separator + args[1]);
                }
                else { System.out.println("Provide a directory. "); }
            }
        }
        else {
            System.out.println("Directory Manager");
        }
    }
}

