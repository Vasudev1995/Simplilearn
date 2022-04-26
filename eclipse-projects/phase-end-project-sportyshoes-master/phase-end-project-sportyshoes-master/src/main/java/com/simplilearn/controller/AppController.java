package com.simplilearn.controller;

import com.simplilearn.entity.*;
import com.simplilearn.service.AdminService;
import com.simplilearn.service.ProductService;
import com.simplilearn.service.PurchaseService;
import com.simplilearn.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AppController {
	@Autowired
	RegisterService registerService;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	PurchaseService purchaseService;
	
	
	List<Product> products = new ArrayList<Product>();
    @ResponseBody
	@RequestMapping("/home")
	public String Hello()
	{
		return "Welcome to the application from Springs";
	}

	@GetMapping("/")
	public String Welcome() {
		return "welcomepage";
	}
	@GetMapping("/register")
	public String Register() {
		return "register";
	}

	@GetMapping("/login")

	public String login() {
		return "loginpage";
	}

	@GetMapping("/admin")
	public String admin() {
		return "adminpage";
	}
	@GetMapping("/changepassword")
	public String change() {
		return "changepasswordpage";
	}

	@GetMapping("/user")
	public String user() {
		return "user";
	}

	@GetMapping("/product")
	public String Product() {
		return "productpage";
	}

	@GetMapping("/welcomeuser")
	public String welcomeuser() {
		return "welcomeuser";
	}

	@RequestMapping(value = "/adduser", method = RequestMethod.POST)
	public String save(@RequestParam String name
			, @RequestParam String email
			, @RequestParam String gender
			, @RequestParam String password
			, String role,
			HttpServletRequest request) {

		 role="user";
		 Register register1= new Register(name,email,gender,password,role);
		registerService.createRegister(register1);
		return "success";

	}
	@RequestMapping(value= "/validate" , method=RequestMethod.POST)
	public String validateuser(@RequestParam String email, @RequestParam String password) {
		Register register = registerService.findByEmail(email);
		String email1 =register.getEmail();
		String password1 = register.getPassword();
		if(password.equals(password1) && email.equals(email1)) {
			return "welcomeuser";
		}
		else
		return "wronguser";

	}
@RequestMapping(value= "/validateadmin" , method=RequestMethod.POST)
public String validateadmin(@RequestParam String name, @RequestParam String password) {
	Admin admin = adminService.findByName(name);
//	String name1 = admin.getName();
	String password1 = admin.getPassword();

	if(password.equals(password1)) {
		return "welcomeadmin";
	}
	else
	return "wrongadmin";
	
}
@RequestMapping(value="/adminupdate" , method=RequestMethod.POST)
public String changepass(@RequestParam String name, @RequestParam String oldpassword, @RequestParam String newpassword){
	Admin admin = adminService.findByName(name);
	String name1 = admin.getName();
	String password1 = admin.getPassword();
	if(oldpassword.equals(password1) && name.equals(name1)) {
		admin.setPassword(newpassword);
		adminService.update(name, admin);
		//admin.setPassword(newpassword);
		
		
		return "passwordchanged";
	}
	
	return "error";
	
}

@GetMapping(value="/allusers")
public String allusers(ModelMap model) {
	List<Register> register = registerService.findAll();
    model.put("allusers", register);
	
	return "allusers";
	
}

@RequestMapping(value="/nameuser", method =RequestMethod.POST)
public String nameuser(@RequestParam String name, Model model) {
	List<Register> register = registerService.findByName(name);
	model.addAttribute("regobj",register);
	return "nameuser";
	
}

@RequestMapping(value="/emailuser", method =RequestMethod.POST)
public String emailuser(@RequestParam String email, Model model) {
	Register register = registerService.findByEmail(email);
	model.addAttribute("id",register.getId());
	model.addAttribute("name",register.getName());
	model.addAttribute("gender",register.getGender());
	model.addAttribute("email",register.getEmail());
	return "emailuser";
	
}
@GetMapping(value = "/allproduct")
public String allproduct(ModelMap model)
{
	List<Product> product = productService.getProducts(); 
	model.put("allproduct", product);
	return "allproduct";
}
@RequestMapping(value = "/nameproduct", method = RequestMethod.POST)
public String nameproduct(@RequestParam String name, ModelMap model)
{
	List<Product> nameproduct = productService.getProductByName(name);
	model.put("nameproduct", nameproduct);
	return "nameproduct";
}
@RequestMapping(value = "/colourproduct", method = RequestMethod.POST)
public String colourproduct(@RequestParam String colour, ModelMap model)
{
	List<Product> colourproduct = productService.getProductByColour(colour);
	model.put("colourproduct", colourproduct);

	
	return "colourproduct";
}
@RequestMapping(value = "/categoryproduct", method = RequestMethod.POST)
public String categoryproduct(@RequestParam String category, ModelMap model)
{
	List<Product> categoryproduct = productService.getProductByCategory(category);
	model.put("categoryproduct", categoryproduct);
	
	return "categoryproduct";
}
@RequestMapping(value = "/priceproduct", method = RequestMethod.POST)
public String priceproduct(@RequestParam Long price, ModelMap model)
{
	List<Product> priceproduct = productService.getProductByprice(price);
	model.put("priceproduct", priceproduct);
	
	return "priceproduct";
}
@RequestMapping(value = "/createproduct", method = RequestMethod.POST)
public String createProduct(@RequestParam String name 
		, @RequestParam String colour
		, @RequestParam String category
		, @RequestParam Long price) {

	 Product product = new Product(name,category,price,colour);
	 productService.createProduct(product);
	return "createdproduct";
	
}

@RequestMapping(value = "/deleteproduct", method =RequestMethod.POST)
public String deleteproduct(@RequestParam Long id) {
	productService.deleteProduct(id);

	return "deleted";
}
@RequestMapping(value ="/updateproduct", method = RequestMethod.POST)
public String updateproduct(@RequestParam Long id
		, @RequestParam String name
		,@RequestParam String colour
		,@RequestParam String category
		,@RequestParam Long price){
   Product product = productService.getProductById(id);
	product.setCategory(category);
	product.setColour(colour);
	product.setName(name);
	product.setPrice(price);
	
	productService.updateProduct(id, product);
	
	return "updateproduct";
}



@RequestMapping(value = "/allproductuser")
public String allproductU(ModelMap model)
{
	List<Product> product = productService.getProducts(); 
	model.put("allproduct", product);
	return "allproductuser";
}
@RequestMapping(value = "/nameproductuser", method = RequestMethod.POST)
public String nameproductU(@RequestParam String name, ModelMap model)
{
	List<Product> nameproduct = productService.getProductByName(name);
	model.put("nameproduct", nameproduct);
	return "nameproductuser";
}
@RequestMapping(value = "/colourproductuser", method = RequestMethod.POST)
public String colourproductU(@RequestParam String colour, ModelMap model)
{
	List<Product> colourproduct = productService.getProductByColour(colour);
	model.put("colourproduct", colourproduct);

	
	return "colourproductuser";
}

@RequestMapping(value = "/categoryproductuser", method = RequestMethod.POST)
public String categoryproductU(@RequestParam String category, ModelMap model)
{
	List<Product> categoryproduct = productService.getProductByCategory(category);
	model.put("categoryproduct", categoryproduct);
	
	return "categoryproductuser";
}
@RequestMapping(value = "/priceproductuser", method = RequestMethod.POST)
public String priceproductU(@RequestParam Long price, ModelMap model)
{
	List<Product> priceproduct = productService.getProductByprice(price);
	model.put("priceproduct", priceproduct);
	
	return "priceproductuser";
}

//@RequestMapping(value = "/addtocast")
//public String addtocart(@RequestParam Long productid)
//{
//	Product product = productService.getProductById(productid);
//	products.add(product);
//	
//	return null;
//	
//}

@RequestMapping(value = "/orderbyname", method = RequestMethod.POST)
public String orderByName(@RequestParam String type, @RequestParam Long productid, ModelMap model)
{
	Product product = productService.getProductById(productid);
	List<Product> list = new ArrayList<Product>();
	list.add(product);
	long mills = System.currentTimeMillis();
	Date date = new Date(mills);
	Purchase purchase = new Purchase(date,type,productid,list);
	purchaseService.createPurchase(purchase);
	return "ordersuccessed";
}
@RequestMapping(value = "/orderbycolour", method = RequestMethod.POST)
public String orderByColour(@RequestParam String type, @RequestParam Long productid, ModelMap model)
{
	Product product = productService.getProductById(productid);
	List<Product> list = new ArrayList<Product>();
	list.add(product);
	long mills = System.currentTimeMillis();
	Date date = new Date(mills);
	Purchase purchase = new Purchase(date,type,productid,list);
	purchaseService.createPurchase(purchase);
	return "ordersuccessed";
}
@RequestMapping(value = "/orderbycategory", method = RequestMethod.POST)
public String orderByCategory(@RequestParam String type, @RequestParam Long productid, ModelMap model)
{
	Product product = productService.getProductById(productid);
	List<Product> list = new ArrayList<Product>();
	list.add(product);
	long mills = System.currentTimeMillis();
	Date date = new Date(mills);
	Purchase purchase = new Purchase(date,type,productid,list);
	purchaseService.createPurchase(purchase);
	return "ordersuccessed";
}
@RequestMapping(value = "/orderbyprice", method = RequestMethod.POST)
public String orderByPrice(@RequestParam String type, @RequestParam Long productid, ModelMap model)
{
	Product product = productService.getProductById(productid);
	List<Product> list = new ArrayList<Product>();
	list.add(product);
	long mills = System.currentTimeMillis();
	Date date = new Date(mills);
	Purchase purchase = new Purchase(date,type,productid,list);
	purchaseService.createPurchase(purchase);
	return "ordersuccessed";
}
@RequestMapping(value = "/orderbyall", method = RequestMethod.POST)
public String orderByAll(@RequestParam String type, @RequestParam Long productid, ModelMap model)
{
	Product product = productService.getProductById(productid);
	List<Product> list = new ArrayList<Product>();
	list.add(product);
	long mills = System.currentTimeMillis();
	Date date = new Date(mills);
	Purchase purchase = new Purchase(date,type,productid,list);
	purchaseService.createPurchase(purchase);
	return "ordersuccessed";
}

@RequestMapping("/purchase")
public String purchase()
{
	return "purchase";
}


@RequestMapping("/allpurchase")
public String allpurchase(ModelMap model)
{
	List<Purchase> list = purchaseService.findAll();
	model.put("purchase", list);
	return "allpurchase";
}
@RequestMapping("/typepurchase")
public String typepurchase(@RequestParam String type, ModelMap model)
{
	List<Purchase> list = purchaseService.findByType(type);
	model.put("purchase", list);
	return "typepurchase";
}
@RequestMapping("/datepurchase")
public String datepurchase(@RequestParam Date date, ModelMap model)
{
	List<Purchase> list = purchaseService.findByDate(date);
	model.put("purchase", list);
	return "datepurchase";
}
}