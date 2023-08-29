package com.relationship.one.to.one.model.entities;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "tb_order")
@NoArgsConstructor
@AllArgsConstructor()
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;
    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Payment payment;
}
