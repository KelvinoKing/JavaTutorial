import java.io.*;

public class Copy{

    public static void main(String[] args) throws IOException{

        //Check if the number of arguments are 2
        if (args.length != 2){
            System.out.println("Usage: java Copy sourceFile targetFile");
            System.exit(1);
        }

        //Check if the source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()){
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        //Check if the target file exists
        File targetFile = new File(args[1]);
        if (!targetFile.exists()){
            System.out.println("Target file " + args[1] + " does not exist");
            System.exit(2);
        }

        try(
        //Open the file and copy data
        BufferedInputStream input = 
        new BufferedInputStream(new FileInputStream(sourceFile));
        BufferedOutputStream output = 
        new BufferedOutputStream(new FileOutputStream(targetFile));){

            int r, numberOfCopiedBytes = 0;
            
            while ((r = input.read()) != -1){
                output.write((byte)r);
                numberOfCopiedBytes++;
            }
            System.out.println(numberOfCopiedBytes + " bytes copied");
        }
    }
}