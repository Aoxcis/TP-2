public class App {
    public static void main(String[] args) {
        //fizzbuzz(10);
        //System.out.println(fizzbuzz2(10));
        //multiplication1();
        //multiplication2();
        //multiplication3();
        //multipara1(1, 1, 10, 10);
        //multipara2(1, 1, 5, 5);
        //intToHexrecursive(500);
        //System.out.println(intToHexrecursive2(500));
        //piViete(100);
        //Hanoi(5, 'A', 'B', 'C');
        //System.out.println(operateurFleche(3, 3, 3));
    }
    public static void fizzbuzz(int n){
        for(int i = 1; i <= n; i++){
            if(i % 5 == 0 && i % 7 == 0){
                System.out.print("[Fizz-Buzz]");
            }
            if(i % 5 ==0){
                System.out.print("[Fizz]");
            }
            if(i % 7 ==0){
                System.out.print("[Buzz]");
            }
            else{
                System.out.print(i);
            }
            System.out.print("-");
        }
    }
    public static String fizzbuzz2(int n){
        String str = new String();
        for(int i = 1; i <= n; i++){
            if(i % 5 == 0 && i % 7 == 0){
                str = str + "[Fizz-Buzz]";
            }
            if(i % 5 ==0){
                str = str + "[Fizz]";
            }
            if(i % 7 ==0){
                str = str + "[Buzz]";
            }
            else{
                str = str + i;
            }
            str = str + "-";
        }
        return str;
    }
    public static void multiplication1(){
        for(int i = 1; i <= 10; i++){
            System.out.println("Table de multiplication du "+ i + " :");
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }
    public static void multiplication2(){
        int i = 1;
        while(i <= 10){
            int j = 1;
            System.out.println("Table de multiplication du "+ i + " :");
            while(j <= 10){
                System.out.println(i + " * " + j + " = " + i*j);
                j++;
            }
            i++;
        }
    }
    public static void multiplication3(){
        System.out.println("\t1\t2\t3\t4\t5");
        for(int i = 1; i <= 5; i++){
            System.out.println(i +"\t" + i + "\t" + i*2 + "\t" + i*3 + "\t" + i*4 + "\t" + i*5);
        }
    }
    public static void multipara1(int n1, int n2, int m1, int m2){
        for(int i = n1; i <= m1; i++){
            System.out.println("Table de multiplication du "+ i + " :");
            for(int j = n2; j <= m2; j++){
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }
    public static void multipara2(int n1, int n2, int m1, int m2){
        for(int x = n1; x <= m1; x++){
            System.out.print("\t" + x);
        }
        for(int i = n1; i <= m1; i++){
            System.out.println();
            System.out.print(i);
            for(int j = n2; j <= m2; j++){
                System.out.print("\t" + i*j);
            }
        }
    }
    public static void intToHexrecursive(int n){
        if(n == 0){
            return;
        }
        intToHexrecursive(n/16);
        if (n % 16 < 10){
            System.out.print(n % 16);
        }
        if(n % 16 == 10){
            System.out.print("A");
        }
        if(n % 16 == 11){
            System.out.print("B");
        }
        if(n % 16 == 12){
            System.out.print("C");
        }
        if(n % 16 == 13){
            System.out.print("D");
        }
        if(n % 16 == 14){
            System.out.print("E");
        }
        if(n % 16 == 15){
            System.out.print("F");
        }
    }
    public static String intToHexrecursive2(int n){
        if(n == 0){
            return "";
        }
        String str = new String();
        str = str + intToHexrecursive2(n/16);
        if (n % 16 < 10){
            str = str + n % 16;
        }
        if(n % 16 == 10){
            str = str + "A";
        }
        if(n % 16 == 11){
            str = str + "B";
        }
        if(n % 16 == 12){
            str = str + "C";
        }
        if(n % 16 == 13){
            str = str + "D";
        }
        if(n % 16 == 14){
            str = str + "E";
        }
        if(n % 16 == 15){
            str = str + "F";
        }
        return str;
    }
    public static void piViete(int n){
        double[] U = new double[n+1];
        double[] V = new double[n+1];
        U[0] = 1;
        U[1] = 1/Math.sqrt(2);
        V[0] = U[0];
        for(int i = 2; i<=n; i++){
            U[i] = Math.sqrt((1+U[i-1])/2); 
        }
        for(int i = 1; i<=n; i++){
            V[i] = V[i-1]*U[i];
        }
        System.out.println(2/V[n]);
    }
    public static void Hanoi(int n, char depart, char inter, char arrivee){
        if(n == 1){
            System.out.println("Déplacer le disque "+n+" de "+depart+" vers "+arrivee);
        }
        else{
            Hanoi(n-1,depart,arrivee,inter);
            System.out.println("Déplacer le disque "+n+" de "+depart+" vers "+arrivee);
            Hanoi(n-1,inter,depart,arrivee);
        }
    }

    public static double operateurFleche(double m, int k, double n){
        if(k == 1){
            return Math.pow(m,n);
        }
        else{
            if(n == 1){
                return m;
            }
            else{
                double res = m;
                for(int i = 1; i < n; i++){
                    res = Math.pow(m,res);
                }
                return res;
            }
        }
    }
}

