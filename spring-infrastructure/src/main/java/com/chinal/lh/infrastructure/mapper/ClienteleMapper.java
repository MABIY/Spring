package com.chinal.lh.infrastructure.mapper;

import com.chinal.lh.domain.data.Clientele;
import java.util.List;

public interface ClienteleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Clientele record);

    Clientele selectByPrimaryKey(Integer id);

    List<Clientele> selectAll();

    int updateByPrimaryKey(Clientele record);
}