package hu.tb.product;

import hu.tb.product.Product;

/**
 * Created by Tivadar Bocz on 2016.10.03..
 */
public interface IProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);
}
