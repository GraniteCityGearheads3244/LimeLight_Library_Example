/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;
import oi.limelightvision.limelight.frc.ControlMode.Snapshot;

/**
 * Add your docs here.
 */
public class myLimeLight_Toggle_Snapshot extends InstantCommand {
  /**
   * Add your docs here.
   */
  public myLimeLight_Toggle_Snapshot() {
    super();
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.mylimelight);
    setRunWhenDisabled(true);
  }

  // Called once when the command executes
  @Override
  protected void initialize() {
    if(Robot.mylimelight.getLimeLight().getSnapshot() == Snapshot.kon){
      Robot.mylimelight.getLimeLight().setSnapshot(Snapshot.koff);
    }else{
      Robot.mylimelight.getLimeLight().setSnapshot(Snapshot.kon);
    }
  }

}
