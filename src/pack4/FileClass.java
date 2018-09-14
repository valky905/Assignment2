package pack4;

import java.io.*;

import java.util.*;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.IOException;





public class FileClass {

public long checkLength() {

    // variable declaration

    long length;

    File file = new File("/home/cgi/Desktop/file1.txt");

    length = file.length();

//    System.out.println("length of file is" + length);
    return length;



}
public String checkUpperCase() throws IOException {
    long length;

    File file = new File("/home/cgi/Desktop/file1.txt");

    length = file.length();

    System.out.println("length of file is" + length);

    BufferedReader br;
    br = new BufferedReader(new FileReader(file));


    String st;
    String res="";

    while ((st = br.readLine()) != null)

        res=res+(st.toUpperCase());

    return res;


}

}