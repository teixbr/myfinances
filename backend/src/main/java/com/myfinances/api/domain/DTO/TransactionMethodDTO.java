package com.myfinances.api.domain.DTO;

/**
 * System:                 MyFinancesAPI
 * Name:                   TransactionMethodDTO
 * Description:            Class that represents a TransactionMethod's DTO in the application
 *
 * @author teixbr
 * @version 1.0
 * @since 22/09/21
 */
public class TransactionMethodDTO extends BaseDTO
{
    //region Attributes

    private String name;

    //endregion

    //region Constructors

    /**
     * Name:                TransactionMethodDTO
     * Description:         Method to initializes a TransactionMethod DTO (Empty constructor)
     */
    public TransactionMethodDTO()
    {
    }

    /**
     * Name:                TransactionMethodDTO
     * Description:         Method to initializes a TransactionMethod DTO
     */
    public TransactionMethodDTO( long id )
    {
        super( id );
    }

    //endregion

    //region Getters & Setters

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    //endregion
}
