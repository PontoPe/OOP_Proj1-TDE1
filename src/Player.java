public class Player {

//    atributos:
    public static int getTeam;
    public Arma arma;
    public String nome;
    public int vida;
    public Team team;
    public int mortes = 0;
    public int abates = 0;

    public Player(Arma arma, String nome, int vida, Team team) {
        this.arma = arma;
        this.nome = nome;
        this.vida = vida;
        this.team = team;
    }

//    metodos:
    public void atirar() throws InterruptedException {
        arma.atirar();
    }
    
    public void equipar() {
        arma.equipar();
    }

    public void tomarDano(int dano) {
        vida -= dano;
        if (vida <= 0) {
            System.out.println(nome + " morreu!");
            mortes++;
        } else {
            System.out.println(nome + " tomou " + dano + " de dano e agora tem " + vida + " de vida.");
        }
    }

    public void darDano (Player receptor, Arma arma) {
        receptor.tomarDano(arma.dano);
        if (receptor.vida <= 0) {
            abates++;
        }

    }
}
