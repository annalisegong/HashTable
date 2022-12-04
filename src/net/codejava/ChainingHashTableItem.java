package net.codejava;

class ChainingHashTableItem 
{
	public Object key;
	public Object value;
	public ChainingHashTableItem next;
	
	public ChainingHashTableItem(Object itemKey, Object value)
	{
		this.key = itemKey;
		this.value = value;
		this.next = null;
	}
}