import java.io.*;

public class TestObjectStreams{
    public static void main(String[] args) throws IOException, ClassNotFoundException{

        try(ObjectOutputStream output = 
        new ObjectOutputStream(new FileOutputStream("temp.dat"));){
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeObject(new java.util.Date());
        }

        try(ObjectInputStream input = 
        new ObjectInputStream(new FileInputStream("temp.dat"))){
            String name = input.readUTF();
            Double score = input.readDouble();
            java.util.Date date = (java.util.Date)(input.readObject());

            System.out.println(name + " " + score + " " + date);
        }
    }
}