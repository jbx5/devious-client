import net.runelite.mapping.ObfuscatedName;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedSignature;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;
import java.net.URLEncoder;
@ObfuscatedName("op")
public class class400 implements class398 {
	@ObfuscatedName("v")
	final Map field4437;

	public class400(Map var1) {
		this.field4437 = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)[B", garbageValue = "793389020")
	public byte[] vmethod7114() throws UnsupportedEncodingException {
		return this.method7122().getBytes("UTF-8");
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "1192893333")
	public String method7122() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder();
		Iterator var2 = this.field4437.entrySet().iterator();
		while (var2.hasNext()) {
			Entry var3 = ((Entry) (var2.next()));
			String var4 = URLEncoder.encode(((String) (var3.getKey())), "UTF-8");
			String var5 = URLEncoder.encode(((String) (var3.getValue())), "UTF-8");
			var1.append(var4).append("=").append(var5).append("&");
		} 
		if (var1.length() == 0) {
			return "";
		} else {
			var1.deleteCharAt(var1.length() - 1);
			var1.insert(0, "?");
			return var1.toString();
		}
	}
}