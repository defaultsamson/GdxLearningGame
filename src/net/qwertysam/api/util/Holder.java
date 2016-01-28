package net.qwertysam.api.util;

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
	
	public boolean isEmpty()
	{
		return entries.isEmpty();
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
