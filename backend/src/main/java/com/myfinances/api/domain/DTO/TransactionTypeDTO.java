package com.myfinances.api.domain.DTO;

/**
 * System:                 MyFinancesAPI
 * Name:                   TransactionTypeDTO
 * Description:            Class that represents a TransactionType's DTO in the application
 *
 * @author teixbr
 * @version 1.0
 * @since 22/09/21
 */
public class TransactionTypeDTO extends BaseDTO
{
    //region Attributes

    private String name;

    //endregion

    //region Constructors

    /**
     * Name:                TransactionTypeDTO
     * Description:         Method to initializes a TransactionType DTO (Empty constructor)
     */
    public TransactionTypeDTO()
    {
    }

    /**
     * Name:                TransactionTypeDTO
     * Description:         Method to initializes a TransactionType DTO
     */
    public TransactionTypeDTO( long id )
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
