package com.lyk.coursearrange.service.impl;

import com.lyk.coursearrange.entity.Teacher;
import com.lyk.coursearrange.dao.TeacherDao;
import com.lyk.coursearrange.service.TeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lequal
 * @since 2020-03-13
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherDao, Teacher> implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    @Override
    public Teacher teacherLogin(String username, String password) {
        return teacherDao.teacherLogin(username, password);
    }
}
