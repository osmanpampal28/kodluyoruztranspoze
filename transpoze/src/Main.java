public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] matris={
            {2,3,4},
            {5,6,4}
        };
        int satir=2,sutun=3;
        System.out.println("Matris : ");
        for(int[] row:matris){
            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        int[][] transpoze=new int[sutun][satir];

        for(int i=0;i<satir;i++){
            for(int j=0;j<sutun;j++){
                transpoze[j][i]=matris[i][j];
            }
        }
        System.out.println("Transpoze");
        for(int[] row:transpoze){
            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
