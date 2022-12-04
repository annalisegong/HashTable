package net.codejava;

public class QuadraticProbingHashTable extends OpenAddressingHashTable
{
	private int c1;
	private int c2;
	
	public QuadraticProbingHashTable(int c1, int c2, int initialCapacity)
	{
		super(initialCapacity);
		this.c1 = c1;
		this.c2 = c2;
	}
	
	public QuadraticProbingHashTable()
	{
		this(1,1,11);
	}
	
	@Override
	protected int probe(Object key, int i)
	{
		return(hash(key) + c1 * i + c2 * i * i) % table.length;
	}

	@Override
	public boolean remvove(Object key) {
		// TODO Auto-generated method stub
		return false;
	}
}
