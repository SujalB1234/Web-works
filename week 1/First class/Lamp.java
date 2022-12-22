class Lamp {
    // stores the value for light
    //true if light is on
    //false if light is off
    boolean ison;
    
    //method to turn on the light
    void turnon() {
        ison=true;
        System.out.println("light on?"  + ison);
    }
    //method to turnoff the light
    void turnoff() {
        ison = false;
            System.out.println("light on?"+ison);
        }
    }
    class main{
        public static void main(String[] args) {
            
            //create objects led and halogen
            Lamp led = new Lamp();
            Lamp halogen = new Lamp();
            
            //turn on the light by
            //calling method turnon()
            led.turnon();
            
            //turn off the light by
            //calling method turnoff()
            halogen.turnoff();
            
            
        }
    }
            
        
        
    
