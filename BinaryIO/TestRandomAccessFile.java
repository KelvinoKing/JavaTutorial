import java.io.*;

public class TestRandomAccessFile{
    public static void main(String[] args) throws IOException{

        try(RandomAccessFile rf = new RandomAccessFile("inout.dat", "rw");){

            rf.setLength(0);

            for (int i = 0; i < 200; i++){
                rf.writeInt(i);
            }

            System.out.println("Current length of file is: " + rf.length());

            rf.seek(0);
            System.out.println("First number is: " + rf.readInt());

            rf.seek(1 * 4);
            System.out.println("Second number is: " + rf.readInt());

            rf.seek(9 * 4);
            System.out.println("Tenth number is: " + rf.readInt());

            //Modify eleventh number
            rf.writeInt(555);

            //Append a new number
            rf.seek(rf.length());
            rf.writeInt(999);

            System.out.println("New length is: " + rf.length());

            //Print the eleventh number
            rf.seek(10 * 4);
            System.out.println("Eleventh number is: " + rf.readInt());
        }
    }
}