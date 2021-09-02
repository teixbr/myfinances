package com.myfinances.api.domain.enums;

public enum TransactionReasonEnum
{
    SALARY( 1 ),
    PAYMENT( 2 );

    private final long value;

    TransactionReasonEnum( long value )
    {
        this.value = value;
    }

    public long getValue()
    {
        return value;
    }
}
