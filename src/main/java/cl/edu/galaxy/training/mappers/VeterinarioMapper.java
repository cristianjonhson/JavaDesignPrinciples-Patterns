package cl.edu.galaxy.training.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import cl.edu.galaxy.training.dto.VeterinarioDTO;
import cl.edu.galaxy.training.entity.Veterinario;

@Mapper
public interface VeterinarioMapper {

    VeterinarioMapper INSTANCE = Mappers.getMapper(VeterinarioMapper.class);

    VeterinarioDTO toDto(Veterinario veterinario);
    Veterinario toEntity(VeterinarioDTO veterinarioDTO);
}