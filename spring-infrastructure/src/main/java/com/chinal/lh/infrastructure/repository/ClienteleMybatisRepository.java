package com.chinal.lh.infrastructure.repository;

import com.chinal.lh.domain.clientele.repository.ClienteleRepository;
import com.chinal.lh.domain.clientele.model.Clientele;
import com.chinal.lh.infrastructure.mapper.ClienteleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

/**
 * Created by sj on 16-7-31.
 */
@Repository
public class ClienteleMybatisRepository implements ClienteleRepository {

    @Autowired
    ClienteleMapper clienteleMapper;

    @Override
    public Clientele find(Integer integer) {
        return clienteleMapper.selectByPrimaryKey(integer);
    }

    @Override
    public void delete(Integer integer) {
        clienteleMapper.deleteByPrimaryKey(integer);
    }

    @Override
    public int save(Clientele clientele) {
        if (StringUtils.isEmpty(clientele.getId())) {
            return clienteleMapper.insert(clientele);
        } else {
            return clienteleMapper.updateByPrimaryKey(clientele);
        }
    }
}
