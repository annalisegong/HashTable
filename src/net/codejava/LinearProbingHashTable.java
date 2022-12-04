package net.codejava;

public class LinearProbingHashTable extends OpenAddressingHashTable
{
	public LinearProbingHashTable(int initialCapacity)
	{
		super(initialCapacity);
	}
	
	public LinearProbingHashTable()
	{
		this(11);
	}
	
	@Override
	protected int probe(Object key, int i)
	{
		return (hash(key) + i) % table.length;
	}

	@Override
	public boolean remvove(Object key) {
		// TODO Auto-generated method stub
		return false;
	}
}
