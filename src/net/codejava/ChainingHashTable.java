package net.codejava;

public class ChainingHashTable extends HashTable
{
	private ChainingHashTableItem[] table;
	
	public ChainingHashTable(int initialCapacity)
	{
		table = new ChainingHashTableItem[initialCapacity];
	}
	
	/*public ChainingHashTable()
	{
		this(10);
	}*/
	
	public boolean insert(Object key, Object value)
	{
		int bucketIndex = hash(key) % table.length;
		
		ChainingHashTableItem item = table[bucketIndex];
		ChainingHashTableItem previous = null;
		while(item != null)
		{
			if(key.equals(item.value))
			{
				item.value = value;
				return true;
			}
			previous = item;
			item = item.next;
		}
		
		if(table[bucketIndex] == null)
		{
			table[bucketIndex] = new ChainingHashTableItem(key, value);
		}
		else
		{
			previous.next = new ChainingHashTableItem(key,value);
		}
		return true;
	}

	public boolean remove(Object key)
	{
		int bucketIndex = hash(key) % table.length;
		
		ChainingHashTableItem item = table[bucketIndex];
		ChainingHashTableItem previous = null;
		while(item != null)
		{
			if(key.equals(item.value))
			{
				if(previous == null)
				{
					table[bucketIndex] = item.next;
				}
				else
				{
					previous.next = item.next;
				}
				return true;
			}
			previous = item;
			item = item.next;
		}
		return false;
	}
	
	public Object search(Object key) 
	{
		int bucketIndex = hash(key) % table.length;
		
		ChainingHashTableItem item = table[bucketIndex];
		while(item != null)
		{
			if(key.equals(item.key))
			{
				return item.value;
			}
			item = item.next;
		}
		return null;
	}

	@Override
	public boolean remvove(Object key) {
		// TODO Auto-generated method stub
		return false;
	}
}