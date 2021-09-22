package com.myfinances.api.logic.mapper;

import com.myfinances.api.logic.exceptions.MyFiIncompleteDataException;

/**
 * System:                 MyFinancesAPI
 * Name:                   BaseMapper
 * Description:            Abstract class that handles the use of inheritance for the Mapper module
 *
 * @author teixbr
 * @version 1.0
 * @since 21/09/21
 */
public abstract class BaseMapper
{
    protected static void validate( long id, String attribute )
    {
        if ( id <= 0 )
        {
            throw new MyFiIncompleteDataException( attribute );
        }
    }

    protected static void validate( double value, String attribute )
    {
        if ( value <= 0.0 )
        {
            throw new MyFiIncompleteDataException( attribute );
        }
    }

    protected static void validate( int value, String attribute )
    {
        if ( value <= 0 )
        {
            throw new MyFiIncompleteDataException( attribute );
        }
    }

    protected static void isBlank( String string, String attribute )
    {
        if ( string == null || string.chars().allMatch( Character::isWhitespace ) )
        {
            throw new MyFiIncompleteDataException( attribute );
        }
    }
}
