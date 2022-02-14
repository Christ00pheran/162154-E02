import java.io.File;

public class zad3 {
    public static File[] zadFile(String path){
        File pliki = new File(path);
        return pliki.listFiles((file)->file.isDirectory());

    }
    public static void main(String[] args){
        for(File x: zadFile("C:\\")){
            System.out.println(x.getName());
        }

    }
}
