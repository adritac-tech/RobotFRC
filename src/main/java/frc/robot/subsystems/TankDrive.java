
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;


import edu.wpi.first.wpilibj.Timer;


public class TankDrive extends Command {
  
  public TankDrive() {
    requires(Robot.driveTrain);
  }
  @Override
  protected void initialize() {
    
  }
  @Override
  
  proected void execute(){
    double leftStickY = Robot.m_oi.GetDriverRawAxis(RobotMap.LEFT_STICK_Y);
    double RightStickY = Robot.m_oi.GetDriverRawAxis(RobotMap.RIGHT_STICK_Y);

    Robot.driveTrain.setLeftMotors(leftStickY);
    Robot.driveTrain.setRightMotors(RightStickY);
  }

  @Override
  protected boolean isFinished() {
    return false;
  }
  @Override
  protected void end() {
    Robot.driveTrain.speedLeftMotors(0);
    Robot.driveTrain.speedRightMotors(0);
  }
  @Override
  protected void interrupted() {
    this.end();
  }
}
