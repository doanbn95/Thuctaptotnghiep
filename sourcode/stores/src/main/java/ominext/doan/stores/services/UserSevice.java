package ominext.doan.stores.services;

import ominext.doan.stores.persistencts.domain.User;
import ominext.doan.stores.requests.UserRequest;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;


public interface UserSevice extends UserDetailsService {
    void createUser(UserRequest userForm);

    void delete(Long id);

    UserRequest edit(Long id);

    void update(Long id);

    List<User> findAll();

    User findById(Long id);

    boolean checkUserNameExist(String userName, String userNameOld);

}
