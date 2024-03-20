package com.ibit.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "equity")
public class Equity {

    @Id
    @Column(name = "product_code")
    private String productCode;

    @Column(name = "stock_name")
    private String stockName;

    @Column(name = "primary_exchange")
    private String primaryExchange;

    @Column(name = "lot_size")
    private Integer lotSize;

    @Column(name = "last_close_price")
    private BigDecimal lastClosePrice;

    @Column(name = "currency")
    private String currency;

    @Column(name = "day_20_average_volume")
    private Long day20AverageVolume;

    @Column(name = "day_30_average_volume")
    private Long day30AverageVolume;
}
