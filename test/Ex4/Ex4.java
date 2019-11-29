import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
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

 List<Integer> list = new ArrayList<Integer>();
        for (int tmp : a) {
            list.add((Integer)tmp);
        }

        Collections.sort(list, Comparator.reverseOrder());

        for (int i = 0; i < a.length; i++) {
            a[i] = list.get(i);
        }
        return a;
	}

	public String [] ex4_3(int [] a){

        String [] ret = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                ret[i] = "正";
            } else if (a[i] < 0) {
                ret[i] = "負";
            } else {
                ret[i] = "零";
            }
        }
         return ret;
	}

	public int ex4_4(int a){

       int val = a;
       int valLen = String.valueOf(val).length();

       return valLen;

	}

	public int ex4_5(int a){

        int sum = 0;
        for (int i = 1; i <= a; i++){
            sum += i;
        }
        return sum;
    }


	public int [] ex4_6(int a){

        List<Integer> b = new ArrayList<Integer>();

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                b.add(i);
            }
        }

		int [] ret = new int[b.size()];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = b.get(i);
        }
		return ret;
	}

	public boolean ex4_7(int a){


        if (a == 1) {
            return false;
        }

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
	}

	public int ex4_8(int [] a){

		int sum = 0;

        for (int i : a){
            sum += i;
        }
		return sum;

    }

	public int ex4_9(int [] a){

        float sum = 0;

        for (int i : a) {
            sum += i;
        }

        int ret = Math.round(sum/a.length);

        return ret;
	}
}

