//package main;
import java.util.*;
//import required packages here

class Item
{
private int price;
//create various method to return attribute value(s)

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}
}
 
class Customer
{
private String product;
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
private int quantity;
//create various method to return attribute value(s)
}

class Bill
{
	
	public int calc(int q,int p) {
		int amount=0;
		//System.out.println(q*p);
		amount=(q*p);
		return amount;
	}
			

}
class Main
{
public static void main(String[] args)
{
  Item i = new Item();
  Customer c = new Customer();
  Bill obj = new Bill();
  Scanner sc = new Scanner(System.in);
  c.setProduct(sc.nextLine());
  i.setPrice(sc.nextInt());
  c.setQuantity(sc.nextInt());
  System.out.println("Total Price is : "+ obj.calc(c.getQuantity(),i.getPrice()));
  //write the logic here
  
}
}