package customer;

import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Review {

    /*public void WriteInFile(){     //WritingFIles
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\r\\OneDrive - American International University-Bangladesh\\AIUB\\Semester-2\\Final\\OOP1\\Final Project\\file\\review.txt"));
           
            bw.write("\n\tOnline Shop");
            bw.write("\tMain Office: Uttara, Dhaka");
            bw.write("\tOffice Number: +8801795628029");
            bw.close(); }catch (Exception ex){
            return;
        }
    }*/

    /* public void ReadFromFile(){   //Reading Problem but shows null?
try{
        BufferedReader br=new BufferedReader(
                new FileReader("C:\\Users\\r\\OneDrive - American International University-Bangladesh\\AIUB\\Semester-2\\Final\\OOP1\\Final Project\\file\\review.txt"));
        String s;
        while ((s= br.readLine()) !=null);
    System.out.println(s);
        br.close();
    } catch (Exception ex){
    return; }

    }*/
    public void FileShow() {
        try { //Exception handling
            File file = new File("C:\\Users\\r\\OneDrive - American International University-Bangladesh\\AIUB\\Semester-2\\Final\\OOP1\\Final Project\\file\\\\review.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){
            System.out.println(scan.nextLine());}
        } catch (FileNotFoundException fnf) {
            return;
        }

    }
}


