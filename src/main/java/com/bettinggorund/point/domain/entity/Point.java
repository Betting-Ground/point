package com.bettinggorund.point.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.*;
import static lombok.AccessLevel.*;

@Entity
@Table(name = "points")
@Getter
@NoArgsConstructor(access = PROTECTED)
public class Point extends BaseEntity {

    private static final String USER_TOKEN_PREFIX = "point_";

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "point_id")
    private Long id;
    private String pointToken;
    @Column(nullable = false, unique = true)
    private String userToken;
    private Long amount;

}
