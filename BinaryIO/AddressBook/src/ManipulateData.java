import java.io.*;

public class ManipulateData{

    private final int NAME_SIZE = 32;
    private final int STREET_SIZE = 32;
    private final int CITY_SIZE = 20;
    private final int STATE_SIZE = 2;
    private final int ZIP_SIZE = 5;
    private final int RECORD_SIZE = NAME_SIZE + STREET_SIZE + CITY_SIZE + STATE_SIZE + ZIP_SIZE;
    private static long count = 0;

    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;

    public void addData(String name, String street, String city, String state, String zip) throws IOException{
        this.name = paddString(name, NAME_SIZE);
        this.street = paddString(street, STREET_SIZE);
        this.city = paddString(city, CITY_SIZE);
        this.state = paddString(state, STATE_SIZE);
        this.zip = paddString(zip, ZIP_SIZE);

        try(RandomAccessFile file = new RandomAccessFile("Address.dat", "rw");){

            file.seek(file.length());
            writeRecord(file);
        }
    }

    public void firstRecord() throws IOException{
        try(RandomAccessFile file = new RandomAccessFile("Address.dat", "rw");){

            if (file.length() != 0){
                file.seek(0);
                readRecord(file);
                count = 1;
            }
        }
    }

    public void nextRecord() throws IOException{
        try(RandomAccessFile file = new RandomAccessFile("Address.dat", "rw");){
            
            if (count * RECORD_SIZE < file.length()){
                file.seek(count * RECORD_SIZE);
                readRecord(file);
                count += 1;
            }
        }
    }

    public void prevRecord() throws IOException{
        try(RandomAccessFile file = new RandomAccessFile("Address.dat", "rw");){

            if (count > 1){
                count -= 1;
            }
            else{
                count += 1;
            }

            file.seek((count * RECORD_SIZE) - RECORD_SIZE);
            readRecord(file);
        }
    }

    public void lastRecord() throws IOException{
        try(RandomAccessFile file = new RandomAccessFile("Address.dat", "rw");){

            count = ((int)file.length()) / RECORD_SIZE;
            file.seek((count * RECORD_SIZE) - RECORD_SIZE);
            readRecord(file);
        }
    }

    public void updateRecord(String name, String street, String city, String state, String zip) throws IOException{
        this.name = paddString(name, NAME_SIZE);
        this.street = paddString(street, STREET_SIZE);
        this.city = paddString(city, CITY_SIZE);
        this.state = paddString(state, STATE_SIZE);
        this.zip = paddString(zip, ZIP_SIZE);

        try(RandomAccessFile file = new RandomAccessFile("Address.dat", "rw");){
            file.seek((count * RECORD_SIZE) - RECORD_SIZE);
            writeRecord(file);
        }
    }

    //Ensures the data is in its correct byte size
    public String paddString(String s, int length){
        StringBuilder str = new StringBuilder(s);
        str.setLength(length);
        return str.toString();
    }

    private void readRecord(RandomAccessFile file) throws IOException{
        int pos;
        byte[] name = new byte[NAME_SIZE];
        pos = file.read(name);
        this.name = new String(name);

        byte[] street = new byte[STREET_SIZE];
        pos += file.read(street);
        this.street = new String(street);

        byte[] city = new byte[CITY_SIZE];
        pos += file.read(city);
        this.city = new String(city);

        byte[] state = new byte[STATE_SIZE];
        pos += file.read(state);
        this.state = new String(state);

        byte[] zip = new byte[ZIP_SIZE];
        pos += file.read(zip);
        this.zip = new String(zip);
    }

    private void writeRecord(RandomAccessFile file) throws IOException{
        file.write(fixedLength(name.getBytes(), NAME_SIZE));
        file.write(fixedLength(street.getBytes(), STREET_SIZE));
        file.write(fixedLength(city.getBytes(), CITY_SIZE));
        file.write(fixedLength(state.getBytes(), STATE_SIZE));
        file.write(fixedLength(zip.getBytes(), ZIP_SIZE));
    }

    private byte[] fixedLength(byte[] x, int n){
        byte[] b = new byte[n];
        for (int i = 0; i < x.length; i++){
            b[i] = x[i];
        }
        return b;
    }

    //Getter and setter methods for datafields
    public String getName(){
        return name;
    }
    public String getStreet(){
        return street;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getZip(){
        return zip;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setStreet(String street){
        this.street = street;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setZip(String zip){
        this.zip = zip;
    }
}