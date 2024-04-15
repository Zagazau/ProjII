package entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;

@Entity
public class Encomendaproduto {
    @Basic
    @jakarta.persistence.Column(name = "idencomenda")
    private int idencomenda;

    public int getIdencomenda() {
        return idencomenda;
    }

    public void setIdencomenda(int idencomenda) {
        this.idencomenda = idencomenda;
    }

    @Basic
    @jakarta.persistence.Column(name = "idproduto")
    private int idproduto;

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Encomendaproduto that = (Encomendaproduto) o;

        if (idencomenda != that.idencomenda) return false;
        if (idproduto != that.idproduto) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idencomenda;
        result = 31 * result + idproduto;
        return result;
    }
}
