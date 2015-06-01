package kr.co.taommall.product.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import kr.co.taommall.product.dao.ProductDAO;
import kr.co.taommall.product.vo.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ProductServiceImpl implements ProductService {
	private String imagePath = "C:\\JAVA\\eclipse\\project_workspace\\shoppingmall\\WebContent\\WEB-INF\\etc\\upimage";
	@Autowired
	private ProductDAO dao;
	
	public void insertProduct(Product product,MultipartFile upfile){
		//파일명은 현재 시간으로 가져옴.
		long lFileName = System.currentTimeMillis();
		String fileName = lFileName+".jpg";
		File file = new File(imagePath,fileName);
		try {
			upfile.transferTo(file);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		imagePath = imagePath+fileName;
		product.setImagePath(imagePath);
		
		System.out.println(product);
		dao.insertProduct(product);
	}
	
	public void updateProduct(Product product,MultipartFile upfile){
		//TODO imagePath가 없을 경우
		dao.updateProduct(product);
	}

	@Override
	public int deleteProduct(String productId) {
		
		return dao.deleteProduct(productId);
	}

	@Override
	public List<Product> selectAllProduct() {
		
		return dao.selectAllProduct();
	}

	@Override
	public List<Product> selectProductById(int productId) {
		// TODO Auto-generated method stub
		return dao.selectProductById(productId);
	}

	@Override
	public List<Product> selectProductLikeName(String productName) {
		// TODO Auto-generated method stub
		return dao.selectProductLikeName(productName);
	}

	@Override
	public List<Product> selectProductByCategory(String productCategory) {
		// TODO Auto-generated method stub
		return dao.selectProductByCategory(productCategory);
	}

	@Override
	public List<Product> selectProductByexpDate(String expDate) {
		// TODO Auto-generated method stub
		return dao.selectProductByexpDate(expDate);
	}

	@Override
	public List<Product> selectProductBySellerId(String sellerId) {
		// TODO Auto-generated method stub
		return dao.selectProductBySellerId(sellerId);
	}

	@Override
	public List<Product> selectProductByPrice(int lPrice,int Hprice) {
		// TODO Auto-generated method stub 검색 조건에 따라 다르게 검색 함.
			
		if(true){
			List<Product> list = dao.selectProductBetweenPrice(lPrice, Hprice);
			List<Product> list1 = dao.selectProductMinPrice(lPrice);
			List<Product> list2 = dao.selectProductMaxPrice(Hprice);
		}
		
		
		return null;
	}

	
}
