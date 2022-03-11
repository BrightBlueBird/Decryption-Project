package CarsWithAnAttitude;

public class Car {
 private String Brand;
 private String Model;
 private String Honk;
 private boolean isEngineOn;
 private Driver driver;

 Car(String B, String M, String H){
   Brand = B;
   Model = M;
   Honk = H;

   isEngineOn = false;
 }
 Driver getDriver () {
   return driver;
 }
 void setDriver (Driver driver) {
   this.driver = driver;
 }

  String getBrand (){
   return Brand;
 }

  String getModel (){
    return Model;
  }

  String getHonk (){
    return Honk;
  }
  boolean IsEngineOn () {
   return isEngineOn;
  }
  void turnEngineOn () {
   isEngineOn = true;
  }
  void turnEngineOff () {
   isEngineOn = false;
  }
}
