package com.parochi.distributionTracker.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class StockPosition {

    @Id
    private String id;

    @Column(nullable = false)
    private String status;

    private Warehouse warehouse;

    private List<Product> content = new ArrayList<>();
}
