//Given a picture representated by N*N matrix, where each pixel is represented by 4 bytes, write a method to rotate the image by 90 degrees. Can you do that in place?


public class question4{
	public void matrixChange(int [4][4] matrix){
		for(int i = 0; i <= 4 ; i++){
			for (int j = 0; j <=4 ; j++){
				swap(matrix[i][j],matrix[j][i];
			}
		}
	}
	
	}

	public void swap(int a, int b){
		int t=0;
		t = a;
		a = b;
		b = t;
	}


