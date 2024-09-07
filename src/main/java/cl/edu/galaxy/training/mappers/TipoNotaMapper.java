package cl.edu.galaxy.training.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import cl.edu.galaxy.training.dto.TipoNotaDTO;
import cl.edu.galaxy.training.entity.TipoNota;

@Mapper
public interface TipoNotaMapper {

    TipoNotaMapper INSTANCE = Mappers.getMapper(TipoNotaMapper.class);

    TipoNotaDTO toDto(TipoNota tipoNota);
    TipoNota toEntity(TipoNotaDTO tipoNotaDTO);
}
