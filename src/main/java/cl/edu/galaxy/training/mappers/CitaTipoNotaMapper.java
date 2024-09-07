package cl.edu.galaxy.training.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import cl.edu.galaxy.training.dto.CitaTipoNotaDTO;
import cl.edu.galaxy.training.entity.CitaTipoNota;

@Mapper
public interface CitaTipoNotaMapper {
    CitaTipoNotaMapper INSTANCE = Mappers.getMapper(CitaTipoNotaMapper.class);

    @Mapping(source = "cita.id", target = "idCita")
    @Mapping(source = "tipoNota.id", target = "idTipoNota")
    CitaTipoNotaDTO toDto(CitaTipoNota citaTipoNota);

    @Mapping(source = "idCita", target = "cita.id")
    @Mapping(source = "idTipoNota", target = "tipoNota.id")
    CitaTipoNota toEntity(CitaTipoNotaDTO citaTipoNotaDTO);
}

