package com.offcn.dao;

import com.offcn.pojo.Mobile;

/**
 * @Author afp
 * @date 2018/10/11--20:58
 */
public interface MDao {
    void save(Mobile mobile);
    Mobile find(String number);
}
