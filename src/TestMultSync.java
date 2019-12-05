public class TestMultSync {
    public static void main(String[] args){
        Output output = new Output();
        Library lib = new Library(output);
        Classroom clr = new Classroom(output);
        lib.start();
        clr.start();
    }
}
