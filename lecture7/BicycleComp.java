public class BicycleComp {
  private String size;
  private String parts;

  public BicycleComp(String size, String parts){
    this.size = size;
    this.parts = parts;
  }
  
  public void setParts(String newParts){
    parts = newParts;
  }

  public String getParts(){
    return this.parts;
  }

  public static void main(String[] args){
    BicycleComp myBike = new BicycleComp("large", "road bike");
    System.out.println(myBike.getParts());
  }// end of main
  public class part {
      ....
  }
  public class Parts {
      public Parts (Part one, Part two, Part three)

  }
}// end of class