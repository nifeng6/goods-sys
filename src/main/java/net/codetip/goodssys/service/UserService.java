package net.codetip.goodssys.service;

import net.codetip.goodssys.domain.User;

public interface UserService {
    User findByName(String username);
}
