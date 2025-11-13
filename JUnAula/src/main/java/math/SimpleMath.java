package math;

public class SimpleMath {

    public Double sum(Double num1, Double num2) {
        return num1 + num2;
    }


    public Double sub(Double num1, Double num2) {
        return (num1 - num2);
    }

    public Double division(Double num1, Double num2) {
        return (num1 / num2);
    }

    public Double multiplication(Double num1, Double num2) {
        if (num2 == 0.0) {
            throw new ArithmeticException("Impossible to dividendo");


        }
        return num1 / num2;
    }


        public Double media (Double num1, Double num2){
            return (num1 + num2) / 2;
        }


        public Double squareRoot (Double num){
            return Math.sqrt(num);
        }
    }

