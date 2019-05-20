package discordgamesdk;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * <i>native declaration : line 294</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class DiscordEntitlement extends Structure {
	/** C type : DiscordSnowflake */
	public long id;
	/**
	 * C type : EDiscordEntitlementType
	 * @see DiscordGameSDKLibrary.EDiscordEntitlementType
	 */
	public int type;
	/** C type : DiscordSnowflake */
	public long sku_id;
	public DiscordEntitlement() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("id", "type", "sku_id");
	}
	/**
	 * @param id C type : DiscordSnowflake<br>
	 * @param type C type : EDiscordEntitlementType
	 * @param sku_id C type : DiscordSnowflake
	 * @see DiscordGameSDKLibrary.EDiscordEntitlementType
	 */
	public DiscordEntitlement(long id, int type, long sku_id) {
		super();
		this.id = id;
		this.type = type;
		this.sku_id = sku_id;
	}
	public DiscordEntitlement(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends DiscordEntitlement implements Structure.ByReference {
		
	};
	public static class ByValue extends DiscordEntitlement implements Structure.ByValue {
		
	};
}
