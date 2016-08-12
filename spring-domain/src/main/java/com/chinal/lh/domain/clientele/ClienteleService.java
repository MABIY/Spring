package com.chinal.lh.domain.clientele;

import com.chinal.lh.domain.clientele.repository.ClienteleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sj on 16-8-2.
 */
@Service
public class ClienteleService {

    @Autowired
    ClienteleRepository clienteleRepository;

}
