package week2;

public class TwoThread extends Thread {

public static void main(String[] args) {
   
    TwoThread t1 = new TwoThread();
    TwoThread t2 = new TwoThread();
    
    try{
        for (int x = 1; x < 11; x++) {
            System.out.print(x + " "); 
            sleep(1000);
       
             if (x==5){
                for(int i=0; i<10; i++)
                System.out.print("A");
                System.out.print(" ");
                
             }
        }
    }
    
    catch(Exception e){
    e.printStackTrace();
    }
    
}
}