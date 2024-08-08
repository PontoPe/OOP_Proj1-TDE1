import static java.lang.Thread.sleep;

public class Arma {
    public String nome;
    public int dano;
    public int capacidade;
    public int maxRange;
    public int team;
    public int tempoRecarga;
    public int fireRate;
    public int currentTeam;
    public int currentTeam() {
        Player.getTeam = currentTeam;
        return currentTeam;
    }

    public Arma(String nome, int dano, int capacidade, int maxRange, int team, int tempoRecarga, int fireRate) {
        this.nome = nome;
        this.dano = dano;
        this.capacidade = capacidade;
        this.maxRange = maxRange;
        this.team = team;
        this.tempoRecarga = tempoRecarga;
        this.fireRate = fireRate;
    }


    public void atirar() throws InterruptedException {
        if (capacidade > 0) {
            System.out.println("Atirando com " + nome + " e causando " + dano + " de dano.");
            capacidade--;
        } else {
            System.out.println("Sem munição! Recarregando!");
            recarregar(capacidade);
        }
    }

    public void recarregar(int capacidade) throws InterruptedException {
        Thread.sleep(tempoRecarga);
        this.capacidade += capacidade;
    }

    public void equipar() {
        if (this.team == currentTeam) {
            System.out.println(nome + " equipavel no seu time");
            System.out.println("Equipando " + nome + "...");
        } else {
            System.out.println(nome + " não equipavel no seu time");
        }
        }
}

