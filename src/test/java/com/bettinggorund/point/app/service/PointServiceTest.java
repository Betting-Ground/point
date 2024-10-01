package com.bettinggorund.point.app.service;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PointServiceTest {

    @Autowired
    PointService pointService;

    @Test
    public void create() throws Exception {
        // given
        String userToken = "user_fwefinsf23rslkfn823";

        // when
        String pointToken = pointService.create(userToken);

        // then
        System.out.println("pointToken = " + pointToken);
    }

}