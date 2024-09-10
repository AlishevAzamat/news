package kz.alishev.news.service.impl;

import kz.alishev.news.model.entity.UserEntity;
import kz.alishev.news.repository.UserRepository;
import kz.alishev.news.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
//    private PasswordEncoder passwordEncoder;

    @Override
    public void create(UserEntity userEntity) {
        userRepository.save(userEntity);
    }
}
