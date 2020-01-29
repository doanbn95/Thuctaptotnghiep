package ominext.doan.stores.services;


import jdk.internal.joptsimple.internal.Strings;
import ominext.doan.stores.common.utils.DateUtils;
import ominext.doan.stores.common.utils.GeneratePassword;
import ominext.doan.stores.persistencts.domain.User;
import ominext.doan.stores.persistencts.repository.UserRepository;
import ominext.doan.stores.requests.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserSevice {

    //Final

    private final static int STATUS_OFF = 0;
    private final static int STATUS_ON = 1;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;


    @Override
    public void createUser(UserRequest userForm) {
        String generatePassword = GeneratePassword.generatePassword(8);
        User user = new User();
        user.setUserName(userForm.getUserName());
        if (Strings.isNullOrEmpty(userForm.getPassword())) {
            user.setPassword(passwordEncoder.encode(generatePassword));
        } else {
            user.setPassword(passwordEncoder.encode(userForm.getPassword()));
        }
        user.setRole(userForm.getRole());
        user.setStatus(STATUS_OFF);
        user.setCreateDay(DateUtils.getCurrentDay());
        user.setCreatePerson("doandv@ominext.com");
        user.setDeleted(0);
        userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        User user = userRepository.getOne(id);
        user.setDeleted(1);
        userRepository.save(user);
    }

    @Override
    public UserRequest edit(Long id) {
        return null;
    }

    @Override
    public void update(Long id) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public boolean checkUserNameExist(String userName, String userNameOld) {
        return false;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
