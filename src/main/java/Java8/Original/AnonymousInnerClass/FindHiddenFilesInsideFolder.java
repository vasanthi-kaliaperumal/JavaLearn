package Java8.Original.AnonymousInnerClass;

import java.io.File;
import java.io.FileFilter;

public class FindHiddenFilesInsideFolder {
    public static void main(String ar[]){
        File[] hiddenFiles = new File("C:\\").listFiles(
                new FileFilter(){
                    public boolean accept(File file){
                        return file.isHidden();
                    }
                }
        );
        for(File d:hiddenFiles){
            System.out.println(d.getName());
        }
    }
}
