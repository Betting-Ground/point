package com.bettinggorund.point.domain.repository;

import com.bettinggorund.point.domain.entity.*;
import org.springframework.data.jpa.repository.*;

public interface PointRepository extends JpaRepository<Point, Long> {
}
