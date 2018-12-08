package oi.limelightvision.limelight.frc;


/**
*
*/
public class ControlMode {

    public enum LedMode {
        kon(0), koff(1), kblink(2);
    
        @SuppressWarnings("MemberName")
        public final int value;
    
        LedMode(int value) {
         this.value = value;
        }
    }

    public enum CamMode {
        kvision(0), kdriver(1);
    
        @SuppressWarnings("MemberName")
        public final int value;
    
        CamMode(int value) {
         this.value = value;
        }
    }

    public enum Stream {
        kStandard(0),
        kPiPMain(1),
        kPiPSecondary(2);
    
        @SuppressWarnings("MemberName")
        public final int value;
    
        Stream(int value) {
            this.value = value;
        }
    }
    
}
