package com.example.application.mapper.exhibit;

import com.example.application.dto.exhibit.*;
import com.example.application.entity.exhibits.*;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ExhibitMapper {

    @Mapping(target = "exhibitions", source = "exhibitions")
    CuratorDTO toCuratorDTO(Curator curator);

    @Mapping(target = "curator", ignore = true)
    ExhibitionDTO toExhibitionDTO(Exhibition exhibition);

    List<ExhibitionDTO> toExhibitionDTOList(List<Exhibition> exhibitions);
}

