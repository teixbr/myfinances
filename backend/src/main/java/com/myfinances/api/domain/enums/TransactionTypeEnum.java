package com.myfinances.api.domain.enums;

public enum TransactionTypeEnum
{
    CREDIT( 1 ),
    DEBIT( 2 );

    private final long value;

    TransactionTypeEnum( long value )
    {
        this.value = value;
    }

    public long getValue()
    {
        return value;
    }
}