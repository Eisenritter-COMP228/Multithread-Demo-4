public class Output {
    public synchronized void print(String s){
        System.out.println(s);
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
