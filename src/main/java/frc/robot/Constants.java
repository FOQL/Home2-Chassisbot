// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.util.Units;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    // Physical Robot Constants //
    public static double trackWidth = 2;

    // Victor PWM Ports //
    public static final int leftMotor1CANID = 1;
    public static final int leftMotor2CANID = 2;
    public static final int rightMotor1CANID = 0;
    public static final int rightMotor2CANID = 3;    

    // Apriltag Vision Constants //
    public static final double CAMERA_HEIGHT_METERS = Units.inchesToMeters(7);
    public static final double TARGET_HEIGHT_METERS = Units.inchesToMeters(18.5);
    public static final double CAMERA_PITCH_RADIANS = Units.degreesToRadians(18);
    public static final String USB_CAMERA_NAME = null;

    // Controller Input Axes //
    public static final int LEFT_VERTICAL_JOYSTICK_AXIS = 1;
    public static final int RIGHT_VERTICAL_JOYSTICK_AXIS = 3;
    public static final int RIGHT_HORIZONTAL_JOYSTICK_AXIS = 2;

    public static final double TRACKED_TAG_ROATION_KP = 0;

    public static final double TRACKED_TAG_AREA_DRIVE_KP = 0;

    public static final double TRACKED_TAG_DISTANCE_DRIVE_KP = 0;

    public static final double APRILTAG_POWER_CAP = 0;
     
    }
