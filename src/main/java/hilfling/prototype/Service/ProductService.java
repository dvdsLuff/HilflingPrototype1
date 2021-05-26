package hilfling.prototype.Service;


import hilfling.prototype.Model.Product;
import hilfling.prototype.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Set<Product> findAll(){
        Set<Product> products = new HashSet<>();
        for(Product product : productRepository.findAll()){
            products.add(product);
        }
        return products;

    }


    public Product findById(int id){
        //findById returnerer en optional, så der skal checkes for null og pakkes ud
        Optional<Product> optionalProd = productRepository.findById(id);
        if (!optionalProd.isPresent()){
            throw new RuntimeException("Product" + id + " not found");
        }
        //returner indhold af optional vha. get()
        return optionalProd.get();
    }

    public Product create(Product product){
        return productRepository.save(product);
    }

    public Product update(Product product){
        //check evt. for eksistens og thow exception hvis ikke eksisterer
        return productRepository.save(product);
    }

    public void deleteById(int id){
       productRepository.deleteById(id);
    }

}

