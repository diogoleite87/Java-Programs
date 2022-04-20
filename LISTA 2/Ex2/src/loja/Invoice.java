package loja;

import java.util.Arrays;

public class Invoice {

    private int numItemFaturado;
    private String descicaoItem;
    private int quantidadeItem;
    private double precoItem;
    private double invoiceAmount;

    public void setInvoiceAmount(double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public double getInvoiceAmount() {
        return invoiceAmount = this.quantidadeItem * this.precoItem;
    }

    public int getNumItemFaturado() {
        return numItemFaturado = numItemFaturado;
    }

    public void setNumItemFaturado(int numItemFaturado) {
        this.numItemFaturado = numItemFaturado;
    }

    public String getDescicaoItem() {
        return descicaoItem;
    }

    public void setDescicaoItem(String descicaoItem) {
        this.descicaoItem = descicaoItem;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    public Invoice(int numItemFaturado, String descicaoItem, int quantidadeItem, double precoItem){
        this.numItemFaturado = numItemFaturado;
        this.descicaoItem = descicaoItem;
        this.quantidadeItem = quantidadeItem;
        this.precoItem = precoItem;

        if (this.precoItem < 0.0) {
            this.precoItem = 0.0;
        }
        if (this.quantidadeItem < 0) {
            this.quantidadeItem = 0;
        }

    }

}

