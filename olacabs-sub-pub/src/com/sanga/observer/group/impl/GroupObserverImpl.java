/**
 * 
 */
package com.sanga.observer.group.impl;

import java.util.List;
import java.util.Random;

import com.sanga.observer.consumer.ConsumerMessage;
import com.sanga.observer.consumer.ConsumerObserver;
import com.sanga.observer.consumer.ConsumerPubInterface;
import com.sanga.observer.consumer.impl.ConsumerPubInterfaceImpl;
import com.sanga.observer.group.GroupMessage;
import com.sanga.observer.group.GroupObserver;

/**
 * @author sangamesh
 *
 */
public class GroupObserverImpl implements GroupObserver {
	int groupId;
	ConsumerPubInterface consumerInterface = new ConsumerPubInterfaceImpl ();

	/**
	 * 
	 */
	public GroupObserverImpl() {
		
	}

	/* (non-Javadoc)
	 * @see com.sanga.observer.GroupUserObserver#update(com.sanga.observer.GroupUserMessage)
	 */
	@Override
	public void update(GroupMessage message) {
		List<ConsumerObserver> consumers = consumerInterface.getConsumers();
	
		ConsumerObserver consumer = consumers.get((new Random ()).nextInt(consumers.size()));
		if(consumer.getGroupId () == groupId){
			ConsumerMessage consumerMessage = new ConsumerMessage();
			consumer.update(consumerMessage);	
		}
	}
}
