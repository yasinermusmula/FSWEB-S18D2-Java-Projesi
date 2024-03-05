package com.example.s18d2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "vegetable",schema = "fsweb")
public class Vegetable extends Plant{

    @Column(name = "grown_on_tree")
    private boolean isGrownOntree;
}
