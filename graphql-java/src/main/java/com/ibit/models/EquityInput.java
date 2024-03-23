package com.ibit.models;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class EquityInput {
    private String productCode;
    private String stockName;
    private String primaryExchange;
    private Integer lotSize;
    private BigDecimal lastClosePrice;
    private String currency;
    private Long day20AverageVolume;
    private Long day30AverageVolume;
}
