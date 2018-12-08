/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;
import oi.limelightvision.limelight.frc.ControlMode.LedMode;

/**
 * Add your docs here.
 */
public class myLimeLightToggle_LED extends InstantCommand {
  /**
   * Add your docs here.
   */
  public myLimeLightToggle_LED() {
    super();
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.mylimelight);
    setRunWhenDisabled(true);
  }

  // Called once when the command executes
  @Override
  protected void initialize() {
    if(Robot.mylimelight.getLimeLight().getLEDMode() == 0){
      Robot.mylimelight.getLimeLight().setLEDMode(LedMode.koff);
    }else{
      Robot.mylimelight.getLimeLight().setLEDMode(LedMode.kon);
    }
    
  }

}
