/**
 * 
 */
package com.sanga.observer.group;

import java.util.List;

/**
 * @author sangamesh
 *
 */
public interface NewGroupEventNotifier {
	public void newGroupEvent(GroupMessage message, List<GroupPubInterface> groups);
}
