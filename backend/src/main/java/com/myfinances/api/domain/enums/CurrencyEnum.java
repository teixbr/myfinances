package com.myfinances.api.domain.enums;

public enum CurrencyEnum
{
    GBP( 1, "$", "GBP" ),
    USD( 2, "$", "USD" ),
    VES( 3, "VES", "VES" );

    private final long value;
    private final String symbol;
    private final String abbreviation;

    CurrencyEnum( long value, String symbol, String abbreviation )
    {
        this.symbol = symbol;
        this.abbreviation = abbreviation;
        this.value = value;
    }

    public long getValue()
    {
        return value;
    }

    public String getSymbol()
    {
        return symbol;
    }

    public String getAbbreviation()
    {
        return abbreviation;
    }
}
