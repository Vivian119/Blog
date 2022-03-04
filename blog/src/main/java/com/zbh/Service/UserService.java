package com.zbh.Service;

import com.zbh.Entity.User;

public interface UserService {

    User checkUser(String username, String password);
}
