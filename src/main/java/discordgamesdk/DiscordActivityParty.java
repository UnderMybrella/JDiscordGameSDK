package discordgamesdk;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * <i>native declaration : line 244</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class DiscordActivityParty extends Structure {
	/** C type : char[128] */
	public byte[] id = new byte[128];
	/** C type : DiscordPartySize */
	public DiscordPartySize size;
	public DiscordActivityParty() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("id", "size");
	}
	/**
	 * @param id C type : char[128]<br>
	 * @param size C type : DiscordPartySize
	 */
	public DiscordActivityParty(byte id[], DiscordPartySize size) {
		super();
		if ((id.length != this.id.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.id = id;
		this.size = size;
	}
	public DiscordActivityParty(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends DiscordActivityParty implements Structure.ByReference {
		
	};
	public static class ByValue extends DiscordActivityParty implements Structure.ByValue {
		
	};
}
