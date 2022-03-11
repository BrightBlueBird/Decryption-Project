package CarsWithAnAttitude;

public class goCar {
  Car[] carType = new Car[4];
  Driver[] carDriver = new Driver[4];


  void go() {
    carType[0] = new Car("Toyota", "Tiger", "DytBåt!");
    carDriver[0] = new Driver ("Thomas");
    carType[0].setDriver(carDriver[0]);

    carType[1] = new Car("Audi", "Applause", "FLYT DIG!");
    carDriver[1] = new Driver ("William");
    carType[1].setDriver(carDriver[1]);

    carType[2] = new Car("Fiat", "Focus", "Hjælp Mig!");
    carDriver[2] = new Driver ("Alexander");
    carType[2].setDriver(carDriver[2]);

    carType[3] = new Car("Ferrari", "Fabulous", "Jeg prøver at gøre op for mit lave selvværd...");
    carDriver[3] = new Driver ("Bertil");
    carType[3].setDriver(carDriver[3]);

    drive();
    sound();
    park();
  }

  void sound() {
    int i;
    for (i = 0; i < 4; i++) {
      System.out.println(carType[i].getDriver().getName() + " Som er i bilen " + carType[i].getBrand() + " " + carType[i].getModel() + " Dyter! Det lyder som \"" +
          carType[i].getHonk() + "\"");
    }
  }

  void drive() {
    int i;
    for (i = 0; i < 4; i++) {
      System.out.println(carType[i].getDriver().getName() + " Som er i bilen " + carType[i].getBrand() + " " + carType[i].getModel() + " kører");
    }
  }

  void park() {
    int i;
    for (i = 0; i < 4; i++) {
      System.out.println(carType[i].getDriver().getName() + " Som er i bilen " + carType[i].getBrand() + " " + carType[i].getModel() + " er parkeret");
    }
  }
  public static void main(String[] args) {
    new goCar().go();
  }
}
