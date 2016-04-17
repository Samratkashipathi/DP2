import java.util.*;
import java.io.*;
class Player
{
	
	private int bId=0;
	private int bPrice;
	private String playername;
	private ArrayList<Bidder> Bidders=new ArrayList<Bidder>();
	private int bcount;
	private boolean sold=false;
	PrintWriter fout=null;
	private int pi=1;	
	
	public Player(String name){
		playername=name;
	}	
	
	public void attach( Bidder a ){
		
		
		
		Bidders.add(a);
		
		bcount++;
	}
	
	public int [] getBidderAndPrice(){
		int a[]=new int[2];
		a[0]=this.bId;
		a[1]=this.bPrice;
		return a;
		
    }
	
	 public void setBidderAndPrice(int bidderId, int biddingPrice)  throws Exception{
		 
		 //check bID
		if(this.bPrice<biddingPrice&&sold==false){
			    
				if(this.bId!=0)
					{	
					int j=0;
				
					while ((this.bId!=(Bidders.get(j)).getId())&&Bidders.size()>j)
					{
						j++;
					}
				    
					Bidder a=Bidders.get(j);
					a.setBud(a.getBud()-10);
					
					}
					this.bId=bidderId;
					this.bPrice=biddingPrice;
					
					notifyBidding();
					}
					
					
				else{
					System.out.println("not proper");
					}
		 }
	
	 public void completeDeal(int bidderId, int biddingPrice)  throws Exception{
		 
		 
		 //check bID
		if(this.bPrice<biddingPrice&&sold==false){
			       int j=0;
				
				if(this.bId!=0)
					{	
					 j=0;
				
						while ((this.bId!=(Bidders.get(j)).getId())&&Bidders.size()>j)
						{
							j++;
						}
				    
					Bidder a=Bidders.get(j);
					a.setBud(a.getBud()-10);
					
					}
				
						j=0;
				
						while ((bidderId!=(Bidders.get(j)).getId())&&Bidders.size()>j)
						{
							j++;
						}
					
					Bidder a=Bidders.get(j);
					a.setBud(a.getBud()-biddingPrice);
				this.bId=bidderId;
				this.bPrice=biddingPrice;
				sold=true;
				notifyDeal();
				}
			else{
				System.out.println("not proper");
			}
		 }
	 
	 /*
	 public void destination() throws Exception 
	{
		fout=new PrintWriter(new FileWriter("result.txt"));
		for(int i=0;i<trav.length;i++)
		{
			System.out.println("destination "+(i+1)+":"+trav[i]);
			fout.println(trav[i]);
		}
		
		fout.close();
		
		
	}
	 */
	 private void notifyBidding()  throws Exception
	 {
	 if(pi==1)
	 {
			 System.out.println("Bidding starts for player "+this.playername);
	  
	  pi=2;
	  }
	 	for(int i=0;i<Bidders.size();i++)
	 	{
	 		Bidders.get(i).UpdateBidding();
	 	}
	 	
	 	System.out.println("");
	 	
	 }
	 
	  private void notifyDeal() throws Exception
	  {
	  //fout=new PrintWriter(new FileWriter("output.txt",true));
	  System.out.println("Bid Winner");
	  //fout.close();
	  	for(int i=0;i<Bidders.size();i++)
	 	{
	 		Bidders.get(i).UpdateFinalDeal();
	 	}
	 // fout=new PrintWriter(new FileWriter("output.txt",true));
	 	System.out.println("");
	 	//fout.close();
	  }
	  
	  
	 
}
