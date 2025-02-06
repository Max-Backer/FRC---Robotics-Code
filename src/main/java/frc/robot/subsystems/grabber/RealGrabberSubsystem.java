package frc.robot.subsystems.grabber;

import java.util.function.Supplier;

import com.revrobotics.jni.CANSparkJNI;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.DigitalInput;
import frc.robot.FieldConstants.PickupState;

public class RealGrabberSubsystem implements GrabberSubsystem {
    private final DigitalInput flightSensor;
    private final DigitalInput breakSensor;
    private final SparkMax grabberMotor;
    private PickupState currentPickupState = PickupState.NONE;

    public RealGrabberSubsystem() {
        flightSensor = new DigitalInput(0);
        breakSensor = new DigitalInput(1);
        grabberMotor = new SparkMax(0, MotorType.kBrushless);

        
    }
    

    @Override
    public boolean isAlgaeDetected() {
        return !flightSensor.get();
    }

    @Override
    public boolean isCoralDetected() {
        return !breakSensor.get();
    }


    @Override
    public void runMotor(double power) {
        grabberMotor.set(power);
    }


    @Override
    public void stopMotor() {
        grabberMotor.set(0);
    }


    @Override
    public void holdMotor() {
        grabberMotor.set(0.5);
    }


    @Override
    public PickupState getPickupState() {
        return currentPickupState;
    }


    @Override
    public void setPickupState(PickupState state) {
        currentPickupState = state;
    }
    
}
