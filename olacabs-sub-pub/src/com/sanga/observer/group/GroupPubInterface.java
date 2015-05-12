/**
 * 
 */
package com.sanga.observer.group;

import java.util.List;

/**
 * @author sangamesh
 *
 */
public interface GroupPubInterface {
	public void register(GroupObserver obs);
	public void unregister(GroupObserver obs);
	public List<GroupObserver> getObserverGroups();
}
