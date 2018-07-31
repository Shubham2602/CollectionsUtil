package Notations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public class findScale 
{
	public List<String> ionian()
	{
		List<String> ionianScale = new ArrayList<String>();
		EnumSet.allOf(Notes.class).forEach(note -> ionianScale.add(note.toString()));
		ScaleIntervals si = new ScaleIntervals();
		int arr[] = si.ionian;		
		return calculate(arr,ionianScale);
		
	}
	
	public List<String> aeolian()
	{
		List<String> aeolianScale = new ArrayList<String>();
		EnumSet.allOf(Notes.class).forEach(note -> aeolianScale.add(note.toString()));
		ScaleIntervals si = new ScaleIntervals();
		int arr[] = si.aeolian;	
		
		return calculate(arr, aeolianScale);
		
	}
	
	public List<String> myxolydian()
	{
		List<String> myxolydianScale = new ArrayList<String>();
		EnumSet.allOf(Notes.class).forEach(note -> myxolydianScale.add(note.toString()));
		ScaleIntervals si = new ScaleIntervals();
		int arr[] = si.myxolydian;	
		
		return calculate(arr, myxolydianScale);
		
	}
	
	public List<String> dorian()
	{
		List<String> dorianScale = new ArrayList<String>();
		EnumSet.allOf(Notes.class).forEach(note -> dorianScale.add(note.toString()));
		ScaleIntervals si = new ScaleIntervals();
		int arr[] = si.dorianScale;	
		
		return calculate(arr, dorianScale);
		
	}
	
	public List<String> calculate(int[] arr, List<String> scale)
	{
		
		List<String> finalScale = new ArrayList<>();
		int i = 0;
		Iterator<String> itr = scale.iterator();
		do
		{
			finalScale.add(itr.next().toString());
			int pos = arr[i];
			for(int j = 0; j<pos-1; j++)
				itr.next();
			i++;
		}while(itr.hasNext());
		
		return finalScale;
	}

}
