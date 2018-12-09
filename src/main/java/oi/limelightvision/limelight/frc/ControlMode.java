package oi.limelightvision.limelight.frc;

import java.util.HashMap;
import java.util.Map;

/**
*
*/
public class ControlMode {

    public enum LedMode {
        kon(0),
        koff(1), 
        blink(2);

        private static final Map<Double, LedMode> MY_MAP = new HashMap<Double, LedMode>();
        
        static {
            for (LedMode LedMode : values()) {
            MY_MAP.put(LedMode.getValue(), LedMode);
            }
        }
        
        private double value;

        private LedMode(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        public static LedMode getByValue(double value) {
            return MY_MAP.get(value);
        }

        public String toString() {
            return name();
        }

}

    
    public enum CamMode {
        kvision(0),
        kdriver(1);
    
        private static final Map<Double, CamMode> MY_MAP = new HashMap<Double, CamMode>();
  
        static {
            for (CamMode CamMode : values()) {
            MY_MAP.put(CamMode.getValue(), CamMode);
            }
        }
        
        private double value;

        private CamMode(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        public static CamMode getByValue(double value) {
            return MY_MAP.get(value);
        }

        public String toString() {
            return name();
        }
    }

    public enum Stream {
        kStandard(0),
        kPiPMain(1),
        kPiPSecondary(2);
    
        private static final Map<Double,  Stream> MY_MAP = new HashMap<Double,  Stream>();
        
        static {
            for ( Stream  Stream : values()) {
            MY_MAP.put( Stream.getValue(),  Stream);
            }
        }
        
        private double value;

        private  Stream(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        public static  Stream getByValue(double value) {
            return MY_MAP.get(value);
        }

        public String toString() {
            return name();
        }

    }

    enum  Snapshot {

        kon(0), koff(1);
      
        private static final Map<Double,  Snapshot> MY_MAP = new HashMap<Double,  Snapshot>();
        
        static {
          for ( Snapshot  Snapshot : values()) {
            MY_MAP.put( Snapshot.getValue(),  Snapshot);
          }
        }
        
        private double value;
      
        private  Snapshot(double value) {
          this.value = value;
        }
      
        public double getValue() {
          return value;
        }
      
        public static  Snapshot getByValue(double value) {
          System.out.println(MY_MAP.get(value));
          return MY_MAP.get(value);
        }
      
        public String toString() {
          return name();
        }
      
      }

    /* public enum Stream {
        kStandard(0),
        kPiPMain(1),
        kPiPSecondary(2);
    
        @SuppressWarnings("MemberName")
        public final int value;
    
        Stream(int value) {
            this.value = value;
        }
    } */
    
}
