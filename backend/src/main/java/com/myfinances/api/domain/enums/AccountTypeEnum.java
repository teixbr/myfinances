package com.myfinances.api.domain.enums;

public enum AccountTypeEnum
{
    CHECKING( 1 ),
    SAVINGS( 2 );

    private final long value;

    AccountTypeEnum( long value )
    {
        this.value = value;
    }

    public long getValue()
    {
        return value;
    }
}
