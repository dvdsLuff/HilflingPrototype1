package hilfling.prototype.Controller;


import hilfling.prototype.Model.Product;
import hilfling.prototype.Service.ProductService;
import hilfling.prototype.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {
 @Autowired
   ProductRepository productRepository;

    @Autowired
    ProductService productService;

    @GetMapping("/index")
    public String index(){

        return "index";

    }

    @GetMapping("/add")
    public String add(){

        return "add";

    }


    @PostMapping("/add")
    public String create(@ModelAttribute Product product){
        Product newProduct = productService.create(product);


        return "index";
    }

    @GetMapping("/delete")
    public String delete(){

        return "delete";

    }
    @GetMapping("/update")
    public String update(){

        return "update";

    }
}
