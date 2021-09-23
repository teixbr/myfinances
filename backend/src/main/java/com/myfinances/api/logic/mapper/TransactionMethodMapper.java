package com.myfinances.api.logic.mapper;

import com.myfinances.api.domain.DTO.TransactionMethodDTO;
import com.myfinances.api.domain.DTO.DTOFactory;
import com.myfinances.api.domain.entity.TransactionMethod;
import com.myfinances.api.domain.entity.EntityFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * System:                 MyFinancesAPI
 * Name:                   TransactionMethodMapper
 * Description:            Class for handling mapping between Dto´s and TransactionMethod Entity classes
 *
 * @author teixbr
 * @version 1.0
 * @since 21/09/21
 */
public class TransactionMethodMapper extends BaseMapper
{
    public static List<TransactionMethodDTO> mapEntityToDtoList( List<TransactionMethod> entityList )
    {
        return new ArrayList<TransactionMethodDTO>()
        {{
            if ( !entityList.isEmpty() )
            {
                for ( TransactionMethod entity : entityList )
                {
                    add( mapEntityToDto( entity ) );
                }
            }
        }};
    }

    public static TransactionMethodDTO mapEntityToDto( TransactionMethod entity )
    {
        final TransactionMethodDTO answer = DTOFactory.createTransactionMethodDTO( entity.getId() );

        answer.setName( entity.getName() );

        return answer;
    }

    public static TransactionMethod mapIdToEntity( long id )
    {
        BaseMapper.validate( id, "transactionMethodId" );

        return EntityFactory.createTransactionMethod( id );
    }
}