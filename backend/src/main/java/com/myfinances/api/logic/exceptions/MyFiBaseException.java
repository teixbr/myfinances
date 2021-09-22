package com.myfinances.api.logic.exceptions;

import java.io.Serializable;

/**
 * System:                  MyFinancesAPI
 * Name:                    MyFiBaseException
 * Description:             Base Exception class for handling personalized errors inside MyFinances's API
 *
 * @author teixbr
 * @version 1.0
 * @since 21/09/21
 */
public class MyFiBaseException extends RuntimeException implements Serializable
{
    public MyFiBaseException( Exception e )
    {
        super( e );
    }

    public MyFiBaseException( Exception e, String str )
    {
        super( str, e );
    }

    public MyFiBaseException( String str )
    {
        super( str );
    }

    public MyFiBaseException( )
    {
        super();
    }
}