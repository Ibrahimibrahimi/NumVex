
/* 
    example : NdArray<String> example = new NdArray<String>(6); // this create a 6 dimensions array
*/


public class NdArray<T> {
    public int ARRAY_DIM;
    public int N_ELEMENT;
    

    public NdArray(int dimension) {
        this.ARRAY_DIM = dimension;
    }
    public NdArray(int dimension , int nElement){
        this.ARRAY_DIM = dimension;
        this.N_ELEMENT = nElement;
    }
}

