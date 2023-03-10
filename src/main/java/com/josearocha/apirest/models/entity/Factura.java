package com.josearocha.apirest.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="facturas")
public class Factura implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descripcion;
	private String observacion;
	
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	
	@JsonIgnoreProperties(value={"facturas","hibernateLazyInitializer", "handler"}, allowSetters =true)
	@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name="cliente_id") // <-- sino lo ponemos lo hace automaticamente (estandart) JPA
	private Cliente cliente;
	
	
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="factura_id") // <--fundamental para generar la llave 
	//foránea factura_id en la tabla factura_tems
	//Y colocamos esta anotacion JoinColum ya que en la clase ItemFactura no creamos el atributo que relaciona ItemFacturas con la clase Factura
	private List<ItemFactura> items;
		
	
	public Factura() {
		items = new ArrayList<>();
	}

	@PrePersist
	public void prePersist() {
		
		this.createAt= new Date();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}
	
	public List<ItemFactura> getItems() {
		return items;
	}

public Double getTotal() {
	
	Double total=0.00;
	for(ItemFactura item:items) {
		total = total+item.getImporte();
	}
	
	return total;
}
	
	
}
