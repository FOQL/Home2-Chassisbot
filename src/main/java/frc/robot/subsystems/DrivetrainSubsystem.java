// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.math.kinematics.DifferentialDriveKinematics;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DrivetrainSubsystem extends SubsystemBase {
  
  public final int CURRENT_DRIVE_SCALE = 1;
  private VictorSP leftMotor1;  
  private VictorSP leftMotor2; 
  private VictorSP rightMotor1;  
  private VictorSP rightMotor2;  
  
  MotorControllerGroup leftControllerGroup = new MotorControllerGroup(leftMotor1, leftMotor2);
  MotorControllerGroup rightControllerGroup = new MotorControllerGroup(rightMotor1, rightMotor2);

  DifferentialDrive differentialDrive = new DifferentialDrive(leftControllerGroup, rightControllerGroup);

  private DifferentialDriveKinematics kinematics;

  /** Creates a new ExampleSubsystem. */
  public DrivetrainSubsystem() {

    leftMotor1 = new VictorSP(Constants.leftMotor1CANID);
    leftMotor2 = new VictorSP(Constants.leftMotor2CANID);
    rightMotor1 = new VictorSP(Constants.rightMotor1CANID);
    rightMotor2 = new VictorSP(Constants.rightMotor2CANID);

    rightControllerGroup.setInverted(true);
    leftControllerGroup.setInverted(false);

    kinematics = new DifferentialDriveKinematics(Constants.trackWidth);
  }

  public void driveWithJoystick(double fwd, double rot) {
    differentialDrive.arcadeDrive(fwd, rot);
  }

  public void drive(double leftPercentPower, double rightPercentPower) {
    leftControllerGroup.set(leftPercentPower);
    rightControllerGroup.set(rightPercentPower);
  }

  public void stop() {
    drive(0, 0);
  }

  public DifferentialDriveKinematics getKinematics() {
    return kinematics;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

}
