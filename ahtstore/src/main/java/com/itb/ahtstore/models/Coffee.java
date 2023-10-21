package com.itb.ahtstore.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "coffee")
public class Coffee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_coffee", nullable = false)
    private Integer code;

    @Column(name = "merk", nullable = false)
    private String merk;
    
    @Column(name = "type", nullable = false)
    private String type;
    
    @Column(name = "price", nullable = false)
    private Long price;
}
