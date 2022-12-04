package net.codejava;

public class OpenAddressingBucket 
{
	public Object key;
	public Object value;
	
	public static final OpenAddressingBucket  EMPTY_SINCE_START = new OpenAddressingBucket(null, null);
	public static final OpenAddressingBucket EMPTY_AFTER_REMOVAL = new OpenAddressingBucket (null, null);;
	
	OpenAddressingBucket(Object bucketKey, Object bucketValue)
	{
		this.key = bucketKey;
		this.value = bucketValue;
	}
	
	boolean isEmpty()
	{
		return this == EMPTY_SINCE_START || this == EMPTY_AFTER_REMOVAL;
	}
		
}
