package discordgamesdk;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * <i>native declaration : line 391</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class IDiscordRelationshipEvents extends Structure {
	/** C type : on_refresh_callback* */
	public on_refresh_callback on_refresh;
	/** C type : on_relationship_update_callback* */
	public on_relationship_update_callback on_relationship_update;
	public interface on_refresh_callback extends Callback {
		void apply(Pointer event_data);
	};
	public interface on_relationship_update_callback extends Callback {
		void apply(Pointer event_data, DiscordRelationship relationship);
	};
	public IDiscordRelationshipEvents() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("on_refresh", "on_relationship_update");
	}
	/**
	 * @param on_refresh C type : on_refresh_callback*<br>
	 * @param on_relationship_update C type : on_relationship_update_callback*
	 */
	public IDiscordRelationshipEvents(on_refresh_callback on_refresh, on_relationship_update_callback on_relationship_update) {
		super();
		this.on_refresh = on_refresh;
		this.on_relationship_update = on_relationship_update;
	}
	public IDiscordRelationshipEvents(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends IDiscordRelationshipEvents implements Structure.ByReference {
		
	};
	public static class ByValue extends IDiscordRelationshipEvents implements Structure.ByValue {
		
	};
}
