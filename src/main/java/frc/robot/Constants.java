// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static class MechanicalConstants {
        public static class SwerveModuleLocationsMetres {
            /**
             * The location of each swerve module relative to the robot's centre
             */

            Translation2d FRONT_LEFT = new Translation2d(-0.2975, 0.3325);
            Translation2d FRONT_RIGHT = new Translation2d(0.2975, 0.3225);
            Translation2d REAR_LEFT = new Translation2d(-0.2975, -0.3225);
            Translation2d REAR_RIGHT = new Translation2d(0.2975, -0.3225);
        }

        public static final double SWERVE_WHEEL_DIAMETER = Units.inchesToMeters(4);
        public static final double SWERVE_WHEEL_CIRCUMFERENCE = SWERVE_WHEEL_DIAMETER * 2 * Math.PI;

        /**
         * The gearing-ratio between the driving motor and the driving wheel using the L2 ratio of
         * the MK4i modules
         */
        public static final double SWERVE_DRIVING_GEAR_RATIO = 6.75;

        /**
         * The ratio between steering motor rotation and the steering itself 
         */
        public static final double SWERVE_STEERING_GEAR_RATIO = 150 / 7;
    }

    public static final int FALCON_SENSOR_TICKS_PER_REV = 2048;

    public static class ControlConstants {
        public static final double SWERVE_DRIVING_KP = 0;
        public static final double SWERVE_DRIVING_KI = 0;
        public static final double SWERVE_DRIVING_KD = 0;
        public static final double SWERVE_DRIVING_KF = 0;


        public static final double SWERVE_DRIVING_KS = 0;

        /**
         * The ratio between the input voltage of the swerve's steering motors and their rotation
         * speed in volts per (radians per second)
         */
        public static final double SWERVE_DRIVING_KV = 0.023; // TODO this is not the correct value

        /**
         * The ratio between the input voltage of the swerve's steering motors and their rotational
         * acceleration in volts per (radians per second squared)
         */
        public static final double SWERVE_DRIVING_KA = 0.0001;
    
        public static final double SWERVE_STEERING_KP = 0;
        public static final double SWERVE_STEERING_KI = 0;
        public static final double SWERVE_STEERING_KD = 0;
    }

    public static class Ports {
        public class Swerve {
            public static final int FRONT_LEFT_TURNING_MOTOR = 0;
            public static final int FRONT_LEFT_DRIVING_MOTOR = 1;
        }
    }
}