public abstract class SymbolTest2 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble( args[0] ) ;
        double num2 = Double.parseDouble( args[1] ) ;
        double gr=Math.atan(Double.parseDouble(String.valueOf(num1/num2))) ;
        System.out.println("В радианах: "+gr);
        System.out.println("В градусах: "+Math.toDegrees(gr));
    }
}
