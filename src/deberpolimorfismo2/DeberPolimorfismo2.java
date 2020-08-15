/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberpolimorfismo2;

/**
 *
 * @author Aguaiza Quimbita Jonathan Fabricio
 */
class CalculoMotorCombustionInterna{
    int CalcularConsumoCombustible(int KilometrosRecorridos, int LitrosConsumidoTrayecto,
            int LitrosDepositoLleno){
        return (KilometrosRecorridos*LitrosConsumidoTrayecto)/LitrosDepositoLleno;
    }
    double CalcularConsumoCombustible(double KilometrosRecorridos, double LitrosConsumidoTrayecto,
            double LitrosDepositoLleno){
        return (KilometrosRecorridos*LitrosConsumidoTrayecto)/LitrosDepositoLleno;
    }
    int CalcularPotenciaMotor(int TorqueMotor, int RPM_Motor, int ConstanteConversion){
        return (TorqueMotor*RPM_Motor)/ConstanteConversion;
    }
    double CalcularPotenciaMotor(double TorqueMotor, double RPM_Motor, double ConstanteConversion){
        return (TorqueMotor*RPM_Motor)/ConstanteConversion;
    }
}
public class DeberPolimorfismo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("      UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-L");
        System.out.println("MATERIA: PROGRAMACIÓN");
        System.out.println("CARRERA: INGENIERIA AUTOMOTRIZ");
        System.out.println("NRC: 7450");
        System.out.println("ALUMNO: Aguaiza Jonathan");
        System.out.println(" ");
        System.out.println("      POLIMORFISMO Sobrecarga");
        
        CalculoMotorCombustionInterna Consumo_Combustible1 = new CalculoMotorCombustionInterna();
        CalculoMotorCombustionInterna Consumo_Combustible2 = new CalculoMotorCombustionInterna();
        
        CalculoMotorCombustionInterna Potencia_Motor1 = new CalculoMotorCombustionInterna();
        CalculoMotorCombustionInterna Potencia_Motor2 = new CalculoMotorCombustionInterna();
        
        int resultado1;
        Consumo_Combustible1.CalcularConsumoCombustible(100, 55, 750);
        resultado1 = Consumo_Combustible1.CalcularConsumoCombustible(100,55,750);
        System.out.println("El consumo del combustible 1 es de: "+resultado1+" litros "
                + "que consume el motor por el trayecto recorrido.");
        
        double resultado2;
        Consumo_Combustible2.CalcularConsumoCombustible(98.5, 48.96, 740.85);
        resultado2 = Consumo_Combustible2.CalcularConsumoCombustible(98.5,48.96,740.85);
        System.out.println("El consumo del combustible 2 es de: "+resultado2+" litros "
                + "que consume el motor por el trayecto recorrido.");
        
        int resultado3;
        Potencia_Motor1.CalcularPotenciaMotor(100, 4500, 727);
        resultado3 = Potencia_Motor1.CalcularPotenciaMotor(100, 4500, 727);
        System.out.println("La potencia del motor 1 es de: "+resultado3+" HP.");
        
        double resultado4;
        Potencia_Motor2.CalcularPotenciaMotor(98.55, 6500.25, 727.70);
        resultado4 = Potencia_Motor2.CalcularPotenciaMotor(98.55, 6500.25, 727.70);
        System.out.println("La potencia del motor 1 es de: "+resultado4+" HP.");
    }
    
}








