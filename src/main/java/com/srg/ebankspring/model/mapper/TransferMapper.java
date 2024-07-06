package com.srg.ebankspring.model.mapper;

import com.srg.ebankspring.model.entity.Transfer;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "sprint")
public interface TransferMapper {
    Transfer toEntity(TransferMapper DTO);
    TransferMapper toDTO(Transfer entity);
    List<TransferMapper> toDTOList(List<Transfer> users);
    List<Transfer> toEntityList(List<TransferMapper> userDTOs);
}
