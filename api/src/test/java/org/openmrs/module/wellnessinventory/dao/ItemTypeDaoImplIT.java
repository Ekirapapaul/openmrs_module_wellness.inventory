package org.openmrs.module.wellnessinventory.dao;

import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openmrs.module.wellnessinventory.api.dao.ItemTypeDao;
import org.openmrs.module.wellnessinventory.api.model.InventoryItem;
import org.openmrs.module.wellnessinventory.api.model.ItemType;
import org.openmrs.test.BaseModuleContextSensitiveTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@org.springframework.test.context.ContextConfiguration(locations = { "classpath:TestingApplicationContext.xml" }, inheritLocations = true)
public class ItemTypeDaoImplIT extends BaseModuleContextSensitiveTest {
	
	@Autowired
	ItemTypeDao itemTypeDao;
	
	@Before
	public void beforeAllTests() throws Exception {
		executeDataSet("inventoryItems.xml");
	}
	
	@Test
	public void shouldGetAllItems() {
		List<ItemType> inventoryItems = itemTypeDao.getAllItemTypes();
		Assert.assertEquals(2, inventoryItems.size());
	}
}