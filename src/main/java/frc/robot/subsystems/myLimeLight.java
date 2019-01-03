package frc.robot.subsystems;

import oi.limelightvision.limelight.frc.LimeLight;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class myLimeLight extends Subsystem {

    private LimeLight _limelight;

    public myLimeLight() {
        _limelight = new LimeLight();
        //_limelight = new LimeLight("limelight");
    }

    @Override
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public LimeLight getLimeLight(){
        return _limelight;
    }
   
}

