package frc.robot.commands;
import edu.wpi.first.wpilibj.command.InstantCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;

/**
 *
 */
public class MyGetLimeLightData extends InstantCommand {

    public MyGetLimeLightData() {
        requires(Robot.mylimelight);
        setRunWhenDisabled(true);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {

        //Test all the getters
        boolean getIsTargetFound = Robot.mylimelight.getLimeLight().getIsTargetFound();
        SmartDashboard.putBoolean("getIsTargetFound",getIsTargetFound);
        double getdegRotationToTarget = Robot.mylimelight.getLimeLight().getdegRotationToTarget();
        SmartDashboard.putNumber("getdegRotationToTarget",getdegRotationToTarget);
        double getdegVerticalToTarget = Robot.mylimelight.getLimeLight().getdegVerticalToTarget();
        SmartDashboard.putNumber("getdegVerticalToTarget",getdegVerticalToTarget);
        double getTargetArea = Robot.mylimelight.getLimeLight().getTargetArea();
        SmartDashboard.putNumber("getTargetArea",getTargetArea);
        double getSkew_Rotation = Robot.mylimelight.getLimeLight().getSkew_Rotation();
        SmartDashboard.putNumber("getSkew_Rotation",getSkew_Rotation);
        double getPipelineLatency = Robot.mylimelight.getLimeLight().getPipelineLatency();
        SmartDashboard.putNumber("getPipelineLatency",getPipelineLatency);
        double Advanced_RotationToTarget0 = Robot.mylimelight.getLimeLight().Advanced_RotationToTarget(0);
        SmartDashboard.putNumber("Advanced_RotationToTarget0",Advanced_RotationToTarget0);
        double Advanced_RotationToTarget1 = Robot.mylimelight.getLimeLight().Advanced_RotationToTarget(1);
        SmartDashboard.putNumber("Advanced_RotationToTarget1",Advanced_RotationToTarget1);
        double Advanced_RotationToTarget2 = Robot.mylimelight.getLimeLight().Advanced_RotationToTarget(2);
        SmartDashboard.putNumber("Advanced_RotationToTarget2",Advanced_RotationToTarget2);
        double Advanced_degVerticalToTarget0 = Robot.mylimelight.getLimeLight().Advanced_degVerticalToTarget(0);
        SmartDashboard.putNumber("Advanced_degVerticalToTarget0",Advanced_degVerticalToTarget0);
        double Advanced_degVerticalToTarget1 = Robot.mylimelight.getLimeLight().Advanced_degVerticalToTarget(1);
        SmartDashboard.putNumber("Advanced_degVerticalToTarget1",Advanced_degVerticalToTarget1);
        double Advanced_degVerticalToTarget2 = Robot.mylimelight.getLimeLight().Advanced_degVerticalToTarget(2);
        SmartDashboard.putNumber("Advanced_degVerticalToTarget2",Advanced_degVerticalToTarget2);
        double Advanced_TargetArea0 = Robot.mylimelight.getLimeLight().Advanced_TargetArea(0);
        SmartDashboard.putNumber("Advanced_TargetArea0",Advanced_TargetArea0);
        double Advanced_TargetArea1 = Robot.mylimelight.getLimeLight().Advanced_TargetArea(1);
        SmartDashboard.putNumber("Advanced_TargetArea1",Advanced_TargetArea1);
        double Advanced_TargetArea2 = Robot.mylimelight.getLimeLight().Advanced_TargetArea(2);
        SmartDashboard.putNumber("Advanced_TargetArea2",Advanced_TargetArea2);
        double Advanced_Skew_Rotation0 = Robot.mylimelight.getLimeLight().Advanced_Skew_Rotation(0);
        SmartDashboard.putNumber("Advanced_Skew_Rotation0",Advanced_Skew_Rotation0);
        double Advanced_Skew_Rotation1 = Robot.mylimelight.getLimeLight().Advanced_Skew_Rotation(1);
        SmartDashboard.putNumber("Advanced_Skew_Rotation1",Advanced_Skew_Rotation1);
        double Advanced_Skew_Rotation2 = Robot.mylimelight.getLimeLight().Advanced_Skew_Rotation(2);
        SmartDashboard.putNumber("Advanced_Skew_Rotation2",Advanced_Skew_Rotation2);
        double[] Advanced_RawCrosshair0 = Robot.mylimelight.getLimeLight().Advanced_RawCrosshair(0);
        SmartDashboard.putNumberArray("Advanced_RawCrosshair0",Advanced_RawCrosshair0);
        double[] Advanced_RawCrosshair1 = Robot.mylimelight.getLimeLight().Advanced_RawCrosshair(1);
        SmartDashboard.putNumberArray("Advanced_RawCrosshair1",Advanced_RawCrosshair1);
        double Advanced_RawCrosshair_X0 = Robot.mylimelight.getLimeLight().Advanced_RawCrosshair_X(0);
        SmartDashboard.putNumber("Advanced_RawCrosshair_X0",Advanced_RawCrosshair_X0);
        double Advanced_RawCrosshair_X1 = Robot.mylimelight.getLimeLight().Advanced_RawCrosshair_X(1);
        SmartDashboard.putNumber("Advanced_RawCrosshair_X1",Advanced_RawCrosshair_X1);
        double Advanced_RawCrosshair_Y0 = Robot.mylimelight.getLimeLight().Advanced_RawCrosshair_Y(0);
        SmartDashboard.putNumber("Advanced_RawCrosshair_Y0",Advanced_RawCrosshair_Y0);
        double Advanced_RawCrosshair_Y1 = Robot.mylimelight.getLimeLight().Advanced_RawCrosshair_Y(1);
        SmartDashboard.putNumber("Advanced_RawCrosshair_Y1",Advanced_RawCrosshair_Y1);
    }

}
