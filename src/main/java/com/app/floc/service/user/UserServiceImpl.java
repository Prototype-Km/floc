package com.app.floc.service.user;


import com.app.floc.DAO.UserDAO;
import com.app.floc.domain.DTO.AdminPagination;
import com.app.floc.domain.DTO.Search;
import com.app.floc.domain.VO.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

    @Override
    public void join(UserVO userVO) {
        userDAO.save(userVO);
    }

    @Override
    public Optional<UserVO> checkId(String identification) {
        return userDAO.findByUserIdentification(identification);
    }

    @Override
    public Optional<Long> login(String userIdentification, String userPassword) {
        return userDAO.findByUserIdentificationAndUserPassword(userIdentification,userPassword);
    }

    @Override
    public Optional<UserVO> getUser(Long userId) {
        return userDAO.findByUserId(userId);
    }

    @Override
    public Optional<UserVO> checkNickname(String nickname) {
        return userDAO.findByUserNickname(nickname);
    }

    @Override
    public void modifyUser(UserVO userVO) {
        userDAO.setUser(userVO);
    }
    @Override
    public List<UserVO> getUserList(AdminPagination adminPagination, Search search) {
        return userDAO.findByUser(adminPagination,search);

    }

    @Override
    public int getTotal(Search search) {
        return userDAO.findCountOfUser(search);
    }

    @Override
    public List<UserVO> getUserRecent() {
        return userDAO.findByRecent();
    }

    @Override
    public void deleteUsersByIds(List<Long> userIds) {
        userDAO.deleteUsersByIds(userIds);
    }

}
