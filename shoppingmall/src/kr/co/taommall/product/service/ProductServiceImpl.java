package kr.co.taommall.product.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import kr.co.taommall.common.PagingBean;
import kr.co.taommall.product.dao.ProductDAO;
import kr.co.taommall.product.vo.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ProductServiceImpl implements ProductService {
	private String abImagePath = "C:\\JAVA\\eclipse\\project_workspace\\shoppingmall\\WebContent\\upimage";
	private String deImagePath = "upimage/";
	@Autowired
	private ProductDAO dao;
	
	public void insertProduct(Product product,MultipartFile upfile){
		//파일명은 현재 시간으로 가져옴.
		long lFileName = System.currentTimeMillis();
		String fileName = lFileName+".jpg";
		File file = new File(abImagePath,fileName);
		try {
			upfile.transferTo(file);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String imagePath = deImagePath+fileName;
		product.setImagePath(imagePath);
		dao.insertProduct(product);
	}
	
	public void updateProduct(Product product,MultipartFile upfile){
		//imagePath가 있는 경우
		if(product.getImagePath()!=null){
			File file = new File(abImagePath,product.getImagePath().substring(8));
			file.delete();
			dao.updateProduct(product);	
		}else{
			dao.updateProductIgnoreImagePath(product);
		}
	}

	@Override
	public int deleteProduct(int productId) {
		Product product = dao.selectProductByIdNoPaging(productId);
		File file = new File(abImagePath,product.getImagePath().substring(8));
		file.delete();
		return dao.deleteProduct(productId);
	}

	@Override
	public List<Product> selectAllProduct(int pageNo,Model model) {
		int totalContent = dao.selectProductCount();
		PagingBean pagingBean = new PagingBean(totalContent, pageNo);
		int contentsPerPage =PagingBean.CONTENTS_PER_PAGE;
		model.addAttribute("contentsPerPage", contentsPerPage);
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("pagingBean", pagingBean);
		//dao작업
		List<Product> list = dao.selectAllProduct(model);
		return list;
	}

	@Override
	public List<Product> selectProductById(int productId,int pageNo,Model model) {
		int totalContent = dao.selectProductCount();
		PagingBean pagingBean = new PagingBean(totalContent, pageNo);
		int contentsPerPage =PagingBean.CONTENTS_PER_PAGE;
		model.addAttribute("contentsPerPage", contentsPerPage);
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("pagingBean", pagingBean);
		model.addAttribute("productId", productId);
		return dao.selectProductById(model);
	}

	@Override
	public List<Product> selectProductLikeName(String productName,int pageNo,Model model) {
		int totalContent = dao.selectProductCount();
		PagingBean pagingBean = new PagingBean(totalContent, pageNo);
		int contentsPerPage =PagingBean.CONTENTS_PER_PAGE;
		model.addAttribute("contentsPerPage", contentsPerPage);
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("pagingBean", pagingBean);
		model.addAttribute("productName", productName);
		return dao.selectProductLikeName(model);
	}

	@Override
	public List<Product> selectProductByCategory(String productCategory,int pageNo,Model model) {
		int totalContent = dao.selectProductCount();
		PagingBean pagingBean = new PagingBean(totalContent, pageNo);
		int contentsPerPage =PagingBean.CONTENTS_PER_PAGE;
		model.addAttribute("contentsPerPage", contentsPerPage);
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("pagingBean", pagingBean);
		model.addAttribute("category", productCategory);
		return dao.selectProductByCategory(model);
	}

	@Override
	public List<Product> selectProductByexpDate(String expDate,int pageNo,Model model) {
		int totalContent = dao.selectProductCount();
		PagingBean pagingBean = new PagingBean(totalContent, pageNo);
		int contentsPerPage =PagingBean.CONTENTS_PER_PAGE;
		model.addAttribute("contentsPerPage", contentsPerPage);
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("pagingBean", pagingBean);
		model.addAttribute("expDate", expDate);
		return dao.selectProductByexpDate(model);
	}

	@Override
	public List<Product> selectProductBySellerId(String sellerId,int pageNo,Model model) {
		int totalContent = dao.selectProductCount();
		PagingBean pagingBean = new PagingBean(totalContent, pageNo);
		int contentsPerPage =PagingBean.CONTENTS_PER_PAGE;
		model.addAttribute("contentsPerPage", contentsPerPage);
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("pagingBean", pagingBean);
		model.addAttribute("sellerId", sellerId);
		return dao.selectProductBySellerId(model);
	}

	@Override
	public List<Product> selectProductByPrice(int lPrice,int Hprice,int pageNo,Model model) {
		// TODO Auto-generated method stub 검색 조건에 따라 다르게 검색 함.
		int totalContent = dao.selectProductCount();
		PagingBean pagingBean = new PagingBean(totalContent, pageNo);
		int contentsPerPage =PagingBean.CONTENTS_PER_PAGE;
		model.addAttribute("contentsPerPage", contentsPerPage);
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("pagingBean", pagingBean);
		model.addAttribute("min", lPrice);
		model.addAttribute("max",Hprice);
		if(true){
			List<Product> list = dao.selectProductBetweenPrice(model);
			List<Product> list1 = dao.selectProductMinPrice(model);
			List<Product> list2 = dao.selectProductMaxPrice(model);
		}
		
		
		return null;
	}
	
	@Override
	public Product selectProductByIdNoPaging(int productId,Model model){
		return dao.selectProductByIdNoPaging(productId);
	}
	
	@Override
	public List<Product> selectProductBySellerIdNoPaging(String sellerId,Model model){
		return dao.selectProductBySellerIdNoPaging(sellerId);
	}
	
	@Override
	public List<Product> selectProductToRandom(int num){
		return dao.selectProductToRandom(num);
	}
}
