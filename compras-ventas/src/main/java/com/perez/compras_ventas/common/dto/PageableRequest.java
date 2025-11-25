package com.perez.compras_ventas.common.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PageableRequest <T>{

    private T criterials;
    private Integer pageNumber;
    private String sortField;
    private Integer pageSize;
    private String sortOrder;
    private String filterValue;

}
