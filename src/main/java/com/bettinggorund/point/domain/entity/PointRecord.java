package com.bettinggorund.point.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.*;

import static jakarta.persistence.CascadeType.*;
import static jakarta.persistence.EnumType.*;
import static jakarta.persistence.FetchType.*;
import static jakarta.persistence.GenerationType.*;
import static lombok.AccessLevel.*;

@Entity
@Table(name = "point_records")
@Getter
@NoArgsConstructor(access = PROTECTED)
public class PointRecord extends BaseEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "point_record_id")
    private Long id;
    @ManyToOne(fetch = LAZY, cascade = ALL)
    @JoinColumn(name = "point_id", nullable = false, updatable = false)
    private Point point;
    private Long recordAmount;
    @Enumerated(STRING)
    private RecordType recordType;
    private LocalDateTime recordTime;

}
