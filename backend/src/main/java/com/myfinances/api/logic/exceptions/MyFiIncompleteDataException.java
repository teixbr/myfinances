package com.myfinances.api.logic.exceptions;

/**
 * System:                  MyFinancesAPI
 * Name:                    MyFiIncompleteDataException
 * Description:             Exception for handling errors when a trying to persist a record but there's missing data
 *
 * @author teixbr
 * @version 1.0
 * @since 21/09/21
 */
public class MyFiIncompleteDataException extends MyFiBaseException
{
    public MyFiIncompleteDataException( String missing )
    {
        super( "Incomplete data. Please review missing data on attribute: " + missing );
    }
}
