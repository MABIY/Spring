package com.chinal.lh.domain.data;

import lombok.*;

/**
 * Created by liuhua on 16-6-30.
 */
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private long id;

    private String name;

    private int age;
}
