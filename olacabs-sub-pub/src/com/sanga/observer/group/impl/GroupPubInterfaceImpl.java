/**
 * 
 */
package com.sanga.observer.group.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.sanga.observer.group.GroupMessage;
import com.sanga.observer.group.GroupObserver;
import com.sanga.observer.group.GroupPubInterface;


/**
 * @author sangamesh
 *
 */
public abstract class GroupPubInterfaceImpl implements GroupPubInterface {

	List<GroupObserver> groupObservers;
	GroupMessage groupUserMessage;
	
	public GroupPubInterfaceImpl() {
		groupObservers = Collections.synchronizedList(new ArrayList<GroupObserver>());
	}
	
	/* (non-Javadoc)
	 * @see com.sanga.observer.GenericSubjectInterface#register(com.sanga.observer.GenericObserver)
	 */
	@Override
	public void register(GroupObserver obs) {
		groupObservers.add(obs);
	}

	/* (non-Javadoc)
	 * @see com.sanga.observer.GenericSubjectInterface#unregister(com.sanga.observer.GenericObserver)
	 */
	@Override
	public void unregister(GroupObserver obs) {
		for (Iterator<GroupObserver> iterator = groupObservers.iterator(); iterator.hasNext();) {
			GroupObserver groupUserObserver = iterator.next();
			if (groupUserObserver.equals(obs)){
				iterator.remove();
				break;
			}
		}
	}

//	/* (non-Javadoc)
//	 * @see com.sanga.observer.GenericSubjectInterface#notifyListeners()
//	 */
//	@Override
//	public void notifyListeners() {
//		for (Iterator<GroupUserObserver> iterator = groupObservers.iterator(); iterator.hasNext();) {
//			GroupUserObserver groupUserObserver = iterator.next();
//			groupUserObserver.update(groupUserMessage);
//		}
//	}
	
	public abstract void setGroupUserMesage (GroupMessage message);
	
	/**
	 * 
	 * @return
	 */
	public List<GroupObserver> getGroupObservers() {
		return groupObservers;
	}
}
