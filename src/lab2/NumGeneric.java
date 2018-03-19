package lab2;

/**
 * Created by Admin on 11/1/2017 at 10:13 AM
 **/
public class NumGeneric extends Thread {
    public void run(){
        for(int i=0; i<50; i++){
            System.out.println(i);
            try{
                sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
                break;
            }
        }
    }
}
