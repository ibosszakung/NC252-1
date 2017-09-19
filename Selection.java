package th.ac.utcc.cpe.phanupong;
/**
 * @author5907401004 นายอดิศักด์ สัมมารุ่งโรจน์
 */

public class Selection {
	
	
		private int [] el ;
		private int esize ;


		public Selection(int size){ 
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
			for(int i = 0 ; i < esize ; i++){
				System.out.print(this.el[i]+ " ");
				
			}
			System.out.print(" ");
		}
		public void SelectionSorts(){
			
			int out,in , min ;
			for(out = 0 ;out < esize-1;out++){
				min = out ;
				for(in = out +1;in < esize; in++){
					if(this.el[in]<this.el[min]){
						min = in ;
					}
					this.swap(out,min);
				}
			}
		}
			private void  swap(int le , int ri){
				int temp = this.el[le];
				this.el[le] = this.el[ri];
				this.el[ri] = temp ;
			}
			
			public static void main(String[]args){
				int max = 50 ;
				Selection selection = new Selection(max) ;
				selection.insert(3);
				selection.insert(38);
				selection.insert(44);
				selection.insert(5);
				selection.insert(47);
				selection.insert(15);
				selection.insert(36);
				selection.insert(26);
				selection.insert(27);
				selection.insert(2);
				selection.insert(46);
				selection.insert(4);
				selection.insert(19);
				selection.insert(50);
				selection.insert(48);
				
				System.out.println("Original Order ::");
				selection.show();
				selection.SelectionSorts();
				System.out.println("\nSorced order ::");
				selection.show();
				
			}
	}


