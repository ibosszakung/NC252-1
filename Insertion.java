package th.ac.utcc.cpe.phanupong;
/**
 * @author5907401004 นายอดิศักด์ สัมมารุ่งโรจน์
 */

public class Insertion {
	private int [] el ;
	private int esize ;

	

	public Insertion (int size){ 
		if(size< 0 ) 
			this.el = new int[size] ;
		else 
			this.el = new int[20];
		
		esize = 0 ;
		
	}
	public  void insert(int e){
		this.el[esize] = e ;
		esize++;
		
	}
	public void show(){
		for(int i = 0 ; i < esize ; i++){ //5907401004 นายอดิศักด์ สัมมารุ่งโรจน์
			System.out.print(this.el[i]+ " ");
			
		}
		System.out.print(" ");
	}
	public void insertionSorts(){
		
		int out,in,temp;
		for(out = 1 ;out < esize ;out++){
			temp =  this.el[out];
			for(in = out;in > 0 && this.el[in-1] >= temp; in--){
				this.el[in]= this.el[in-1];
			}
			this.el[in]=temp ;
		}
	}
	
		
		public static void main(String[]args){
			int max = 20 ;
			Insertion insertion = new Insertion(max) ;
			insertion.insert(3);
			insertion.insert(38);
			insertion.insert(44);
			insertion.insert(5);
			insertion.insert(47);
			insertion.insert(15);
			insertion.insert(36);
			insertion.insert(26);
			insertion.insert(27);
			insertion.insert(2);
			insertion.insert(46);
			insertion.insert(4);
			insertion.insert(19);
			insertion.insert(50);
			insertion.insert(48);
			
			System.out.println("Original Order ::");
			insertion.show();
			insertion.insertionSorts();
			System.out.println("\nSorced order ::");
			insertion.show();
			
		}
}