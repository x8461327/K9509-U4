package cn.kgc.service.imp;

import cn.kgc.domain.Product;
import cn.kgc.mapper.ProductMapper;
import cn.kgc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<Product> selectProduct() {
        return productMapper.selectProduct();
    }
}
