package logic;

import java.util.List;

import dao.ItemDao;

public class ItemCatalogImpl implements ItemCatalog{
	private ItemDao itemDao;
	
	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	public List<Item> findAll() {
		// TODO Auto-generated method stub
		return itemDao.findAll();
	}

	public Item getItemByItemId(Integer itemId) {
		// TODO Auto-generated method stub
		return itemDao.findPrimaryKey(itemId);
	}

}
