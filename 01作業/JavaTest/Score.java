public class Score {	
		public int no;
		public int chi;
		public int math;
		public int eng;
		public float avg;
		public int total;
		public Score(int a, int b, int c,int d) {
			this.no = a;
			this.chi = b;
			this.math = c;
			this.eng = d;
			this.total = b + c + d;
			this.avg = total / 3;
		}
		public Score() {
			this.no = 0;
			this.chi = 0;
			this.math = 0;
			this.eng = 0;
			this.total = 0;
			this.avg = 0;
		}
		public void Sort(Score[] arr){
			int swap_counter=0;
			do{ for(int i=0;i<=arr.length;i++){
				swap_counter=0;//reset swap_counter
			         if(arr[i+1].total>arr[i].total){ 
				        swap(arr[i+1],arr[i]);
				         swap_counter++;
				     }
		     	}
    	    }while(swap_counter==0);	
    };
		public void swap(Score a, Score b) {
			Score tmp = new Score();
			tmp = a;
			a = b;
			b = tmp;
		};

		public void Display() {
			System.out.println("座號" + no + "同學 :" + " 國文:" + chi + " 數學:"
					+ math + "英文:" + eng + " 總分:" + total + " 平均:" + avg);
		};
	public static void main(String[] args) {
		Score[] student = new Score[]{new Score(1,50,50,50),new Score(2,70,70,70),new Score(3,60,60,60)};	
		student[0].Display();
		student[1].Display();
		student[2].Display();
		student[0].Sort(student);
		student[0].Display();
		student[1].Display();
		student[2].Display();
	}	
}
