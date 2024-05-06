public class LojaCarros {
 private String marca;
 private String modelo;
 private String cor;
 private int KMs;

 private static int ContadordeCarros;
 public String getMarca(){
    return marca;
 }
 public void setMarca(String temp){
    marca = temp;
 }
 public String getModelo(){
    return modelo;
 }
 public void setModelo(String temp){
    modelo = temp;
 }
 public String getCor(){
    return cor;
 }
 public void setCor(String temp){
    cor = temp;
 }
 public int getKMs(){
    return KMs;
 }
 public void setKMs(int temp){
    KMs = temp;
 }
 public static int getQuantidadedeCarros(){
    return ContadordeCarros;
 }

}