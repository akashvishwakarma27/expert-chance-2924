package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Crime;
import bean.Criminal;

public class FileExists {

    public static List<Crime> CrimeFile() {

        List<Crime> CFile = null;

        File f = new File("Crime.ser");
        boolean flag = false;
        try {
            if (!f.exists()) {
                f.createNewFile();
                flag = true;
            }

            if (flag) {

                CFile = new ArrayList<>();
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
                oos.writeObject(CFile);
                return CFile;

            } else {

                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
                CFile = (List<Crime>) ois.readObject();

                return CFile;

            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        return CFile;
    }

    public static Map<String, Criminal> CriminalFile() {

        Map<String, Criminal> CFile = null;

        File f = new File("Criminal.ser");
        boolean flag = false;
        try {
            if (!f.exists()) {
                f.createNewFile();
                flag = true;
            }

            if (flag) {

                CFile = new HashMap<>();
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
                oos.writeObject(CFile);
                return CFile;

            } else {

                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
                CFile = (Map<String, Criminal>) ois.readObject();

                return CFile;

            }

        } catch (Exception e) {
            // TODO: handle exception

            System.out.println(e.getMessage());
        }
        return CFile;

    }
}
