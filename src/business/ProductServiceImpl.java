package business;

import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ProductServiceImpl {

	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();

	public ProductServiceImpl() {

		bookList.add("Inferno");
		bookList.add("Joyland");
		bookList.add("The Game of Thrones");

		musicList.add("Amatory");
		musicList.add("Stigmata");
		musicList.add("August Burns Red");

		movieList.add("Oz The Great");
		movieList.add("Despicable Me");
		movieList.add("Star Trek");

	}

	public List<String> getProductCategories() {

		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");

		return categories;
	}

	public List<String> getProducts(String category) {

		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}

		return null;
	}

	public boolean addProduct(String category, String product) {

		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "movies":
			movieList.add(product);
			break;
		default:
			return false;
		}

		return true;
	}

	public List<Product> getProductsv2(String category) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Java Brains Book", "212334", 334.32));
		productList.add(new Product("Head First Java", "344", 23.2));
		productList.add(new Product("Java Book", "344", 28.99));
		
		return productList;
	}
}
