public class Operacion {
    
    public String devolverOperacion(String operacion) {
        
        if("+".equals(operacion)) {
            return "suma";
        }
        if("-".equals(operacion)) {
            return "resta";
        }
        if("*".equals(operacion)) {
            return "multiplicacion";
        }
        if("/".equals(operacion)) {
            return "division";
        }

        return operacion;
    }

}
