package feb24th;

public class ArraysDemo4 {
	
	 public static void main(String[] args) {
		
		 
		 String[][] data=new String[4][3];
		 
		 for(int i=0;i<4;i++)
		 {
			 
			 for(int j=0;j<3;j++)
			 {
				 System.out.print(data[i][j]+"\t");
			 }
			 
			 System.out.println();
		 }
		 
		 data[0][0]="reyaz0806";
		 data[0][1]="reyaz123";
		 data[0][2]="Adactin.com - Search Hotel";
		 
		 data[1][0]="reyaz0806";
		 data[1][1]="reyaz456";
		 data[1][2]="Adactin.com - Hotel Reservation Systeml";
		 
		 data[2][0]="reyaz1212";
		 data[2][1]="reyaz123";
		 data[2][2]="Adactin.com - Hotel Reservation System";
		 
		 data[3][0]="reyaz1212";
		 data[3][1]="reyaz456";
		 data[3][2]="Adactin.com - Hotel Reservation System";
		 
		 for(int i=0;i<4;i++)
		 {
			 
			 for(int j=0;j<3;j++)
			 {
				 System.out.print(data[i][j]+"   ");
			 }
			 
			 System.out.println();
		 }
		 
		 
	}

}
