package com.myfinances.api.logic.mapper;

import com.myfinances.api.domain.DTO.CurrencyDTO;
import com.myfinances.api.domain.DTO.DTOFactory;
import com.myfinances.api.domain.entity.Currency;
import com.myfinances.api.domain.entity.EntityFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * System:                 MyFinancesAPI
 * Name:                   CurrencyMapper
 * Description:            Class for handling mapping between Dto´s and Currency Entity classes
 *
 * @author teixbr
 * @version 1.0
 * @since 22/09/21
 */
public class CurrencyMapper extends BaseMapper
{
    public static List<CurrencyDTO> mapEntityToDtoList( List<Currency> entityList )
    {
        return new ArrayList<CurrencyDTO>()
        {{
            if ( !entityList.isEmpty() )
            {
                for ( Currency entity : entityList )
                {
                    add( mapEntityToDto( entity ) );
                }
            }
        }};
    }

    public static CurrencyDTO mapEntityToDto( Currency entity )
    {
        final CurrencyDTO answer = DTOFactory.createCurrencyDTO( entity.getId() );

        answer.setAbbreviation( entity.getAbbreviation() );
        answer.setSymbol( entity.getSymbol() );

        return answer;
    }

    public static Currency mapIdToEntity( long id )
    {
        BaseMapper.validate( id, "currencyId" );

        return EntityFactory.createCurrency( id );
    }
}