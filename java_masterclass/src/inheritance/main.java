package inheritance;

import composition.*;

public class main {

    public static void main(String[] args){

        CpuCase doanPCCase = new CpuCase("220B", "Dell", "240W",new Dimensions(20,20,5));
        Monitor doanPCMonitor = new Monitor("Yeet-M10", "Acer", 27, new Resolution(2540, 1440));
        Motherboard doanPCMotherboard = new Motherboard("Yuh2000", "Acer", 4,8, "v2.44");

        PC doanPC = new PC(doanPCCase, doanPCMonitor, doanPCMotherboard);

        doanPC.togglePower();
        System.out.println("");

        doanPC.loadProgram("MS Paint 2020");
        doanPC.drawPixel(1500,2000, "red");
        System.out.println("");

        doanPC.togglePower();



        System.out.println(doanPC.getOn());



    }
}
