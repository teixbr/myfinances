package com.myfinances.api.domain.enums;

public enum TransactionMethodEnum
{
    CARD( 1 ),
    ZELLE( 2 ),
    TRANSFER( 3 ),
    CASH( 4 );

    private final long value;

    TransactionMethodEnum( long value )
    {
        this.value = value;
    }

    public long getValue()
    {
        return value;
    }
}
