package discordgamesdk;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * <i>native declaration : line 279</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class DiscordLobby extends Structure {
	/** C type : DiscordLobbyId */
	public long id;
	/**
	 * C type : EDiscordLobbyType
	 * @see DiscordGameSDKLibrary.EDiscordLobbyType
	 */
	public int type;
	/** C type : DiscordUserId */
	public long owner_id;
	/** C type : DiscordLobbySecret */
	public byte[] secret = new byte[128];
	public int capacity;
	public byte locked;
	public DiscordLobby() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("id", "type", "owner_id", "secret", "capacity", "locked");
	}
	/**
	 * @param id C type : DiscordLobbyId
	 * @param type C type : EDiscordLobbyType
	 * @param owner_id C type : DiscordUserId
	 * @param secret C type : DiscordLobbySecret
	 * @see DiscordGameSDKLibrary.EDiscordLobbyType
	 */
	public DiscordLobby(long id, int type, long owner_id, byte[] secret, int capacity, byte locked) {
		super();
		this.id = id;
		this.type = type;
		this.owner_id = owner_id;
		if ((secret.length != this.secret.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.secret = secret;
		this.capacity = capacity;
		this.locked = locked;
	}
	public DiscordLobby(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends DiscordLobby implements Structure.ByReference {
		
	};
	public static class ByValue extends DiscordLobby implements Structure.ByValue {
		
	};
}
