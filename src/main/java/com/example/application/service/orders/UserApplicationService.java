package com.example.application.service.orders;

import com.example.application.database.repository.orders.UserApplicationRepository;
import com.example.application.dto.orders.UserApplicationDTO;
import com.example.application.entity.ordrers.UserApplication;
import com.example.application.mapper.orders.UserApplicationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class UserApplicationService {

    private final UserApplicationRepository userApplicationRepository;

//    public UserApplication getUserWithOrders(final Long id){
//        var orderOptional = userApplicationRepository.findUserWithOrders(id);
//        return orderOptional.orElseThrow(() -> new IllegalArgumentException("User not found"));
//    }

    public UserApplicationDTO getUserWithOrders(Long id) {
        UserApplication user = userApplicationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return UserApplicationMapper.INSTANCE.toDTO(user);
    }
}
