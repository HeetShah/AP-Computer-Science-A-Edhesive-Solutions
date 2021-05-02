import java.util.ArrayList;

public class Game
{
  public static void play(GameWheel g)
  {
    // Implement the play method here
    String s = "";
    int sum = 0;
    boolean n = true;
    ArrayList<String> colors = new ArrayList<String>();
    
    for (int i = 0; i < 3; i++) {
      int x = (int)(Math.random() * 20);
      int amount = g.getSlice(x).getPrizeAmount();
      colors.add(g.getSlice(x).getColor());
      s += "Spin " + (i + 1) + " - " + g.getSlice(x) + "\n";
      sum += amount;
    }
    
    for (int i = 0; i < colors.size() - 1; i++) {
      if (colors.get(i).equals(colors.get(i + 1))) {
        continue;
      } else {
        n = false;
      }
    }
    if (n) {
      sum *= 2;
      System.out.println("Total prize money: $" + sum + "\n");
      System.out.println(s);
      System.out.println("Three " + colors.get(0) + "s = double your money!");
    } else {
      System.out.println("Total prize money: $" + sum + "\n");
      System.out.println(s);
    }
  }
}
