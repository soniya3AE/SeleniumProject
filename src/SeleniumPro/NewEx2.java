package SeleniumPro;

public class NewEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a= "121";
		String b="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
					b=b+a.charAt(i);
					
			
		}
		System.out.println(b);
		// int result  = (int) b;
		 
		
		
		if(a.equals(b))
		{
			System.out.println("madam45");
		}
		else
		{
			System.out.println("madam12");
		}

	}

}
