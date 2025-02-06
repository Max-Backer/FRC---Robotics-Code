package frc.robot.subsystems.elevator;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkMaxAlternateEncoder;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.units.measure.Distance;
import edu.wpi.first.units.measure.LinearVelocity;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;

public class RealElevatorSubsystem implements ElevatorSubsystem {
    private final SparkMax sparkMax;
    private final SparkMax sparkMax2;

    private final DigitalInput limitSwitch;
    private final DigitalInput limitSwitch2;

    private final Encoder encoder;

    public RealElevatorSubsystem() {
        sparkMax = new SparkMax(0, MotorType.kBrushless);
        sparkMax2 = new SparkMax(1, MotorType.kBrushless);

        limitSwitch = new DigitalInput(0);
        limitSwitch2 = new DigitalInput(1);
        encoder = new Encoder(2, 3);


    }
    

    @Override
    public void setTargetPosition(double position) {
    }

    @Override
    public void setTargetHeight(Distance height) {

    }

    @Override
    public double getPosition() {
        return encoder.getDistance();
    }

    @Override
    public Distance getHeight() {
        return encoder.getDistance();
    }

    @Override
    public double getTargetPosition() {
        return encoder.getTargetPosition();
    }

    @Override
    public Distance getTargetHeight() {
        return encoder.getTargetHeight();
    }

    @Override
    public LinearVelocity getVelocity() {
        return encoder.getClass().getVelocity9
    }
    
}
