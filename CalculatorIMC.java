public class CalculatorIMC {
    String nume;
    double greutate;
     double inaltime;

    public CalculatorIMC(String nume, double greutate, double inaltime) {
        this.nume = nume;
        this.greutate = greutate;
        this.inaltime = inaltime;
    }

    public double calculeazaIMC() {
        return greutate / (inaltime * inaltime);
    }

    public String getRezultatFormatat() {
        double bmi = calculeazaIMC();
        return String.format("%s, indicele tău de masă corporală este %.2f", nume, bmi);
    }
}
