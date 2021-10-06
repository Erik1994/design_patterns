package com.company.secondimp;

public class XMLParserAdapter implements CSVParser {
    private StackMarketDataParser stackMarketDataParser;

    public XMLParserAdapter(StackMarketDataParser stackMarketDataParser) {
        this.stackMarketDataParser = stackMarketDataParser;
    }

    @Override
    public void parse() {
        this.stackMarketDataParser.parseXml();
    }
}
