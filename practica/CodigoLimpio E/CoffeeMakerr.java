
public class Coffeemakerr {
    private boolean validateCofffeType(String coffeType) {
        return ! coffeeType.equals("");
    }
    private boolean validateTemp(float temp) {
        return temp>0 && temp<100;
    }
    private boolean validateWaterAmount(Float waterAmount) {
        return waterAmount > 10;
    }

    public boolean makeCoffe(String coffetype, float temp, float waterAmount) throws Exception {
       
        if(validateCofffeType(coffetype)) throw new Exception("tipo de cafe incorrecto");        
        
        if(temp<=0 || temp>=100)  throw new Exception("tipo de cafe incorrecto");
            
        if(waterAmount<=10)   throw new Exception("tipo de cafe incorrecto");
            

            //hacer cafe
            return true;

        }

       
    }





