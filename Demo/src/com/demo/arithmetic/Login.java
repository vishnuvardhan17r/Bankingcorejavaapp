package com.demo.arithmetic;
import java.util.Scanner;
public class Login {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the username");
		String username=s.nextLine();
		System.out.println("Enter the password");
		String password=s.nextLine();
	if(username.equals("vishnu") && password.equals("vardhan") )
		{
				System.out.println("your login is succesfull..");
				System.out.println("Welcome to Amazon Mobiles");
				System.out.println("which mobile you want");
				System.out.println("********************");
				System.out.println("1.oppo");
				System.out.println("2.oneplus");
				System.out.println("3.redmi");
				System.out.println("4.realme");
				System.out.println("5.lenovo");
				System.out.println("********************");
				String mobile=s.nextLine();
	if(mobile.equals("vivo")||mobile.equals("oppo")||mobile.equals("oneplus")||mobile.equals("redmi")||mobile.equals("realme")||mobile.equals("lenovo"))
	{
		System.out.println("IN stock");
		System.out.println("which model number mobile you need to buy");
		System.out.println("********************");
		System.out.println("A series");
		System.out.println("B series");
		System.out.println("C series");
		System.out.println("D series");
		System.out.println("E series");
		System.out.println("********************");
		String series=s.nextLine();
	 if(series.equals("A series")||series.equals("B series")||series.equals("C series")||series.equals("D series")||series.equals("E series"))
		{
			System.out.println("Your mobile is succesfully added to cart");
			System.out.println("Enter you Address");
			String  address=s.nextLine();
			System.out.println("Your Address is available to delivery");
			System.out.println("Select the Payment Method");
			System.out.println("********************");
			System.out.println("1.Pay on Delivery");
			System.out.println("2.Net Banking");
			System.out.println("3.Card Details");
			System.out.println("4.UPI");
			System.out.println("********************");
			String Paymentmethod=s.nextLine();
		if(Paymentmethod.equals("Pay on Delivery")||Paymentmethod.equals("Net Banking")||Paymentmethod.equals("Card Details")||Paymentmethod.equals("UPI"))
			{
			System.out.println("Enter the payment details");
			String payment=s.nextLine();
			System.out.println("Review your order details");
			System.out.println("Mobile Brand :"+mobile);
			System.out.println("Series Name :"+series);
			System.out.println("Delivery Address :"+address);
			System.out.println("Payment Through :"+Paymentmethod);
			System.out.println("payment information :"+payment);
			System.out.println("Click 'yes' to place your order..");
			System.out.println("Click 'No' to place your order..");
			String option=s.nextLine();
		if(option.equals("yes"))
			{
				System.out.println("Your order is placed");
				System.out.println("Thank you for Shoopping in amazonmobiles");
			}
			else
			{
				System.out.println("your order is Cancelled");
				System.out.println("Thank you for choosing in amazonmobiles");
			}

			}		
		}	
	}
	else
		System.out.println("Out of Stock");
				
		}
		else
			    System.out.println("Invalid login");
	}
}


