import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
class Ex4{

	public int [] ex4_1(int [] a){
        int[] x = new int[a.length];
    for (int i = 0; i < x.length; i++) {
        x[i] = a[i];
            }
    Arrays.sort(x);
    return x;
    }

	public int [] ex4_2(int [] a){
        int[] z = new int[a.length];
     for (int i = 0 ; i < z.length -1; i++) {
         z[i] = a[i];
     }
     Collections.reverse(z);
		return z;

	}

	public String [] ex4_3(int [] a){
		
		String [] hantei = {"dummy"};
		
		return hantei;

	}

	public int ex4_4(int a){
		
		return -1;

	}

	public int ex4_5(int a){
		
		return -1;

	}

	public int [] ex4_6(int a){
		
		int [] ret = new int[1];
		
		return ret;

	}

	public boolean ex4_7(int a){
		
		return false;

	}

	public int ex4_8(int [] a){
		
		int ret = 0;
		
		return ret;

	}

	public int ex4_9(int [] a){
		
		int ret = 0;
		
		return ret;

	}
}

