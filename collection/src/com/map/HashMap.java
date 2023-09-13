package com.map;

public class HashMap {
	
	public static void main(String[] args) {
		
		class Key
		{
		  String key;
		  Key(String key)
		  {
		    this.key = key;
		  }
		  
		  @Override
		  public int hashCode() 
		  {
		     return (int)key.charAt(0);
		  }

		  @Override
		  public boolean equals(Object obj)
		  {
		    return key.equals((String)obj);
		  }
		}


	}

}
