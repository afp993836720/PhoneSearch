package com.offcn.service.impl;

import com.offcn.dao.MDao;
import com.offcn.pojo.Mobile;
import com.offcn.service.MService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author afp
 * @date 2018/10/11--21:01
 */
@Service
public class MServiceImpl implements MService {
    @Autowired
    private MDao mDao;
    @Override
    public Mobile find(String number) {
        if (number.length()>7){
            number=number.substring(0, 7);
        }
        return mDao.find(number);
    }
}
