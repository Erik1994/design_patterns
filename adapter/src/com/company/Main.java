package com.company;

import com.company.firstimpl.*;

public class Main {

    public static void main(String[] args) {
        CSVParser machineParser = new MachineLearningDataParser();
        CSVParser realEstateParser = new RealEstateDataParser();
        CSVParser xmlParser = new XMLParserAdapter(new StackMarketDataParser());
        machineParser.parse();
        realEstateParser.parse();
        xmlParser.parse();
    }
}
