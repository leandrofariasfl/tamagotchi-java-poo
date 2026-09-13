package io.github.leandrofariasfl.tamagotchi;

public class Tamagotchi {
    private String nome;
    private int fome;
    private int saude;
    private int idade;

    public Tamagotchi(String nome, int fome, int saude, int idade) {
        this.setNome(nome);
        this.setFome(fome);
        this.setIdade(idade);
        this.setSaude(saude);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        if (fome < 0) {
            this.fome = 0;
            System.out.println("Aviso: A fome não pode ser menor que zero. Ajustado para 0.");
        } else if (fome > 100) {
            this.fome = 100;
            System.out.println("Aviso: A fome não pode ser maior que 100. Ajustado para 100.");
        } else {
            this.fome = fome;
        }
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        if (saude < 0){
            this.saude = 0;
            System.out.println("Aviso: A saúde não pode ser menor que zero. Ajustado para 0.");
        } else if (saude > 100) {
            this.saude = 100;
            System.out.println("Aviso: A saúde não pode ser maior que 100. Ajustado para 100.");
        } else {
            this.saude = saude;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            this.idade = 1;
            System.out.println("Aviso: A idade não pode ser menor ou igual a zero. Ajustado para 1.");
        } else if (idade > 40){
            this.idade = 40;
            System.out.println("Aviso: A idade não pode ser maior que 40. Um tamagotchi vive em média até os 15 anos. Ajustado para 40.");
        } else {
            this.idade = idade;
        }
    }

    @Override
    public String toString() {
        return "Tamagotchi | Nome: " + this.nome +
                ", Fome: " + this.fome +
                ", Saúde: " + this.saude +
                ", Idade: " + this.idade + " |";
    }

    public void imprimir() {
        System.out.println(this.toString());
    }
}
