import java.util.*;
import java.io.*;
//import java.lang.String.*;
import java.util.Arrays;
import java.util.*;
public class AuctionStage
{
	
	 
	public static void main(String[]args)throws Exception
	{
		 ArrayList<Bidder> bidders;
		 ArrayList<Integer> bidding;
		 Player virat;
	     int max=0;
		//
		
		int i=0;
			Scanner sn =new Scanner(System.in);	
			bidding=new ArrayList<Integer>();
			bidders=new ArrayList<Bidder>();

			BufferedReader fin=null;
			
		
		
			//fin =new BufferedReader(new FileReader("input.txt"));
			String s=sn.next();
			//System.out.println(s);
			virat=new Player(s);
			
			s=sn.next();
			int size=Integer.parseInt(s);
			
			//System.out.println(size);
		
			while(i<size)
			{ 
			s=sn.next();
			String[]z=s.split(",");
			
				
					Bidder p=new Bidder(Integer.parseInt(z[0]),Integer.parseInt(z[1]));
					p.linkplayer(virat);
					bidders.add(p);
				
			i++;	
				
			}
			
			s=sn.next();
			max=Integer.parseInt(s);
			
			
			//s=sn.next();
			for(int f=0;f<max;f++) 
			{ 
  
			s=sn.next();
      //System.out.println(s);
			String[]z=s.split(",");
			
					
					bidding.add(Integer.parseInt(z[0]));
					bidding.add(Integer.parseInt(z[1]));
					
        
				
				
			}
			
			
		
		
		//
		
		int j=0;
		i=0;
		while(j<size)
		{
			
			virat.attach(bidders.get(j));
			j++;
			
		}
		
		j=0;
		while(j<max)
		{
			if(j<max-1)
			{virat.setBidderAndPrice(bidding.get(i++),bidding.get(i++));
			j++;
			}
			else {virat.completeDeal(bidding.get(i++),bidding.get(i++));
			j++;}
		}
		
		
		/*for(int k=0;k<bidders.size();k++)
		{
			Bidder a=bidders.get(k);
			System.out.println("ID:"+a.BId+" "+a.Budget);
		}*/
		
		
		
		
	}
	
	
}
