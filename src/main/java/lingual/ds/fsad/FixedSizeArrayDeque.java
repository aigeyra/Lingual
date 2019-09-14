package lingual.ds.fsad;

import java.util.ArrayDeque;

public class FixedSizeArrayDeque<T> extends ArrayDeque<T>{
    /**
	 * 
	 */
	private static final long serialVersionUID = -441585264989500850L;
	private final int maxSize;

    public FixedSizeArrayDeque(int maxSize){
        super(maxSize + 1);
        this.maxSize = maxSize;
    }  
    
    @Override
    public boolean add(T e) {
    	if(size() >= maxSize){
    		return false;
    	}    	
    	return super.add(e);
    }
    
    @Override
    public void addFirst(T e){
    	if(size() >= maxSize){
    		pollLast();
    	}
    	super.addFirst(e);
    }
    

    @Override
    public void addLast(T e) {
    	if(size() < maxSize){
    		super.addLast(e);
    	}
    }
    
    @Override
    public boolean offer(T e) {
    	if(size() >= maxSize){
    		return false;
    	}    	
    	return super.offer(e);
    }
    
    @Override
    public boolean offerFirst(T e){
    	if(size() >= maxSize){
    		pollLast();
    	}
    	return super.offerFirst(e);
    }
    
    @Override
    public boolean offerLast(T e){   	
    	if(size() >= maxSize){
    		return false;
    	}    	
    	return super.offerLast(e);
    }
}