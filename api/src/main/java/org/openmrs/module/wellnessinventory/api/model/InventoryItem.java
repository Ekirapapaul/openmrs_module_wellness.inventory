package org.openmrs.module.wellnessinventory.api.model;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.BaseOpenmrsObject;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "InventopryItem")
@Table(name = "inventory_item")
public class InventoryItem extends BaseOpenmrsData {
	
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "item_id", nullable = false)
	private Integer id;

    @Column(name = "name", length = 30, nullable = false)
	private String name;

    @Column(name = "description")
	private String description;

    @Column(name = "item_code", length = 30)
	private String itemCode;
	
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getItemCode() {
		return itemCode;
	}
	
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	
	@Override
	public Integer getId() {
		return this.id;
	}
	
	@Override
	public void setId(Integer id) {
		this.id = id;
	}
}
