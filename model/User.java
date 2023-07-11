package model;

public class User {
  // modifier: bisa diakses secara global (berbeda package)
  public String namaDepan;
  // modifer: bisa diakses oleh turunan class
  protected String alamat;
  // default modifer: bisa diakses oleh package yg sama
  String namaBelakang;
  // modifer: hanya bisa diakses oleh class yang sama
  private Integer usia;

  // method setter getter
  // jenis method void atau tidak mengembalikan data/value
  public void setUsia(Integer umur) {
    try {
      if (umur < 0) {
        throw new Exception("umur harus diatas 0 tahun!");
      }
      usia = umur;
    } catch (Exception e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }

  // jenis method return type Integer
  public Integer getUsia() {
    return usia;
  }
}
