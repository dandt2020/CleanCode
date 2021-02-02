package coursemanage.service;

import coursemanage.dto.UserReqDto;
import coursemanage.dto.UserResDto;
import coursemanage.entity.User;
import coursemanage.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Transactional
    public UserResDto saveUser(UserReqDto userReqDto) {
        User user = new User();
        modelMapper.map(userReqDto, user);
        User savedUser = userRepository.save(user);
        return modelMapper.map(savedUser, UserResDto.class);
    }
}
