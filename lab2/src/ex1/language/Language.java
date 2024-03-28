package ex1.language;

import ex1.os.OS;

public abstract class Language {
    private OS os;
    public Language(OS os) {
        this.os = os;
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public abstract void execute(String code);
}
