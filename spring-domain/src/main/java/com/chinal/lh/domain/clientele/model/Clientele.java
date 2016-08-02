package com.chinal.lh.domain.clientele.model;

import lombok.Data;

@Data
public class Clientele {
    private Integer id;

    private String name;

    private Short age;

    private SexStates sex;

    private String identity;

    private Integer accountId;

}