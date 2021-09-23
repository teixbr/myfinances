package com.myfinances.api.domain.DTO;

/**
 * System:                 MyFinancesAPI
 * Name:                   TransactionReasonDTO
 * Description:            Class that represents a TransactionReason's DTO in the application
 *
 * @author teixbr
 * @version 1.0
 * @since 22/09/21
 */
public class TransactionReasonDTO extends BaseDTO
{
    //region Attributes

    private String name;

    //endregion

    //region Constructors

    /**
     * Name:                TransactionReasonDTO
     * Description:         Method to initializes a TransactionReason DTO (Empty constructor)
     */
    public TransactionReasonDTO()
    {
    }

    /**
     * Name:                TransactionReasonDTO
     * Description:         Method to initializes a TransactionReason DTO
     */
    public TransactionReasonDTO( long id )
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
