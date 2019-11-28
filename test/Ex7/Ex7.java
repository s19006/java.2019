class Ex7{

    public int ex7_1(int a, int b){
        if (a >= b)
        {
            return b;
        }
        else {
            return a;
        }
    }

    public int ex7_1(int a, int b, int c){
        if (a <= b && a <= c)
        {
            return a;
        }
        else if (b <= a && b <=c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }

    public int ex7_1(int [] a){
        int [] b = new int[a.length];
    for (int i = 0; i < a.length; i++){
        b[i] = a[i];
    }
    int min = b[0];
    for (int i = 1; i < b.length; i++){
        int v = b[i];
        if (v < min){
            min = v;
        }
    }
    return min;
    }

    public int ex7_2(int x){
        return x;
    }
    public long ex7_2(long x){

        return x;
    }

    public float ex7_2(float x){

        return x;
    }

    public double ex7_2(double x){

        return x;
    }

    public String ex7_3(byte x){

        String ret = "";

        return ret;
    }

    public String ex7_3(short x){

        String ret = "";

        return ret;
    }

    public String ex7_3(int x){

        String ret = "";

        return ret;
    }

    public String ex7_3(long x){

        String ret = "";

        return ret;
    }
}