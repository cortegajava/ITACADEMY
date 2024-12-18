package Sprint1.s01_05.lv1.ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Directory dir = new Directory("resources/test_dir");
        dir.list();
        dir.readTxt("resources/test_dir/test1.txt");

        // serialize and deserialize dir
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("output/serializedDir.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(dir);
            objectOutputStream.flush();
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("output/serializedDir.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Directory dir2 = (Directory) objectInputStream.readObject();
            objectInputStream.close();

            // check this is the object we serialized
            System.out.println("Serialized object is a Directory with path " + dir2.getPath());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}