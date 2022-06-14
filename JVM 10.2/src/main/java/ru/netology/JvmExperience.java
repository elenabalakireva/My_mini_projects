package ru.netology;

import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class JvmExperience {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Please open 'ru.netology.JvmExperience' in VisualVm");
        Thread.sleep(30_000);

        loadToMetaspaceAllFrom("io.vertx");
        Thread.sleep(3_000);
        loadToMetaspaceAllFrom("io.netty");
        Thread.sleep(3_000);
        loadToMetaspaceAllFrom("org.springframework");
        Thread.sleep(3_000);

        System.out.println(LocalTime.now() + ": now see heap");
        List<SimpleObject> simpleObjects = createSimpleObjects(5_000_000);
        Thread.sleep(3_000);
        simpleObjects.addAll(createSimpleObjects(5_000_000));
        Thread.sleep(3_000);
        simpleObjects.addAll(createSimpleObjects(5_000_000));
        Thread.sleep(3_000);
    }

    static void loadToMetaspaceAllFrom(String packageName) {
        System.out.println(LocalTime.now() + ": loading " + packageName);

        Reflections reflections = new Reflections(packageName, new SubTypesScanner(false));
        Set<Class<?>> allClasses = reflections.getSubTypesOf(Object.class);

        System.out.println(LocalTime.now() + ": loaded " + allClasses.size() + " classes");
    }

    private static List<SimpleObject> createSimpleObjects(int count) {
        System.out.println(LocalTime.now() + ": creating " + count + " objects");

        List<SimpleObject> result = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            result.add(new SimpleObject(i));
        }

        System.out.println(LocalTime.now() + ": created");
        return result;
    }

    static class SimpleObject {
        final Integer value;
        SimpleObject(int value) {
            this.value = value;
        }
    }
}
