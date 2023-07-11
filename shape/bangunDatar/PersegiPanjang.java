package shape.bangunDatar;

import shape.exception.InputNotValidException;

public class PersegiPanjang implements BangunDatar {
  private Double panjang;
  private Double lebar;

  public PersegiPanjang() {
  }

  public PersegiPanjang(Double panjang, Double lebar) {
    this.panjang = panjang;
    this.lebar = lebar;
  }

  public Double getPanjang() {
    return panjang;
  }

  public void setPanjang(Double panjang) {
    if (panjang < 0) {
      throw new InputNotValidException();
    }
    this.panjang = panjang;
  }

  public Double getLebar() {
    return lebar;
  }

  public void setLebar(Double lebar) {
    if (lebar < 0) {
      throw new InputNotValidException();
    }
    this.lebar = lebar;
  }

  @Override
  public Double getKeliling() {
    return (2 * this.panjang) + (2 * this.lebar);
  }

  @Override
  public Double getLuas() {
    return this.panjang * this.lebar;
  }

  @Override
  public String getShapeName() {
    return "=== PERSEGI PANJANG ===";
  }

  @Override
  public void getInformation() {
    System.out.println("Panjang: " + this.getPanjang());
    System.out.println("Lebar: " + this.getLebar());
    System.out.println("Keliling: " + this.getKeliling());
    System.out.println("Luas: " + this.getLuas());
  }
}
