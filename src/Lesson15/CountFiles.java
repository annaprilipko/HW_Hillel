package Lesson15;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountFiles {
    //Посчитать количество файлов в директории и во всех вложенных папках.

    public static List<File> lFiles = new ArrayList<>();
    public static int fileLength;

    static void showHowManyFiles(String path){
        File getFile = new File(path);
        File[] files = getFile.listFiles();
        for( File f: files ){
            if( f.isDirectory() ) showHowManyFiles(Paths.get(path, f.getName()).toAbsolutePath().toString());
            else {
                lFiles.add(f);
                fileLength++;
            }
        }
    }

}
