package cl.edu.galaxy.training.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import cl.edu.galaxy.training.dto.RazaDTO;
import cl.edu.galaxy.training.entity.Raza;

@Mapper
public interface RazaMapper {
    RazaMapper INSTANCE = Mappers.getMapper(RazaMapper.class);

    @Mapping(source = "especie.id", target = "idEspecie") 
    RazaDTO toDto(Raza raza);

    @Mapping(source = "idEspecie", target = "especie.id")
    Raza toEntity(RazaDTO razaDTO);
}


