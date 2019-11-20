import java.io.File;

/*Написать функциюpublic void copyFile(String from, String to){}
которая принимает файл и цель и копирует файл.
Например: copyFile(“c:\\temp\\bigfile.zip”, “c:\\temp2”)
должна скопировать ​bigfile.zip​ в папку ​temp2​*/
public class CopyFile {
    public static void main(String[] args) {
        copyFile("\\Users\\lizap\\Dropbox\\Intellij\\Work space\\2019_07_25_CopyFile\\tmp1\\txt1.txt",
                "Users\\lizap\\Dropbox\\Intellij\\Work space\\2019_07_25_CopyFile\\tmp2\\txt2.txt");
    }
    public static void copyFile (String sourceFile, String targetFile){
        File source = new File(sourceFile);
        System.out.println(source.getAbsolutePath());
        System.out.println(source.getName());
    }
}
