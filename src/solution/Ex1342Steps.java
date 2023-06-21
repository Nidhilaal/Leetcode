package solution;

public class Ex1342Steps {
	public int numberOfSteps(int num) {
        int count=0;
        while(num!=0){
            if(num%2==0){
                num=num/2;
                count++;
            }
            else{
                num=num-1;
                count++;
            }
        }
        return count;  
    }
}
