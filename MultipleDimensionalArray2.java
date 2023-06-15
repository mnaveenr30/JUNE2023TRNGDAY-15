class MultipleDimensionalArray2{
    public static void main(String args[]){
        int[][][] test={
            {{1,-2,3},{2,3,4}},{{-4,-5,6,9},{7},{2,3}}
        };
        for(int[][]array2D:test){
            for(int[] array1D:array2D){
                for(int a:array1D){
                    System.out.println(a);
                }
            }
        }
    }
     
}