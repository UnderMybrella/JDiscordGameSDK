package discordgamesdk;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * <i>native declaration : line 450</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class IDiscordNetworkEvents extends Structure {
	/** C type : on_message_callback* */
	public on_message_callback on_message;
	/** C type : on_route_update_callback* */
	public on_route_update_callback on_route_update;
	public interface on_message_callback extends Callback {
		void apply(Pointer event_data, long peer_id, byte channel_id, Pointer data, int data_length);
	};
	public interface on_route_update_callback extends Callback {
		void apply(Pointer event_data, Pointer route_data);
	};
	public IDiscordNetworkEvents() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("on_message", "on_route_update");
	}
	/**
	 * @param on_message C type : on_message_callback*<br>
	 * @param on_route_update C type : on_route_update_callback*
	 */
	public IDiscordNetworkEvents(on_message_callback on_message, on_route_update_callback on_route_update) {
		super();
		this.on_message = on_message;
		this.on_route_update = on_route_update;
	}
	public IDiscordNetworkEvents(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends IDiscordNetworkEvents implements Structure.ByReference {
		
	};
	public static class ByValue extends IDiscordNetworkEvents implements Structure.ByValue {
		
	};
}
