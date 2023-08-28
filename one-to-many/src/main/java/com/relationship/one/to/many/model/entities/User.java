package com.relationship.one.to.many.model.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tb_user")
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@EqualsAndHashCode(of = {"id"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    @Setter
    private String name;
    @NonNull
    @Setter
    private String email;
    @OneToMany(mappedBy = "client")
    private Set<Order> orders;

    private void addOrder(Order order){
        orders.add(order);
    }
}
