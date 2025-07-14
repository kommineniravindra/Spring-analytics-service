package com.sathya.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RevenueBreakdownDTO {
    private String label;  // e.g., "2025-07-10" or "Week 27"
    private double totalRevenue;
}
