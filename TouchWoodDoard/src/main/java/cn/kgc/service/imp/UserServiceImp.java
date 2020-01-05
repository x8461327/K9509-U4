package cn.kgc.service.imp;

import cn.kgc.domain.User;
import cn.kgc.mapper.UserMapper;
import cn.kgc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> selectUser() {
        return userMapper.selectUser();
    }
}
