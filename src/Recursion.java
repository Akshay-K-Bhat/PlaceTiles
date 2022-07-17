public class Recursion {

    public static int placeTiles(int n,int m){

        if(n==m){
            return 2;
        }
        if (n<m){
            return 1;
        }
        //horizontally
        int horizontalPlacmnts = placeTiles(n-1,m);

        //vertically
        int verticalPlacmnt = placeTiles(n-m,m);

        return  verticalPlacmnt+horizontalPlacmnts;

    }
    public static void main(String[] args) {

        int n=4,m=2;

        int totalPlacement = placeTiles(n,m);
        System.out.println(totalPlacement);
    }
}
