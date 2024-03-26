package ex3;


public class Captain {

    private static Captain instance;
    private Captain() {}

    public static Captain getInstance() {
        if(instance == null) instance = new Captain();
        return instance;
    }
}
