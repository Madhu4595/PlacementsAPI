package com.iti.service;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.iti.config.CustomPasswordEncoder;
import com.iti.entity.login.Role;
import com.iti.entity.login.Users;
import com.iti.repo.login.RoleRepository;
import com.iti.repo.login.UserRepository;


@Service
@Transactional
public class UserService implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Users user = userRepository.findByUsername(username);
		UserDetailsPrincipal userDetailsPrincipal = new UserDetailsPrincipal(user);
		return userDetailsPrincipal;
	}

	public Users addUser(Users user) {
		Set<Role> roles = new HashSet<>();

		CustomPasswordEncoder customPasswordEncoder = new CustomPasswordEncoder();

		String password = customPasswordEncoder.encode(customPasswordEncoder.encode(user.getPassword()));
		user.setPassword(password);

		user.getRoles().forEach(role -> {
			if (role.getRole_id() > 0) {
				Role nrole = roleRepository.findById(role.getRole_id()).get();
				nrole.getUsers().add(user);
				roles.add(nrole);
			} else {
				roles.add(role);
			}
		});
		user.setRoles(roles);
		return userRepository.save(user);
	}

}
