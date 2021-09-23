package com.myfinances.api.logic.mapper;

import com.myfinances.api.domain.DTO.TransactionTypeDTO;
import com.myfinances.api.domain.DTO.DTOFactory;
import com.myfinances.api.domain.entity.TransactionType;
import com.myfinances.api.domain.entity.EntityFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * System:                 MyFinancesAPI
 * Name:                   TransactionTypeMapper
 * Description:            Class for handling mapping between Dto´s and TransactionType Entity classes
 *
 * @author teixbr
 * @version 1.0
 * @since 21/09/21
 */
public class TransactionTypeMapper extends BaseMapper
{
    public static List<TransactionTypeDTO> mapEntityToDtoList( List<TransactionType> entityList )
    {
        return new ArrayList<TransactionTypeDTO>()
        {{
            if ( !entityList.isEmpty() )
            {
                for ( TransactionType entity : entityList )
                {
                    add( mapEntityToDto( entity ) );
                }
            }
        }};
    }

    public static TransactionTypeDTO mapEntityToDto( TransactionType entity )
    {
        final TransactionTypeDTO answer = DTOFactory.createTransactionTypeDTO( entity.getId() );

        answer.setName( entity.getName() );

        return answer;
    }

    public static TransactionType mapIdToEntity( long id )
    {
        BaseMapper.validate( id, "transactionTypeId" );

        return EntityFactory.createTransactionType( id );
    }
}