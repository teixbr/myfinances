package com.myfinances.api.logic.mapper;

import com.myfinances.api.domain.DTO.TransactionReasonDTO;
import com.myfinances.api.domain.DTO.DTOFactory;
import com.myfinances.api.domain.entity.TransactionReason;
import com.myfinances.api.domain.entity.EntityFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * System:                 MyFinancesAPI
 * Name:                   TransactionReasonMapper
 * Description:            Class for handling mapping between Dto´s and TransactionReason Entity classes
 *
 * @author teixbr
 * @version 1.0
 * @since 21/09/21
 */
public class TransactionReasonMapper extends BaseMapper
{
    public static List<TransactionReasonDTO> mapEntityToDtoList( List<TransactionReason> entityList )
    {
        return new ArrayList<TransactionReasonDTO>()
        {{
            if ( !entityList.isEmpty() )
            {
                for ( TransactionReason entity : entityList )
                {
                    add( mapEntityToDto( entity ) );
                }
            }
        }};
    }

    public static TransactionReasonDTO mapEntityToDto( TransactionReason entity )
    {
        final TransactionReasonDTO answer = DTOFactory.createTransactionReasonDTO( entity.getId() );

        answer.setName( entity.getName() );

        return answer;
    }

    public static TransactionReason mapIdToEntity( long id )
    {
        BaseMapper.validate( id, "transactionReasonId" );

        return EntityFactory.createTransactionReason( id );
    }
}