package bean;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import model.Product;

@WebService(targetNamespace="www.testmart.com")
public interface ProductCatalogInterface {
	@WebMethod(action = "fetch_categories", operationName = "fetchCategories")
	List<String> getProductCategories();

	@WebMethod
	List<String> getProduct(String category);

	@WebMethod
	boolean addProduct(String category, String product);

	@WebMethod
	List<Product> getProductv2(String category);

}