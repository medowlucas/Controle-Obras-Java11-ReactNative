package br.com.irrigaparana.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    private final UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public User getByUsername(String username) {
        return userRepository.findByUsername(username).orElseThrow();
    }
}
