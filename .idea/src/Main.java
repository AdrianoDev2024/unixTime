//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        long totalMilisegundos = System.currentTimeMillis() -10800000;

        long totalSegundos = totalMilisegundos / 1000;
        long segundoAltual = totalSegundos % 60;

        long totalMinutos = totalSegundos / 60;
        long minutoAtual = totalMinutos % 60;

        long totalHora = totalMinutos / 60;
        long horaAtual = totalHora % 24;

        System.out.println(totalMilisegundos);
        System.out.println(totalSegundos);
        System.out.println(segundoAltual);
        System.out.println(totalMinutos);
        System.out.println(minutoAtual);
        System.out.println(totalHora);
        System.out.println(horaAtual);
        System.out.println(horaAtual + ":" + minutoAtual + ":" + segundoAltual);


    }
}