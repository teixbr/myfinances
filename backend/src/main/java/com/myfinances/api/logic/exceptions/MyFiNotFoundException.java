package com.myfinances.api.logic.exceptions;

/**
 * System:                  MyFinancesAPI
 * Name:                    MyFiNotFoundException
 * Description:             Exception for handling errors when a trying to find a resource that is not persisted
 *                              on the system
 *
 * @author teixbr
 * @version 1.0
 * @since 21/09/21
 */
public class MyFiNotFoundException extends MyFiBaseException
{
    public MyFiNotFoundException()
    {
        super( "The resource that you are trying to find doesn't exist." );
    }
}