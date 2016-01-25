package net.qwertysam.resource;

import java.util.ArrayList;
import java.util.List;

public class Holder<T>
{
	private List<T> entries;
	
	public Holder()
	{
		entries = new ArrayList<T>();
	}
	
	public List<T> getEntries()
	{
		return entries;
	}
	
	public void unregisterEntty(T entry)
	{
		entries.remove(entry);
	}
	
	public void registerEntry(T entry)
	{
		entries.add(entry);
	}
	
	public void dispose()
	{
		entries.clear();
	}
}
