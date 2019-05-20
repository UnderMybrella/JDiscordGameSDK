package discordgamesdk;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * <i>native declaration : line 305</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class DiscordSku extends Structure {
	/** C type : DiscordSnowflake */
	public long id;
	/**
	 * C type : EDiscordSkuType
	 * @see DiscordGameSDKLibrary.EDiscordSkuType
	 */
	public int type;
	/** C type : char[256] */
	public byte[] name = new byte[256];
	/** C type : DiscordSkuPrice */
	public DiscordSkuPrice price;
	public DiscordSku() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("id", "type", "name", "price");
	}
	/**
	 * @param id C type : DiscordSnowflake
	 * @param type C type : EDiscordSkuType
	 * @param name C type : char[256]
	 * @param price C type : DiscordSkuPrice
	 * @see DiscordGameSDKLibrary.EDiscordSkuType
	 */
	public DiscordSku(long id, int type, byte[] name, DiscordSkuPrice price) {
		super();
		this.id = id;
		this.type = type;
		if ((name.length != this.name.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.name = name;
		this.price = price;
	}
	public DiscordSku(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends DiscordSku implements Structure.ByReference {
		
	};
	public static class ByValue extends DiscordSku implements Structure.ByValue {
		
	};
}
