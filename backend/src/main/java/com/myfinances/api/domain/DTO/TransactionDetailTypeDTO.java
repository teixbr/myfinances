package com.myfinances.api.domain.DTO;

/**
 * System:                 MyFinancesAPI
 * Name:                   TransactionDetailTypeDTO
 * Description:            Class that represents a TransactionDetailType's DTO in the application
 *
 * @author teixbr
 * @version 1.0
 * @since 21/09/21
 */
public class TransactionDetailTypeDTO extends BaseDTO
{
    //region Attributes

    private String name;

    //endregion

    //region Constructors

    /**
     * Name:                TransactionDetailTypeDTO
     * Description:         Method to initializes a TransactionDetailType DTO (Empty constructor)
     */
    public TransactionDetailTypeDTO()
    {
    }

    /**
     * Name:                TransactionDetailTypeDTO
     * Description:         Method to initializes a TransactionDetailType DTO
     */
    public TransactionDetailTypeDTO( long id )
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
