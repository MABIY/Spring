package com.chinal.lh.domain.Repository;

import com.chinal.lh.domain.data.User;

/**
 * Created by liuhua on 16-6-30.
 */
public interface UserRepository {

    User find(long id);

}
