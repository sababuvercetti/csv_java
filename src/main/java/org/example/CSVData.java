package org.example;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

/**
 * User: HP
 * Date: 3/11/2021
 * Time: 6:47 AM
 */
public class CSVData {
    @CsvBindByName(column="waiting_time")
    private int waitingTimeInSeconds;
    @CsvBindByName(column="data_size")
    private  int dataSize;
}
