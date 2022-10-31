package org.example.ioc;

import org.example.ioc.calculator.Calculator;
import org.example.ioc.operator.CalAdd;
import org.example.ioc.operator.CalDiv;
import org.example.ioc.operator.CalMul;
import org.example.ioc.operator.CalSub;

// IoC 컨테이너 입장 (객체 제어권 존재)
// 객체 생성 가능
public class MainClass {
    public static void main(String[] args) {

        // 생성자 이용한 객체 주입 방법
        new Calculator(3, 5, new CalAdd()).result();
        new Calculator(3, 5, new CalSub()).result();
        new Calculator(3, 5, new CalMul()).result();
        new Calculator(3, 5, new CalDiv()).result();

        // setter 이용한 객체 주입 방법
        Calculator myCalculator = new Calculator();
        myCalculator.setNum1(3);
        myCalculator.setNum2(5);
        myCalculator.setCal(new CalAdd());

        myCalculator.setNum1(3);
        myCalculator.setNum2(5);
        myCalculator.setCal(new CalSub());

        myCalculator.setNum1(3);
        myCalculator.setNum2(5);
        myCalculator.setCal(new CalMul());

        myCalculator.setNum1(3);
        myCalculator.setNum2(5);
        myCalculator.setCal(new CalDiv());

    }

}