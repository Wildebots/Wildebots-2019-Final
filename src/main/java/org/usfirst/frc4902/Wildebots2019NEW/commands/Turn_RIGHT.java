
package org.usfirst.frc4902.Wildebots2019NEW.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4902.Wildebots2019NEW.Robot;

public class Turn_RIGHT extends Command 
{

    public Turn_RIGHT() // Constructor
    {
        requires(Robot.driveTrain);
    }

    @Override
    protected void initialize()
    {
        Robot.driveTrain.drive(0.0, 0.0); // Get the motors ready to drive and stop it as initialization
    }

    @Override
    protected void execute() 
    {
        Robot.driveTrain.drive(1.0, -1.0); // Full Speed Turn RIGHT. Speed values are between [-1.0..1.0]
        //System.out.println("Executing Turn_RIGHT");
    }

    @Override
    protected boolean isFinished()
    {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() 
    {
        Robot.driveTrain.end(); // Stop the motor
    }

    @Override
    protected void interrupted() 
    {
        end(); // If the command is interrupted for whatever reason kindly stop the command
    }
}