package com.abbos.brainwave_matrix_intern.config;

import com.abbos.brainwave_matrix_intern.mapper.UserMapper;
import com.abbos.brainwave_matrix_intern.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * @author Aliabbos Ashurov
 * @since 16/January/2025  10:34
 **/
@Component
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserService userService;
    private final UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userMapper.toCustomUserDetails(userService.findByUsername(username));
    }
}
