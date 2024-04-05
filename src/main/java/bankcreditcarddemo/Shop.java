package bankcreditcarddemo;

import java.util.List;

public class Shop {
    public List<Product> productList;

    public void selectionProcess(Product product){
        if (productList.contains(product)){
            System.out.println(" Product found "+product);
        }else
        {
            System.out.println(" Product Not Found ");
        }
    }
}
