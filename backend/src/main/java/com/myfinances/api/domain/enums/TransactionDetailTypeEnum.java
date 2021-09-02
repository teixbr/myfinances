package com.myfinances.api.domain.enums;

public enum TransactionDetailTypeEnum
{
    COMMISSION( 1 ),
    VALUE( 2 );

    private final long value;

    TransactionDetailTypeEnum( long value )
    {
        this.value = value;
    }

    public long getValue()
    {
        return value;
    }
}