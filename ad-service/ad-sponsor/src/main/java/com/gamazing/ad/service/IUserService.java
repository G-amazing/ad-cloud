package com.gamazing.ad.service;

import com.gamazing.ad.exception.AdException;
import com.gamazing.ad.vo.CreateUserRequest;
import com.gamazing.ad.vo.CreateUserResponse;

public interface IUserService {
    CreateUserResponse createUser(CreateUserRequest request) throws AdException;
}
