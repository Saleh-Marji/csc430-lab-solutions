package ex1.os;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public abstract class OS {
    protected OS() {
    }

    private static final Map<Class<? extends OS>, OS> objects = new HashMap<>();

    public static OS get(Class<? extends OS> clazz) {
        if (!objects.containsKey(clazz)) {
            OS os = null;
            try {
                os = clazz.getConstructor().newInstance();
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            objects.put(clazz, os);
            os.configure();
        }
        return objects.get(clazz);
    }

    protected abstract void configure();
}
