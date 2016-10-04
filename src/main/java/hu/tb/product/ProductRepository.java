package hu.tb.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tivadar Bocz on 2016.10.03..
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}