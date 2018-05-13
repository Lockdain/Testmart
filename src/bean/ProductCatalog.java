package bean;

import java.util.List;

import javax.jws.WebService;

import business.ProductServiceImpl;
import model.Product;

@WebService(endpointInterface = "bean.ProductCatalogInterface", portName = "TestMartCatalogPort", 
			serviceName = "TestMartCatalogService", name="TestMartCatalog")
public class ProductCatalog implements ProductCatalogInterface {

	ProductServiceImpl productService = new ProductServiceImpl();

	public List<String> getProductCategories() {
		return productService.getProductCategories();
	}

	public List<String> getProduct(String category) {
		return productService.getProducts(category);
	}

	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}

	public List<Product> getProductv2(String category) {
		return productService.getProductsv2(category);
	}

}
