package com.relationship.many.to.many.model.entities;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
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
    @ManyToMany
    @JoinTable(name = "tb_product_category",
        joinColumns = @JoinColumn(name = "product_id"),
        inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories = new HashSet<>();

    public void addCategory(Category category){
        categories.add(category);
    }
}
