import java.util.Locale;
import java.util.ResourceBundle;

public class Greeter {

  private Locale locale;
  private String name;

  public Greeter(String language, String country, String name) {
    locale = new Locale(language, country);
    this.name = name;
  }

  public String sayHello() {
    ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
    return messages.getString("greeting") + ", " + "_"+name.toUpperCase()+"_";
  }

  public static void main(String[] args) {
    if (args.length != 3){
      System.out.println("Error: Not enough values were given. You need at least 3");
      System.exit(0);
    }
    String language = args[0];
    String country = args[1];
    String name = args[2];
    Greeter greeter = new Greeter(language, country, name);
    System.out.println(greeter.sayHello());
  }

  //I don't know what more to add for the "More changes section", or if I should even do so.
}
