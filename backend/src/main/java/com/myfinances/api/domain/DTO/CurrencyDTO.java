package com.myfinances.api.domain.DTO;

/**
 * System:                 MyFinancesAPI
 * Name:                   CurrencyDTO
 * Description:            Class that represents a Currency's DTO in the application
 *
 * @author teixbr
 * @version 1.0
 * @since 22/09/21
 */
public class CurrencyDTO extends BaseDTO
{
    //region Attributes

    private String _symbol;
    private String _abbreviation;

    //endregion

    //region Constructors

    /**
     * Name:                CurrencyDTO
     * Description:         Method to initializes a Currency DTO (Empty constructor)
     */
    public CurrencyDTO()
    {
    }

    /**
     * Name:                CurrencyDTO
     * Description:         Method to initializes a Currency DTO
     */
    public CurrencyDTO( long id )
    {
        super( id );
    }

    //endregion

    //Getters & Setters

    public String getSymbol()
    {
        return _symbol;
    }

    public void setSymbol( String symbol )
    {
        _symbol = symbol;
    }

    public String getAbbreviation()
    {
        return _abbreviation;
    }

    public void setAbbreviation( String abbreviation )
    {
        _abbreviation = abbreviation;
    }

    //endregion
}
