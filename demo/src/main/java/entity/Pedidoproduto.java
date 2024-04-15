package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@jakarta.persistence.IdClass(entity.PedidoprodutoPK.class)
public class Pedidoproduto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "idpedido")
    private int idpedido;

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
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

        Pedidoproduto that = (Pedidoproduto) o;

        if (idpedido != that.idpedido) return false;
        if (idproduto != that.idproduto) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idpedido;
        result = 31 * result + idproduto;
        return result;
    }
}
