/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class myLimeLight_set_Pipeline extends InstantCommand {
  /**
   * Add your docs here.
   */
  private double m_pipeline = 0.0;

  public myLimeLight_set_Pipeline(double pipeline) {
    super();
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.mylimelight);
    m_pipeline = pipeline;
    setRunWhenDisabled(true);
  }

  // Called once when the command executes
  @Override
  protected void initialize() {
    Robot.mylimelight.getLimeLight().setPipeline(m_pipeline);
  }

}
