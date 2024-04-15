package entity;

import jakarta.persistence.Column;

import java.io.Serializable;

public class PedidoprodutoPK implements Serializable {
    @Column(name = "idpedido")
    private Long idPedido;

    @Column(name = "idproduto")
    private Long idProduto;
}
