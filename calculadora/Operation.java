/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Lucas
 */
public class Operation {
    private Double soma;
    private Double subtracao;
    private Double multiplicacao;
    private Double divisao;
    private Double modulo;
    private Double raiz;

    public Double getSoma() {
        return soma;
    }

    public void setSoma(Double numero1, Double numero2) {
        this.soma = numero1 + numero2;
    }

    public Double getSubtracao() {
        return subtracao;
    }

    public void setSubtracao(Double numero1, Double numero2) {
        this.subtracao = numero1 - numero2;
    }

    public Double getMultiplicacao() {
        return multiplicacao;
    }

    public void setMultiplicacao(Double numero1, Double numero2) {
        this.multiplicacao = numero1*numero2 ;
    }

    public Double getDivisao() {
        return divisao;
    }

    public void setDivisao(Double numero1, Double numero2) {
        this.divisao = numero1/numero2;
    }

    public Double getModulo() {
        return modulo;
    }

    public void setModulo(Double numero1, Double numero2) {
        this.modulo = numero1%numero2;
    }

    public Double getRaiz() {
        return raiz;
    }

    public void setRaiz(Double numero, Double grau) {
        this.raiz = Math.pow(numero,1/grau) ;
    }

    
}
