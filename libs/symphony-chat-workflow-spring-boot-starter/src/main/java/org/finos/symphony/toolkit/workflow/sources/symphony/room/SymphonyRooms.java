package org.finos.symphony.toolkit.workflow.sources.symphony.room;

import org.finos.symphony.toolkit.workflow.content.Addressable;
import org.finos.symphony.toolkit.workflow.content.Chat;
import org.finos.symphony.toolkit.workflow.content.User;
import org.finos.symphony.toolkit.workflow.room.Rooms;

/**
 * Increases the api-surface area, allowing you to create rooms/users from symphony objects.
 * 
 * @author Rob Moffat
 *
 */
public interface SymphonyRooms extends Rooms {

	public User loadUserById(Long userId);
	
	public Chat loadRoomById(String streamId);
	
	public String getStreamFor(Addressable a);
	
	public Long getId(User u);
}
