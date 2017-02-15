package designPattern;

import java.util.Objects;

interface SocialNetwork
{
	public String getNetworkName();
	public void verify();
}

class Google implements SocialNetwork
{
	public String getNetworkName(){
		return "Google";
	}
	
    boolean userVerification(){
		//if user exists 
		return true;
	}
	
	public void verify()
	{
		System.out.print("Network Name : "+this.getNetworkName()+" , Verification Status : ");
		if(userVerification() == true)
			System.out.print("Sucess");
		else
			System.out.print("Fail");
	}
}

class Facebook implements SocialNetwork
{
	public String getNetworkName(){
		return "Facebook";
	}
	
	boolean userVerification(){
		//if user exists 
		return true;
	}
	
	public void verify()
	{
		System.out.print("Network Name : "+this.getNetworkName()+" , Verification Status : ");
		if(userVerification() == true)
			System.out.print("Sucess");
		else
			System.out.print("Fail");
	}
}

class LinkedIn implements SocialNetwork
{
	public String getNetworkName(){
		return "LinkedIn";
	}
	
	boolean userVerification(){
		//if user exists 
		return true;
	}
	
	public void verify()
	{
		System.out.print("Network Name : "+this.getNetworkName()+" , Verification Status : ");
		if(userVerification() == true)
			System.out.print("Sucess");
		else
			System.out.print("Fail");
	}
}

class Twitter implements SocialNetwork
{
	public String getNetworkName(){
		return "Twitter";
	}
	
	public boolean userVerification(){
		//if user exists 
		return true;
	}
	
	public void verify()
	{
		System.out.print("Network Name : "+this.getNetworkName()+" , Verification Status : ");
		if(userVerification() == true)
			System.out.print("Sucess");
		else
			System.out.print("Fail");
	}
	
}

class SocialNetworkFactory
{
	public SocialNetwork login(String social_network_name)
	{
		if(Objects.equals(social_network_name,"Facebook")){
			return new Facebook();
		}
		else if(Objects.equals(social_network_name,"Google")){
			return new Google();
		}
		else if(Objects.equals(social_network_name,"LinkedIn")){
			return new LinkedIn();
		}
		else if(Objects.equals(social_network_name,"Twitter")){
			return new Twitter();
		}
		else
			return null;
	}
}



public class Main 
{
	public static void main(String[] args)
	{
		String social_network = "Google";
		SocialNetworkFactory Factory = new SocialNetworkFactory();
		SocialNetwork SN = Factory.login(social_network);
		SN.verify();
	}
	

}


