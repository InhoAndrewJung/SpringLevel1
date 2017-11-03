package logic;

import java.util.List;

public class ShopImpl implements Shop{
	private ItemCatalog itemCatalog;
	
	
	public void setItemCatalog(ItemCatalog itemCatalog) {
		this.itemCatalog = itemCatalog;
	}


	public List<Item> findAll() {
		// TODO Auto-generated method stub
		return itemCatalog.findAll();
	}


	public Item getItemByItemId(Integer itemId) {
		// TODO Auto-generated method stub
		return itemCatalog.getItemByItemId(itemId);
	}

	
}
