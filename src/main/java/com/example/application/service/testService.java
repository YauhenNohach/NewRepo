package com.example.application.service;

import com.example.application.database.repository.CuratorRepository;
import com.example.application.dto.exhibit.CuratorDTO;
import com.example.application.entity.exhibits.Curator;
import com.example.application.mapper.exhibit.ExhibitMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class testService {
    private final CuratorRepository curatorRepository;
    private final ExhibitMapper exhibitMapper;

    public CuratorDTO getCuratorWithExhibition(Long id){
       var curator =  curatorRepository.findById(id).get();
       return exhibitMapper.toCuratorDTO(curator);
    }
}
