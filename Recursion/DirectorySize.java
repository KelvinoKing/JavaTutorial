import java.io.File;
import java.util.Scanner;

public class DirectorySize {
    public static void main(String[] args){

        System.out.print("Enter file/directory: ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();

        System.out.println("The size of directory/file: " + getSize(new File(directory)) + " bytes");
    }

    public static long getSize(File file){

        long size = 0;

        if (file.isDirectory()){
            File[] files = file.listFiles();
            
            for (int i = 0; i < files.length && files != null; i++){
                size += getSize(files[i]);
            }
        }else{
            size += file.length();
        }

        return size;
    }
}
