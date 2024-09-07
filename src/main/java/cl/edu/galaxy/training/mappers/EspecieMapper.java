package cl.edu.galaxy.training.mappers;

import cl.edu.galaxy.training.dto.EspecieDTO;
import cl.edu.galaxy.training.entity.Especie;
import cl.edu.galaxy.training.entity.Raza;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface EspecieMapper {

    EspecieMapper INSTANCE = Mappers.getMapper(EspecieMapper.class);

    @Mappings({
        @Mapping(source = "razas", target = "razas")
    })
    EspecieDTO toDto(Especie especie);

    @Mappings({
        @Mapping(source = "razas", target = "razas")
    })
    Especie toEntity(EspecieDTO especieDTO);

    default List<Long> mapRazasToIds(List<Raza> razas) {
        return razas.stream().map(Raza::getId).collect(Collectors.toList());
    }

    default List<Raza> mapIdsToRazas(List<Long> ids, Especie especie) {
        return ids.stream().map(id -> new Raza(id, null, especie)).collect(Collectors.toList());
    }
    
    // Método para mapear una lista de IDs a una lista de entidades Raza
    default List<Raza> map(List<Long> ids) {
        return ids.stream().map(id -> new Raza(id, null, null)).collect(Collectors.toList());
    }
}

