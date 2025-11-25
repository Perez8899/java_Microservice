package com.perez.compras_ventas.services;

import com.perez.compras_ventas.common.dto.PageableRequest;
import com.perez.compras_ventas.common.dto.PageableResponse;
import com.perez.compras_ventas.dto.request.ProductAlmacenRequest;
import com.perez.compras_ventas.dto.request.ProductRequest;
import com.perez.compras_ventas.dto.response.ProductResponse;
import com.perez.compras_ventas.dto.response.ProductoFilterCriteria;

import java.util.List;

public interface ProductService {

    PageableResponse<ProductResponse> getProductsPagination(PageableRequest<ProductoFilterCriteria> pageableRequest);

    ProductResponse createProducto(ProductRequest productoRequest);

    ProductResponse createProductoAlmacen(ProductAlmacenRequest productoAlmacenRequest);

    List<ProductResponse> getAllProductosByAlmacen(Integer almacenId);
}
