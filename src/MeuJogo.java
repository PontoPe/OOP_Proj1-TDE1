public class MeuJogo{
    public static void main(String[] args) {

        Team Spetznas = new Team();
        Spetznas.name = "Spetznas";
        Team TaskForce = new Team();
        TaskForce.name = "TaskForce";

        Arma MP7 = new Arma("MP7", 24, 30, 100, 1, 1100, 900);
        Arma AK47 = new Arma("AK47", 30, 30, 200, 2, 1500, 550);
        Arma M4A1 = new Arma("M4A1", 27, 30, 150, 1, 1200, 700);

        Player player1 = new Player(MP7,"PontoPe",100,Spetznas);
        Player player2 = new Player(M4A1,"mimiza",100,TaskForce);

        System.out.println(player1.nome + ", do time " + player1.team.name + " equipou a " + player1.arma.nome + "\n" + player2.nome + ", do time " + player2.team.name + " equipou a " + player2.arma.nome );
        TaskForce.score = 74;
        Spetznas.score = 74;
        try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
        System.out.println("...");
        try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
        System.out.println("...");
        try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
        System.out.println("...");
        try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}

        System.out.println(".......e falta um abate apenas para acabar o jogo, quem conseguir uma kill agora, vai ganhar tudo!");
        try{Thread.sleep(2450);}catch(InterruptedException e){System.out.println(e);}
        System.out.println(player1.nome + " vai ao meio de campo, enquanto " + player2.nome + " vai pelo flanco direito!");
        try{Thread.sleep(1750);}catch(InterruptedException e){System.out.println(e);}
        System.out.println(player2.nome + " avista " + player1.nome + " pelas costas e atira!");
        player2.darDano(player1, player2.arma);
        player2.darDano(player1, player2.arma);
        try{Thread.sleep(1750);}catch(InterruptedException e){System.out.println(e);}
        System.out.println("mas tem tempo de virar para tras e entregar dois tiros no peito de " + player2.nome);
        player1.darDano(player2, player1.arma);
        player1.darDano(player2, player1.arma);
        player1.darDano(player2, player1.arma);
        try{Thread.sleep(1750);}catch(InterruptedException e){System.out.println(e);}
        System.out.println("Mas os dois jogadores conseguem sair vivos da trocacao! \nQUE JOGO MALUCO!");
        try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}
        System.out.println("depois de muitos tiros errados, "+player1.nome+" fica com "+ (player1.arma.capacidade - 6) + " balas no pente, e " + player2.nome + " com " + (player2.arma.capacidade - 8) + " balas no pente");
        try{Thread.sleep(2500);}catch(InterruptedException e){System.out.println(e);}
        System.out.println("Mas o jogo continua, e os dois jogadores se encontram novamente, e dessa vez, " + player1.nome + " nao quer cometer o mesmo erro, \ne joga uma granada de concussao na direcao de " + player2.nome + ", mas ela consegue desviar, e da mais dano no " + player1.nome + "!!!!");
        try{Thread.sleep(1750);}catch(InterruptedException e){System.out.println(e);}
        System.out.println("Mas " + player1.nome + " consegue se recuperar e atirar em " + player2.nome + " com a " + player1.arma.nome + " e consegue um abate, e o jogo acaba!");
        player1.darDano(player2, player1.arma);
        player1.darDano(player2, player1.arma);
        Spetznas.score++;
        try{Thread.sleep(2450);}catch(InterruptedException e){System.out.println(e);}
        System.out.println("O time " + player1.team.name + " ganhou o jogo em um clutch incrivel de " + player1.nome + "!!!!!");

    }
}