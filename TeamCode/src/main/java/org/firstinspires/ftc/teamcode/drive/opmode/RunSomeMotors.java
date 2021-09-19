package org.firstinspires.ftc.teamcode.drive.opmode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous
public class RunSomeMotors extends LinearOpMode {
    public DcMotorEx leftFront, rightFront, leftRear, rightRear;


    @Override
    public void runOpMode() throws InterruptedException {
        leftFront = hardwareMap.get(DcMotorEx.class, "leftfront");
        leftRear = hardwareMap.get(DcMotorEx.class, "leftrear");
        rightFront = hardwareMap.get(DcMotorEx.class, "rightfront");
        rightRear = hardwareMap.get(DcMotorEx.class, "rightrear");

        leftFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        leftRear.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightRear.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        rightFront.setDirection(DcMotor.Direction.REVERSE);
        rightRear.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();

        setMotorPowers(0.5, 0.5, 0.5, 0.5);
        sleep(1000);

        setMotorPowers(0.5, 0.5, -0.5, -0.5);
        sleep(500);
    }

    public void setMotorPowers(double leftFrontPower, double leftRearPower, double rightFrontPower, double rightRearPower){
        leftFront.setPower(leftFrontPower);
        leftRear.setPower(leftRearPower);
        rightFront.setPower(rightFrontPower);
        rightRear.setPower(rightRearPower);
    }

}
