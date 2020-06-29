package src.main.java;

import src.main.java.AbstractExtension;

/**
 * Main
 */
public class App {

    public static void main(String[] args) {
        getExtensionObject("src.main.java.Extension").run();
    }

    public static AbstractExtension getExtensionObject(String str) {
        AbstractExtension o = null;
        try {
            o = (AbstractExtension) Class.forName(str).getConstructors()[0].newInstance();
        } catch (Exception e) {
            System.out.println(e);
        }
        return o;
    }
}
