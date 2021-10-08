package modelo;

import java.util.*;
import java.util.Scanner;

/**
 * Classe que modela os telefones
 * @author Luíza Esteves
 */
public class Telefone {

    Scanner ler = new Scanner(System.in);
    private int ddd, numero;

    public Telefone(int cod, int num) {
        ddd = cod;
        numero = num;
    }

    @Override
    public String toString() {
        return "Telefone: (" + ddd + ") " + numero;
    }

    public int getDDD() {
        return ddd;
    }

    public void setDDD(int ddd) {
        this.ddd = ddd;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

}
