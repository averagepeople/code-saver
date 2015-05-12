/**
 * 
 */
package com.sanga.observer.consumer;


/**
 * @author sangamesh
 *
 */
public interface ConsumerObserver {
	public void update (ConsumerMessage message);

	public int getGroupId(); 
}
