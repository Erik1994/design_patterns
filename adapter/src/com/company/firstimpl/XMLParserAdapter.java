package com.company.firstimpl;

public class XMLParserAdapter implements CSVParser {
    private XMLParser stackMarketDataParser;

    public XMLParserAdapter(XMLParser stackMarketDataParser) {
        this.stackMarketDataParser = stackMarketDataParser;
    }

    @Override
    public void parse() {
        this.stackMarketDataParser.parseXml();
    }
}
