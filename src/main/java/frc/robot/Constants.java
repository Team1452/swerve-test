// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.math.util.Units;
import frc.robot.util.Vector2;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean
 * constants. This class should not be used for any other purpose. All constants
 * should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  
  public static class SquareTest {
    public static final String currentTest = "Square1";

    public static final int[] xLoc1 = {0, 1, 1, 0};
    public static final int[] yLoc1 = {1, 1, 0, 0};

    public static final int[] xLoc2 = {1, 1, 0, 0};
    public static final int[] yLoc2 = {0, 1, 1, 0};

    public static final double threshold = 0.01;
  }
  
  public static class CANIds {
    // Module 1 (Front-right)
    public static final int kMod1CANCoder = 10;
    public static final int kMod1SteeringMotor = 11;
    public static final int kMod1DriveMotor = 12;

    // Module 2 (Front-left)
    public static final int kMod2CANCoder = 20;
    public static final int kMod2SteeringMotor = 21;
    public static final int kMod2DriveMotor = 22;

    // Module 3 (Back-left)
    public static final int kMod3CANCoder = 30;
    public static final int kMod3SteeringMotor = 31;
    public static final int kMod3DriveMotor = 32;

    // Module 4 (Back-right)
    public static final int kMod4CANCoder = 40;
    public static final int kMod4SteeringMotor = 41;
    public static final int kMod4DriveMotor = 42;

    public static final int kPigeon = 50;
  }

  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public static class DriveConstants {
    public static final MotorType kMotorType = MotorType.kBrushless;

    public static final double kLength = Units.inchesToMeters(28);
    public static final double kWidth = Units.inchesToMeters(28);

    public static final Vector2 kMod1Position = new Vector2(kWidth / 2, kLength / 2);
    public static final Vector2 kMod2Position = new Vector2(-kWidth / 2, kLength / 2).unaryMinus();
    public static final Vector2 kMod3Position = new Vector2(-kWidth / 2, -kLength / 2);
    public static final Vector2 kMod4Position = new Vector2(kWidth / 2, -kLength / 2).unaryMinus();

    public static final double kMod1CANCoderOffset = 49.83398;
    public static final double kMod2CANCoderOffset = -134.20898;
    public static final double kMod3CANCoderOffset = -71.10352;
    public static final double kMod4CANCoderOffset = 0.87891;

    public static final double kMaxSpeedMetersPerSecond = 2.0; // TODO: Determine max possible/desired speed

    public static final double kDriveGearRatio = 1/6.75; 

    // Used to get pivot angle from NEO encoders (for now)
    public static final double kSteeringGearRatio = 1/21.665599999999998;
    public static final double kSteeringInitialAngleRadians = Math.PI / 2; // Have initial pivot angle be facing
  }
}
