package com.chinal.lh.domain.account.model;

/**
 * Created by sj on 16-8-2.
 */
public enum  AccountAuthority {
    role_admin, // 最高权限
    role_staff,   //职工权限
    role_user    //用户权限　　
//    TD 可以把权限字段设计成String 一个角色可以有多个权限

}
