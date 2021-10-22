package ru.dataart.academy.java;

import java.io.FileInputStream;
import java.util.zip.*;

public class Calculator {
    /**
     * @param zipFilePath -  path to zip archive with text files
     * @param character   - character to find
     * @return - how many times character is in files
     */
    public Integer getNumberOfChar(String zipFilePath, char character) {
        //Task implementation
        int count = 0;
        try(ZipInputStream zin = new ZipInputStream(new FileInputStream(zipFilePath))) {
            while((zin.getNextEntry())!=null){
                for (int c = zin.read(); c != -1; c = zin.read()) {
                    if ((char)c == character)
                        count++;
                }
                zin.closeEntry();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return count;
    }

    /**
     * @param zipFilePath - path to zip archive with text files
     * @return - max length
     */

    public Integer getMaxWordLength(String zipFilePath) {
        //Task implementation
        int maxLenght = 0;
        int currLenght = 0;
        try(ZipInputStream zin = new ZipInputStream(new FileInputStream(zipFilePath))) {
            while((zin.getNextEntry())!=null){
                for (int c = zin.read(); c != -1; c = zin.read()) {
                    if (c == 32 || c == 10)
                        currLenght = 0;
                    else {
                        currLenght ++;
                        if (currLenght > maxLenght)
                            maxLenght = currLenght;
                    }
                }
                currLenght = 0;
                System.out.println();
                zin.closeEntry();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return maxLenght;
    }
}
