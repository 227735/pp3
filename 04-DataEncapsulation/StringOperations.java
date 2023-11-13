public class StringOperations {
    static String text = "Have a nice day!";

    static public int numberOfCharakters(){
        return text.length();
    }
        
    static public String first9(){
        return text.substring(0,9);
    }

    static public String end(){
        return (text.endsWith("day!")) ? "true" : "false";
    }

    static public boolean Empty(){
        return (!text.isEmpty());
    }

    static public int Last(){
        return (text.lastIndexOf("e"));
    }

    static public String Space(){
        return (text.replace(" ", "-"));
    }

    static public String UpperCase(){
        return (text.toUpperCase());
    }
}
