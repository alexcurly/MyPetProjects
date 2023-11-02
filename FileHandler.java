package javaproject;

import java.io.*;
import java.util.*;


public class FileHandler {

//    public String createCSV(String fileName){
//        FileCreator a = new FileCreator();
//        a.create("myFile.txt");
//        return "file was created";
//    }

    String line;
    public LinkedList<Member> readFile() {
        LinkedList<Member> m = new LinkedList<>();
        String lineRead;
        String[] splitLine;
        Member mem;


        try (var reader = new BufferedReader(new FileReader("member.csv"))) {

            lineRead = reader.readLine();
            while(lineRead != null) {
                splitLine = lineRead.split(", ");
                if (splitLine[0].equals("S")){
                    mem = new SingleClubMember('S',
                            Integer.parseInt(splitLine[1]), splitLine[2],
                            Double.parseDouble(splitLine[3]),
                            Integer.parseInt(splitLine[4]));
                }else {
                    mem = new MultiClubMember('M',
                            Integer.parseInt(splitLine[1]), splitLine[2],
                            Double.parseDouble(splitLine[3]),
                            Integer.parseInt(splitLine[4]));
                }
                m.add(mem);
                lineRead = reader.readLine();
            }
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
        return m;
    }

    public void appendFile(String mem){
        try(BufferedWriter write = new BufferedWriter(new FileWriter("members.csv", true))) {
            write.write(mem + "\n");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void overwriteFile(LinkedList<Member> m) {
        String s;

        try(BufferedWriter write = new
                BufferedWriter(new FileWriter("member.temp", false))) {
            for (int i=0; i< m.size(); i++)
            {
                s = m.get(i).toString();
                write.write(s + "\n");
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            File f = new File("members.csv");
            File tf = new File("members.temp");

            f.delet();
            tf.renameTo(f);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
