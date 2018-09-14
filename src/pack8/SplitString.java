package pack8;
import java.io.*;

import java.util.*;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.IOException;






    public class SplitString
    {

        public static void main(String[] args) throws IOException {
            long length;
            File file = new File("/home/cgi/Desktop/file2.txt");

            length = file.length();

//    System.out.println("length of file is" + length);
//    return length;


            BufferedReader br;
            br = new BufferedReader(new FileReader(file));
            String st;
            String res="";

            while ((st = br.readLine()) != null)

                res=res+st;
            String text= res;
//            String text = "the quick brown fox jumps fox fox over the lazy dog brown";
            String[] keys = text.split(" ");
            String[] uniqueKeys;
            int count = 0;
            System.out.println(text);
            uniqueKeys = getUniqueKeys(keys);

            for(String key: uniqueKeys)
            {
                if(null == key)
                {
                    break;
                }
                for(String s : keys)
                {
                    if(key.equals(s))
                    {
                        count++;
                    }
                }
                System.out.println("Count of ["+key+"] is : "+count);
                count=0;
            }
        }

        private static String[] getUniqueKeys(String[] keys)
        {
            String[] uniqueKeys = new String[keys.length];

            uniqueKeys[0] = keys[0];
            int uniqueKeyIndex = 1;
            boolean keyAlreadyExists = false;

            for(int i=1; i<keys.length ; i++)
            {
                for(int j=0; j<=uniqueKeyIndex; j++)
                {
                    if(keys[i].equals(uniqueKeys[j]))
                    {
                        keyAlreadyExists = true;
                    }
                }

                if(!keyAlreadyExists)
                {
                    uniqueKeys[uniqueKeyIndex] = keys[i];
                    uniqueKeyIndex++;
                }
                keyAlreadyExists = false;
            }
            return uniqueKeys;
        }
    }






