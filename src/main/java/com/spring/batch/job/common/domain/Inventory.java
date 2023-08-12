package com.spring.batch.job.common.domain;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Inventory {

    private String itemId;
    private String unitItemId;
    private Integer baseQty;
    private Integer usableQty;
    private String registerId;
    private String modifierId;
}
