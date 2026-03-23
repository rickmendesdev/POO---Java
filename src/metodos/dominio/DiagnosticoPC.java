package metodos.dominio;

public class DiagnosticoPC {

    public String avaliarGargalo(String cpu, String gpu){
    if (cpu.equals("Ryzen 5 5500") && gpu.equals("RX 6600")) {
            return "Setup equilibrado, pronto para rodar os jogos liso!";
        } else {
            return "Analisando outros hardwares...";
        }
    }
}
