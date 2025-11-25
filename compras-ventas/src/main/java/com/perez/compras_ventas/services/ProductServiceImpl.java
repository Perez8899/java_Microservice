package com.perez.compras_ventas.services;

import com.perez.compras_ventas.common.dto.FileRequest;
import com.perez.compras_ventas.common.dto.FileResponse;
import com.perez.compras_ventas.common.dto.PageableRequest;
import com.perez.compras_ventas.common.dto.PageableResponse;
import com.perez.compras_ventas.dto.request.ProductAlmacenRequest;
import com.perez.compras_ventas.dto.request.ProductRequest;
import com.perez.compras_ventas.dto.response.ProductResponse;
import com.perez.compras_ventas.dto.response.ProductoFilterCriteria;
import com.perez.compras_ventas.entity.Almacen;
import com.perez.compras_ventas.entity.AlmacenProducto;
import com.perez.compras_ventas.entity.Categoria;
import com.perez.compras_ventas.entity.Producto;
import com.perez.compras_ventas.repository.AlmacenProductRepository;
import com.perez.compras_ventas.repository.ProductRepository;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements  ProductService{

    private final ProductRepository productoRepository;

    private final FileService fileService;

    private final AlmacenProductRepository almacenProductRepository;

    private final EntityManager entityManager;


    @Override
    public PageableResponse<ProductResponse> getProductsPagination(PageableRequest<ProductoFilterCriteria> pageableRequest) {
        return null;
    }

    @Override
    public ProductResponse createProducto(ProductRequest productRequest) {
        try {
            Producto productoToCreate = ProductRequest.toEntity(productRequest);
            productoToCreate.setCategoria(entityManager.getReference(Categoria.class, productRequest.getCategoriaId()));
            FileResponse createFile = fileService.createFile(FileRequest.builder().file(productRequest.getFile()).build());
            productoToCreate.setImagen(createFile.getFilePath());
            return ProductResponse.fromEntity(productoRepository.save(productoToCreate));
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public ProductResponse createProductoAlmacen(ProductAlmacenRequest productAlmacenRequest) {
        try {
            AlmacenProducto almacenProductoToCreate = AlmacenProducto.builder()
                    .almacen(entityManager.getReference(Almacen.class, productAlmacenRequest.getAlmacenId()))
                    .producto(entityManager.getReference(Producto.class, productAlmacenRequest.getProductoId()))
                    .stock(productAlmacenRequest.getStock())
                    .build();
            return ProductResponse.fromEntity(almacenProductRepository.save(almacenProductoToCreate).getProducto());
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<ProductResponse> getAllProductosByAlmacen(Integer almacenId) {
        return almacenProductRepository.findByAlmacen_Id(almacenId).stream().map(res->ProductResponse.fromEntity(res.getProducto()))
                .collect(Collectors.toList());
    }
}
