public class CalcSederhana {
    // 103122400020_Abu Abdirrahman Humaid Al-Atsary
    static void calc(int a, int b){
        System.out.println("Hasil penjumlahan : " +(a+b));
        System.out.println("Hasil pengurangan : " +(a - b));
        System.out.println("Hasil perkalian : " +(a*b));
        System.out.println("Hasil pembagian : " +(a/b));
        System.out.println("Hasil sisa : " +(a%b));
    }
    public static void main(String[] args){
        int a = 20, b = 7;
        calc(a, b);
    }
}