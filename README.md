# LimeLight_Library_Example

# Java Instructions

## Manual Install
* Copy the `oi.limelightvision.limelight.frc` package into your `src/main/java` folder.

## Usage
Make a new instance of the driver, and use it however you like. For example:
```java
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import oi.limelightvision.limelight.frc.LimeLight;
import oi.limelightvision.limelight.frc.ControlMode.*;

public class Robot extends IterativeRobot {

  public static final LimeLight _limelight = new LimeLight();
  //public static final LimeLight _limelight = new LimeLight("NetworkTable Key");  //If you renamed your limelight ex: limelight-custome
  
  @Override
  public void robotPeriodic() {
    //Getters
    SmartDashboard.putBoolean("Target Found", _limelight.getIsTargetFound());
    SmartDashboard.putNumber("Deg Rotation to Target", _limelight.getdegRotationToTarget());
    //.....and MORE

    //Setters
    _limelight.setPipeline(1);
    _limelight.setLEDMode(LedMode.koff);
    _limelight.setCamMode(CamMode.kdriver);
    _limelight.setSnapshot(Snapshot.kon);
    _limelight.setStream(StreamType.kPiPMain);
  }

}

```
