

import javax.swing.JOptionPane;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Dadas las edades y alturas de 5 alumnos,mostrar la edad y la estatura media"
                + " la cantidad de alumnos mayores de 18 años y la cantidad de alumnos que miden mas de 1,75");

        int Age,ContA=0,ContH=0,PromA=0,MediaA=0;
        double height,PromH=0,MediaH=0;

        for(int i=1; i<6; i++){
            Age=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese edad del malcriado: "));
            height=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese altura del malcriado: "));

            MediaA+=Age;
            MediaH+=height;
            if(Age>17){
                ContA++;
            }
            if(height>1.74){
                ContH++;
            }
            PromA=PromA+Age;
            PromH=PromH+height;
        }  MediaA=MediaA/5;
        MediaH=MediaH/5;

        System.out.println(PromA);
        System.out.println(PromH);
        JOptionPane.showMessageDialog(null,"cantidad de soldados mayores de 18: "+ContA);
        JOptionPane.showMessageDialog(null,"pelotudos mas altos que 1.75: "+ContH);
        JOptionPane.showMessageDialog(null,"Promedio de edades "+MediaA);
        JOptionPane.showMessageDialog(null,"Promedio de alturas: "+MediaH);
    }
}