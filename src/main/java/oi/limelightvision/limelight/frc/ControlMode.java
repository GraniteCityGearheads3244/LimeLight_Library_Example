package oi.limelightvision.limelight.frc;

import java.util.HashMap;
import java.util.Map;

/**
*
*/
public class ControlMode {

    public enum LedMode {
        kpipeLine(0),   //0	use the LED Mode set in the current pipeline
        kforceOff(1),   //1	force off
        kforceBlink(2), //2	force blink
        kforceOn(3);    //3	force on 

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

    public enum StreamType {
        kStandard(0),
        kPiPMain(1),
        kPiPSecondary(2);
    
        private static final Map<Double,  StreamType> MY_MAP = new HashMap<Double,  StreamType>();
        
        static {
            for ( StreamType  StreamType : values()) {
            MY_MAP.put( StreamType.getValue(),  StreamType);
            }
        }
        
        private double value;

        private  StreamType(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        public static  StreamType getByValue(double value) {
            return MY_MAP.get(value);
        }

        public String toString() {
            return name();
        }

    }

    public enum  Snapshot {

        kon(1), koff(0);
      
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
          return MY_MAP.get(value);
        }
      
        public String toString() {
          return name();
        }
      
      }
      
      public enum  Advanced_Target {

        kone(0), ktwo(1), kthree(2);
      
        private static final Map<Integer,  Advanced_Target> MY_MAP = new HashMap<Integer,  Advanced_Target>();
        
        static {
          for ( Advanced_Target  Advanced_Target : values()) {
            MY_MAP.put( Advanced_Target.getValue(),  Advanced_Target);
          }
        }
        
        private Integer value;
      
        private  Advanced_Target(Integer value) {
          this.value = value;
        }
      
        public Integer getValue() {
          return value;
        }
      
        public static  Advanced_Target getByValue(Integer value) {
          return MY_MAP.get(value);
        }
      
        public String toString() {
          return name();
        }
      
      }
    
      public enum  Advanced_Crosshair {

        kone(0), ktwo(1);
      
        private static final Map<Integer,  Advanced_Crosshair> MY_MAP = new HashMap<Integer,  Advanced_Crosshair>();
        
        static {
          for ( Advanced_Crosshair  Advanced_Crosshair : values()) {
            MY_MAP.put( Advanced_Crosshair.getValue(),  Advanced_Crosshair);
          }
        }
        
        private Integer value;
      
        private  Advanced_Crosshair(Integer value) {
          this.value = value;
        }
      
        public Integer getValue() {
          return value;
        }
      
        public static  Advanced_Crosshair getByValue(Integer value) {
          return MY_MAP.get(value);
        }
      
        public String toString() {
          return name();
        }
      
      }
}
