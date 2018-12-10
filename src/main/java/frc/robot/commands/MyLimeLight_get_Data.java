/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;
import oi.limelightvision.limelight.frc.ControlMode.*;


/**
 *
 */
public class MyLimeLight_get_Data extends InstantCommand {

    public MyLimeLight_get_Data() {
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
        double Advanced_RotationToTarget0 = Robot.mylimelight.getLimeLight().getAdvanced_RotationToTarget(Advanced_Target.kone);
        SmartDashboard.putNumber("Advanced_RotationToTarget0",Advanced_RotationToTarget0);
        double Advanced_RotationToTarget1 = Robot.mylimelight.getLimeLight().getAdvanced_RotationToTarget(Advanced_Target.ktwo);
        SmartDashboard.putNumber("Advanced_RotationToTarget1",Advanced_RotationToTarget1);
        double Advanced_RotationToTarget2 = Robot.mylimelight.getLimeLight().getAdvanced_RotationToTarget(Advanced_Target.kthree);
        SmartDashboard.putNumber("Advanced_RotationToTarget2",Advanced_RotationToTarget2);
        double Advanced_degVerticalToTarget0 = Robot.mylimelight.getLimeLight().getAdvanced_degVerticalToTarget(Advanced_Target.kone);
        SmartDashboard.putNumber("Advanced_degVerticalToTarget0",Advanced_degVerticalToTarget0);
        double Advanced_degVerticalToTarget1 = Robot.mylimelight.getLimeLight().getAdvanced_degVerticalToTarget(Advanced_Target.ktwo);
        SmartDashboard.putNumber("Advanced_degVerticalToTarget1",Advanced_degVerticalToTarget1);
        double Advanced_degVerticalToTarget2 = Robot.mylimelight.getLimeLight().getAdvanced_degVerticalToTarget(Advanced_Target.kthree);
        SmartDashboard.putNumber("Advanced_degVerticalToTarget2",Advanced_degVerticalToTarget2);
        double Advanced_TargetArea0 = Robot.mylimelight.getLimeLight().getAdvanced_TargetArea(Advanced_Target.kone);
        SmartDashboard.putNumber("Advanced_TargetArea0",Advanced_TargetArea0);
        double Advanced_TargetArea1 = Robot.mylimelight.getLimeLight().getAdvanced_TargetArea(Advanced_Target.ktwo);
        SmartDashboard.putNumber("Advanced_TargetArea1",Advanced_TargetArea1);
        double Advanced_TargetArea2 = Robot.mylimelight.getLimeLight().getAdvanced_TargetArea(Advanced_Target.kthree);
        SmartDashboard.putNumber("Advanced_TargetArea2",Advanced_TargetArea2);
        double Advanced_Skew_Rotation0 = Robot.mylimelight.getLimeLight().getAdvanced_Skew_Rotation(Advanced_Target.kone);
        SmartDashboard.putNumber("Advanced_Skew_Rotation0",Advanced_Skew_Rotation0);
        double Advanced_Skew_Rotation1 = Robot.mylimelight.getLimeLight().getAdvanced_Skew_Rotation(Advanced_Target.ktwo);
        SmartDashboard.putNumber("Advanced_Skew_Rotation1",Advanced_Skew_Rotation1);
        double Advanced_Skew_Rotation2 = Robot.mylimelight.getLimeLight().getAdvanced_Skew_Rotation(Advanced_Target.kthree);
        SmartDashboard.putNumber("Advanced_Skew_Rotation2",Advanced_Skew_Rotation2);
        double[] Advanced_RawCrosshair0 = Robot.mylimelight.getLimeLight().getAdvanced_RawCrosshair(Advanced_Crosshair.kone);
        SmartDashboard.putNumberArray("Advanced_RawCrosshair0",Advanced_RawCrosshair0);
        double[] Advanced_RawCrosshair1 = Robot.mylimelight.getLimeLight().getAdvanced_RawCrosshair(Advanced_Crosshair.ktwo);
        SmartDashboard.putNumberArray("Advanced_RawCrosshair1",Advanced_RawCrosshair1);
        double Advanced_RawCrosshair_X0 = Robot.mylimelight.getLimeLight().getAdvanced_RawCrosshair_X(Advanced_Crosshair.kone);
        SmartDashboard.putNumber("Advanced_RawCrosshair_X0",Advanced_RawCrosshair_X0);
        double Advanced_RawCrosshair_X1 = Robot.mylimelight.getLimeLight().getAdvanced_RawCrosshair_X(Advanced_Crosshair.ktwo);
        SmartDashboard.putNumber("Advanced_RawCrosshair_X1",Advanced_RawCrosshair_X1);
        double Advanced_RawCrosshair_Y0 = Robot.mylimelight.getLimeLight().getAdvanced_RawCrosshair_Y(Advanced_Crosshair.kone);
        SmartDashboard.putNumber("Advanced_RawCrosshair_Y0",Advanced_RawCrosshair_Y0);
        double Advanced_RawCrosshair_Y1 = Robot.mylimelight.getLimeLight().getAdvanced_RawCrosshair_Y(Advanced_Crosshair.ktwo);
        SmartDashboard.putNumber("Advanced_RawCrosshair_Y1",Advanced_RawCrosshair_Y1);

        //getters of setters
        LedMode ledMode = Robot.mylimelight.getLimeLight().getLEDMode();
        SmartDashboard.putString("LedMode",ledMode.toString());
        CamMode camMode = Robot.mylimelight.getLimeLight().getCamMode();
        SmartDashboard.putString("CamMode",camMode.toString());
        double pipeline = Robot.mylimelight.getLimeLight().getPipeline();
        SmartDashboard.putNumber("Pipeline",pipeline);
        StreamType stream = Robot.mylimelight.getLimeLight().getStream();
        SmartDashboard.putString("stream",stream.toString());
        Snapshot snapShot = Robot.mylimelight.getLimeLight().getSnapshot();
        SmartDashboard.putString("snapShot key", snapShot.toString());
    }

}
