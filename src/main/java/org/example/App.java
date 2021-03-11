package org.example;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class App 
{  public static void main(String[] args) throws IOException {
///Set path
    //TODO: Env Initialize
    String fileName = "c:\\test\\csv\\country.csv";

    List<CSVData> csvData = new CsvToBeanBuilder(new FileReader(fileName))
            .withType(CSVData.class)
            .build()
            .parse();

    csvData.forEach(System.out::println);

    Message message=new Message();

}

}