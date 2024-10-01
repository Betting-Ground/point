package com.bettinggorund.point.domain.entity;

import com.bettinggorund.point._common.*;
import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.*;
import static lombok.AccessLevel.*;

@Entity
@Table(name = "points")
@Getter
@NoArgsConstructor(access = PROTECTED)
public class Point extends BaseEntity {

    private static final String POINT_TOKEN_PREFIX = "point_";

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "point_id")
    private Long id;
    private String pointToken;
    @Column(nullable = false, unique = true)
    private String userToken;
    private Long amount;

    @Builder
    public Point(String userToken) {
        this.pointToken = TokenGenerator.randomCharacterWithPrefix(POINT_TOKEN_PREFIX);
        this.userToken = userToken;
        this.amount = 0L;
    }
}
