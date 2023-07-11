package shape.bangunRuang;

import shape.bangunDatar.PersegiPanjang;
import shape.exception.InputNotValidException;

public class Balok extends PersegiPanjang implements BangunRuang {
  private Double tinggi;

  public Balok(Double panjang, Double lebar, Double tinggi) {
    super(panjang, lebar);
    this.tinggi = tinggi;
  }

  public Balok(Double panjang, Double lebar) {
    super(panjang, lebar);
  }

  public Balok() {
  }

  public Double getTinggi() {
    return tinggi;
  }

  public void setTinggi(Double tinggi) {
    if (tinggi < 0) {
      throw new InputNotValidException();
    }
    this.tinggi = tinggi;
  }

  @Override
  public Double getVolume() {
    return super.getLuas() * this.tinggi;
  }

  @Override
  public String getShapeName() {
    return "=== BALOK ===";
  }

  @Override
  public void getInformation() {
    super.getInformation();
    System.out.println("Tinggi: " + this.getTinggi());
    System.out.println("Volume: " + this.getVolume());
  }

}
