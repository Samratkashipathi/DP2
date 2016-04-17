//101 : [102, 2000]
//101 : [4990, 105]
import java.io.*;
import java.util.*;
class Bidder extends Observer
{
//protected Player player;
private int BId;
private int Budget;
PrintWriter fout=null;

	public Bidder(int id,int budget)
	{
			BId=id;
			Budget=budget;
	}
  @Override
    public void UpdateBidding() throws Exception 
	{

	int a[]=player.getBidderAndPrice();
  System.out.println(this.BId+" : "+"["+a[0]+", "+a[1]+"]");
	}
	 @Override
	public void UpdateFinalDeal()  throws Exception
	{
	
	int a[]=player.getBidderAndPrice();
  System.out.println(this.BId+" : "+"["+this.Budget+", "+a[0]+"]");
	
	}
	
	public void linkplayer(Player p)
	{
	this.player = p;
	}
	
	public int getId()
	{
		return this.BId;
	}
	public int getBud()
	{
		return this.Budget;
	}
	public void setBud(int bud)
	{
		this.Budget=bud;
	}
	
		
}
