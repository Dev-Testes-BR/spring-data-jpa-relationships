package com.example.demo.model.entities;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_product")
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@EqualsAndHashCode(of = {"id"})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    @Setter
    private String name;
    @NonNull
    @Setter
    @Column(columnDefinition = "TEXT")
    private String description;
    @NonNull
    @Setter
    private Double price;
    @NonNull
    @Setter
    private String imgUrl;
    @OneToMany(mappedBy = "id.product")
    private Set<OrderItem> items = new HashSet<>();

    public List<Order> getOrders(){
        return items.stream().map(x -> x.getOrder()).toList();
    }
}
