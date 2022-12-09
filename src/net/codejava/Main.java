package net.codejava;
import java.util.Random;

public class Main 
{
	public static void main(String[] args) 
	{
		int[] keys = new int[10000];
		int[] values = new int[10000];
		
		final int initialCapacity = 11;
		
		//creates four new hash tables
		HashTable[] table = {new ChainingHashTable(initialCapacity), 
							new LinearProbingHashTable(initialCapacity),
							new QuadraticProbingHashTable(1,1,initialCapacity), 
							new DoubleHashingHashTable(initialCapacity)};

		Random rand = new Random();
		
		//stores 10000 different data values that are between 0 and 1000000
		//into keys[] and values[]
		for(int i = 0; i < 10000; i++) 
		{
				int key = rand.nextInt(0, 100000);
				keys[i] = key;
				values[i] = key;
		}
		
		//stores keys[] and values[] into each table
		for(int i = 0; i < keys.length; i++)
		{
			for(int j = 0; j < table.length;j++)
			{
				table[j].insert(keys[i], values[i]);
			}
		}
		
		//searches each hash table for first 100 values in keys[]
		for(int i = 0; i < table.length; i++) 
		{
			System.out.println("table: " + i);
			long start = System.currentTimeMillis();
			for(int j = 0; j < 3; j++)
			{
				Object result = table[i].search(keys[j]);
				System.out.println(result);
			}
			long stop = System.currentTimeMillis();
			long time = stop - start;
			System.out.println("search time: " + time);
		}
	}
}