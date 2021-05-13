package hilos;

public class Array extends Thread {

    private int[] info;
    private String Vect;
    private int longi;
    private int suma;
    private long sumaCuadrados;
    private double media;

    public Array(String Vector, int longi) {
        this.Vect = Vector;
        this.longi = longi;
        this.sumaCuadrados = 0;
        this.media = 0.0;
        this.info = new int[this.longi];
        for(int x = 0; x < this.longi; x++) {
         info[x] = (int) (Math.random() * 100);
         
        }
    }


    public int getSuma() {
        return (this.suma);
    }

    public long getSumaCuadrados() {
        return (this.sumaCuadrados);
    }

    public double getMedia() {
        return (this.media);
    }

    public void run() {
        for (int i = 0; i < this.longi; i++) {
            System.out.println(this.Vect + ": " + info[i]);
            this.suma += info[i]; 
            this.sumaCuadrados += info[i] * info[i]; 
        }
        this.media = (double) this.suma / (double) this.longi;     }
}