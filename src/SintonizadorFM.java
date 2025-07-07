public class SintonizadorFM {
    //La frecuencia se incrementará de 0.5 a 0.5
    private double frecuencia;

    public SintonizadorFM(double frecuencia) {
        //Debe estar comprendida entre 80 MHz y 108 MHz
        if (frecuencia < 80) {
            this.frecuencia = 108;
        } else if (frecuencia > 108) {
            this.frecuencia = 80;
        } else {
            this.frecuencia = frecuencia;
        }
    }

    public void comprobarFrecuencia() {
        if (frecuencia < 80) {
            this.frecuencia = 108;
        } else if (frecuencia > 108) {
            this.frecuencia = 80;
        } else {
            this.frecuencia = frecuencia;
        }
    }

    //metodo para bajar la frecuencia
    public double bajarFrecuencia() {
        this.frecuencia -= 0.5;
        comprobarFrecuencia();
        return this.frecuencia;
    }

    //Metodo de subir frecuencia
    public double subirFrecuencia() {
        this.frecuencia += 0.5;
        comprobarFrecuencia();
        return this.frecuencia;
    }

    public void mostrarFrecuencia(){

    System.out.println("Sintonizando..."+ frecuencia + " RadioFM ");

}
}

