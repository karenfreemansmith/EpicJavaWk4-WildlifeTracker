import org.sql2o.*;
import java.util.List;

public class Ranger extends Person {
  public Ranger() {}

  public static Person find(int id) {
    Person person = new Ranger();
    return person;
  }
}
