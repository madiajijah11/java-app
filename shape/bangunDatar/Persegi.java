package shape.bangunDatar;

import shape.exception.InputNotValidException;

public class Persegi implements BangunDatar {
  // ATRIBUT
  private Double sisi;

  // CONSTRUCTOR
  public Persegi() {
  }

  public Persegi(Double sisi) {
    this.sisi = sisi;
  }

  public Persegi(Double sisi, String shapeName) {
    this.sisi = sisi;
  }

  // SETTER AND GETTER
  public Double getSisi() {
    return sisi;
  }

  public Double getSisi(Double sisi) {
    return sisi;
  }

  public void setSisi(Double sisi) {
    if (sisi < 0) {
      throw new InputNotValidException("sisi must be positive numbers");
    }
    this.sisi = sisi;
  }

  // CUSTOM METHOD
  @Override
  public Double getKeliling() {
    return 4 * this.sisi;
  }

  @Override
  public Double getLuas() {
    return this.sisi * this.sisi;
  }

  @Override
  public String getShapeName() {
    return "=== PERSEGI ===";
  }

  @Override
  public void getInformation() {
    System.out.println("Sisi: " + this.sisi);
    System.out.println("Keliling: " + this.getKeliling());
    System.out.println("Luas: " + this.getLuas());

  }
}
