package hu.tb.product;

import hu.tb.product.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tivadar Bocz on 2016.10.03..
 */
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
}