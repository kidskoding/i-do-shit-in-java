package kidkoder;
//polymorphism demo
class Presidents {
  public void president() {
    System.out.println("Presidents of the United States");
  }
}

class Washington extends Presidents {
  public void president() {
    System.out.println("George Washington was the 1st president of the United States");
  }
}

class Biden extends Presidents {
  public void president() {
    System.out.println("Joe Biden is the 46th president of the United States");
  }
}

public class polymorphismDemo {
  public static void main(String[] args) {
    Presidents myPresident = new Presidents();
    Presidents myFirstPresident = new Washington();
    Presidents myFourtySixPresident = new Biden();
        
    myPresident.president();
    myFirstPresident.president();
    myFourtySixPresident.president();
  }
}
