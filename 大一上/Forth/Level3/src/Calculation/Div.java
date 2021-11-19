package Calculation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Div {
    public static BigDecimal myDiv(BigDecimal i, BigDecimal j){
        return i.divide(j,3, RoundingMode.HALF_UP);
    }
}
