package demo;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileNotFoundException;

import demo.data.*;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;



public class SetTshirtData{
    
    public static ArrayList<Tshirt> getTshirts() { //search output
        // File f = new File("C:\\Users\\eshachoudhary\\Desktop\\Maven Assignment\\first-app\\src\\main\\CSVFiles");
        // ArrayList<File> files = new ArrayList<File>(Arrays.asList(f.listFiles()));

        ArrayList<Tshirt> getalldata = new ArrayList<Tshirt>();
        CSVReaderMethod("C:\\Users\\eshachoudhary\\Desktop\\Maven Assignment\\maven-assignment\\src\\main\\java\\demo\\CSVFiles\\Adidas.csv"
        ,
                getalldata);
        CSVReaderMethod("C:\\Users\\eshachoudhary\\Desktop\\Maven Assignment\\maven-assignment\\src\\main\\java\\demo\\CSVFiles\\Nike.csv" ,
                getalldata);
        CSVReaderMethod("C:\\Users\\eshachoudhary\\Desktop\\Maven Assignment\\maven-assignment\\src\\main\\java\\demo\\CSVFiles\\Puma.csv",
                getalldata);

        // for (File file: files){
        //     if(file.isFile()){
        //         CSVReaderMethod(file.getPath(), getalldata); 
        //     }
        // }
        return getalldata;
          
    }

    private static void CSVReaderMethod(String filePath, ArrayList<Tshirt> getalldata) {
        try {
            CSVParser parser = new CSVParserBuilder().withSeparator('|').withIgnoreQuotations(true).build();
            CSVReader csvReader = new CSVReaderBuilder(new FileReader(filePath)).withCSVParser(parser).withSkipLines(1)
                    .build();

            String[] Line;
            try {
                while ((Line = csvReader.readNext()) != null) {
                    Tshirt tshirt = new Tshirt();

                    tshirt.setId(Line[0]);
                    tshirt.setName(Line[1]);
                    tshirt.setColor(Color.valueOf(Line[2].toUpperCase()));
                    tshirt.setGender(Gender.valueOf(Line[3].toUpperCase()));
                    tshirt.setSize(Size.valueOf(Line[4].toUpperCase()));
                    tshirt.setPrice(Double.parseDouble(Line[5]));
                    tshirt.setRating(Double.parseDouble(Line[6]));
                    tshirt.setAvalibilty(Line[7]);

                    getalldata.add(tshirt);

                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


