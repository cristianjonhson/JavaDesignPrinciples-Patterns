package cl.edu.galaxy.training.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import cl.edu.galaxy.training.dto.HistorialVacunaDTO;
import cl.edu.galaxy.training.entity.HistorialVacuna;

@Mapper
public interface HistorialVacunaMapper {

    HistorialVacunaMapper INSTANCE = Mappers.getMapper(HistorialVacunaMapper.class);

    @Mapping(source = "mascota.id", target = "idMascota")
    @Mapping(source = "vacuna.id", target = "idVacuna")
    HistorialVacunaDTO toDTO(HistorialVacuna historialVacuna);

    @Mapping(source = "idMascota", target = "mascota.id")
    @Mapping(source = "idVacuna", target = "vacuna.id")
    HistorialVacuna toEntity(HistorialVacunaDTO historialVacunaDTO);
}
