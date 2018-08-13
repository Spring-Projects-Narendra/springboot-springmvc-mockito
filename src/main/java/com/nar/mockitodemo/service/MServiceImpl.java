package com.nar.mockitodemo.service;

import com.nar.mockitodemo.dao.MDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MServiceImpl implements MService {

    @Autowired
    private MDao mDao;

    @Override
    public String getNameByIdService(int id) {
        System.out.println("inside service ");

        String name = mDao.getnNameById(id);
        return name;
    }
}
