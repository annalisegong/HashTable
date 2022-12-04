package net.codejava;

public class DoubleHashingHashTable extends OpenAddressingHashTable
{
	public DoubleHashingHashTable(int initialCapacity)
	{
		super(initialCapacity);
	}
	
	public DoubleHashingHashTable()
	{
		this(11);
	}
	
	private int h2(Object key)
	{
		return 7 - hash(key) % 7;
	}
	
	@Override
	protected int probe(Object key, int i)
	{
		return (hash(key) + i * h2(key)) % table.length;
	}
}
