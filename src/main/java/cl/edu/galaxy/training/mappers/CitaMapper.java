package cl.edu.galaxy.training.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import cl.edu.galaxy.training.dto.CitaDTO;
import cl.edu.galaxy.training.entity.Cita;

@Mapper
public interface CitaMapper {

    CitaMapper INSTANCE = Mappers.getMapper(CitaMapper.class);

    @Mapping(source = "mascota.id", target = "idMascota")
    @Mapping(source = "veterinario.id", target = "idVeterinario")
    CitaDTO toDto(Cita cita);

    @Mapping(source = "idMascota", target = "mascota.id")
    @Mapping(source = "idVeterinario", target = "veterinario.id")
    Cita toEntity(CitaDTO citaDTO);
}

