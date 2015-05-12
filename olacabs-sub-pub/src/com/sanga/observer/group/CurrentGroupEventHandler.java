/**
 * 
 */
package com.sanga.observer.group;

import java.util.Iterator;
import java.util.List;

/**
 * @author sangamesh
 *
 */
class ConcurrentEventHandler implements NewGroupEventNotifier, Runnable {
    private final GroupMessage message;
    List<GroupPubInterface> publishers;
    
    public ConcurrentEventHandler(GroupMessage value, List<GroupPubInterface> groups) {
        this.message = value;
        this.publishers = groups;
    }

    public void run() {
        // executed in background thread
        newGroupEvent(message, publishers);
    }

	@Override
	public void newGroupEvent(GroupMessage message, List<GroupPubInterface> publishers) {
		for (Iterator<GroupPubInterface> publishersIterator = publishers.iterator(); publishersIterator.hasNext();) {
			GroupPubInterface groupUserPubInterface =  publishersIterator.next();
			List<GroupObserver> observerGroups = groupUserPubInterface.getObserverGroups ();
			for (Iterator<GroupObserver> groupsIterator = observerGroups.iterator(); groupsIterator.hasNext();) {
				GroupObserver groupUserObserver = groupsIterator.next();
				groupUserObserver.update(message);
			}
		}
	}
}