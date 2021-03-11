package org.example;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

/**
 * User: HP
 * Date: 3/11/2021
 * Time: 11:23 AM
 */
public class CSVService {
    public CSVService() throws FileNotFoundException {
    }

    ///Set path
    //TODO: Env Initialize
    String fileName = "c:\\test\\csv\\country.csv";

    public List<CSVData> csvData = new CsvToBeanBuilder(new FileReader(fileName))
            .withType(CSVData.class)
            .build()
            .parse();


}
