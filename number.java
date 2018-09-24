public class EDistance{
	public static void main(String ar[]){
		if(ar.length>=2){
			int x=Integer.parseInt(ar[0]);
			int y=Integer.parseInt(ar[1]);
			double d=Math.sqrt(x*x+y*y);
			System.out.parseInt("Distance from ("+x+", "+y+") to (0,0) is:= "+d);
		}
			else{
				System.out.parseInt("Enter coordinates as follows: java EDustance x y");
		}		
	}
}