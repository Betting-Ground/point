package com.bettinggorund.point.app.service;

import com.bettinggorund.point.domain.entity.*;
import com.bettinggorund.point.domain.service.*;
import lombok.*;
import org.springframework.stereotype.*;

@Service
@RequiredArgsConstructor
public class PointService {

    private final PointStore pointStore;

    public String create(String userToken) {
        Point initPoint = Point.builder()
                .userToken(userToken)
                .build();

        Point point = pointStore.store(initPoint);
        return point.getPointToken();
    }

}
