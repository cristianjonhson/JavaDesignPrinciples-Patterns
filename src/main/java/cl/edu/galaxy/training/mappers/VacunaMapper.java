package cl.edu.galaxy.training.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import cl.edu.galaxy.training.dto.VacunaDTO;
import cl.edu.galaxy.training.entity.Vacuna;

@Mapper
public interface VacunaMapper {

    VacunaMapper INSTANCE = Mappers.getMapper(VacunaMapper.class);

    VacunaDTO toDto(Vacuna vacuna);
    Vacuna toEntity(VacunaDTO vacunaDTO);
}
