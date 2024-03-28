package ex1.language;

import ex1.os.OS;

public class Python extends Language {
    public Python(OS os) {
        super(os);
    }

    @Override
    public void execute(String code) {
        System.out.printf("Executed code using python! on os %s, code: %s%n", getOs().getClass().getSimpleName(), code);
    }
}
