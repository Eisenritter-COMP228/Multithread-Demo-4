public class Classroom extends Thread{
    Output output;
    public  Classroom(Output output){
        this.output =output;
    }
    public void run(){
        output.print("Printing from the classroom.");
    }
}
