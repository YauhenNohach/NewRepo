package com.example.application.mapper.exhibit;

import com.example.application.dto.exhibit.*;
import com.example.application.entity.exhibits.*;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface ExhibitMapper {

    @Mapping(source = "exhibitions", target = "exhibitions")
    CuratorDTO toCuratorDTO(Curator curator);

    @Mapping(source = "curator", target = "curator")
    @Mapping(source = "exhibits", target = "exhibits")
    @Mapping(source = "halls", target = "halls")
    ExhibitionDTO toExhibitionDTO(Exhibition exhibition);

    ExhibitDTO toExhibitDTO(Exhibit exhibit);

    HallDTO toHallDTO(Hall hall);
}
