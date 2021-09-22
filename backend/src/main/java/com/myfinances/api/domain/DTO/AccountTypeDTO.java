package com.myfinances.api.domain.DTO;

/**
 * System:                 MyFinancesAPI
 * Name:                   AccountTypeDTO
 * Description:            Class that represents a AccountType's DTO in the application
 *
 * @author teixbr
 * @version 1.0
 * @since 21/09/21
 */
public class AccountTypeDTO extends BaseDTO
{
    //region Attributes

    private String name;

    //endregion

    //region Constructors

    public AccountTypeDTO( long id )
    {
        super( id );
    }

    public AccountTypeDTO()
    {
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
