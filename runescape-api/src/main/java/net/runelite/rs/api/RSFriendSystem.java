package net.runelite.rs.api;

import net.runelite.api.FriendContainer;
import net.runelite.mapping.Import;

public interface RSFriendSystem
{
	@Import("friendsList")
	FriendContainer getFriendContainer();

	@Import("ignoreList")
	RSIgnoreList getIgnoreContainer();

	@Import("isFriended")
	boolean isFriended(RSUsername var1, boolean var2);

	@Import("isIgnored")
	boolean isIgnored(RSUsername var1);

	@Import("addFriend")
	void addFriend(String username);

	@Import("removeFriend")
	void removeFriend(String username);

	@Import("addIgnore")
	void addIgnore(String username);

	@Import("removeIgnore")
	void removeIgnore(String username, boolean confirmToJagex);
}
