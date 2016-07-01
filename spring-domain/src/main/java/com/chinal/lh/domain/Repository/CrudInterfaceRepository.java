package com.chinal.lh.domain.Repository;

/**
 * Created by liuhua on 16-7-1.
 */
public interface CrudInterfaceRepository<T,F> {
//    查询
    T find(F f);
//删除操作
    void delete(F f);

    //根据id 来决定插入或更新
    int save(T t);



}
