package com.chinal.lh.domain.clientele.repository;

import com.chinal.lh.domain.clientele.model.Clientele;
import com.chinal.lh.domain.repository.CrudRepository;

/**
 * Created by sj on 16-7-31.
 */
public interface ClienteleRepository extends CrudRepository<Clientele,Integer> {

    Clientele findByAccountId(Integer f);
}
