package org.example;

import com.opencsv.bean.CsvBindByPosition;

/**
 * User: HP
 * Date: 3/11/2021
 * Time: 6:47 AM
 */
public class CSVData {
    @CsvBindByPosition(position=0)
    private int waitingTimeInSeconds;
    @CsvBindByPosition(position=0)
    private  int dataSize;
}
