package cl.edu.galaxy.training.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import cl.edu.galaxy.training.dto.MascotaDTO;
import cl.edu.galaxy.training.entity.Mascota;

@Mapper
public interface MascotaMapper {
    MascotaMapper INSTANCE = Mappers.getMapper(MascotaMapper.class);

    @Mapping(source = "raza.id", target = "idRaza")
    MascotaDTO toDto(Mascota mascota);

    @Mapping(source = "idRaza", target = "raza.id")
    Mascota toEntity(MascotaDTO mascotaDTO);
}


