public class Ex1 {
    public int bruto(int nh, int vh){
        if(vh>120){
           return -1;
        }
        if(nh>80){
            return -1;
        }
        return nh*vh;
    }
}
