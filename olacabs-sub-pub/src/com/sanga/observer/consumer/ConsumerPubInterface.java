/**
 * 
 */
package com.sanga.observer.consumer;

import java.util.List;

import com.sanga.observer.group.GroupObserver;

/**
 * @author sangamesh
 *
 */
public interface ConsumerPubInterface {
	public void register(GroupObserver obs);
	public void unregister(GroupObserver obs);
	public List<ConsumerObserver> getConsumers();
}
