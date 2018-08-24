import com.product.project.model.Product;
import com.product.project.repository.ProductRepository;
import com.product.project.service.ProductService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
@SpringBootTest
public class ProductServiceTest {

    @Mock
    ProductRepository productRepository;

    @InjectMocks
    ProductService productService;

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getAllProductsTest(){

        List<Product> products = new ArrayList<>();
        Product product1 = new Product();
        product1.setId("425");
        product1.setName("test1");
        product1.setDescription("product 1");
        product1.setType("CHIPS");
        product1.setCategory("EATABLES");
        product1.setPrice(20.55);

        products.add(product1);

        Product product2 = new Product();
        product2.setId("416");
        product2.setName("test2");
        product2.setDescription("product2");
        product2.setType("CANDIES");
        product2.setCategory("BARS");
        product2.setPrice(40.5);

        products.add(product2);
        when(productRepository.findAll()).thenReturn(products);
        List<Product> result =this.productService.getAllProducts();
        assertEquals(2, result.size());

    }


    @Test
    public void editProduct(){
        Product product1 = new Product();
        product1.setId("425");
        product1.setName("test1");
        product1.setDescription("product 1");
        product1.setType("CHIPS");
        product1.setCategory("EATABLES");
        product1.setPrice(20.55);

    }




}
