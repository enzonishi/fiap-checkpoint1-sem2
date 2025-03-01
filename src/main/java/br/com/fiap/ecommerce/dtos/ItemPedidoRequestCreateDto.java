package br.com.fiap.ecommerce.dtos;

import java.math.BigDecimal;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import br.com.fiap.ecommerce.model.ItemPedido;

public class ItemPedidoRequestCreateDto {

private Long idPedido;
    
    private Long idProduto;

    private BigDecimal quantidade;

    private BigDecimal valorTotal;
    
    private static final ModelMapper modelMapper = new ModelMapper();
    
    static {
    	modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }
    
    

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	 public ItemPedido toModel() {
	        return modelMapper.map(this, ItemPedido.class);
	    }
}
