package com.bettinggorund.point.infra;

import com.bettinggorund.point.domain.entity.*;
import com.bettinggorund.point.domain.repository.*;
import com.bettinggorund.point.domain.service.*;
import lombok.*;
import org.springframework.stereotype.*;

@Component
@RequiredArgsConstructor
public class PointStoreImpl implements PointStore {

    private final PointRepository pointRepository;

    @Override
    public Point store(Point initPoint) {
        return pointRepository.save(initPoint);
    }

}
