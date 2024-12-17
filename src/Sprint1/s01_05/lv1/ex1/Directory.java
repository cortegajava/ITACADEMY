package Sprint1.s01_05.lv1.ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Comparator;

public class Directory {
    private final File directory;
    private FileWriter myWriter;

    public Directory(String dir) {
        directory = new File(dir);

        try {
            File save = new File("output/" + directory.getName());
            myWriter = new FileWriter(save);
        } catch (IOException e) {
            System.out.println("Cannot write to file. ");
        }
    }

    public void list(File dir, int depth) {
        if(dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();
            if(files != null) {
                Arrays.sort(files, Comparator.comparing(File::getName));

                try {
                    if(depth == 0){
                        String msg = " ".repeat(30)+"Last Modified";
                        myWriter.write(msg+"\n");
                        System.out.println(msg);
                    }
                    for (File file : files) {

                        StringBuilder str = new StringBuilder();

                        String signature = file.isFile() ? " (F) " : " (D) ";
                        String lastModified = (new Timestamp(file.lastModified())).toString();
                        str.append("  ".repeat(depth));
                        str.append(file.getName());
                        str.append(" ".repeat(Math.max(30 - str.length(), 2)));
                        str.append(signature);
                        str.append(" ".repeat(5));
                        str.append(lastModified);

                        System.out.println(str.toString());
                        myWriter.write(str.append("\n").toString());

                        if(file.isDirectory()) {
                            list(new File(file.getPath()), depth+1);
                        }
                    }
                    myWriter.close();
                } catch (IOException e) {
                    System.out.println("Cannot write to file. "); // todo debug
                }
            } //else System.out.println("Directory is empty.");
        } else System.out.println("Not a directory.");
    }
    public void list() {
        list(directory, 0);
    }

    public void readTxt(String fileName) {
        //File txt = new File(directory.)
    }
}
