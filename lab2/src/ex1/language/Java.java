package ex1.language;

import ex1.os.OS;

public class Java extends Language {
    public Java(OS os) {
        super(os);
    }

    @Override
    public void execute(String code) {
        System.out.printf("Executed code using java! on os %s, code: %s%n", getOs().getClass().getSimpleName(), code);
    }
}
