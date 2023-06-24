import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class DZ5 {

    public static void main(String[] args) throws IOException {
        copyFiles("G:\\#GB\\#JavaCore\\DZ5\\src\\main\\java\\randomFiles\\");
        print(new File("G:\\#GB\\#JavaCore\\DZ5\\src\\main\\java\\"), "", true);
    }

    static void copyFiles(String szDir) throws IOException {

        File f = new File(szDir);
        String destination = "G:\\#GB\\#JavaCore\\DZ5\\src\\main\\java\\backup\\";
        String[] sDirList = f.list();
        for(int i = 0; i < Objects.requireNonNull(sDirList).length; i++)
        {
            File f1 = new File(szDir + File.separator + sDirList[i]);

            if(f1.isFile()){
                System.out.println(szDir + File.separator + sDirList[i]);
                copyFile(new File(szDir + File.separator + sDirList[i]), new File(destination+f1.getName()));
            }
            else
            {
                copyFiles(szDir + File.separator + sDirList[i]);
            }
        }
    }

    public static void copyFile(File src, File dest) throws IOException {
        Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }


    public static void print(File file, String indent, boolean isLast) {
        System.out.print(indent);
        if (isLast) {
            System.out.print("|_");
            indent += " ";
        } else {
            System.out.print("|–");
            indent += "| ";
        }
        System.out.println(file.getName());

        File[] files = file.listFiles();
        if (files == null) {
            return;
        }

        int subDirsTotal = 0;

        for (File value : files) {
            if (value.isDirectory()) {
                subDirsTotal++;
            }
        }

        int subDirCounter = 0;
        for (File value : files) {
            if (value.isDirectory()) {
                print(value, indent, subDirCounter == subDirsTotal - 1);
                subDirCounter++;
            }

        }

    }
}
