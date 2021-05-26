package hilfling.prototype.repository;

import org.springframework.data.repository.CrudRepository;
import hilfling.prototype.Model.Product;


public interface ProductRepository extends CrudRepository<Product, Integer> {


}