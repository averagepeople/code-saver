/**
 * 
 */
package com.sanga.observer.consumer.impl;

import java.util.List;

import com.sanga.observer.consumer.ConsumerObserver;
import com.sanga.observer.consumer.ConsumerPubInterface;
import com.sanga.observer.group.GroupObserver;

/**
 * @author sangamesh
 *
 */
public class ConsumerPubInterfaceImpl implements ConsumerPubInterface {

	/* (non-Javadoc)
	 * @see com.sanga.observer.consumer.ConsumerPubInterface#register(com.sanga.observer.group.GroupObserver)
	 */
	@Override
	public void register(GroupObserver obs) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.sanga.observer.consumer.ConsumerPubInterface#unregister(com.sanga.observer.group.GroupObserver)
	 */
	@Override
	public void unregister(GroupObserver obs) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.sanga.observer.consumer.ConsumerPubInterface#getObserverGroups()
	 */
	@Override
	public List<ConsumerObserver> getConsumers() {
		// TODO Auto-generated method stub
		return null;
	}

}
